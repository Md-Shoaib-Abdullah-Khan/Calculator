import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabXm implements ActionListener {
    private JPanel panel1;
    private JTextPane textPane1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new LabXm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new LabXm();
        frame.pack();
        frame.setVisible(true);
    }
    LabXm(){
        button1.setActionCommand("pressed");
        button1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String st = e.getActionCommand();
        if(st.equals("pressed")){
            textPane1.setText(st);
        }
    }
}
