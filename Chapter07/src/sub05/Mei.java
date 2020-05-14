package sub05;

public class Mei implements OverWatch{

	@Override
	public void name() {
		System.out.println("ÀÌ¸§ : ¸ŞÀÌ");
		
		
	}

	@Override
	public void lClick() {
		System.out.println("ÁÂÅ¬¸¯ : ³Ã°¢ÃÑ");
		
	}

	@Override
	public void rClick() {
		System.out.println("¿ìÅ¬¸¯ : °íµå¸§ Åõ»çÃ¼");
		
	}

	@Override
	public void shiftButton() {
		System.out.println("shift : ±Ş¼Ó ºù°á");
		
	}

	@Override
	public void eButton() {
		System.out.println("e : ºùº®");
		
	}

	@Override
	public void qButton() {
		System.out.println("q : ´«º¸¶ó(±Ã±Ø±â)");
		
	}
	

}
