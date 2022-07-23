package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vue.App;
import vue.ViewEvenement;

public class ControleFinEvenement implements ActionListener {
	
	ViewEvenement ve;

	public ControleFinEvenement(ViewEvenement ve) {
		this.ve=ve;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			App.getContent().remove(ve);
			App.getContent().getComponent(0).setVisible(true);
			App.getContent().repaint();
			App.getContent().revalidate();
		}
		catch (Exception ee) {
			
		}
	}	
}
