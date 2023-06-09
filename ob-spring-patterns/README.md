
## Patrones de diseño

No son código en sí, son una forma de estructurar el código con el objeto de resolver un 
problema común.

Patrones a explorar: 

* Plantilla (Template)
* Cadena de responsabilidad (Chain of responsibility)
* Estrategia (Strategy)
* Proxy
* Constructor (Builder)
* Observador (Observer)
* Decorador (Decorator)

## Tipos de patrones 

* **Creacionales**
  * Constructor (Builder)
* **Estructurales**
  * Proxy
  * Decorador
* **Comportamiento**
  * Template
  * Chain of responsibility
  * Strategy
  * Observer

## Objetivos generales

* Obtener bajo acoplamiento 
* Reutilización de código
* Flexibilidad
* Escalabilidad
* Eficiencia
* Estándar de buenas prácticas
* Favorece el testing
* Mayor calidad

# Recursos de interés 

https://refactoring.guru/design-patterns/catalog

https://github.com/eugenp/tutorials/tree/master/patterns

https://www.baeldung.com/spring-framework-design-patterns

## 1. Patrón Plantilla 

* Desacoplar código 
* Reutilizar código

## 2. Patrón cadena de responsabilidad 

En Spring Security tenemos los filtros 

Objetivos:
* Reducir el acoplamiento
* Flexibilidad al permitir cambiar responsabilidad
* Componer objetos que en su totalidad resuelven una unidad de trabajo

A tener en cuenta: 

* Cada elemento de la cadena de responsabilidad (Manejador) tiene su propia implementación
* Cada manejador hace referencia al siguiente manejador
* No deberían formarse ciclos recursivos 

## 3. Patron estrategia

Permite utilizar algoritmos de forma dinamica.

Ventajas:

* Cambiar un algoritmo o comportamiento en tiempo de ejecucion (runtime)
* Clara separacion de comportamientos, cada algoritmo representa una estrategia
* Principios SOLID: pincipio de open closed. Podemos introducir nuevas estragias sin alterar el codigo original

Desventajas:

* Se puede llegar a complicar al tener que introdir nuevas clases / intefaces
* Si los algoritmos no son muy distintos puede no teener sentido hacer tanto codigo
* Los clientes que la utilizan tienen que ser consciontes de la existencia de las diferentes estrategias
* La programacion funcional permite simplificar el uso del patron estrategia al poder pasar comportamiento por parametros 
por lo que no haria falta crear nuevas clases evitando asi el uso del patron estrategia

## 4. Proxy

Carga de un objeto pesado: imagenes, conexiones a bases de datos (contexto de persistencai).

La carga de estos objetos se difiere todo lo posible

Client --> Objeto

Client --> Proxy --> Objeto

Ejemplos: SessionFactory (Hibernate), EntityMAnagerFactory (JPA)

Ventajas:

* Permite gestionar el ciclo de vida del objeto pesado sin que el Client tenga nocion de ello
* El proxy funciona incluso aunque el objeto pesado no haya sido inicializado o no este disponible.
* Principios SOLID: pincipio de open closed. Podemos introducir nuevos objetos pesados.

Desventajas:

* Diferir la carga de un objeto no siempre sera lo mejor si se necesita de inmediato.
* Introduccion de nuevas clases puede dar lugar a complejidad

## 5. Builder

Cuando una clase con muchos atributos y necesitamos multiples formas de crear objetos haciendo
de constructores sobrecargados.

Tener todas las posibles combinaciones de constructores puede llegar a ser muy complejo de mantener.

Utiliza fluent programing style para lograr construir los objetos

Devolver "this" al final de cada metodo setter

Ventajas:

* Permite construir objetos paso a paso encadenando llamadas a metodos en una misma linea.
* Permite crear objetos cada vez con diferentes atributos sin necesidad de tener un constructor para
cada manera de crearlos.
* Principios SOLID: principio SRP Una sola responsabilidad al aislar la forma de construir el objeto a los clientes

Desventajas:

* Requiere crear una nueva clase Builder lo cual puede añadir complejidad a la clase original

## 6. Observer

Cuando tenemos una asociacion de tipo one to many entre clases y queremos que cuando se actualice
el objeto del lado one se notifique a los objetos del lado many

Por ejemplo:

Un canal de youtube sube un video y se notifique automaticamente a todos los subscriptores.

Ventajas:

* Principios SOLID: principio Open Closed. Podemos introducir nuevos objetos subscriptores
* Establecer asociaciones entre objetos en tiempo de ejecucion (runtime)

Desventajas:

* Puede ser que no se siga un orden a la hora de notificar a los subscriptores y se haga de manera aleatoria

## 7. Decorator

Agregar nueva funcionalidad a objetos existentes. Decorar objetos con nuevas funcionalidades

Ejemplo: muñeca rusa. Un objeto se puede decorar con funcionalidad y a su vez el resultado
se le puede seguir aplicando otros decoradores

Ventajas:

* Extender la funcionalidad de objetos existentes sin necesidad de utilizar herencia
* Agregar nuevas responsabilidades o comportamientos a un objeto en tiempo de ejecucion (runtime)
* Multiples comportamientos sobre un mismo por medio de utilizar mas de un decorador a la vez
* SRP Principio de una sola responsabilidad, cada decorador seria una clase y se centraria
en una misma responsabilidad

Desventajas:

* Complejidad cuando hay muchos decoradores, complejidad a la hora de implementar el patron al tener varias clases abstractas
* Dificil eliminar un decorador que esta dentro de otro decorador
* El orden en los decoradores puede ser importante y podria ser dificil tener que cambiarlo.