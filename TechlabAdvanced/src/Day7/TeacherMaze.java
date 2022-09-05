package Day7;

public class TeacherMaze {
    static char maze[][] = {{' ',' ',' ',' ',' ','█','█',' ',' ',' '},
                            {'█','█',' ','█',' ',' ',' ',' ','█',' '},
                            {'█','█',' ','█',' ','█','█','█','█',' '},
                            {'█','█',' ','█',' ','█','█','█','█',' '},
                            {' ',' ',' ','█',' ',' ',' ','█','█',' '},
                            {' ','█',' ','█',' ','█',' ','█','█',' '},
                            {' ',' ','█',' ',' ','█',' ',' ','█',' '},
                            {'█',' ','█','█',' ','█',' ','█','█',' '},
                            {'█',' ',' ','█',' ','█',' ','█','█',' '},
                            {'█','█','█','█',' ','█',' ','█','█',' '}};
    
    public static void print() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static boolean solve(int x, int y) {
        if (x < 0 || y < 0 || x > 9 || y > 9) return false;
        
        if (maze[x][y] == '█' || maze[x][y] == '═' || maze[x][y] == '║' )  
            return false;
        
        maze[x][y] = '═';
        
        if (x == 9 && y == 9) {
       	 maze[x][y] = '╚'; 	

        	return true;
        }
        
        if (solve(x + 1, y)) {
        	 maze[x][y] = '║'; 	
        	return true;
        }
        if (solve(x - 1, y)) {
        	 maze[x][y] = '║';
        	return true;
        }
        if (solve(x, y - 1)) {
        	 maze[x][y] = '═';
        	return true;
        }
        if (solve(x, y + 1)) {
        	 maze[x][y] = '═';
        	return true;
        }
        
        maze[x][y] = ' ';
        return false;
    }
    
    public static void main(String args[]) {
        System.out.println("ORIGINAL");
        print();
        solve(0, 0);
        System.out.println("\n\nSOLVED");
        print();
    }
}
