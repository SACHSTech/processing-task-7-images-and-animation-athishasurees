import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
PImage imgBackground; 
PImage imgTornado;

 float fltTornadoX = 200;
  float fltTornadoY = 200;
  float fltTornadoSpeed = 2; 
  float fltTornadoDirectionX = -1; 
  float fltTornadoDirectionY = -1; 


  float fltSqrX = width/2;
  float fltSqrY = width/2; 
  float fltSqrSpeed = 5; 
  float fltSqrDirectionX = -1; 
  float fltSqrDirectionY = -1; 

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
   imgBackground = loadImage("background.jpeg");
   imgBackground.resize(imgBackground.width*3, imgBackground.height*3);
   imgTornado = loadImage("tornado.png");
   imgTornado.resize(imgTornado.width/2, imgTornado.height/2);
  }


  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    image (imgBackground, 0, 0);

    image(imgTornado, fltTornadoX, fltTornadoY); 
    fltTornadoX = fltTornadoX + (fltTornadoDirectionX*fltTornadoSpeed);
    if (fltTornadoX < 0 || fltTornadoX > width - imgTornado.width){
      fltTornadoDirectionX = fltTornadoDirectionX * -1; 
    }
    fltTornadoY = (float)0.02 * (float)Math.pow(fltTornadoX - 125, 2); 
    fltTornadoY = fltTornadoY + (fltTornadoDirectionY*fltTornadoSpeed);
    if (fltTornadoY < 0 || fltTornadoY > height - imgTornado.height){
      fltTornadoDirectionY = fltTornadoDirectionY * -1; 
    }

    fill(255,0,0); 
    rect(fltSqrX, fltSqrY, 50, 50);
      fltSqrX = fltSqrX + (fltSqrDirectionX*fltSqrSpeed);
    if (fltSqrX < 0 || fltSqrX > width - 50){
      fltSqrDirectionX *= -1; 
    }

     fltSqrY = fltSqrY + (fltSqrDirectionY*fltSqrSpeed);
    if (fltSqrY < 0 || fltSqrY > height - 50){
      fltSqrDirectionY *= -1; 
    }
  }
  }
  
  // define other methods down here.
