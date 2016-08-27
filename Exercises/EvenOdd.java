/**
 * Created by rylan on 27/08/2016.
 */

import javax.swing.*;
public class EvenOdd
{
    public static void main(String[] args)
    {
        String userInputNumber;
        userInputNumber = JOptionPane.showInputDialog(null, "Enter a number:");
        int number = Integer.parseInt(userInputNumber);
        calcOddEven(number);
    }
    public static void calcOddEven(int number)
    {
        if (number % 2 == 0)
            JOptionPane.showMessageDialog(null, "Your number is even");
        else
            JOptionPane.showMessageDialog(null, "Your number is odd");
    }
}
