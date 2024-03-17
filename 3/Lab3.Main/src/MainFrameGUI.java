import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameGUI extends JFrame{
        public MainFrameGUI() {
            super("Repository GUI Lab6");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(200, 200, 300, 200);
            this.textArea = new JTextArea(this.repository.ToString());
            JScrollPane scroll = new JScrollPane(textArea);
            add(scroll);
            Container panel = this.getContentPane();
            panel.setLayout(new GridLayout(2, 2, 2, 2));
            JButton saveButton = new JButton("Sort");
            panel.add(saveButton);
            saveButton.addActionListener(new ButtonEventListener());
            setVisible(true);
        }

        class ButtonEventListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

            }
        }
    }
}
