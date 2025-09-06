import java.util.Scanner;
class Hurdlerace{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int height []=new int[n];
       for(int i=0;i<height.length;i++){
            height[i]=sc.nextInt();
       }
       int result=hurdlerace(height,k);
       System.out.print(result);
    }
    static int hurdlerace(int height[],int k){
            int max=0;
            for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
            }
            }
            if(max>k){
            return max-k;
            }
            else
            return 0;
            }
    
}
