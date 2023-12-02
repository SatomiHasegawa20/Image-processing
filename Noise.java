import java.awt.Color;


public class Noise {

  public static MyImage execute(MyImage input, double noise_rate, int n_r, int n_g, int n_b) {

    MyImage output = new MyImage(input.width, input.height);
  
    for(int i = 0; i < input.height; i++) {
      for(int j = 0; j < input.width; j++) {

        Color color = input.getColor(j, i);

        double rate = Math.random() * 100.0;

        if(noise_rate > rate){
          Color noise_color = new Color(n_r, n_g, n_b);

          output.setColor(j, i, noise_color);
        }else{
          output.setColor(j, i, color);
        }
        
      }
    }
    
    return output;
  }

}



