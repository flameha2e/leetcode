package solution;

import java.util.Arrays;

public class increase_to_keep_city_skyline {

	public static void main(String Args[]) {
//		int grid[][]= {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		int grid[][] = {{2,4},{0,1}};
		System.out.println(maxIncreaseKeepingSkyline(grid));
	}
	
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
    		int side_view[] = new int[grid.length];
	    	for(int i=0;i<grid.length;i++) {
	    		int max=0;
	    		for(int j=0;j<grid[i].length;j++) {
	    			if(max < grid[i][j])
	    				max = grid[i][j];
	    		}
	    		side_view[i]=max;
	    	}
	    	
	    	int top_view[] = new int[grid.length];
	    	for(int j=0;j<grid.length;j++) {
	    		int max=0;
	    		for(int i=0;i<grid[j].length;i++) {
	    			if(max < grid[i][j])
	    				max = grid[i][j];
	    		}
	    		top_view[j]=max;
	    	}
	    	System.out.println("side view " +Arrays.toString(side_view));
	    	System.out.println(" top view " +Arrays.toString(top_view));
	    	
	    	int total_increase = 0;
	    	for(int i=0;i<grid.length;i++) {
	    		for(int j=0;j<grid[i].length;j++) {
	    			int max = top_view[j] < side_view[i] ? top_view[j] : side_view[i];
	    			total_increase += max - grid[i][j];
	    		}	
	    	}
	    	return total_increase;
    }
}
