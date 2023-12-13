package ejercicio2;

public class EjercicioDeposito {
    public static void main(String[] args) throws Exception {
        Deposito d1 = new Deposito(100);
        Deposito d2 = new Deposito(200,"gasolina");

        System.out.println(d1);
        System.out.println(d2);

        if (d1.estaVacio()) {
            System.out.println(d1 + " está vacío");
        }

        d1.llenar(20,"aceite");
        d2.llenar(100,"gasolina");

        System.out.println(d1);
        System.out.println(d2);

        d1.llenar(40,"aceite");
        d2.llenar(10,"gasolina");

        System.out.println(d1);
        System.out.println(d2);

        d2.extraer(10);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1.getCantidad() + "%");
        System.out.println(d2.getCantidad() + "%");

        d2.transvasar(d1);

        System.out.println(d1);
        System.out.println(d2);

        d1.llenar(50,"aceite");

        d1.dibujar(10);
        d2.dibujar(5);
    }
}
