package ejercicio1;

public class EjercicioExamen {
    public static void main(String[] args) throws Exception {
        Examen e1 = new Examen("Tema 1",8.2);
        Examen e2 = new Examen("Tema 2",7.8);
        Examen e3 = new Examen(e1);
        Examen e4 = new Examen("Tema 3",e2);
        Examen e5 = new Examen("Tema 4",4.2);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        Examen.setAsignatura("Programación");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        System.out.println(e1.redondear());
        System.out.println(e2.redondear());
        System.out.println(e5.redondear());

        aprobado(e1);
        aprobado(e2);
        aprobado(e5);
    }

    private static void aprobado(Examen examen){
        if (examen.estaAprobado()) {
            System.out.println("Está aprobado");
        } else {
            System.out.println("Está suspenso");
        }
    }
}
