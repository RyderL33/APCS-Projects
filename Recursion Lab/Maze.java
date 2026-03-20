public class Maze {
    private int[][] grid;

    public Maze(int [][] data)
    {
        grid = data;

        System.out.println("Initial maze (1 = wall, 0 = open):");
        DisplayData.display(grid);

        boolean possible = false;
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            System.out.println("No maze data provided.");
            return;
        }

        // If start or end is a wall, immediately impossible
        if(grid[0][0] == 1){
            System.out.println("Start is blocked. No path possible.");
        }
        else if(grid[grid.length-1][grid[0].length-1] == 1){
            System.out.println("End is blocked. No path possible.");
        }
        else{
            possible = solve(0,0);
            System.out.println("\nResult: " + (possible ? "Path found!" : "No path exists."));
            System.out.println("\nMaze after search (2 = path, 3 = visited dead-end, 1 = wall, 0 = unvisited open):");
            DisplayData.display(grid);
        }
    }

    // Recursive backtracking solver. Returns true if a path from (r,c) to bottom-right exists.
    private boolean solve(int r, int c){
        int rows = grid.length;
        int cols = grid[0].length;

        // bounds check
        if(r < 0 || c < 0 || r >= rows || c >= cols) return false;

        // If wall or already visited (2 or 3), skip
        if(grid[r][c] == 1 || grid[r][c] == 2 || grid[r][c] == 3) return false;

        // If we've reached the goal
        if(r == rows-1 && c == cols-1){
            grid[r][c] = 2; // mark as part of path
            return true;
        }

        // Mark as visited (tentative path)
        grid[r][c] = 2;

        // Explore neighbors in 4 directions: down, right, up, left
        if(solve(r+1, c)) return true;
        if(solve(r, c+1)) return true;
        if(solve(r-1, c)) return true;
        if(solve(r, c-1)) return true;

        // Backtrack: mark as visited dead-end (3)
        grid[r][c] = 3;
        return false;
    }



}
