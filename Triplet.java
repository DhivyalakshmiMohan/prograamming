import java.util.Scanner;
class Triplet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [3];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int b[] =new int [3];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
    int[] result= compareTriplets(a,b);
    for(int r: result)
    System.out.print(r +" ");
      }
       static int [] compareTriplets(int[]a,int[]b){
      int alice=0,bob=0;
        int [] res=new int [2];
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i])
             alice++;
            if(b[i]>a[i])
           bob++;
        }
        res[0]=alice; 
       res[1]=bob;
        return res;
       }
    }

