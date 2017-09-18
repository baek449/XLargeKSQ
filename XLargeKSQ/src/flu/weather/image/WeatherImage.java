package flu.weather.image;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class WeatherImage {
	private BufferedImage image;
	public boolean read(String url){
		try {
			URL u=new URL(url);
			image=ImageIO.read(u);
			int color=image.getRGB(160, 120);
			System.out.println(color);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("IO Error");
			return false;
		}
		return true;
	}
}
