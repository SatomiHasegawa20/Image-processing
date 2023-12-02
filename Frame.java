import java.awt.Color;


public class Frame {

  public static MyImage execute(MyImage input, int frame, int r, int g, int b) {

    MyImage output = new MyImage(input.width, input.height);

    Color frameColor = new Color(r, g, b);


    // 縦の枠
    for(int i = 0; i < input.height; i++) {
      for(int j = 0; j < frame; j++){

        output.setColor(j, i, frameColor);
        output.setColor(input.width - j -1, i, frameColor);

      }
      
    }

    // 横の枠
    for(int j = 0; j < input.width; j++) {
      for(int i = 0; i < frame; i++){

        output.setColor(j, i, frameColor);
        output.setColor(j, input.height - i -1, frameColor);

      }
    }

    for(int j = frame; j < input.width - frame; j++) {
      for(int i = frame; i < input.height - frame; i++){

        Color color = input.getColor(j, i);
        output.setColor(j, i, color);

      }
    }
    
    return output;
  }

}



