# Taller Java TCS
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/VINT100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/ICLC100001)

_Clase 53: Default en Interfaces._

```
📢 Que pasaría si agregamos un método en una interfaz que es llamada muchas veces en diferentes clases. 
📢 Voy a simular este caso copiando la clase "AccionesAlumnoImpl".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/DEI0100001_1.png)

```
📢 Agregaré 1 método a la interfaz "AccionesAlumno".
📢 Podemos ver que en todas las clases donde la llama nos sale la advertencia para implementar los métodos.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/DEI0100001_2.png)

```
📢 Si quisiera que un método se replique ya implementado podemos usar el método "default".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/DEI0100001_3.png)

```
📢 De esta forma, en todas las clases que llama a la interfaz, implícitamente se ha agregado el método y su implementación.
📢 Considerar que esta implementación solo es aceptada para versiones de java 8 o superior. En caso se use una versión inferior, nos aparecerá un mensaje como el siguiente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/DEI0100001_4.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/VINT100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/ICLC100001)
