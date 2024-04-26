import java.util.Scanner;

// adjacnecy matrix
public class adjacnecy_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of vertices :");
        int n = sc.nextInt();
        
        while(n<0){
            System.out.println("Enter the valid Verteces");
            n = sc.nextInt();
        }
        int [][]arr = new int[n][n];
        for(int row = 0;row<n;row++){
            for(int col = 0;col<n;col++){
                System.out.println("Enter 1 if there is an edge between "+ row +" and "+col+" else,enter 0" );
                int edge = sc.nextInt();
                if(edge != 1 && edge != 0){
                    edge = sc.nextInt(); 
                }
                arr[row][col] = edge;
                arr[col][row] = edge;
            }
        }
        System.out.println("Printing 2d Matrix :");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
