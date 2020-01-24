# Taller Java TCS

_Clase 44: Static._

```
📢 Este modificador puede ser usado en variables, clases o campos.
📢 Podemos usarlo con la finalidad de que estén disponibles globalmente para varias clases.
📢 Por ejemplo, si queremos declarar el ip de la base de datos.
📢 Esta ip la deberíamos declarar en todas las clases que se van a conectar al a base de datos (Prueba_1.java, Prueba_2.java y Prueba_3.java).
📢 Esto ocasionaría que se separe memoria para 3 variables de tipo String que se encuentran en estas 3 clases.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_1.png)

```
📢 Ante esto podemos declarar una variable de tipo static.
📢 Esta variable estará disponible para las demás clases sin necesidad de instanciar la clase.
📢 Crearemos la clase de nombre "VariablesSistema".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_2.png)

```
📢 Agregaremos nuestra variable estática.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_3.png)

```
📢 Crearemos una clase de nombre "Principal". (Incluir public static void main)
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_4.png)

```
📢 Desde ahí llamaremos a nuestra variable estática.
📢 Escribimos el nombre de la clase y luego colocaremos un punto.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_5.png)

```
📢 Mostraré el resultado de la variable.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_6.png)

```
📢 Agregaré otra variable "puerto".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_7.png)

```
📢 Si la intento llamar desde la clase principal veré que no es posible acceder a esta como una variable estática.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_8.png)

```
📢 Para acceder a esta tengo que inicializar la clase y luego acceder a ella.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-44/imagenes/pagina_44_9.png)

```
📢 Es posible usar este concepto para variables, clases o campos.
```

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)



⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊
