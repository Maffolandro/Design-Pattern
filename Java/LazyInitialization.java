public class Lazy {
	private boolean initialized;
	private String[] data;
	public String var;
	
	public Lazy(String... data) {
		this.data = data;
		this.initialized = false;
	}

	public void lazyInit() {
		this.var = String.join(" ", this.data);
		this.initialized = true;
	}
	
	public void callMe() {
		if (!this.initialized){
			lazyInit();
		}
		System.out.println(this.var);
}