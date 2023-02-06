package style;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class JTextFieldStyle1 extends JTextField {

    public JTextFieldStyle1() {
        configureTextField();
    }

    public JTextFieldStyle1(String text) {
        super(text);
        configureTextField();
    }

    public JTextFieldStyle1(int columns) {
        super(columns);
        configureTextField();
    }

    public JTextFieldStyle1(String text, int columns) {
        super(text, columns);
        configureTextField();
    }

    public JTextFieldStyle1(Document doc, String text, int columns) {
        super(doc, text, columns);
        configureTextField();
    }

    private void configureTextField() {
        this.setText("");
        this.setFont(new Font("Dialog", 1, 14));
        this.setBackground(new Color(58, 58, 60));
        this.setForeground(new Color(170, 170, 170));
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));

        FocusListener highlighter = new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                e.getComponent().setBackground(new Color(48, 48, 50));
            }

            @Override
            public void focusLost(FocusEvent e) {
                e.getComponent().setBackground(new Color(58, 58, 60));
            }
        };

        this.addFocusListener(highlighter);
    }
}
