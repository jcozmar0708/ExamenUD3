package ejercicio1;

public class Examen {
    private String titulo;
    private double calificacion;
    private static String asignatura = null;

    public Examen(String titulo, double calificacion) throws Exception {
        if (titulo != null) {
            this.titulo = titulo;
        } else {
            throw new Exception("El título no puede estar vacío");
        }
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        } else {
            throw new Exception("La calificación debe estar entre 0 y 10");
        }
    }

    public Examen(Examen examen) {
        this.titulo = examen.getTitulo();
        this.calificacion = examen.getCalificacion();
    }

    public Examen(String titulo, Examen examen) {
        this.titulo = titulo;
        this.calificacion = examen.getCalificacion();
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public static String getAsignatura() {
        return asignatura;
    }

    public static void setAsignatura(String asignatura) {
        Examen.asignatura = asignatura;
    }

    @Override
    public String toString() {
        if (asignatura != null) {
            return asignatura + " - " + this.titulo + " - " + this.calificacion;
        }
        return this.titulo + " - " + this.calificacion;
    }

    public int redondear(){
        return (int) Math.round(this.calificacion);
    }

    public boolean estaAprobado(){
        if (this.calificacion >= 5) {
            return true;
        }
        return false;
    }
}
