package work;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int [] a=new int[8];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<8;i++) {
            a[i] = sc.nextInt();
        }
        sort(a);
    }
    public static void sort(int [] a){
        int m=0,n=0;
        for (int j=0;j<a.length;j++){
            if (a[j]%2==0){
                m++;
            }
            else{
                n++;
            }
        }
        int []jnumber=new int[n];
        int []onumber=new int[m];
        int p=0,q=0;
        for (int k=0;k<a.length;k++){
            if (a[k]%2==0){
                onumber[p]=a[k];
                p++;
            }
            else{
                jnumber[q]=a[k];
                q++;
            }
        }
        if (n>m){
            for(int i=0;i<m;i++){
                System.out.println(jnumber[i]+" "+onumber[i]);
            }
            for (int k=m;k<n;k++){
                System.out.println(jnumber[k]);
            }
        }
        else{
            for (int i=0;i<n;i++){
                System.out.println(jnumber[i]+" "+onumber[i]);
            }
            for (int k=n;k<m;k++){
                System.out.println(onumber[k]);
            }
        }
    }
}
