package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vue.App;
import vue.Connection;

public class ControleDeconnexion implements ActionListener{
	
	public ControleDeconnexion() {}

	@Override
	public void actionPerformed(ActionEvent e) {
		App.removeData();
		App.getContent().removeAll();
		App.getApp().getContentPane().removeAll();
		
		System.gc();
		
		App.getApp().getContentPane().add(new Connection());
		App.getApp().getContentPane().repaint();
		App.getApp().getContentPane().revalidate();		
	}

}
