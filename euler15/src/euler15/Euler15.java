package euler15;

public class Euler15 {

	public static void main(String[] args) {
		final int gridSize = 20;
		long[][] grid = new long[gridSize + 1][gridSize + 1];

		for (int i = 0; i < gridSize; i++) 
		{
			grid[i][gridSize] = 1;
			grid[gridSize][i] = 1;
		}

		for (int i = gridSize - 1; i >= 0; i--)
		{
			for (int j = gridSize - 1; j >= 0; j--) 
			{

				grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
				System.out.println(grid[i][j]);
			}

		}

	}

}
