package flappybird;
import java.awt.*;
import java.awt.image.ImageObserver;

public abstract class GameMatrix {
	protected int x, y;
	protected int dx, dy;
	protected int width, height;
	protected Image image;
	
	public GameMatrix(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	public int getdx()
	{
		return dx;
	}
	public int getdy()
	{
		return dy;
	}
	public int getwidth()
	{
		return width;
	}
	public int getheight()
	{
		return height;
	}
	public Image getimage()
	{
		return image;
	}
	
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public void setdx(int dx)
	{
		this.dx=dx;
	}
	public void setdy(int dy)
	{
		this.dy=dy;
	}
	public void setwidth(int width)
	{
		this.width=width;
	}
	public void setheight(int height)
	{
		this.height=height;
	}
	public void setimage(Image image)
	{
		this.image=image;
	}
	public abstract void tick();
	public abstract void render(Graphics2D g, ImageObserver obs);
}
