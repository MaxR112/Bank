import javax.swing.*;

public class Main {
    static void button() {
        JFrame firstFrame = new JFrame();
        JButton b1 = new JButton("Click me!");
        firstFrame.add(b1);
        b1.setBounds(200,100,100,100);
        firstFrame.setSize(500, 500);
        firstFrame.setLayout(null);
        firstFrame.setVisible(true);
    }

    public static void main(String[] args) {
        button();
    }


}