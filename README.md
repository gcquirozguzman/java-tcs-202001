# Taller Java TCS

_Clase 49: Polimorfismo._

```
📢 Para explicar este concepto agregaré un método que me envíe un mensaje en la consola.
📢 También crearé un constructor. Pero los crearé sin parámetros.
📢 Esto con la finalidad de inicializar el objeto sin que me solicite parámetros.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_1.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_2.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_3.png)

```
📢 Primero agregaré la superclase Persona y la inicializaré.
📢 Recordemos que de esta clase nacen 2 clases: Alumno y Profesor.
📢 Invocaré al método saludar() de la clase Persona.
📢 Podemos ver que nos retorna el mensaje propio de la clase.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_5.png)

```
📢 Ahora quiero indicar que la clase Persona es una clase de tipo Alumno.
📢 Para esto indicare ahora que:
    persona = new Alumno()
📢 Invocaré al método saludar() de la clase Persona.
📢 Podemos ver que nos retorna el mensaje de la clase que hemos asignado.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_6.png)

```
📢 Lo mismo sucede al asignarle la clase Profesor a la clase Persona.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_7.png)

```
📢 Luego de ver estos ejemplos, podemos indicar que una clase puede tomar diversas formas que se le asignen.
📢 Puede tomar la forma de la misma clase que "Persona".
📢 Puede tomar la forma de la clase que "Alumno" o "Profesor".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_4.png)

```
📢 Se debe tener en cuenta que solo se le puede asignar a una clase Padre(Persona) una clase Hijo(Alumno o Profesor).
📢 Si esto se hace la revés, provocaría un error.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-49/imagenes/pagina_49_8.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)



⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊
