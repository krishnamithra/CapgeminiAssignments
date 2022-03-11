package day5;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Experiment";
		char c = name.charAt(4);
		System.out.println(c);
		
		String s3 = "Rom";
		System.out.println(name.compareTo(s3));
		
		String s4 = name.concat(" is done");
		System.out.println(s4);
		
		System.out.println(name.contains("peri"));
		
		System.out.println(name.endsWith("one"));
		
		System.out.println(name.equals(s3));
		
		String s5 = "ROM";
		System.out.println(s3.equalsIgnoreCase(s5));
		
		String.format("name is %s",name);
		
		byte[] b = name.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		char[] c1 = new char[10];
		try {
			name.getChars(4, 9, c1, 0);
			System.out.println(c1);
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		int index = name.indexOf("is");
		System.out.println(index);
		
		String s6 = new String("Hello").intern();
		String s7 = new String("Hello").intern();
		System.out.println("Strings of different references are same after adding intern():" + (s6==s7));
		
		
		System.out.println("Is the String empty?" + name.isEmpty());
		
		String s8 = String.join("-","Hello","guys");
		System.out.println(s8);
		
		System.out.println(name.lastIndexOf("e"));
		
		System.out.println(name.length());
		
		String s9 = name.replace("e", "a");
		System.out.println(s9);
		
		s9 = name.replaceAll("e", "a");
		System.out.println(s9);
		
		String s10="java string split method by javatpoint";  
		String[] words=s10.split("\\s"); 
		
		for(String w:words){  
		System.out.println(w);  
		}
		
		System.out.println(name.startsWith("Ex"));
		
		System.out.println(name.substring(1, 8));
		
		char[] c2 = name.toCharArray();
		for(int i=0;i<c2.length;i++) {
			System.out.println(c2[i]);
		}
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		int n = 3;
		String s11 = String.valueOf(n);
		System.out.println(s11);
		

	}

}
