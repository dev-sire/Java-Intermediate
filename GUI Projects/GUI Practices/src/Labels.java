import javax.swing.JFrame;
import javax.swing.JLabel;

public class Labels extends JFrame {
    Labels(){
        JLabel label = new JLabel();
        label.setText("Testing and Debugging");
        this.setSize(500,500);
        this.setTitle("Labels In JSwing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(label);
    }
    
}
