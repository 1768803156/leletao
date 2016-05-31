import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	
	

    public static void main(String[] args)
    {
        String s1 = "Valaienie";
        String s2 = "Marginle";
        String s3 = s2;
        int begin = 0;
        int end = s2.length();
        int i = 1;
        while (!s1.contains(s3))
        {
            if (end == s2.length())
            {
                begin = 0;
                end = (s2.length()) - (i++);
            }
            else
            {
                begin++;end++;
            }
            s3 = s2.substring(begin, end);
            System.out.println(s3);
            System.out.println("--------");
        }
        System.out.println(s3);
    }
}
