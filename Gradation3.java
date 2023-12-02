import java.awt.Color;

public class Gradation3 {
  static MyImage execute(MyImage input1, MyImage input2, MyImage input3, MyImage input4) { 

    

		int width = input1.width;
		int height = input1.height;
	
    MyImage output = new MyImage(width, height);

    for(int i = 0; i < height; i++) {

      double b = (double)i / (double)( height - 1 );

      for(int j = 0; j < width; j++) {
        
        Color color1 = input1.getColor(j, i);
        Color color2 = input2.getColor(j, i);
        Color color3 = input3.getColor(j, i);
        Color color4 = input4.getColor(j, i);

        int r1 = color1.getRed();
        int g1 = color1.getGreen();
        int b1 = color1.getBlue();
        int r2 = color2.getRed();
        int g2 = color2.getGreen();
        int b2 = color2.getBlue();
        int r3 = color3.getRed();
        int g3 = color3.getGreen();
        int b3 = color3.getBlue();
        int r4 = color4.getRed();
        int g4 = color4.getGreen();
        int b4 = color4.getBlue();
        
          
        // 距離aを計算
        double a = (double)j / (double)( width - 1 );

        // 色を計算
        int g_r = (int)( (double)( r1 - r2 - r3 + r4 ) * a * b - (double)( r1 - r2 ) * a - (double)( r1 - r3 ) * b + (double)r1 );
        int g_g = (int)( (double)( g1 - g2 - g3 + g4 ) * a * b - (double)( g1 - g2 ) * a - (double)( g1 - g3 ) * b + (double)g1 );
        int g_b = (int)( (double)( b1 - b2 - b3 + b4 ) * a * b - (double)( b1 - b2 ) * a - (double)( b1 - b3 ) * b + (double)b1 );

        if( g_r < 0) g_r = 0;
        if( g_g < 0) g_g = 0;
        if( g_b < 0) g_b = 0;
        if( g_r > 255) g_r = 255;
        if( g_g > 255) g_g = 255;
        if( g_b > 255) g_b = 255;


        Color color = new Color(g_r, g_g, g_b);

        output.setColor(j, i, color);
        }
      }
        

    return output;



  }

}
