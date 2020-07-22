import java.util.*;
interface startsWithALength{
    public void wordLength();
}
public class WordProgram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		String[] a = new String[100];
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.next();
		}
		startsWithALength obj=()->{
		    for(int j=0;j<n;j++)
		    {
		        if(a[j].startsWith("a")==true && a[j].length()<=3)
		        {
		            System.out.println(a[j]);
		        }
		      
		    }
		};
		obj.wordLength();
	}
}
