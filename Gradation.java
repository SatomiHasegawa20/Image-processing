import java.awt.Color;

public class Gradation {
  static MyImage execute(MyImage input1, MyImage input2) { 

    

		int width1 = input1.width;
		int width2 = input2.width;
		int height1 = input1.height;
		int height2 = input2.height;
	
		int width  = (width1  < width2)  ? width1  : width2;
    int height = (height1 < height2) ? height1 : height2;

    MyImage output = new MyImage(width, height);

    for(int i = 0; i < height; i++) {
      for(int j = 0; j < width; j++) {
        
        Color color1 = input1.getColor(j, i);
        Color color2 = input2.getColor(j, i);

        int r1 = color1.getRed();
        int g1 = color1.getGreen();
        int b1 = color1.getBlue();
        int r2 = color2.getRed();
        int g2 = color2.getGreen();
        int b2 = color2.getBlue();

        double d = (double)j / (double)(width-1);
        
    
        int r = (int)((double)(r2 - r1)*d + (double)r1);
        int g = (int)((double)(g2 - g1)*d + (double)g1);
        int b = (int)((double)(b2 - b1)*d + (double)b1);

        Color color = new Color(r, g, b);

        output.setColor(j, i, color);
      }
    }
    return output;



  }

}
