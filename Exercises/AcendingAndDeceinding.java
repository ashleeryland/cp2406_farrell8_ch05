import javax.swing.*;

/**
 * Created by rylan on 27/08/2016.
 */
public class AcendingAndDeceinding
{
    public static void main(String[] args)
    {
        String userNum1, userNum2, userNum3;
        int low, med, high;
        userNum1 = JOptionPane.showInputDialog(null, "Enter a number:");
        int num1 = Integer.parseInt(userNum1);
        userNum2 = JOptionPane.showInputDialog(null, "Enter a number:");
        int num2 = Integer.parseInt(userNum2);
        userNum3 = JOptionPane.showInputDialog(null, "Enter a number:");
        int num3 = Integer.parseInt(userNum3);

        if(num1 <= num2 && num1 <= num3)
        {
            low = num1;
            if(num2 <= num3)
            {
                med = num2;
                high = num3;
            }
            else
            {
                med = num3;
                high = num2;
            }
        }
        else
        {
            if(num2 <= num1 && num2 <= num3)
            {
                low = num2;
                if(num1 <= num3)
                {
                    med = num1;
                    high = num3;
                }
                else
                {
                    med = num3;
                    high = num1;
                }
            }
            else
            {
                low = num3;
                if(num1 <= num2)
                {
                    med = num1;
                    high = num2;
                }
                else
                {
                    med = num2;
                    high = num1;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Ascending: " + low + " " +
                med + " " + high);
        JOptionPane.showMessageDialog(null,"Descending: " + high + " " +
                med + " " + low);


    }
}