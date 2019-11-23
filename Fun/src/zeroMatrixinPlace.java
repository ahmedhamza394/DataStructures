
public class zeroMatrixinPlace {
	
	
	public static void setZeroes(int[][] matrix) 
	{
		int m = matrix.length;
		int n = matrix[0].length;
		
		//int max = getmax(matrix, m, n);
		int max = Integer.MAX_VALUE;
		max--;
		for(int x =0; x < m; x++) 
		{
			for(int y =0; y<n; y++) 
			{
				if(matrix[x][y]  == 0) 
				{
					replace(matrix, m, n, x, y, max);
				}
			}
			
		}
		
		for(int x =0; x < m; x++) 
		{
			for(int y =0; y<n; y++) 
			{
				if(matrix[x][y]  == max ) 
				{
					matrix[x][y] = 0;
				}
			}
			
		}
		
		for(int x =0; x < m; x++) 
		{
			for(int y =0; y<n; y++) 
			{
				System.out.print(matrix[x][y] + " ");
			}
			System.out.println();
			
		}
    }
	
	public static void replace(int[][] mat, int m, int n, int x, int y, int max) 
	{
		int i =0;
		while(i < n) 
		{
			if(mat[x][i] == 0) 
			{
				i++;
				continue;
			}
			else 
			{
				mat[x][i] = max;
				i++;
			}
		}
		
		int j = 0;
		while(j < m) 
		{
			if(mat[j][y] == 0) 
			{
				j++;
				continue;
			}
			else 
			{
				mat[j][y] = max;
				j++;
			}
			
		}
		
	}
	
	public static int getmax(int[][] matrix, int m, int n) 
	{
		int max = 0;
		
		for(int x =0; x < m; x++) 
		{
			for(int y =0; y<n; y++) 
			{
				if(matrix[x][y] > max) 
				{
					max = matrix[x][y];
				}
			}
			
		}
		return max;
	}

	public static void main(String[] args) 
	{
		int[][] mat = {{9,3,5,7,2}, {7,2,9,2147483647,4}, {-2147483648,7,3,6,9}, {7,1,3,2,0}};
		

		int m = mat.length;
		int n = mat[0].length;
		for(int x =0; x < m; x++) 
		{
			for(int y =0; y<n; y++) 
			{
				System.out.print(mat[x][y] + " ");
			}
			System.out.println();
			
		}
		System.out.println("********************************************");
		setZeroes(mat);
	}

}
