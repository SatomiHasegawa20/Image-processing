import java.awt.Color;


public class Sepia {

  public static MyImage execute(MyImage input) {

    MyImage output = new MyImage(input.width, input.height);
  
    for(int i = 0; i < input.height; i++) {
      for(int j = 0; j < input.width; j++) {
        
        Color color1 = input.getColor(j, i);

        int r = color1.getRed();
        int g = color1.getGreen();
        int b = color1.getBlue();
        
        int s_r = (int)(0.393 * r + 0.769 * g + 0.189 * b);
        int s_g = (int)(0.349 * r + 0.686 * g + 0.168 * b);
        int s_b = (int)(0.272 * r + 0.534 * g + 0.131 * b);

        if( s_r < 0) s_r = 0;
        if( s_g < 0) s_g = 0;
        if( s_b < 0) s_b = 0;
        if( s_r > 255) s_r = 255;
        if( s_g > 255) s_g = 255;
        if( s_b > 255) s_b = 255;



        

        Color color2 = new Color(s_r, s_g, s_b);

        output.setColor(j, i, color2);
      }
    }
    
    return output;
  }

}



