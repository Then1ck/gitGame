package controls;

public class Buttons {
	private boolean Pressed, Held, Released, toPress, toRelease;
	
	public Buttons() {
		Pressed = false;
		Held = false;
		Released = false;
		toPress = true;
		toRelease = false;
	}
	
	public void buttonDown() {
		if(toPress) {
			Pressed = true;
			Held = true;
			toPress = false;
			toRelease = true;
		}
	}
	
	public void buttonUp() {
		if(toRelease) {
			Released = true;
			Held = false;
			toPress = true;
			toRelease = false;
		}
	}
	
	public void reset() {
		Pressed = false;
		Released = false;
	}
	
	public boolean getPressed() {
		return Pressed;
	}
	
	public boolean getHeld() {
		return Held;
	}
	
	public boolean getReleased() {
		return Released;
	}
}
