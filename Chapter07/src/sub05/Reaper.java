package sub05;

public class Reaper implements OverWatch{

	@Override
	public void name() {
		System.out.println("ÀÌ¸§ : ¸®ÆÛ");
		
	}

	@Override
	public void lClick() {
		System.out.println("ÁÂÅ¬¸¯ : ÇïÆÄÀÌ¾î ¼¦°Ç");
		
	}

	@Override
	public void rClick() {
		System.out.println("¿ìÅ¬¸¯ : ¾øÀ½");
		
	}

	@Override
	public void shiftButton() {
		System.out.println("shift : ¸Á·ÉÈ­");
		
	}

	@Override
	public void eButton() {
		System.out.println("e : ±×¸²ÀÚ ¹â±â");
		
	}

	@Override
	public void qButton() {
		System.out.println("q : Á×À½ÀÇ ²É (±Ã±Ø±â)");
		
	}

}
