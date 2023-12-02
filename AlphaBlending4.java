import java.awt.*;


public class AlphaBlending4{

	static MyImage execute(MyImage input1, MyImage input2 ) { 

		int width1 = input1.width;
		int width2 = input2.width;
		int height1 = input1.height;
		int height2 = input2.height;
	
		int width  = width2;
		int height = height2;
	
		MyImage output = new MyImage(width, height);
	
    
		int x=1810;  //x軸方向移動距離
    int y=2200;  //y軸方向移動距離
      for(int i = height-1; i >= 0; i--) {
        for(int j = width-1; j >= 0; j--) {
				boolean isProcessed = false;
		
				if(i < height1 && j < width1) {
				
						Color color1 = input1.getColor(j, i);
						Color color2 = input2.getColor(j, i);
            Color newcolor2 = input2.getColor(j+x, i+y);
            double a = 1.0;

            int r = (int)(color1.getRed()*a + newcolor2.getRed()*(1-a));
            int g = (int)(color1.getGreen()*a + newcolor2.getGreen()*(1-a));
            int b = (int)(color1.getBlue()*a + newcolor2.getBlue()*(1-a));
            Color newcolor1 = new Color(r, g, b);

            
            output.setColor(j, i, color2);
						output.setColor(j+x, i+y, newcolor1);
				
						isProcessed = true;
					
					
				}

				if(i < height2 && j < width2) {
					if(isProcessed == false) {
						
						Color color2 = input2.getColor(j, i);
						output.setColor(j, i, color2);
					}
				}
			}
		}

		return output;

	}

}
