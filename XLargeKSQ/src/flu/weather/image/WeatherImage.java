package flu.weather.image;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WeatherImage {
	private BufferedImage image;
	public boolean read(String url){
		try {
			Document d=Jsoup.connect(url).get();
			String actualImage=d.getElementsByAttributeValue("name", "anim").get(0).attr("src");
			image=ImageIO.read(new URL("http://www.kma.go.kr"+actualImage));
//			int color=image.getRGB(464, 18);
//			System.out.println(color);
			for(double x=18.0;x<475;x+=7.4){
				System.out.println(image.getRGB(464, (int)x));
			}
		} catch (IOException e) {
			System.err.println("IO Error");
			return false;
		}  catch (NullPointerException e) {
			System.err.println("Cannot bring image");
			return false;
		}
		return true;
	}
}
