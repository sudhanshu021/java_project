package flappybird;

import javax.swing.ImageIcon;

public class ProxyImage implements IImage {
	
	private final String st;
	private RealImage realimage;
	
	public ProxyImage(String st)
	{
		this.st=st;
	}
	
	public ImageIcon loadImage()
	{
		if(realimage==null)
		{
			this.realimage=new RealImage(st);
		}
		return this.realimage.loadImage();
		
	}

}
