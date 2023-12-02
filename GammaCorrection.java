import java.awt.Color;


public class GammaCorrection {

  public static MyImage execute(MyImage input) {

    MyImage output = new MyImage(input.width, input.height);
  
    for(int i = 0; i < input.height; i++) {
      for(int j = 0; j < input.width; j++) {
        
        Color color1 = input.getColor(j, i);
        
        double gam_r = 4.0;
        double gam_g = 4.0;
        double gam_b = 3.8;

        int r = (int)Math.round(255*Math.pow(color1.getRed()/255.0, 1/gam_r));
        int g = (int)Math.round(255*Math.pow(color1.getGreen()/255.0, 1/gam_g));
        int b = (int)Math.round(255*Math.pow(color1.getBlue()/255.0, 1/gam_b));

        Color color2 = new Color(r, g, b);

        output.setColor(j, i, color2);
      }
    }
    
    return output;
  }

}



