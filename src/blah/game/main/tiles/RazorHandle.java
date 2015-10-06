package blah.game.main.tiles;

import java.awt.Graphics;
import java.awt.Rectangle;

import blah.game.main.Game;
import blah.game.main.gfx.ImageManager;

public class RazorHandle extends Tile
{
	private int x, y;
	public RazorHandle(ImageManager iM) 
	{
		super(iM);
	}


	public void render(Graphics g, int x, int y) 
	{
		this.x = x;
		this.y = y;
		g.drawImage(iM.rHandle, x, y, Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
	}
	public Rectangle getBounds()
	{
		return new Rectangle(x,y,Game.TILESIZE * Game.SCALE, Game.TILESIZE * Game.SCALE);
	}
}

