# Taller Java TCS                                                                       
### 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001)

#### ⛄ Hablemos de Swing

```
📢 Para esta actividad nos apoyaremos de una biblioteca de interfaces gráfica llamada Swing.
📢 Esta biblioteca viene incluida con el entorno de desarrollo de Java (JDK).
📢 Extiende a otra librería gráfica más antigua llamada AWT.
```

#### 🐦 Indicaciones para Proyecto Salida

Para este proyecto desarrollaremos bajo las siguientes pautas.

```
📢 Imaginen alguna actividad que pueda ser apoyada por un aplicativo pequeño. Por ejemplo:
    -> Listado de Compras Semanal
📢 Implementemos la solución en base a lo indicaremos en el siguiente bloque "🐰 Arrancamos!!!".
📢 Podemos encontrar algunos ejemplos adicionales, solo si lo consideran necesario, en internet como:
    🎓 https://www.javatpoint.com/java-swing
    🎓 https://guru99.es/java-swing-gui/
    🎓 https://beginnersbook.com/2015/07/java-swing-tutorial/
    🎓 http://zetcode.com/tutorials/javaswingtutorial/firstprograms/
    🎓 http://zetcode.com/tutorials/javaswingtutorial/firstprograms/
    🎓 https://www.geeksforgeeks.org/java-swing-jpanel-examples/
```

#### 🐰 Arrancamos!!!

```
📢 Crearemos un proyecto como en la "Clase: Usando Eclipse", hasta el paso "📢 En una estructura real, dividimos nuestro..."
📢 Agregaremos el menú de lunes a domingo, con sus propios ingredientes. 
📢 Cuando tengamos todo esto completo nos emitirá como salida la lista de compras.
📢 Ahora instalaremos el complemento.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_2.png)

```
📢 Colocaremos el siguiente link: Oxygen - http://download.eclipse.org/releases/oxygen.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_3.png)

```
📢 Seleccionamos las siguientes opciones.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_4.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_5.png)

```
📢 Seleccionamos siguiente y finalizar.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_6.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_7.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_8.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_9.png)

```
📢 Reiniciamos el IDE.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_10.png)

```
📢 Seleccionamos el paquete que creamos "src/main", luego clic derecho para crear.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_11.png)

```
📢 Seleccionamos "Application Window".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_12.png)

```
📢 Damos un nombre cualquiera.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_13.png)

```
📢 Ahora que se ha creado vamos a la vista de diseñador.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_14.png)

```
📢 Podemos ver que esta vista nos da muchas herramientas con las que podemos construir un pequeño aplicativo.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_15.png)

```
📢 Para este ejemplo voy a indicar que necesito que no se ordenen los elementos a una cuadrícula, sino que sean a voluntad del diseñador.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_16.png)

```
📢 Para este ejemplo crearé un listado de opciones.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_17.png)

```
📢 Arrastraré este elemento a nuesta aplicación.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_18.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_19.png)

```
📢 Vuelvo a la parte donde esta el código, seleccionando la pertaña "Source".
📢 Acá agregaré las opciones que quiero que aparescan en mi combo.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_20.png)

```
📢 Vuelvo al área de diseñador para seleccionar una opción que tengo ahí.
📢 Con esa opción puedo ver como esta quedando el diseño.
📢 Esta opción es solo para ver de forma gráfica. Algunas acciones que implementamos ahí posiblemente no funcionen.
📢 Por ejemplo, no van a funcionar con esa opción "JOptionPane".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_21.png)

```
📢 Ahora vemos el resultado.
📢 Lo que nos queda ahi es alargar un poco mas este combo para que se vea mejor.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_22.png)

```
📢 A continuación les enseño el siguiente ejemplo que he desarrollado.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_23.png)

```
📢 Este es el código fuente.
📢 Puedes verlo acá tambien: https://github.com/gcquirozguzman/java-tcs-202001/blob/PRSA100001/src/main/java/Programa.java
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_24.png)

```
📢 Cuando se finaliza la implementación de todo el código, podemos probarlo complemtanete así.
📢 Clic derecho en el archivo Java que creamos.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_25.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_26.png)

```
📢 Seleccionaré el día Lunes y agregare 3 opciones, luego clic en "Guardar".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_27.png)

```
📢 Seleccionaré el día Jueves y agregare 3 opciones, luego clic en "Guardar".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_28.png)

```
📢 Ahora clic en "Generar Lista".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_29.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/PRSA100001_30.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001)
