package showboard;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import javax.swing.SwingUtilities;

import showboard.BoardFrame;


public class Showboarddemo extends Observable implements Runnable , KeyListener {

    /** The Constant width of the board. */
    public static final int        width               = 15;

    /** The Constant height of the board. */
    public static final int        height              = 21;

    /** The Constant timeLoop represents the time in millisecond for each loop. */
    private static final int       timeLoop            = 20;

    /** The Constant sizeFrameCloseView is the size of the view frames. */
    private static final int       sizeFrame           = 500;
    /** The Constant widthBetweenFrame. */
    private static final int       widthBetweenFrame   = 10;

    /** The Constant closeView is the cadre of the board displayed in the close view frame. */
    private static final Rectangle closeView           = new Rectangle(5, 5, width - 5, height - 5);

    private final List<Tile> tile;
    /** The white tile. */
    private final Tile             whiteTile           = new Tile("bone.png");

    /** The black tile. */
    private final Tile             blackTile           = new Tile("horizontal_bone.png");

    /** The light gray tile. */
    private final Tile             lightGrayTile       = new Tile("vertical_bone.png");


    public Showboarddemo() throws IOException {
        super();
        final Random random = new Random();
        this.whiteTile.loadImage();
        this.blackTile.loadImage();
        this.lightGrayTile.loadImage();
        this.tile = new ArrayList<Tile>();
        SwingUtilities.invokeLater(this);
    }

 
    @Override
    public final void run() {
        final BoardFrame frameCloseView = new BoardFrame("Close view");
        frameCloseView.setDimension(new Dimension(width, height));
        frameCloseView.setDisplayFrame(closeView);
        frameCloseView.setSize(sizeFrame, sizeFrame);
        frameCloseView.addKeyListener(this);
        this.frameConfigure(frameCloseView);
       
    }

    
    public final void move() throws InterruptedException {
 
            this.setChanged();
            this.notifyObservers();

            Thread.sleep(timeLoop);
 //       }
    }

    
    public final void frameConfigure(final BoardFrame frame) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if ((x == 0) || (x == (width - 1)) || (y == 0) || (y == (height - 1))) {
                    frame.addSquare(this.lightGrayTile, x, y);
                } else if (((x + y) % 2) == 0) {
                    frame.addSquare(this.whiteTile, x, y);
                } else {
                    frame.addSquare(this.blackTile, x, y);
                }
            }
        }

     

        this.addObserver(frame.getObserver());

        frame.setVisible(true);
    }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
