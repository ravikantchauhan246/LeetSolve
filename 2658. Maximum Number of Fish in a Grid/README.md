# Maximum Number of Fish in a Grid

## Problem Description
You are given a 2D grid where each cell contains a number representing the count of fish in that cell. The task is to find the maximum number of fish that can be caught starting from any cell and moving in four directions (up, down, left, right).

### Rules:
- You can only move to cells containing fish (non-zero values).
- Once you catch fish from a cell, it becomes empty (value becomes 0).
- You can only catch fish from connected cells (cells that share an edge).

## Solution Approach
The solution employs a Depth-First Search (DFS) strategy to explore connected cells containing fish.

### Algorithm
1. Iterate through each cell in the grid.
2. For each non-zero cell, perform DFS to:
   - Collect fish from the current cell.
   - Mark the cell as visited by setting it to 0.
   - Recursively explore all four adjacent cells.
   - Track the maximum fish count found.
3. Return the maximum fish count.

### Code Implementation
```java
class Solution {
    int rows;
    int cols;

    public int findMaxFish(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int maxFishes = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    maxFishes = Math.max(maxFishes, dfs(i, j, grid));
                }
            }
        }
        return maxFishes;
    }

    public int dfs(int r, int c, int[][] grid) {
        // base cases
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0) {
            return 0;
        }

        int ans = grid[r][c];
        grid[r][c] = 0;
        ans += dfs(r - 1, c, grid) + dfs(r + 1, c, grid) + 
               dfs(r, c - 1, grid) + dfs(r, c + 1, grid);
        return ans;
    }
}
```

## Complexity Analysis

### Time Complexity: O(R × C)
- R = number of rows
- C = number of columns
- Each cell is visited at most once because once a cell is visited, it becomes 0 and won't be visited again.

### Space Complexity: O(R × C)
- The worst-case recursion stack depth could be R × C (in case of a zigzag pattern).
- No additional data structures are used besides the recursion stack.

## Examples

### Example 1
Given the following grid:
```
0 2 1 0
4 3 2 1
1 2 3 4
```

The solution would find the largest connected group of cells containing fish and return their sum.
```
Output: 16
```

### Example 2
Given the following grid:
```
0 2 1 0
4 0 0 3
1 0 0 4
0 3 2 0
```

The fisher can start at cell (1,3) and collect 3 fish, then move to cell (2,3) and collect 4 fish.
```
Output: 7
```


