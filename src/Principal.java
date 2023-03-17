import javax.swing.*;

public class Principal {
    public static void main (String[] args){

        Conversion monedas = new Conversion();

        try {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de " +
                    "conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moneda",
                    "Converor de Temperatura"}, "Seleccion")).toString();

            int menuSI = JOptionPane.YES_OPTION;

            switch (opciones){
                case "Conversor de moneda":
                    String cantidad = JOptionPane.showInputDialog("Ingrrese la cantidad de dinero que desea convertir");
                    if (ValidarNumero(cantidad) == true){
                        double valor = Double.parseDouble(cantidad);
                        monedas.ConvertirMoneda(valor);
                    }else{
                        JOptionPane.showMessageDialog(null, "Valor Inválido");
                        cantidad = JOptionPane.showInputDialog("Ingrrese la cantidad de dinero que desea convertir");
                        double valor = Double.parseDouble(cantidad);
                        monedas.ConvertirMoneda(valor);
                    }

                    int seleccion = JOptionPane.showConfirmDialog(null,"¿Quiere volver " +
                            "a convertir?");
                    System.out.println(seleccion);
                 break;

            } while (JOptionPane.YES_OPTION == menuSI);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Vuelva Pronto!");
        }
    }

    public static boolean ValidarNumero(String cantidad){
        try{
            double x = Double.parseDouble(cantidad);
            if (x >= 0 || x < 0);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
