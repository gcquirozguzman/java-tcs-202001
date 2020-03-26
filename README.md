# Taller Java TCS
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/HST0100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/CABS100001)

_Clase: Polimorfismo._

```
📢 Para explicar este concepto agregaré un método que me envíe un mensaje en la consola.
📢 También crearé un constructor. Pero los crearé sin parámetros.
📢 Esto con la finalidad de inicializar el objeto sin que me solicite parámetros.
📢 Modificaremos la clase "Persona" que creamos anteriormente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_1.png)

```
📢 Modificaremos la clase "Alumno" que creamos anteriormente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_2.png)

```
📢 Modificaremos la clase "Profesor" que creamos anteriormente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_3.png)

```
📢 Primero agregaré la superclase Persona y la inicializaré.
📢 Recordemos que de esta clase nacen 2 clases: Alumno y Profesor.
📢 Invocaré al método saludar() de la clase Persona.
📢 Podemos ver que nos retorna el mensaje propio de la clase.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_5.png)

```
📢 Ahora quiero indicar que la clase Persona es una clase de tipo Alumno.
📢 Para esto indicare ahora que:
    persona = new Alumno()
📢 Invocaré al método saludar() de la clase Persona.
📢 Podemos ver que nos retorna el mensaje de la clase que hemos asignado.
📢 Modificaremos la clase "Principal" que creamos anteriormente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_6.png)

```
📢 Lo mismo sucede al asignarle la clase Profesor a la clase Persona.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_7.png)

```
📢 Luego de ver estos ejemplos, podemos indicar que una clase puede tomar diversas formas que se le asignen.
📢 Puede tomar la forma de la misma clase que "Persona".
📢 Puede tomar la forma de la clase que "Alumno" o "Profesor".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_4.png)

```
📢 Se debe tener en cuenta que solo se le puede asignar a una clase Padre(Persona) una clase Hijo(Alumno o Profesor).
📢 Si esto se hace la revés, provocaría un error.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_8.png)

```
📢 Para aclarar el funcionamiento de lo explicado agregaré la siguiente gráfica.
📢 Cuando asignamos la clase hija a una clase padre sucede lo siguiente.
📢 Aún conservará intactos los métodos que no obtenga coincidencia con la clase padre.
📢 El método getDespedir() por ejemplo, no sobreescribira nada de la clase padre porque ahí no existe un método similar.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/POLI100001_9.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/HST0100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/CABS100001)
