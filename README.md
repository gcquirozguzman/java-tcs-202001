# Taller Java TCS

_Clase 54: Interactuando con la Consola._

```
📢 Para poder obtener los valores que escribo en la consola es necesario agregar las siguientes líneas.
    
    InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
    
📢 Enviaremos un mensaje a la consola.

    System.out.println("Ingrese un valor : ");

📢 La siguiente linea bloquea la ejecución del programa hasta obtener una respuesta seguro de Enter.
    
    String input = scanner.next();

📢 Obtenemos el valor escrito en la consola consultando a la variable "input".

    System.out.println("El valor ingresado es : " + input);
    
📢 Informamos que ya no usaremos el objeto Scanner, de esta forma liberamos recursos.

    scanner.close();

📢 Tener en cuenta que las librerías importadas son las siguiente.

    import java.io.InputStream;
    import java.util.Scanner;
    
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-54/imagenes/pagina_54_1.png)

```
📢 Si queremos probar hacemos clic izquierdo en la clase.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-54/imagenes/pagina_54_2.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)



⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊
