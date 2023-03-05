package flappybird;

import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

public class GameComponents extends GameMatrix {
	private ProxyImage proxyImage;
	private Loader[] load;
	
	public GameComponents(int x, int y)
	{
		super(x,y);
		if(proxyImage==null)
		{
			proxyImage=new ProxyImage("F:\\LPU\\4th year\\8 sem\\Advance java\\project\\blue bird");
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g, ImageObserver obs) {
		// TODO Auto-generated method stub
		
	}

}
