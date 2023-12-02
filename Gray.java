import java.awt.Color;

public class Gray {
  public static MyImage execute(MyImage input) {

    MyImage output = new MyImage(input.width, input.height);
  
    for(int i = 0; i < input.height; i++) {
      for(int j = 0; j < input.width; j++) {
        
        Color color1 = input.getColor(j, i);

        int r = color1.getRed();
        int g = color1.getGreen();
        int b = color1.getBlue();
        
        int p = (int)( 0.29891 * r
					 + 0.58661 * g
             + 0.11448 * b );
             
        if( p < 0) p = 0;
        if( p > 255) p = 255;
        

        Color color2 = new Color(p, p, p);

        output.setColor(j, i, color2);
      }
    }
    
    return output;
  }
}
