import javax.swing.*;

public class CRUD {
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CRUD");
        frame.setContentPane(new CRUD().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
