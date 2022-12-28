class Reverse{
	public static void main(String[]args){
	String s1="qlcadda";
	String s2="";
	int len=s1.length();
	for(int i=len-1;i>=0;i--){
	char ch=s1.charAt(i);
	s2=s2+ch;
}
	System.out.println(s2);
}
}