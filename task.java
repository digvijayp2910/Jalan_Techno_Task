
import java.util.*;

public class task {
    
    static int[] reverse(int a[], int n){ 
            int[] b = new int[n];
            int j = n;
            for (int i = 0; i < n; i++) { 
                b[j - 1] = a[i];
                j = j - 1; 
            } 
            return b; 
    }
     
    public static void main(String[] args) { 
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        int p = sc.nextInt();
        int d = sc.nextInt();   
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int temp=0;
        if(d==0){
            for (int i =0;i<p;i++){
                temp=arr[0];
                for(int j=0;j<n-1;j++){
                    arr[j]=arr[j+1];
                } 
                arr[n-1]=temp;
            }
        }
        else if(d==1){  
           int nw[]= task.reverse(arr,n); 
           for (int i : nw) {
        	   System.out.println(i);
		}
           for (int i =0;i<p;i++){ 
               temp=nw[0]; 
               for(int j=0;j<n-1;j++){ 
                   nw[j]=nw[j+1]; 
               }  
                nw[n-1]=temp;
            } 
            arr= task.reverse(nw,n);
          }

        else{
            System.out.println("Invalid Direction");
        } 
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
