package Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    
    private String nombre;
    private String apellidos;
    private List<Asignatura> asignaturas;
    
   
    //Constructor Alumno
    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignaturas = new ArrayList<>();
    }

    //Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Informarle una asignatura al alumno
    public void informarAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }


    //Calcular la nota media
    public double mediaNotas() {
        double sumaNotas = 0;
        double notaMedia = 0;
        for (Asignatura asignatura : asignaturas) {
            sumaNotas += asignatura.getNota();
        }
        notaMedia = sumaNotas/asignaturas.size();
        return notaMedia;
    }

    //Metodo para mostrar el boletin de notas
    public void mostrarBoletin() {
        System.out.println(String.format("Alumno: %s %s", nombre, apellidos));
        System.out.println("Asignatura                                   Nota");
        System.out.println("-------------------------------------------------");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(String.format("%-40s %5.1f", asignatura.getNombre(), asignatura.getNota()));
        }
        System.out.println("-------------------------------------------------");
        System.out.println(String.format("Nota Media                                    %5.1f", mediaNotas()));
    }

    public void modificarNota(String nombreAsignatura, double nuevaNota) {
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                asignatura.setNota(nuevaNota);
                break;
            }
        }
    }
}
