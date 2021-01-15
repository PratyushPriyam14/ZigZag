import java.util.*;
import java.io.*;
public class ZigZag {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pzz(n);
    }
    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println("pre"+n);
        pzz(n-1);
        System.out.println("in"+n);
        pzz(n-1);
        System.out.println("post"+n);
    }
}
