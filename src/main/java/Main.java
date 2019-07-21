
import javax.swing.*;
import java.awt.Color;

public class Main {

    public static void main (String [] args)
    {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();


        obj.setBounds(10, 10, 500 ,500);
        obj.setBackground(Color.DARK_GRAY);
        obj.setTitle("PatoPanda");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
}
