import flu.weather.image.WeatherImage;

public class Main {

	public static void main(String[] args) {
		WeatherImage w=new WeatherImage();
		w.read("http://www.kma.go.kr/cgi-bin/aws/nph-aws_ana1?201709140935_0_0_mtc_460_A0_CENN_a_15_1_h");
	}

}
