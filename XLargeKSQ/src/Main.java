import flu.weather.image.WeatherImage;

public class Main {

	public static void main(String[] args) {
		WeatherImage w = new WeatherImage();
		w.read("http://www.kma.go.kr/cgi-bin/aws/nph-aws_ana1?201709140935_-60_0_mrh_460_A0_CENN_m_15_1_h");
	}		



}
