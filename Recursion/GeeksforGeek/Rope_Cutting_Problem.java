package Basic_Question;

public class Rope_Cutting_Problem {

    protected static int max_piece(int n, int a, int b, int c){
        //Base Condition
        if(n < 0){
            return -1;
        }
        if(n == 0){
            return 0;
        }
        //System.out.println("N: "+n);
        int max_piece = (find_max_value(max_piece(n-a,a,b,c), max_piece(n-b,a,b,c), max_piece(n-c,a,b,c)));
        //System.out.println("Loop Completed");
        return max_piece + 1;
    }

    protected static int find_max_value(int x, int y,int z){
       // System.out.println("X:"+x+" Y:"+y+" Z:"+z);
        if(x > y && x > z){
            return x;
        }
        else if(y > x && y > z){
            return y;
        }
        else{

            return z;
        }
    }



    public static void main(String[] args) {
        // write your code here
        //Test Case 1
        //System.out.println("Number of piece: "+(max_piece(23, 12, 9, 11)));

        //Test case 2
        System.out.println("Number of piece: "+(max_piece(5, 2, 5, 1) ));
    }
}
