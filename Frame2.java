import java.awt.Color;

public class Frame2 {
  public static MyImage execute(MyImage input, int frame) {

    MyImage output = new MyImage(input.width, input.height);

    Color BlackColor = new Color(0, 0, 0);
    Color WhiteColor = new Color(255, 255, 255);



    // 縦の枠(内側の黒枠)
    for(int i = frame+4; i < input.height; i++) {
      for(int j = frame+4; j < frame+5; j++){

        output.setColor(j, i, BlackColor);
        output.setColor(input.width - j -1, i, BlackColor);

      }
      
    }

    // 横の枠(内側の黒枠)
    for(int j = frame+4; j < input.width; j++) {
      for(int i = frame+4; i < frame+5; i++){

        output.setColor(j, i, BlackColor);
        output.setColor(j, input.height - i -1, BlackColor);

      }
    }



    // 縦の枠(中の白枠)
    for(int i = 3; i < input.height; i++) {
      for(int j = 3; j < frame+3; j++){

        output.setColor(j, i, WhiteColor);
        output.setColor(input.width - j -1, i, WhiteColor);

      }
      
    }

    // 横の枠(中の白枠)
    for(int j = 3; j < input.width; j++) {
      for(int i = 3; i < frame+3; i++){

        output.setColor(j, i, WhiteColor);
        output.setColor(j, input.height - i -1, WhiteColor);

      }
    }



    // 縦の枠(外側の黒枠)
    for(int i = 0; i < input.height; i++) {
      for(int j = 0; j < 3; j++){

        output.setColor(j, i, BlackColor);
        output.setColor(input.width - j -1, i, BlackColor);

      }
      
    }

    // 横の枠(外側の黒枠)
    for(int j = 0; j < input.width; j++) {
      for(int i = 0; i < 3; i++){

        output.setColor(j, i, BlackColor);
        output.setColor(j, input.height - i -1, BlackColor);

      }
    }


    // 元画像
    for(int j = frame + 5; j < input.width - frame - 5; j++) {
      for(int i = frame + 5; i < input.height - frame  - 5; i++){

        Color color = input.getColor(j, i);
        output.setColor(j, i, color);

      }
    }
    
    return output;
  }

}
