# Taller Java TCS
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/DEI0100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/MDEX100001)

_Clase: Alta Cohesión y Bajo Acoplamiento._

### Alta Cohesión
```
📢 Cada elemento debe realizar solo 1 función.
📢 Unión fuerte entre 2 elementos de algo.
```
### Bajo Acoplamiento
```
📢 Esto indica que existe independencia entre clases.
📢 Permite la unión de 2 o mas piezas requeridas por el aplicativo.
```

```
📢 Esto permite crear código mantenible, reutilizable y escalable.
📢 Crearemos la clase "AltaCohesionBajoAcoplamiento" en donde pondremos nuestro código.
📢 Podría crear un método en donde coloque todas mis operaciones.
📢 ¿Pero que sucede si es que necesito llamar ciertas operaciones de este método en otro? 
📢 Supongamos que tengo el método calcularNotasAlumno() y calificarProfesor().

  > obtenerNotasAlumno() - Método que solo obtiene notas de alumno de una BD (Alta Cohesión).
  > obtenerNotasProfesor() - Método que solo obtiene notas de profesor de una BD (Alta Cohesión).
  > sumarNotas() - Método que solo suma notas. Este método lo usaré para ambos casos (Alta Cohesión).
  > mostrarNotas() - Método que se encarga de mostrar notas en la consola (Alta Cohesión).

📢 El método calcularNotasAlumno() llamará a las siguiente (Bajo Acoplamiento):
  > obtenerNotasAlumno()
  > sumarNotas()
  > mostrarNotas()
📢 El método obtenerNotasProfesor() llamará a las siguiente (Bajo Acoplamiento):
  > obtenerNotasProfesor()
  > sumarNotas()
  > mostrarNotas()

```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/ACBA100001_3.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-tcs-202001/blob/master/imagenes/ACBA100001_4.png)


## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-tcs-202001/tree/DEI0100001) 🗃️ [Página principal](https://github.com/gcquirozguzman/java-tcs-202001) 📤 [Página Siguiente](https://github.com/gcquirozguzman/java-tcs-202001/tree/MDEX100001)
