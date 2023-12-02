import java.awt.*;


public class AlphaBlending {

	static MyImage execute(MyImage input1, MyImage input2, MyImage input0) { 

		int width1 = input1.width;
		int width2 = input2.width;
		int height1 = input1.height;
		int height2 = input2.height;
	
		// int width  = (width1  > width2)  ? width1  : width2;
		// int height = (height1 > height2) ? height1 : height2;

		int width = width2;
		int height = height2;
	
		MyImage output = new MyImage(width, height);

		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				boolean isProcessed = false;
		
				if(i < height1 && j < width1) {

					Color color0 = input0.getColor(j, i);
					if(color0.getRed() > 0) {
				
            Color color1 = input1.getColor(j, i);
            Color color2 = input2.getColor(j, i);
            double a = 0.45;

            int r = (int)(color1.getRed()*a + color2.getRed()*(1-a));
            int g = (int)(color1.getGreen()*a + color2.getGreen()*(1-a));
            int b = (int)(color1.getBlue()*a + color2.getBlue()*(1-a));
            Color newcolor1 = new Color(r, g, b);
						output.setColor(j, i, newcolor1);
				
						isProcessed = true;
					}

					
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
