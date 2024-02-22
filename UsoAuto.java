
package Auto;

import javax.swing.JOptionPane;

public class UsoAuto {
    public static void main(String[] args) {

        Auto miAuto = new Auto();

        String colorAuto = JOptionPane.showInputDialog("Ingrese el color del auto:");
        miAuto.establecerColor(colorAuto);

        System.out.println(miAuto.datosGeneralesDelAuto());
        System.out.println(miAuto.dimeColor());

        Furgoneta miFurgoneta = new Furgoneta(1500);
        miFurgoneta.establecerColor("Verde");
        System.out.println(miFurgoneta.datosGeneralesDelAuto());
        System.out.println(miFurgoneta.dimeDatosFurgoneta());
    }
}
