package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class BookController {

    //ATRIBUTOS:

    private BookRepository bookRepository;
    private final Logger log = LoggerFactory.getLogger(BookController.class);

    //CONSTRUCTORES

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //CRUD sobre la entidad Book

    //Buscar todos los libros (lista de libros)
    //http://localhost:8080/api/books
    @GetMapping("/api/books")
    public List<Book> findAll(){
        //recuperar y devolver los libros de base de datos
        return bookRepository.findAll();
    }

    //Buscar un solo libro en base de datos segun id
    @GetMapping("/api/books/{id}")
    @Operation(summary = "Buscar libro por clave primaria tipo Long", description = "Clave primaria tipo Long")
    public ResponseEntity <Book> findOneById (@PathVariable Long id){
        Optional<Book> bookOpt = bookRepository.findById(id);
        //opcion 1:
        if(bookOpt.isPresent())
            return ResponseEntity.ok(bookOpt.get());
        else
            return ResponseEntity.notFound().build();

        //Opcion 2:
//        return bookOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    //Crear un libro en base de datos
    @PostMapping("/api/books")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        //guardar el libro recibido por parametro de la base de datos
        if(book.getId() != null){ //quiere decir que existe el id y, por tanto, no es una creacion
            log.warn("trying to create a book with id");
            System.out.println("trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);
    }

    //Actualizar un libro existente en base de datos
    @PutMapping("/api/books")
    public ResponseEntity<Book> update(@RequestBody Book book){
        if(book.getId() == null){ //si no tiene id quiere decir que es un creacion
            log.warn("trying to update a not existent book");
            return ResponseEntity.badRequest().build();
        }
        if(!bookRepository.existsById(book.getId())){
            log.warn("trying to update a not existent book");
            return ResponseEntity.notFound().build();
        }

        //proceso de actualizacion
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);

    }

    //borrar un libro en base de datos
    //@Hidden //Para ocultar el metodo y que non aparezca en la api Swagger
    @DeleteMapping("/api/books/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id){
        if(!bookRepository.existsById(id)){
            log.warn("trying to delete a not existent book");
            return ResponseEntity.notFound().build();
        }

        bookRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
    //@Hidden //Para ocultar el metodo y que non aparezca en la api Swagger
    @DeleteMapping("/api/books")
    public ResponseEntity<Book> deleteAll(){
        log.info("REST Request for deleting all books");
        bookRepository.deleteAll();
        return ResponseEntity.noContent().build();

    }

}
