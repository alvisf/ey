package day4;

public class Ex10 {
	static int mat[][] = { { 1, 2, 3, 4 },
            			   { 5, 6, 7, 8 },
            			   { 9, 10, 11, 12 } };
		
	
	public static void print2D(int mat[][])
    {
        for (int[] row : mat) {
            for (int x : row) {
                System.out.print(x + " ");
                }
            System.out.println();
            }
    }
	
	public static void main(String[] args) {
		print2D(mat);
	}
}
