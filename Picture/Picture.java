
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Triangle roof2;
    private Circle sun;
    private Triangle tree;
    private Square driveway;
    private Square garage;
    private Square theGround;
    private Square theGround2;
    private Square theGround3;
    private Square door1;
    private Square door2;
    private Square theSky;
    private Square road;
    private Square door;
    private Circle doorknob;
    private Square test;
    private Square stump;
    private Circle cloud;
    private Triangle dw;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        theSky = new Square();
        theSky.moveHorizontal(-100);
        theSky.moveVertical(-100);
        theSky.changeSize(10000);
        theSky.changeColor("cyan");
        theSky.makeVisible();
        
        sun = new Circle();
        sun.changeColor("purple");
        sun.moveHorizontal(190);
        sun.moveVertical(115);
        sun.changeSize(160);
        sun.makeVisible();
        
        theGround2 = new Square();
        theGround2.moveHorizontal(-80);
        theGround2.moveVertical(168);
        theGround2.changeSize(800);
        theGround2.changeColor("purple");
        theGround2.makeVisible();
        
        sun = new Circle();
        sun.changeColor("orange");
        sun.moveHorizontal(210);
        sun.moveVertical(132);
        sun.changeSize(120);
        sun.makeVisible();
        
        theGround2 = new Square();
        theGround2.moveHorizontal(-80);
        theGround2.moveVertical(172);
        theGround2.changeSize(800);
        theGround2.changeColor("orange");
        theGround2.makeVisible();
        
        theGround2 = new Square();
        theGround2.moveHorizontal(-80);
        theGround2.moveVertical(176);
        theGround2.changeSize(800);
        theGround2.changeColor("red");
        theGround2.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(240);
        sun.moveVertical(145);
        sun.changeSize(60);
        sun.makeVisible();
        
        theGround = new Square();
        theGround.moveHorizontal(-80);
        theGround.moveVertical(179);
        theGround.changeSize(800);
        theGround.changeColor("green");
        theGround.makeVisible();
        
        road = new Square();
        road.moveHorizontal(-80);
        road.moveVertical(220);
        road.changeSize(800);
        road.changeColor("black");
        road.makeVisible();
        
        driveway = new Square();
        driveway.moveHorizontal(110);
        driveway.moveVertical(180);
        driveway.changeSize(42);
        driveway.changeColor("black");
        driveway.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("white");
        cloud.moveHorizontal(240);
        cloud.moveVertical(-20);
        cloud.changeSize(40);
        cloud.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("white");
        cloud.moveHorizontal(220);
        cloud.moveVertical(-20);
        cloud.changeSize(40);
        cloud.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("white");
        cloud.moveHorizontal(230);
        cloud.moveVertical(-35);
        cloud.changeSize(40);
        cloud.makeVisible();
        
        dw = new Triangle();
        dw.moveHorizontal(119);
        dw.moveVertical(220);
        dw.changeSize(60, 18);
        dw.changeColor("black");
        dw.makeVisible();
        
        dw = new Triangle();
        dw.moveHorizontal(162);
        dw.moveVertical(220);
        dw.changeSize(60, 18);
        dw.changeColor("black");
        dw.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(25, 84);
        roof2.moveHorizontal(139);
        roof2.moveVertical(130);
        roof2.changeColor("black");
        roof2.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.changeColor("blue");
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(120);
        wall2.moveHorizontal(100);
        wall2.changeSize(60);
        wall2.changeColor("blue");
        wall2.makeVisible();
        
        garage = new Square();
        garage.moveVertical(140);
        garage.moveHorizontal(110);
        garage.changeSize(40);
        garage.changeColor("gray");
        garage.makeVisible();
        
        door = new Square();
        door.moveVertical(150);
        door.moveHorizontal(35);
        door.changeSize(30);
        door.changeColor("red");
        door.makeVisible();
        
        doorknob = new Circle();
        doorknob.moveVertical(150);
        doorknob.moveHorizontal(95);
        doorknob.changeSize(5);
        doorknob.changeColor("black");
        doorknob.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.makeVisible();

        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.changeColor("black");
        roof.makeVisible();
        
        stump = new Square();
        stump.changeSize(18);
        stump.moveHorizontal(-48);
        stump.moveVertical(130);
        stump.changeColor("brown");
        stump.makeVisible();
        
        stump = new Square();
        stump.changeSize(18);
        stump.moveHorizontal(-48);
        stump.moveVertical(148);
        stump.changeColor("brown");
        stump.makeVisible();
        
        stump = new Square();
        stump.changeSize(18);
        stump.moveHorizontal(-48);
        stump.moveVertical(166);
        stump.changeColor("brown");
        stump.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(120, 35);
        tree.moveHorizontal(-30);
        tree.moveVertical(50);
        tree.changeColor("green");
        tree.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
