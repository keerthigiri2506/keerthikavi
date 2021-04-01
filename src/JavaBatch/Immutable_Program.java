package JavaBatch;


public class Immutable_Program {
	public static void main(String[] args) {
		
		String s = "Greens";
		String s1 = "Greens";
		String s2 = "Technology";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("After concat:...");
		String s3 = s.concat(s1);
		System.out.println(System.identityHashCode(s3));
		
		System.out.println("^^^^^^Mutable^^^^^^");
			
	StringBuffer b = new StringBuffer("Greens");
	StringBuffer b1 = new StringBuffer("Greens");
	StringBuffer b2 = new StringBuffer("Technology");
	
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(b1));
	System.out.println(System.identityHashCode(b2));
	
	StringBuffer b3 = b.append(b1);
	System.out.println(System.identityHashCode(b3));
	}
	
	
	
}
