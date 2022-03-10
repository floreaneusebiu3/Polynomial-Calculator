import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.createButtons();
        addButtons();
        addActionLister();
        view.getFrame().setVisible(true);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void addButtons() {
        view.getFrame().add(view.getPolinom1());
        view.getFrame().add(view.getP1());
        view.getFrame().add(view.getPolinom2());
        view.getFrame().add(view.getP2());
        view.getFrame().add(view.getR());
        view.getFrame().add(view.getOut());
        view.getFrame().add(view.getButton0());
        view.getFrame().add(view.getButton1());
        view.getFrame().add(view.getButton2());
        view.getFrame().add(view.getButton3());
        view.getFrame().add(view.getButton4());
        view.getFrame().add(view.getButton5());
        view.getFrame().add(view.getButton6());
        view.getFrame().add(view.getButton7());
        view.getFrame().add(view.getButton8());
        view.getFrame().add(view.getButton9());
        view.getFrame().add(view.getAddButton());
        view.getFrame().add(view.getMinButton());
        view.getFrame().add(view.getMulButton());
        view.getFrame().add(view.getDivButton());
        view.getFrame().add(view.getEqualsButton());
        view.getFrame().add(view.getDerivButton());
        view.getFrame().add(view.getIntegButton());
        view.getFrame().add(view.getClearButton());
        view.getFrame().add(view.getPowButton());
        view.getFrame().add(view.getxButton());
        view.getFrame().add(view.getPlusButton());
        view.getFrame().add(view.getMinusButton());
    }

    public void addActionLister() {
        view.getPolinom1().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                view.setP1_selected(true);
                view.setP2_selected(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        view.getPolinom2().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                view.setP1_selected(false);
                view.setP2_selected(true);
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        view.getButton0().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("0");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("0");
            }
        });
        view.getButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("1");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("1");
            }
        });
        view.getButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("2");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("2");
            }
        });
        view.getButton3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("3");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("3");
            }
        });
        view.getButton4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("4");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("4");
            }
        });
        view.getButton5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("5");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("5");
            }
        });
        view.getButton6().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("6");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("6");
            }
        });
        view.getButton7().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("7");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("7");
            }
        });
        view.getButton8().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("8");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("8");
            }
        });
        view.getButton9().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("9");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("9");
            }
        });
        view.getPlusButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("+");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("+");
            }
        });
        view.getMinusButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("-");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("-");
            }
        });
        view.getxButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("x");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("x");
            }
        });
        view.getPowButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.isP1_selected() == true)
                    view.getPolinom1().append("^");
                if (view.isP2_selected() == true)
                    view.getPolinom2().append("^");
            }
        });
        view.getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getPolinom1().setText("");
                view.getPolinom2().setText("");
                view.getOut().setText("");
            }
        });
        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1 = new Polinom();
                Polinom p2 = new Polinom();
                extractCoef1(p1);
                extractCoef2(p2);
                view.getOut().setText(model.sum(p1, p2));
            }
        });
        view.getMinButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1 = new Polinom();
                Polinom p2 = new Polinom();
                extractCoef1(p1);
                extractCoef2(p2);
                view.getOut().setText(model.min(p1, p2));
            }
        });
        view.getMulButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1 = new Polinom();
                Polinom p2 = new Polinom();
                extractCoef1(p1);
                extractCoef2(p2);
                view.getOut().setText(model.mul(p1, p2));
            }
        });
        view.getDerivButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1 = new Polinom();
                Polinom p2 = new Polinom();
                extractCoef1(p1);
                extractCoef2(p2);
                view.getOut().setText(model.derivate(p1));
            }
        });
        view.getIntegButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1 = new Polinom();
                Polinom p2 = new Polinom();
                extractCoef1(p1);
                extractCoef2(p2);
                view.getOut().setText(model.integer(p1));
            }
        });
    }

    public void extractCoef1(Polinom polinom) {
        String pol1 = view.getPolinom1().getText();
        pol1 = pol1.replace("-", "+-");
        String[] parts = pol1.split("\\+");
        for (String s : parts) {
            String[] terms = s.split("x\\^");
            int a = Integer.parseInt(terms[0]);
            int b = Integer.parseInt(terms[1]);
            System.out.println(a + " " + b);
            Molinom m = new Molinom(a, b);
            polinom.adauga(m);
        }
    }
    public void extractCoef2(Polinom polinom) {
        String pol1 = view.getPolinom2().getText();
        pol1 = pol1.replace("-", "+-");
        String[] parts = pol1.split("\\+");
        for (String s : parts) {
            String[] terms = s.split("x\\^");
            int a = Integer.parseInt(terms[0]);
            int b = Integer.parseInt(terms[1]);
            Molinom m = new Molinom(a, b);
            polinom.adauga(m);
        }
    }
}
