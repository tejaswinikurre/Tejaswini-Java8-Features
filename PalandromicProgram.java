import java.util.*;
class Palandrome{
    public void list(String[] a,int n)
    {

        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder(a[i]);
            if(a[i].equals(sb.reverse().toString()))
            System.out.println(a[i]);
        }
    }
}
public class PalandromicProgram
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
		Palandrome obj=new Palandrome();
		obj.list(a,n);
	}
}
