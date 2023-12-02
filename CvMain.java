public class CvMain {


  static void imageProcessing1() {

    String filename1 = "macbook.jpeg";

		String filename2 = "big_macbook.jpg";

    MyImage image1, image2;
  
    image1 = JpegFileReader.read(filename1);

    {
      // image2 = Negative.execute(image1);
      // image2 = change_color.execute(image1);
      // image2 = Binalization.execute(image1);
      // image2 = GammaCorrection.execute(image1);
      // image2 = SpaceFiltering.execute(image1);  
			image2 = Scale.execute(image1);
			// image2 = Affine.execute(image1);
			// image2 = Affine3.execute(image1, 20);
			// image2 = Affine2.execute(image1);
			// image2 = StandGlass.execute(image1);
			// image2 = Rotation.execute(image1);

			// Frame(元画像, 枠の幅, 枠の色R, 枠の色G, 枠の色B)
			// image2 = Frame.execute(image1, 80, 111, 75, 62);

			// Frame2(元画像, 枠の幅)
			// image2 = Frame2.execute(image1, 15);

			// image2 = Oil2.execute(image1);


			// image2 = Miller.execute(image1);

			// Cut(元画像, 切り取り初めのx座標, 切り取り初めのy座標, 切り取り後の横幅, 切り取り後の縦幅)
			// image2 = Cut.execute(image1, 0, 100, 3900, 2520);

			// StainedGlass(元画像, コア数)
			// image2 = StainedGlass.execute(image1, 5000);

			// image2 = Sepia.execute(image1);
			// image2 = Gray.execute(image1);

			// // Noise(元画像, ノイズの割合, ノイズの色(R, G, B))
			// image2 = Noise.execute(image1, 10, 255, 255, 209);
    }

    JpegFileWriter.write(filename2, image2);

  }


  static void imageProcessing2() {

		String filename1 = "resize_season.jpg";
    String filename2 = "mac6.jpg";
		String filename3 = "mac7.jpg";
		String filename4 = "rose_b.jpg";
		String filename5 = "rose_g.jpg";

    MyImage image1, image2, image3, image4, image5, image0;
  
    image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		image4 = JpegFileReader.read(filename4);
		image5 = JpegFileReader.read(filename5);

    KMeans kmeans = new KMeans();
    kmeans.clustering(image1, 6);
    // image0 = Chromakey.execute(image1, kmeans, 3);
    image0 = Chromakey2.execute(image1, kmeans, 3);

    // image3 = VirtualStudio.execute(image1, image2, image0); 
    // image3 = AlphaBlending.execute(image1, image2, image0); 
		// image3 = AlphaBlending2.execute(image1, image2, image0);
		image3 = AlphaBlending4.execute(image1, image2);     
		// image3 = AlphaBlending3.execute(image1, image2, image0);
		// image3 = Tiling.execute(image1, image2);  
		// image3 = Tiling4.execute(image1, image2, image4, image5);  
		// image3 = SameSize.execute(image1, image2); 
		// image3 = Gradation.execute(image1, image2); 
		// image3 = Gradation2.execute(image1, image2); 
		// image3 = Gradation3.execute(image1, image2, image4, image5); 

		// Cut2(元サイズの画像(これに合わせたい),　加工したい画像, 切り取り初めのx座標, 切り取り初めのy座標)
		// image3 = Cut2.execute(image1, image2, 0, 0); 

		// Frame3(画像,　フレームの柄にしたい画像_ただし、二つの画像のサイズは同じであること, 枠の幅)
		// image3 = Frame3.execute(image1, image2, 100); 

    JpegFileWriter.write(filename3, image3);

  }


  public static void main(String args[]) {

    // imageProcessing1();
    imageProcessing2();

  }
}


