package Ejercicio01;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        //Instanciación alumno
        Alumno alumno = new Alumno("Juan", "Pérez");

        //Añadir asignaturas y notas
        alumno.informarAsignatura(new Asignatura("Lengua", 9.5));
        alumno.informarAsignatura(new Asignatura("Matemáticas", 8.7));
        alumno.informarAsignatura(new Asignatura("Geografía", 7.2));

        //Modificar nota de asignatura
        alumno.modificarNota("Matemáticas", 9.2);

        //Mostrar el boletín de notas del alumno
        alumno.mostrarBoletin();
    }
}

