package flu.weather.image;

public class ColorPicker {
	// Provides Exact Mapping
	public static int COLORPICKER_NOMATCH=-10000;
	private int[] colors,values;
	private ColorPicker(int[] colors_, int[] values_){
		colors=colors_;
		values=values_;
	}
	public int match(int color){
		for(int loop=0;loop<colors.length;loop++)
			if(colors[loop]==color) return values[loop];
		return COLORPICKER_NOMATCH;
	}
	
	private static int[] temperatureColor={-14145496,-10480106,-8905957,-7266015,-5691866,-4051924,-3065543,-2666159,-2332054,-1932670,-1533029,-10461162,-8882149,-7237343,-5658330,-4013524,-3026631,-2631855,-2302870,-1908094,-1513317,-15310826,-14976997,-14577375,-14243546,-13843924,-12988103,-11413679,-9773974,-8199550,-6559589,-15310754,-14976906,-14577266,-14243418,-13843778,-12987954,-11413548,-9773862,-8199456,-6559514,-15329696,-15000712,-14605935,-14276951,-13882174,-13026863,-11447849,-9803044,-8224030,-6579224,-10480032,-8905864,-7265903,-5691735,-4051774,-3065391,-2666025,-2331940,-1932574,-1532952,-1644826};
	private static int[] temperatureValue={41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15,-16,-17,-18,-19,-20};
	public static ColorPicker currentTemperature=new ColorPicker(temperatureColor, temperatureValue);
}
