import java.awt.Color;

public class Miller {
  public static MyImage execute(MyImage input) {

    MyImage output = new MyImage(input.width, input.height);


		// ミラー反転
		for (int i = 0; i < input.height; ++ i ) {
			// x座標の初期値を代入
			int j_s = 0;
			int j_e = input.width - 1;
			while ( j_s < j_e ) {

        Color color_s = input.getColor(j_s, i);
        Color color_e = input.getColor(j_e, i);

        output.setColor(j_s, i, color_e);
        output.setColor(j_e, i, color_s);

				// x座標を更新
				j_s ++;
				j_e --;
			}
		}

    return output;
  }

}
