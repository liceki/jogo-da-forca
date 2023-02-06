package style;

import java.awt.Cursor;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class JButtonStyle1 extends JButton{
    public JButtonStyle1() {   
        super();
        ConfigureButton();
    }

    public JButtonStyle1(Icon icon) {
        super(icon);
        ConfigureButton();
    }

    public JButtonStyle1(String text) {
        super(text);
        ConfigureButton();
    }

    public JButtonStyle1(Action a) {
        super(a);
        ConfigureButton();
    }

    public JButtonStyle1(String text, Icon icon) {
        super(text, icon);
        ConfigureButton();
    }
    
    private void ConfigureButton(){
        this.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        this.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        this.setBackground(new java.awt.Color(51,51,51));
        this.setForeground(new java.awt.Color(170,170,170));
        this.setPreferredSize(new java.awt.Dimension(50, 50));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
