package scrambled;

public class CaseSensitive {

	private static final String MYCONSTANT = "Java is Case Sensitive";
	private String var;

	public CaseSensitive() 
	{
		var = "Method and variable names should be lowercase";
	}

	private void Method() 
	{
		System.out.println("Class names should start with a capital letter.");
		System.out.println(var);
		System.out.println("Constants should use all caps.");
	}

	public static void main(String[] args)
	{
		CaseSensitive cs = new CaseSensitive();
		cs.Method();
	}

}