
package Auto;


public class Furgoneta extends Auto {
    private int capacidadCarga;

    public Furgoneta(int capacidadCarga) {
        super(); // Llamar al constructor de la clase padre
        this.capacidadCarga = capacidadCarga;
    }

    public String datosGeneralesDelAuto() {
        return super.datosGeneralesDelAuto() + " y la capacidad de carga es: " + capacidadCarga;
    }

    public String dimeDatosFurgoneta() {
        return "La capacidad de carga es: " + capacidadCarga;
    }
}

