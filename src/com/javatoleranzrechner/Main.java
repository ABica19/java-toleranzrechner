import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("1.Berechnung starten"+"\n"+"2.Programm beenden");
        int chosenNumber = Integer.parseInt(userInput);
        JOptionPane.showMessageDialog(null,"Chosen Number was: "+chosenNumber);


    }
}
