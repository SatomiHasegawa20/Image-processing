import java.awt.Color;

public class Cut {
  public static MyImage execute(MyImage input, int x, int y, int width, int height) {

    MyImage output = new MyImage(width, height);

    for(int i = 0; i < height ; i++) {
			for(int j = 0; j < width ; j++) {
        
        Color color = input.getColor(j + x, i + y);
        output.setColor(j, i, color);
					
        }
    }
    
    return output;
  }
}
