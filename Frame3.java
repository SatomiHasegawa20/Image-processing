import java.awt.Color;


public class Frame3 {

  public static MyImage execute(MyImage input, MyImage input_frame, int frame) {

    MyImage output = new MyImage(input.width, input.height);

    


    // 縦の枠
    for(int i = 0; i < input.height; i++) {
      for(int j = 0; j < frame; j++){


        Color frame_color = input_frame.getColor(j, i);
        Color frame_color2 = input_frame.getColor(input.width - j -1, i);

        int r = frame_color.getRed();
        int g = frame_color.getGreen();
        int b = frame_color.getBlue();

        int r2 = frame_color2.getRed();
        int g2 = frame_color2.getGreen();
        int b2 = frame_color2.getBlue();

        Color frameColor = new Color(r, g, b);
        Color frameColor2 = new Color(r2, g2, b2);

        output.setColor(j, i, frameColor);
        output.setColor(input.width - j -1, i, frameColor2);

      }
      
    }

    // 横の枠
    for(int j = 0; j < input.width; j++) {
      for(int i = 0; i < frame; i++){


        Color frame_color = input_frame.getColor(j, i);
        Color frame_color2 = input_frame.getColor(j, input.height - i -1);

        int r = frame_color.getRed();
        int g = frame_color.getGreen();
        int b = frame_color.getBlue();

        int r2 = frame_color2.getRed();
        int g2 = frame_color2.getGreen();
        int b2 = frame_color2.getBlue();

        Color frameColor = new Color(r, g, b);
        Color frameColor2 = new Color(r2, g2, b2);
        output.setColor(j, i, frameColor);
        output.setColor(j, input.height - i -1, frameColor2);

      }
    }

    for(int j = frame; j < input.width - frame ; j++) {
      for(int i = frame; i < input.height - frame ; i++){

        Color color = input.getColor(j, i);
        output.setColor(j, i, color);

      }
    }
    
    return output;
  }

}



