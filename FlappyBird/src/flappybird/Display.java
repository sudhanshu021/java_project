package flappybird;
import java.awt.*;
import javax.swing.*;
public class Display {
	static int width=800;
	static int height=600;
	public Display(int width,int height)
	{
		JFrame frame=new JFrame("Flappy Bird");
		frame.setMaximumSize(new Dimension(width,height));
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension (width,height));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public static void main(String arg[] )
	{
		try
		{
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		}
		catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex )
		{
			java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
		}
		
		java.awt.EventQueue.invokeLater(()->{
			Display display=new Display(width,height);
		});
	}
}
