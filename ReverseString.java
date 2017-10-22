import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class ReverseString {
	
	public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = k-1;
        while (left<right && left<c.length && right<c.length){
            for (int i=left, j=right; i<j; i++, j--){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
            left = left + 2*k;
            if ((c.length-1-right)<k) right = c.length-1;
            else right += 2*k;
        }
        return new String(c);
    }

	public static void main(String[] args) {
//	   int a = Integer.MAX_VALUE;
//	   System.out.print(a);
       Set<Integer> s = new HashSet<Integer>();
       HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
       StringBuilder sb = new StringBuilder();
       sb.append("->");
       System.out.print(sb.toString());
       List<String> l = new ArrayList<String>();
       l.toString()
       l.add(3+"");
       System.out.println(l);
       String s1 = "12345";
//       s1 += 'w';
         System.out.println(s1.indexOf(s1));
//       Queue q = new LinkedList();
//       Stack<Integer> s4 = new Stack<Integer>();
//       s4.push(1);
//       s4.push(2);
//       s4.push(3);
//       s4.push(4);
//       System.out.println(s4.elementAt(0));
//       int[] frequency = new int[20];
       s1.indexOf(s1);
       hm.k
	}

}
