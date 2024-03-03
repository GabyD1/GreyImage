package Algoritm;
//algoritmul
import java.awt.Color;
import java.awt.image.BufferedImage;

public class GrayTransformation extends AlgClass{
	private BufferedImage bufferedImage;
	
	public GrayTransformation(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
		
	}

	public BufferedImage getBufferedImage() {
		return bufferedImage;
	}

	public void setBufferedImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}
	
	public void applyAlgoritm() {
		x = bufferedImage.getWidth();
		y = bufferedImage.getHeight();
		
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++) {
				Color c = new Color(bufferedImage.getRGB(i,j));
				int red = alg(d, c.getRed());
				int green = alg(d, c.getGreen());
				int blue = alg(d, c.getBlue());
				
	            Color newColor = new Color(red,blue,green);
	            bufferedImage.setRGB(i, j, newColor.getRGB());
				
			}
	}
	
}
