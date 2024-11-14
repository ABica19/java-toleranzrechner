import javax.swing.*;

public class Main {
    public static void main(String[] args) {


    }


    public static void showMainMenu(){
        JOptionPane.showMessageDialog(null, "Welcome to Java Toleranzrechner", "Herzlich Willkommen", JOptionPane.PLAIN_MESSAGE);
        String userInput = JOptionPane.showInputDialog("To proceed, please select one of the following options:\n"+"1. Start Calculator"+"\n"+"2.Exit");
        int userInputAsInt = Integer.parseInt(userInput);
        

    }
}
