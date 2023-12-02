
import java.awt.*;

public class Rotation {

  static double SCALEX = 1.0, SCALEY = 1.0;
  

  static MyImage execute(MyImage input) {
    int width1, height1, width2, height2, i, j;
    
    width1 = input.width;
    height1 = input.height;
    //90°回転のため、縦と横入れ替え
    height2 = (int)(input.width * SCALEX);
    width2 = (int)(input.height * SCALEY);


    MyImage output = new MyImage(width2, height2);
  
    
    for(i = 0; i < height2; i++) {
      for(j = 0; j < width2; j++) {
        double x1, y1;

        x1 = calcX(j, i, width1, height1, width2, height2);
        y1 = calcY(j, i, width1, height1, width2, height2);

        calcRGB(input, output, x1, y1, j, i);


      }
    }



    return output;

  }

  
  static double calcX(int x2, int y2, int width1, int height1, int width2, int height2) {
    double x = 0.0;

    // x=width1/2.0 + (x2 - width2/2.0)*Math.cos(Math.PI*(-1/2)) + (y2 - height2/2.0)*Math.sin(Math.PI*(-1/2));
    x = width1/2.0 + height2/2.0 -y2;

    if(x < 0 || x > (double)width1) {
      System.out.println("EXIT! x=" + x);
      System.exit(-1);
    }

    return x;
  }

  
  static double calcY(int x2, int y2, int width1, int height1, int width2, int height2) {
    double y = 0.0;

    // y=height1/2.0 - Math.sin(Math.PI*(-1/2))*(x2 - width2/2.0) + Math.cos(Math.PI*(-1/2))*(y2 - height2/2.0);
    y = height1/2.0 - width2/2.0 + x2;

    if(y < 0 || y > (double)height1) {
      System.out.println("EXIT! y=" + y);
      System.exit(-1);
    }

    return y;
  }



  static void calcRGB(MyImage input, MyImage output, double x1, double y1, int x2, int y2) {

    int xx = (int)(x1 + 0.5);
    if(xx < 0) xx = 0;
    if(xx >= input.width) xx = input.width - 1;
    int yy = (int)(y1 + 0.5);
    if(yy < 0) yy = 0;
    if(yy >= input.height) yy = input.height - 1;

    Color color = input.getColor(xx, yy);
    int value = color.getRGB();
    output.setColor(x2, y2, color);
  
  }
}

