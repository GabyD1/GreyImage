import java.io.*;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import Algoritm.GrayTransformation;
public class ImageProc {

	public static void main(String[] args) throws IOException{
		
		
		BufferedImage image = null;
		
		double start = System.currentTimeMillis();
		image = readImage("path");
		System.out.println("Decodificarea imaginii a durat: " + (System.currentTimeMillis() - start));
			
		
		GrayTransformation grayTransformation = new GrayTransformation(image);
		
		start = System.currentTimeMillis();
		grayTransformation.applyAlgoritm();
		System.out.println("Aplicarea algoritmului a durat: " + (System.currentTimeMillis() - start));
		
		image = grayTransformation.getBufferedImage();
		
		start = System.currentTimeMillis();
		writeImage("path", image);
		System.out.println("Rescrierea imaginii a durat: " + (System.currentTimeMillis() - start));

	}
	
	public static BufferedImage readImage(String path) {
		BufferedImage image = null;
		File f = null;
		
		try {
			f = new File(path);//imagine file
			image = ImageIO.read(f);
			System.out.println("Citire reusita");
		}catch(IOException e) {
			System.out.println("Error: "+e);
		}
		
		return image;
	}
	
	public static void writeImage(String path, BufferedImage image) {
		//write image
				try {
					File output = new File(path);
					ImageIO.write(image, "bmp", output);
				}catch(IOException e) {
					System.out.println("Error: " +e);
				}
		}
	
	
}
