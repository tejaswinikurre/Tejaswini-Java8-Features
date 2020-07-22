import java.util.*;
class Avg
{
    double average(List list,int n)
    {
        int s=0;
        double res;
        for(int i=0;i<list.size();i++)
        {
            s=s+(Integer)list.get(i);
        }
        res=s/n;
        return res;
    }
  
}
public class AverageProgram
{
	public static void main(String[] args) {
	 ArrayList<Integer> list = new ArrayList<Integer>();
         int n;
         int i,t;
         double res;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         for(i=0;i<n;i++)
         {
             t=sc.nextInt();
             list.add(t);
         }
         System.out.println(list);
         Avg obj=new Avg();
        res=obj.average(list,n);
        System.out.println(res);
	}
}
