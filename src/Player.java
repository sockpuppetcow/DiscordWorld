
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chicken
 */
public class Player extends GameObj{

    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        
        x = Game.clamp(x, 0, Game.WIDTH-32);
        y = Game.clamp(y, 0, Game.HEIGHT-32);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(x, y, 32, 32);
    }
    
}
