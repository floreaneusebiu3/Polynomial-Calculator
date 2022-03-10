import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class View {

    private Model model = new Model();

    private JFrame frame = new JFrame("Polynomial calculator");
    private JTextArea polinom1 = new JTextArea("3x^3+2x^2+2x^1+1x^0");
    private JLabel p1 = new JLabel("P");
    private JLabel p2 = new JLabel("Q:");
    private JLabel r = new JLabel("R:");
    private JTextArea polinom2 = new JTextArea("2x^3-4x^2+2x^1-9x^0");
    private JTextArea out = new JTextArea();
    private boolean p1_selected = false;
    private boolean p2_selected = false;


    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");

    private JButton mulButton = new JButton("*");
    private JButton addButton = new JButton("+");
    private JButton minButton = new JButton("-");
    private JButton divButton = new JButton(":");
    private JButton integButton = new JButton("Integrare");
    private JButton derivButton = new JButton("Derivare");
    private JButton equalsButton = new JButton("=");
    private JButton clearButton = new JButton("C");
    private JButton xButton = new JButton("x");
    private JButton powButton = new JButton("^");
    private JButton plusButton = new JButton("++");
    private JButton minusButton = new JButton("++");

    public View() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(285, 540);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
    }

    public void createButtons() {
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        polinom1.setSize(250, 50);
        polinom1.setBackground(new Color(104, 165, 255));
        polinom1.setLocation(25, 0);
        polinom1.setFont(new Font("SansSerif", Font.BOLD, 14));
        p1.setFont(new Font("SansSerif", Font.BOLD, 16));
        p1.setForeground(new Color(104, 165, 255));
        p1.setSize(30, 50);
        p1.setText("P:");
        p1.setLocation(5, 0);
        polinom2.setSize(250, 50);
        polinom2.setLocation(25, 55);
        polinom2.setBackground(new Color(104, 165, 255));
        polinom2.setFont(new Font("SansSerif", Font.BOLD, 14));
        p2.setFont(new Font("SansSerif", Font.BOLD, 16));
        p2.setForeground(new Color(104, 165, 255));
        p2.setSize(30, 50);
        p2.setLocation(5, 55);
        out.setSize(250, 50);
        out.setLocation(25, 110);
        out.setBackground(new Color(104, 165, 255));
        out.setFont(new Font("SansSerif", Font.BOLD, 14));
        out.setLineWrap(true);
        out.setWrapStyleWord(true);
        r.setFont(new Font("SansSerif", Font.BOLD, 16));
        r.setForeground(new Color(104, 165, 255));
        r.setSize(30, 50);
        r.setLocation(5, 110);
        button0.setSize(50, 50);
        button0.setBackground(new Color(104, 165, 255));
        button0.setLocation(5, 165);
        button0.setFont(font1);
        button1.setSize(50, 50);
        button1.setBackground(new Color(104, 165, 255));
        button1.setLocation(60, 165);
        button1.setFont(font1);
        button2.setSize(50, 50);
        button2.setBackground(new Color(104, 165, 255));
        button2.setLocation(115, 165);
        button2.setFont(font1);
        button3.setSize(50, 50);
        button3.setBackground(new Color(104, 165, 255));
        button3.setLocation(170, 165);
        button3.setFont(font1);
        button4.setSize(50, 50);
        button4.setBackground(new Color(104, 165, 255));
        button4.setLocation(225, 165);
        button4.setFont(font1);
        button5.setSize(50, 50);
        button5.setBackground(new Color(104, 165, 255));
        button5.setLocation(5, 225);
        button5.setFont(font1);
        button6.setSize(50, 50);
        button6.setBackground(new Color(104, 165, 255));
        button6.setLocation(60, 225);
        button6.setFont(font1);
        button7.setSize(50, 50);
        button7.setBackground(new Color(104, 165, 255));
        button7.setLocation(115, 225);
        button7.setFont(font1);
        button8.setSize(50, 50);
        button8.setBackground(new Color(104, 165, 255));
        button8.setLocation(170, 225);
        button8.setFont(font1);
        button9.setSize(50, 50);
        button9.setBackground(new Color(104, 165, 255));
        button9.setLocation(225, 225);
        button9.setFont(font1);
        plusButton.setText("(+)");
        plusButton.setSize(130, 50);
        plusButton.setBackground(new Color(104, 165, 255));
        plusButton.setLocation(5, 280);
        plusButton.setFont(font1);
        minusButton.setText("(-)");
        minusButton.setSize(130, 50);
        minusButton.setBackground(new Color(104, 165, 255));
        minusButton.setLocation(140, 280);
        minusButton.setFont(font1);
        derivButton.setSize(130, 50);
        derivButton.setBackground(new Color(104, 165, 255));
        derivButton.setLocation(5, 390);
        derivButton.setFont(font1);
        integButton.setSize(130, 50);
        integButton.setLocation(145, 390);
        integButton.setBackground(new Color(104, 165, 255));
        integButton.setFont(font1);
        xButton.setSize(87, 50);
        xButton.setLocation(5, 335);
        xButton.setBackground(new Color(104, 165, 255));
        xButton.setFont(font1);
        powButton.setSize(87, 50);
        powButton.setLocation(97, 335);
        powButton.setBackground(new Color(104, 165, 255));
        powButton.setFont(font1);
        clearButton.setSize(86, 50);
        clearButton.setLocation(187, 335);
        clearButton.setBackground(new Color(104, 165, 255));
        clearButton.setFont(font1);
        addButton.setSize(62, 50);
        addButton.setBackground(new Color(104, 165, 255));
        addButton.setLocation(6, 445);
        addButton.setFont(font1);
        minButton.setSize(62, 50);
        minButton.setBackground(new Color(104, 165, 255));
        minButton.setLocation(73, 445);
        minButton.setFont(font1);
        mulButton.setSize(62, 50);
        mulButton.setBackground(new Color(104, 165, 255));
        mulButton.setLocation(140, 445);
        mulButton.setFont(font1);
        divButton.setSize(62, 50);
        divButton.setBackground(new Color(104, 165, 255));
        divButton.setLocation(207, 445);
        divButton.setFont(font1);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JTextArea getPolinom1() {
        return polinom1;
    }

    public void setPolinom1(JTextArea polinom1) {
        this.polinom1 = polinom1;
    }

    public JLabel getP1() {
        return p1;
    }

    public void setP1(JLabel p1) {
        this.p1 = p1;
    }

    public JLabel getP2() {
        return p2;
    }

    public void setP2(JLabel p2) {
        this.p2 = p2;
    }

    public JLabel getR() {
        return r;
    }

    public void setR(JLabel r) {
        this.r = r;
    }

    public JTextArea getPolinom2() {
        return polinom2;
    }

    public void setPolinom2(JTextArea polinom2) {
        this.polinom2 = polinom2;
    }

    public JTextArea getOut() {
        return out;
    }

    public void setOut(JTextArea out) {
        this.out = out;
    }

    public boolean isP1_selected() {
        return p1_selected;
    }

    public void setP1_selected(boolean p1_selected) {
        this.p1_selected = p1_selected;
    }

    public boolean isP2_selected() {
        return p2_selected;
    }

    public void setP2_selected(boolean p2_selected) {
        this.p2_selected = p2_selected;
    }

    public JButton getButton0() {
        return button0;
    }

    public void setButton0(JButton button0) {
        this.button0 = button0;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public void setButton5(JButton button5) {
        this.button5 = button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public void setButton6(JButton button6) {
        this.button6 = button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public void setButton7(JButton button7) {
        this.button7 = button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public void setButton8(JButton button8) {
        this.button8 = button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public void setButton9(JButton button9) {
        this.button9 = button9;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public void setMulButton(JButton mulButton) {
        this.mulButton = mulButton;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JButton getMinButton() {
        return minButton;
    }

    public void setMinButton(JButton minButton) {
        this.minButton = minButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public void setDivButton(JButton divButton) {
        this.divButton = divButton;
    }

    public JButton getIntegButton() {
        return integButton;
    }

    public void setIntegButton(JButton integButton) {
        this.integButton = integButton;
    }

    public JButton getDerivButton() {
        return derivButton;
    }

    public void setDerivButton(JButton derivButton) {
        this.derivButton = derivButton;
    }

    public JButton getEqualsButton() {
        return equalsButton;
    }

    public void setEqualsButton(JButton equalsButton) {
        this.equalsButton = equalsButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JButton getxButton() {
        return xButton;
    }

    public void setxButton(JButton xButton) {
        this.xButton = xButton;
    }

    public JButton getPowButton() {
        return powButton;
    }

    public void setPowButton(JButton powButton) {
        this.powButton = powButton;
    }

    public JButton getPlusButton() {
        return plusButton;
    }

    public void setPlusButton(JButton plusButton) {
        this.plusButton = plusButton;
    }

    public JButton getMinusButton() {
        return minusButton;
    }

    public void setMinusButton(JButton minusButton) {
        this.minusButton = minusButton;
    }
}
