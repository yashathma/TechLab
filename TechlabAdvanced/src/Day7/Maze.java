package Day7;

public class Maze {
	static int[][] grid = { {2,0,0,0,0,0,0,0,0,0}, 
							{1,0,0,0,1,1,1,1,0,0},
							{1,1,1,0,0,1,0,1,0,0},
							{0,0,1,0,0,1,0,1,0,0},
							{0,0,1,0,0,1,0,1,0,0},
							{0,0,1,0,0,1,0,1,0,0},
							{1,1,1,1,1,1,0,1,0,0},
							{0,0,0,0,0,0,0,1,0,0},
							{0,1,1,1,1,1,1,1,1,3},
							{0,0,0,0,0,0,0,0,0,0}};

	private static boolean walk(int x, int y) {
		if(x>=grid.length||y>=grid[0].length||x<0||y<0) {
			return false;
		}
		if(grid[x][y]==3) {
			grid[x][y]=8;
			return true;
		}
		if(grid[x][y]==0 || grid[x][y]==8) {
			return false;
		}
		int temp=grid[x][y];
		grid[x][y]=8;
		if(walk(x+1,y)) {
			return true;
		}
		if(walk(x,y+1)){
			return true;
		}
		if(walk(x,y-1)){
			return true;
		}
		if(walk(x-1,y)){
			return true;
		}
		grid[x][y]=temp;
		return false;

	}

	public static void main(String[] args) {
		print(grid);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		if(walk(0,0)) {
			print(grid);
		}
		





	}

	private static void print(int[][] grid2) {
		for (int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}

	}

}
