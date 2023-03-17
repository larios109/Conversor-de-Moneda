import javax.swing.*;

public class Conversion {

    private double conversion;

    public void ConvertirMoneda(double cantidad){

        String OpcionesMonedas = (JOptionPane.showInputDialog(null, "Elige la moneda a " +
                "la que deseas convertir tu dinero", "Monedas", JOptionPane.QUESTION_MESSAGE, null,
                new Object[] {"De Lempira a Dólar", "De Lempira a Euro", "De Lempira a Libras", "De Lempira a Yen",
                        "De Lempira a Won Coreano", "De Dólar a Lempira", "De Euro a Lempira", "De Libras a Lempira",
                        "De Yen a Lempira", "De Won Coreano a Lempira"}, "Seleccion")).toString();

        switch (OpcionesMonedas){
            case "De Lempira a Dólar":
                conversion = cantidad * 0.041;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Dolares");
            break;

            case "De Lempira a Euro":
                conversion = cantidad * 0.038;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Euros");
            break;

            case "De Lempira a Libras":
                conversion = cantidad * 0.034;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Libras");
            break;

            case "De Lempira a Yen":
                conversion = cantidad * 5.51;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Yen");
            break;

            case "De Lempira a Won Coreano":
                conversion = cantidad * 52.55;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Coreano");
            break;

            case "De Dólar a Lempira":
                conversion = cantidad * 24.65;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Lempiras");
            break;

            case "De Euro a Lempira":
                conversion = cantidad * 26.12;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Lempiras");
            break;

            case "De Libras a Lempira":
                conversion = cantidad * 29.76;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Lempiras");
            break;

            case "De Yen a Lempira":
                conversion = cantidad * 0.19;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Lempiras");
            break;

            case "De Won Coreano a Lempira":
                conversion = cantidad * 0.019;
                JOptionPane.showMessageDialog(null, "Tienes " + conversion + " Lempiras");
            break;
        }
    }
}
