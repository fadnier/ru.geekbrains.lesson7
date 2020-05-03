import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private float summ = 0;
    private String action = "+";

    public Window() {
        setBounds(300,300,400,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Окошко");


        JPanel upPanel = new JPanel();
        upPanel.setLayout(new BoxLayout(upPanel,BoxLayout.X_AXIS));
        //upPanel.setPreferredSize(new Dimension(400,100));
        JTextField textField = new JTextField();
        upPanel.add(textField);

        add(upPanel,BorderLayout.NORTH);

        JPanel downPanel = new JPanel(new GridLayout(4,5));
        //downPanel.setPreferredSize(new Dimension(400,400));
        for (int i = 1; i < 10; i++) {
            JButton btn = new JButton(""+i);
            downPanel.add(btn);

            int finalI = i;
            btn.addActionListener(e -> {
                textField.setText(String.format("%s%d", textField.getText(), finalI));
            });
        }
        JButton buttonZero = new JButton("0");
        JButton buttonDrob = new JButton(".");
        JButton buttonReset = new JButton("C");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonYmnoz = new JButton("*");
        JButton buttonDelenie = new JButton("/");
        JButton buttonRavno = new JButton("=");
        downPanel.add(buttonPlus);
        downPanel.add(buttonMinus);
        downPanel.add(buttonYmnoz);
        downPanel.add(buttonDelenie);
        downPanel.add(buttonZero);
        downPanel.add(buttonDrob);
        downPanel.add(buttonReset);
        downPanel.add(buttonRavno);

        buttonZero.addActionListener(e -> {
            textField.setText(String.format("%s%d", textField.getText(), 0));
        });
        buttonDrob.addActionListener(e -> {
            textField.setText(String.format("%s%s", textField.getText(), "."));
        });
        buttonReset.addActionListener(e -> {
            summ = 0;
            action = "+";
            textField.setText("");
        });
        buttonPlus.addActionListener(e -> {
            textField.setText(actionMethod("+",textField));
        });
        buttonMinus.addActionListener(e -> {
            textField.setText(actionMethod("-",textField));
        });
        buttonDelenie.addActionListener(e -> {
            textField.setText(actionMethod("/",textField));
        });
        buttonYmnoz.addActionListener(e -> {
            textField.setText(actionMethod("*",textField));
        });
        buttonRavno.addActionListener(e -> {
            textField.setText(actionMethod("=",textField));
        });

        add(downPanel,BorderLayout.SOUTH);

        setVisible(true);
    }

    private String actionMethod(String meth, JTextField textField) {
        if(action.equals("+")) {
            System.out.println(String.valueOf(summ)+" "+action+" "+Float.parseFloat(textField.getText()));
            summ = summ + Float.parseFloat(textField.getText());
        } else if(action.equals("-")) {
            System.out.println(String.valueOf(summ)+" "+action+" "+Float.parseFloat(textField.getText()));
            summ = summ - Float.parseFloat(textField.getText());
        } else if(action.equals("*")) {
            System.out.println(String.valueOf(summ)+" "+action+" "+Float.parseFloat(textField.getText()));
            summ = summ * Float.parseFloat(textField.getText());
        } else if(action.equals("/")) {
            System.out.println(String.valueOf(summ)+" "+action+" "+Float.parseFloat(textField.getText()));
            summ = summ / Float.parseFloat(textField.getText());
        }
        action = meth;
        if(meth == "=") {
            return String.valueOf(summ);
        } else {
            return "";
        }

    }
}
