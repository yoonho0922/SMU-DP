package ass08;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalcGUIV1 extends JFrame implements ActionListener {
    final static int WINDOW_WIDTH = 400;
    final static int WINDOW_HEIGHT = 300;
    final static int COMPONENT_HEIGHT = 40;
    final static int BUTTON_WIDTH = 50;

    String[] buttonText = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "=" };
    JButton[] buttons = new JButton[buttonText.length];
    Calculator calculator;

    Dimension displayDimension = new Dimension(WINDOW_WIDTH - 20, COMPONENT_HEIGHT);
    Dimension buttonDimension = new Dimension(BUTTON_WIDTH, COMPONENT_HEIGHT);

    JLabel display = new JLabel(); // 숫자 값 및 결과 출력 화면
    JButton cmdButton;
    NumberButtonCommand numberButtonCommand;
    EqualButtonCommand equalButtonCommand;
    OperatorButtonCommand operatorButtonCommand;

    CalcGUIV1() {
        super("CalcGUIV1");
        calculator = new Calculator();

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Font labelFont = display.getFont();
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font(labelFont.getName(), Font.PLAIN, COMPONENT_HEIGHT - 5));
        display.setPreferredSize(new Dimension(displayDimension));
        setResizable(false);
        setLayout(new BorderLayout());
        add(getDisplayPanel(), BorderLayout.NORTH);
        add(getButtonPanel(), BorderLayout.CENTER);
        clear();


    }

    public JPanel getDisplayPanel() {
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        displayPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        displayPanel.setPreferredSize(displayDimension);
        displayPanel.add(display);
        return displayPanel;
    }
    public JPanel getButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,3,10,5));
        for (int i = 0; i < buttonText.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText(buttonText[i]);
            buttons[i].setPreferredSize(buttonDimension);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        return buttonPanel;
    }

    public void clear() {
        display.setText("0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cmdButton = (JButton) e.getSource();
        numberButtonCommand = new NumberButtonCommand(calculator, cmdButton, display);
        equalButtonCommand = new EqualButtonCommand(calculator, display);
        operatorButtonCommand = new OperatorButtonCommand(calculator, cmdButton);

        if (cmdButton == buttons[0] || cmdButton == buttons[1]  || cmdButton == buttons[2]  ||
                cmdButton == buttons[3]  || cmdButton == buttons[4]  || cmdButton == buttons[5]  ||
                cmdButton == buttons[6]  || cmdButton == buttons[7]  || cmdButton == buttons[8]  ||
                cmdButton == buttons[9] ) { // 0-9 버튼
            numberButtonCommand.execute();
        }
        else if (cmdButton == buttons[14]) { // = 버튼
            equalButtonCommand.execute();
        }
        else if (cmdButton == buttons[10] || cmdButton == buttons[11] ||
                cmdButton == buttons[12] || cmdButton == buttons[13]) { // +, -, *, / 버튼
            operatorButtonCommand.execute();
        }
    }

    public static void main(String[] args) {
        CalcGUIV1 c = new CalcGUIV1();
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setVisible(true);
    }
}

