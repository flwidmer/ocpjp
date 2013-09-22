package polymorphism;

public class Subclass extends Superclass {
	public String name = "Sub";
public static String stat(){
	return "statSub";
}
	@Override
	public String getName() {
		return "overridden";
	}
}
