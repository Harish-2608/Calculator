package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {

    JLabel displayLabel;
    JButton nineButton;
    JButton eightButton;
    JButton sevenButton;
    JButton sixButton;
    JButton fiveButton;
    JButton fourButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divisionButton;
    JButton multiplyButton;
    JButton subtractButton;
    JButton addButton;
    JButton clearButton;

    boolean isOperatorClicked = false;

    String oldvalue;
    String newvalue;
    String operator;

    public calculator() {
        JFrame jf = new JFrame("Calci");
        jf.setLayout(null);
        jf.setSize(410, 600);
        jf.setLocation(300, 100);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 350, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        nineButton = new JButton("9");
        nineButton.setBounds(30, 130, 70, 70);
        nineButton.setBackground(Color.gray);
        nineButton.addActionListener(this);
        jf.add(nineButton);
        eightButton = new JButton("8");
        eightButton.setBounds(120, 130, 70, 70);
        eightButton.setBackground(Color.gray);
        eightButton.addActionListener(this);
        jf.add(eightButton);
        sevenButton = new JButton("7");
        sevenButton.setBounds(210, 130, 70, 70);
        sevenButton.setBackground(Color.gray);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        sixButton = new JButton("6");
        sixButton.setBounds(30, 210, 70, 70);
        sixButton.setBackground(Color.gray);
        sixButton.addActionListener(this);
        jf.add(sixButton);
        fiveButton = new JButton("5");
        fiveButton.setBounds(120, 210, 70, 70);
        fiveButton.setBackground(Color.gray);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);
        fourButton = new JButton("4");
        fourButton.setBounds(210, 210, 70, 70);
        fourButton.setBackground(Color.gray);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        threeButton = new JButton("3");
        threeButton.setBounds(30, 290, 70, 70);
        threeButton.setBackground(Color.gray);
        threeButton.addActionListener(this);
        jf.add(threeButton);
        twoButton = new JButton("2");
        twoButton.setBounds(120, 290, 70, 70);
        twoButton.setBackground(Color.gray);
        twoButton.addActionListener(this);
        jf.add(twoButton);
        oneButton = new JButton("1");
        oneButton.setBounds(210, 290, 70, 70);
        oneButton.setBackground(Color.gray);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 380, 70, 70);
        dotButton.setBackground(Color.gray);
        dotButton.addActionListener(this);
        jf.add(dotButton);
        zeroButton = new JButton("0");
        zeroButton.setBounds(120, 380, 70, 70);
        zeroButton.setBackground(Color.gray);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        equalButton = new JButton("=");
        equalButton.setBounds(210, 380, 70, 70);
        equalButton.setBackground(Color.gray);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divisionButton = new JButton("/");
        divisionButton.setBounds(300, 130, 70, 70);
        divisionButton.setBackground(Color.gray);
        divisionButton.addActionListener(this);
        jf.add(divisionButton);
        multiplyButton = new JButton("*");
        multiplyButton.setBounds(300, 210, 70, 70);
        multiplyButton.setBackground(Color.gray);
        multiplyButton.addActionListener(this);
        jf.add(multiplyButton);
        subtractButton = new JButton("-");
        subtractButton.setBounds(300, 290, 70, 70);
        subtractButton.setBackground(Color.gray);
        subtractButton.addActionListener(this);
        jf.add(subtractButton);
        addButton = new JButton("+");
        addButton.setBounds(300, 380, 70, 70);
        addButton.setBackground(Color.gray);
        addButton.addActionListener(this);
        jf.add(addButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(30, 460,340, 70);
        clearButton.setBackground(Color.gray);
        clearButton.addActionListener(this);
        jf.add(clearButton);
    }

    public static void main(String[] args) {
        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        } else if (e.getSource() == eightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        } else if (e.getSource() == sevenButton) {
            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }
        } else if (e.getSource() == sixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        } else if (e.getSource() == fiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        } else if (e.getSource() == fourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        } else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        } else if (e.getSource() == equalButton) {
            newvalue = displayLabel.getText();
            float oldvalueF = Float.parseFloat(oldvalue);
            float newvalueF = Float.parseFloat(newvalue);
            float result = 0;

            switch (operator) {
                case "+":
                    result = oldvalueF + newvalueF;
                    break;
                case "-":
                    result = oldvalueF - newvalueF;
                    break;
                case "*":
                    result = oldvalueF * newvalueF;
                    break;
                case "/":
                    result = oldvalueF / newvalueF;
                    break;
            }

            displayLabel.setText(String.valueOf(result));
            oldvalue = String.valueOf(result);
        } else if (e.getSource() == divisionButton) {
            isOperatorClicked = true;
            operator = "/";
            oldvalue = displayLabel.getText();
        } else if (e.getSource() == multiplyButton) {
            isOperatorClicked = true;
            operator = "*";
            oldvalue = displayLabel.getText();
        } else if (e.getSource() == subtractButton) {
            isOperatorClicked = true;
            operator = "-";
            oldvalue = displayLabel.getText();
        } else if (e.getSource() == addButton) {
            isOperatorClicked = true;
            operator = "+";
            oldvalue = displayLabel.getText();
        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
            oldvalue = "";
            newvalue = "";
            operator = "";
            isOperatorClicked = false;
        }
    }
}
