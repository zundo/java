import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Popup {
	JFrame frame = new JFrame();
	int count = 0;
	private Container panel;
	public Popup() {
		JLabel label = new JLabel("Le Juste prix");
		frame.add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setLayout(new GridLayout(3,1));
		JButton button = new JButton("envoyer");

		JTextField text = new JTextField("Text");
		text.setHorizontalAlignment(JTextField.CENTER);
		Random rd = new Random();
		int random = rd.nextInt(100);
		button.setBackground(Color.CYAN);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int leprix = 0;
		        
		        
		        leprix = Integer.valueOf(text.getText());
		        String text = "";
		        if (leprix > random){
		        		text = "moins";
		        } 
		        if (leprix < random)
		        {
		        	text = "C'est plus";
		        }
		        count++;
		        if (leprix == random){
		        System.out.println("Bravo le juste prix est "+random);
		        System.out.println("Vous avez gagner en  "+count +" tours");
		        text = "Vous avez gagner en "+count + " tours, le juste prix est "+random;
		        }
		        JOptionPane.showMessageDialog(null, text);
			}
		
		});
		
		frame.add(text);
		frame.add(button);
		frame.pack();
		frame.setVisible(true);	
		
	
	}
}
