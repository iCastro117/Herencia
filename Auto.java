
package Auto;


public class Auto {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    private String color;

    public Auto() {
        ruedas = 4;
        largo = 20;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    public String datosGeneralesDelAuto() {
        return "El vehículo contiene: " + ruedas + " ruedas, Mide: " + largo + " metros, "
                + "con un ancho de: " + ancho + " cm, con un peso de: " + peso + " y posee un motor de: " + motor + " ECU ";
    }

    public void establecerColor(String colorAuto) {
        color = colorAuto;
    }

    public String dimeColor() {
        return "El color del auto es: " + color;
    }
}
