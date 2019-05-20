import java.util.*;


public class ArrtoString
{
  public static void main(String []args)
  {
      ArrayList a = new ArrayList();
   a.add("C");
   a.add("C++");
   a.add("Java");
   System.out.println(a);
 StringBuilder d = new StringBuilder();
		
		Iterator itr=a.iterator();
  while(itr.hasNext()){
    d.append(itr.next());
    d.append(" ");
	}
	String result = d.toString();
	System.out.println(result);
  }
}