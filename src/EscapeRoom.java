import javax.swing.*;

public class EscapeRoom {

    /*Make sure it is difficult to exit the dangerous room*/

    public static void main(String[] args) {


        int sizeOfHead = Integer.parseInt(JOptionPane.showInputDialog("So how big is your head?"));
        int numberOfDates = Integer.parseInt(JOptionPane.showInputDialog("How many girls dated you?"));
        int timesCakeWasConsumed = Integer.parseInt(JOptionPane.showInputDialog("How much cake did you eat?"));

        if (sizeOfHead >= 30) ;
        System.out.println("Your head will fit through the door. Have a nice day");

        if (numberOfDates >= 5) {
            System.out.println("Girls like you. You may leave.");
        } else {

            if (timesCakeWasConsumed >= 2) {
                System.out.println("You have saved cake for others. Leave.");

            } else {
                System.out.println("You may not escape.");
            }else{
                System.out.println("Not enough girls like you. You can't escape");
            }else{
                System.out.println("You have eaten all the cake. You may not leave.");
            }

        }
    




