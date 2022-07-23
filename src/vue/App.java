package vue;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JFrame;

import modele.DaoAccess;
import modele.Etablissement;
import modele.Personnel;

public class App extends JFrame {
	
	public static Color defaultBack = Color.lightGray;
	public static Color defaultCont = Color.darkGray;
	public static Font commonFont = new Font("Arial", Font.BOLD, 15);
	
	private static Content content = new Content();
	private static DaoAccess accesBdd = new DaoAccess("localhost", "gestehpad", "gestEhpad", "1234", null);
	private static Etablissement etabe;
	private static Personnel connected;
	
	private static App app;
	
	public App(String str) {
		super(str);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200,800);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) throws SQLException {
        
	
		app = new App("Gest'Ehpad");
			
		app.getContentPane().add(new Connection());
		app.getContentPane().repaint();
		app.getContentPane().revalidate();
		
	}
	
	
	
	public static Etablissement getEtablissement(){
	        return etabe;
	 } 

	public static void setEtablissement(Etablissement e){
	        etabe = e;
	 }  
    public static DaoAccess getBDD(){
        return accesBdd;
    }
	public static Personnel getConnected() {
		return connected;
	}
	public static void setConnected(Personnel p)
	{
		connected = p;
	}

	public static Content getContent() {
		return content;
	}

	public static App getApp()
	{
		return app;
	}

	public static void removeData()
	{
		etabe = null;
		connected = null;
	}

	public static void resetContent() {
		content = new Content();
		
	}


	

}
