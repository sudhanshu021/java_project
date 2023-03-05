package flappybird;

import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

class Loader extends GameMatrix  {
	private ProxyImage proxyImage;
	
	public Loader(int x, int y)
	{
		super(x,y);
	}

	public void tick() {
		this.x-=dx;
		
	}

	public void render(Graphics2D g, ImageObserver obs) {
		g.drawImage(image, x, y, obs);
		
	}
	

}
