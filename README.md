# Taller Java TCS

_Clase 25: Operador Ternario._

```
📢 Cuando queremos hacer una validación de forma resumida, podemos optar por este tipo de estructura.
```

```
A continuación indicamos el siguiente bloque condicional.

  if(condicion){
    ejecutar A
  }else{
    ejecutar B
  }

Este bloque podemos simplificarlo de la siguiente forma.

  (condicion) ? ejecutar A : ejecutar B
  
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-25/imagenes/pagina_25_3.png)

```
En caso de una condicion anidada, también es posible convertirla.

  if(condicion){
    if(condicion){
      ejecutar A.1
    }else{
      ejecutar A.2
    }
  }else{
    ejecutar B
  }

Este bloque podemos simplificarlo de la siguiente forma.

  (condicion) ? ((condicion) ? ejecutar A.1 : ejecutar A.2) : ejecutar B
  
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/Clase-25/imagenes/pagina_25_2.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)



⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊
