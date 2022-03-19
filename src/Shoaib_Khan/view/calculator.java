package Shoaib_Khan.view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class calculator implements ActionListener {
    private JPanel panel1;
    private JButton answerButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonDiv;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton buttonMul;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton buttonMinus;
    private JButton a0Button;
    private JButton a00Button;
    private JButton button16;
    private JButton buttonPlus;
    private JTextArea textArea1;
    private JButton ACButton;
    public double sum=0, cnt=0;
    private String num = "";
    String action, operator="P";

    public calculator(){
        addAction();
    }
    public void run(){
        JFrame frame = new JFrame("Calculator");
        frame.setSize(1000,1000);
        panel1.setSize(1000,1000);
        frame.setContentPane(new calculator().panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    new calculator();

        frame.pack();
        frame.setVisible(true);
    }

    public void addAction(){

        a1Button.addActionListener(this);
        a1Button.setActionCommand("1");
        a2Button.addActionListener(this);
        a2Button.setActionCommand("2");
        a3Button.addActionListener(this);
        a3Button.setActionCommand("3");
        a4Button.addActionListener(this);
        a4Button.setActionCommand("4");
        a5Button.addActionListener(this);
        a5Button.setActionCommand("5");
        a6Button.addActionListener(this);
        a6Button.setActionCommand("6");
        a7Button.addActionListener(this);
        a7Button.setActionCommand("7");
        a8Button.addActionListener(this);
        a8Button.setActionCommand("8");
        a9Button.addActionListener(this);
        a9Button.setActionCommand("9");
        a0Button.addActionListener(this);
        a0Button.setActionCommand("0");
        buttonPlus.addActionListener(this);
        buttonPlus.setActionCommand("P");
        buttonMinus.addActionListener(this);
        buttonMinus.setActionCommand("M");
        buttonMul.addActionListener(this);
        buttonMul.setActionCommand("Mu");
        buttonDiv.addActionListener(this);
        buttonDiv.setActionCommand("D");
        answerButton.addActionListener(this);
        answerButton.setActionCommand("Ans");
        button16.addActionListener(this);
        button16.setActionCommand(".");
        a00Button.addActionListener(this);
        a00Button.setActionCommand("00");
        ACButton.addActionListener(this);
        ACButton.setActionCommand("AC");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        action = e.getActionCommand();
        if(!action.equals("P") &&!action.equals("M") && !action.equals("Mu") && !action.equals("D") && !action.equals("Ans") && !action.equals("AC") ) {
            num += action;
            textArea1.setText(num);
        }
        else{
            if(operator.equals("P") && !num.equals(""))sum += Double.valueOf(num);
            else if(operator.equals("M")&& !num.equals(""))sum -= Double.valueOf(num);
            else if(operator.equals("Mu")&& !num.equals(""))sum *= Double.valueOf(num);
            else if(operator.equals("D")&& !num.equals(""))sum /= Double.valueOf(num);
            if(action.equals("AC")){
                sum = 0.0;

            }

            num = "";
            if(sum == (double) Integer.valueOf((int) sum)) textArea1.setText(String.valueOf((int)sum));
             else textArea1.setText(String.valueOf(BigDecimal.valueOf(sum).setScale(5, RoundingMode.HALF_UP).doubleValue()));

            operator = action;
        }


        System.out.println("Pressed!");

    }

}
