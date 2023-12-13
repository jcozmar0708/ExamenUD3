package ejercicio2;

public class Deposito {
    private int capacidad;
    private Contenido contenido;
    private int cantidad = 0;

    public Deposito(int capacidad) {
        this.capacidad = capacidad;
    }

    public Deposito(int capacidad, String contenido) {
        this.capacidad = capacidad;
        try {
            this.contenido = Contenido.valueOf(contenido.toUpperCase());
        } catch (Exception e) {
            System.out.println("El contenido tiéne que ser válido");
        }
    }

    @Override
    public String toString() {
        if (this.contenido == null) {
            return "Depósito " + "(" + this.cantidad + "/" + this.capacidad + " l.)";
        }
        return this.contenido + " (" + this.cantidad + "/" + this.capacidad + " l.)";
    }

    public boolean estaVacio(){
        if (this.cantidad == 0) {
            return true;
        }
        return false;
    }

    public int llenar(int cantidad, String contenido) throws Exception {
        this.cantidad += cantidad;
        if (this.cantidad > this.capacidad) {
            throw new Exception("Se ha superado la capacidad máxima");
        }
        if (this.contenido == null) {
            setContenido(Contenido.valueOf(contenido.toUpperCase()));
        }
        if (!contenido.toUpperCase().equals(String.valueOf(this.contenido))){
            throw new Exception("El contenido tiene que ser el mismo que el contenido del depósito");
        }
        return this.cantidad;
    }

    public int extraer(int cantidad) throws Exception {
        this.cantidad -= cantidad;
        if (this.cantidad < 0) {
            throw new Exception("No se puede extraer la cantidad indicada");
        }
        return this.cantidad;
    }

    public double getPorcentaje() {
        return (double) (this.cantidad * 100) / this.capacidad;
    }

    public void transvasar(Deposito deposito) throws Exception {
        this.cantidad += deposito.getCantidad();
        if (this.cantidad > this.capacidad) {
            throw new Exception("Se ha superado la capacidad máxima");
        }
        deposito.setCantidad(0);
    }

    public void dibujar(int longitud) {
        System.out.print(getPorcentaje() +"% |");
        for (int i = 0; i < longitud; i++) {
            if (i < (getPorcentaje() / 100) * longitud) {
                System.out.print('#');
            } else {
                System.out.print('.');
            }
        }
        System.out.println('|');
    }

    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    private void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
