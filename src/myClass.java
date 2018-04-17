
public class myClass {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(r.availableProcessors());
		//total amount of memory in the jawa virtual mashine.
		System.out.println(r.totalMemory());

	}

}
