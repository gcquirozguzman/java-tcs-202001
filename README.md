# Taller Java TCS
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/ICLC100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/GE00100001)

_Clase 55: JOptionPane._

```
📢 Es una clase que nos sirve de una serie de ventanas de diálogo para comunicarnos con nuestro programa.
📢 Esta clase contiene los siguientes métodos.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_1.png)

```
📢 Crearemos una clase "Programa" donde indicaremos los métodos de JOptionPane.
📢 Podemos guiarnos de la documentación en el siguiente link
    https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
```

### ShowMessageDialog

```
📢 Si queremos enviar un mensaje podemos invocar lo siguiente.

📢 Solo enviamos el mensaje que deseamos mostrar en la ventana de diálogo.
    JOptionPane.showMessageDialog(null, "Mensaje");
    
📢 Enviamos el mensaje, el titulo y el icono que queremos que muestre nuestra ventana de diálogo.
  
    JOptionPane.showMessageDialog(null, "Mensaje", "Titulo", JOptionPane.ERROR_MESSAGE);
    
📢 Tenemos distintos tipos de de iconos que acompañan a la ventana.
    
    ERROR_MESSAGE
    INFORMATION_MESSAGE    
    QUESTION_MESSAGE
    WARNING_MESSAGE
    PLAIN_MESSAGE

📢 Veremos el resultado a continuación.
📢 Tener en cuenta que la libreria que usaremos es la siguiente.
    
    import javax.swing.JOptionPane;

📢 Para que se muestren debemos ejecutar como "Java Application" la clase.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_2.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_3.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_4.png)

### ShowInputDialog

```
📢 También podemos generar ventanas con consultas.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_5.png)

```
📢 Envía una consulta y el resultado lo guarda en una variable:
    String respuesta = JOptionPane.showInputDialog("Cuanto es 1 + 1?");
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_6.png)


```
📢 Envía una consulta, pero se puede enviar una respuesta predeterminada. El resultado lo guarda en una variable:
    String respuesta = JOptionPane.showInputDialog("Cuanto es 1 + 1?", "La respuesta es 2");
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_7.png)

```
📢 Envía una consulta, se envía un título e ícono .El resultado lo guarda en una variable.:
    String respuesta = JOptionPane.showInputDialog(null, "Ingrese su clave nuevamente", "Error!", JOptionPane.ERROR_MESSAGE);
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_8.png)


```
📢 Creamos un arreglo de alumnos.
📢 Envía una consulta, se envía un título, ícono, listado de alumnos y alumno que quiero que esté marcado por defecto .El resultado lo guarda en una variable:
   String respuesta = (String) JOptionPane.showInputDialog(null, "Seleccione Alumno", "Jalados", JOptionPane.DEFAULT_OPTION, null, alumnos, alumnos[2]);
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_9.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_10.png)

### ShowConfirmDialog

```
📢 De la misma forma, podemos generar ventanas con consultas con opciones de respuesta en botones.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_11.png)

```
📢 Se genera la ventana, se envía el mensaje y se muestran los botones por defecto. El resultado lo guarda en una variable:
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_12.png)

```
📢 Se genera la ventana, se envía el mensaje, título y los botones que deseamos mostrar. El resultado lo guarda en una variable:
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_13.png)

```
📢 Se genera la ventana, se envía el mensaje, título, los botones que deseamos mostrar y el ícono de la ventana. El resultado lo guarda en una variable:
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_14.png)

### ShowOptionDialog

```
📢 Por último, podemos generar ventanas con todas las opciones anteriores.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_15.png)

```
📢 Se genera la ventana, se envía el mensaje, título, los botones que deseamos mostrar, el ícono de la ventana, opciones y la opción marcada por defecto. El resultado lo guarda en una variable:
    int seleccion = JOptionPane.showOptionDialog(null, "Que opcion deseas?", "Lista de Compras", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_16.png)

### Indicaciones

```
📢 Si se desea conocer todas las opciones que tiene, por ejemplo JOptionPane, solo bastaría agregar la palabra y luego el punto. Ahí aparecerán las opciones.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-55/imagenes/pagina_55_17.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/ICLC100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/GE00100001)
