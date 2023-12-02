import java.awt.Color;

public class Cut2 {
  public static MyImage execute(MyImage input1, MyImage input2, int x, int y) {

    int width = input1.width;
    int height = input1.height;

    MyImage output = new MyImage(width, height);

    for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
        
        Color color = input2.getColor(j + x, i + y);
        output.setColor(j, i, color);
					
        }
    }
    
    return output;
  }
}
