package array;

import java.util.Scanner;

public class Reverse_Duplicate {

	public static void main(String[] args) {
		Reverse_Duplicate rd=new Reverse_Duplicate();
		rd.dup();
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] ch=s.toCharArray();
String r="";
for(int i=ch.length-1;i>=0;i--) {
	r=r+ch.length;
	System.out.print(ch[i]);

}
	}
	
	public void dup() {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++) {
	int count=1;
	for(int j=0;j<i;j++) {
		if(ch[i]==ch[j]) {
			count++;
			ch[j]='%';
		}
	}
	if(count>1&&ch[i]!='%') {
		System.out.println("Duplicate value: " + ch[i] + count);
	}
	
}	String st=new String(ch);
System.out.println(st.replace("%", ""));
	}
	

}
