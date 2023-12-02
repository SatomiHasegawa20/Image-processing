import java.awt.*;


public class Tiling4 {

	static MyImage execute(MyImage input1, MyImage input2, MyImage input4, MyImage input5) { 

		int width1 = input1.width;
    int width2 = input2.width;
    int width4 = input4.width;
		int width5 = input5.width;
		int height1 = input1.height;
		int height2 = input2.height;
    int height4 = input4.height;
		int height5 = input5.height;
    
    int width  = width1 + width2 + width4 + width5;

    int height = (height1 < height2) ? height1 : height2;
 

		MyImage output = new MyImage(width, height);

		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
		
				if(i < height1 && j < width1) {

				
						Color color1 = input1.getColor(j, i);
						output.setColor(j, i, color1);
				
					
				}else if(i < height2 && j-width1 < width2 && j >= width1) {
						
						Color color2 = input2.getColor(j-width1, i);
            output.setColor(j, i, color2);
            
				}else if(i < height4 && j-width2-width1 < width4 && j >= width2) {
						
            Color color4 = input4.getColor(j-width2-width1, i);
            output.setColor(j, i, color4);

        }else if(i < height5 && j-width4-width2-width1 < width5 && j >= width4) {
						
            Color color5 = input5.getColor(j-width4-width2-width1, i);
            output.setColor(j, i, color5);

        }
			}
		}

		return output;

	}

}
