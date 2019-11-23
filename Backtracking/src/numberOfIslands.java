import java.awt.Point;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class numberOfIslands {
	HashSet<Point> set = new HashSet<>();

	public int countIsland(char[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if (grid[i][j] == '1' && !set.contains(new Point(i, j))) {
					sum += countIslandHelper(grid, i, j);
				}
			}
		}

		return sum;
	}

	public int countIslandHelper(char[][] grid, int i, int j) {
		int row = grid.length;
		int col = grid[0].length;
		Queue<Point> q = new LinkedList<>();
		Point p = new Point(i, j);
		q.add(p);
		set.add(p);
		while (!q.isEmpty()) {
			Point top = q.remove();
			//set.add(top);
			if (top.x + 1 < row && grid[top.x + 1][top.y] == '1') {
				if (!set.contains(new Point(top.x + 1, top.y))) {
					q.add(new Point(top.x + 1, top.y));
					set.add(new Point(top.x + 1, top.y));
				}

			}
			if (top.x - 1 > 0 && grid[top.x - 1][top.y] == '1') {
				if (!set.contains(new Point(top.x + 1, top.y))) {
					q.add(new Point(top.x - 1, top.y));
					set.add(new Point(top.x + 1, top.y));
				}
			}

			if (top.y + 1 < col && grid[top.x][top.y + 1] == '1') {
				if (!set.contains(new Point(top.x, top.y + 1))) {
					q.add(new Point(top.x, top.y + 1));
					set.add(new Point(top.x, top.y + 1));
				}

			}
			if (top.y - 1 > 0 && grid[top.x][top.y - 1] == '1') {
				if (!set.contains(new Point(top.x, top.y - 1))) {
					q.add(new Point(top.x, top.y - 1));
					set.add(new Point(top.x, top.y - 1));
				}
			}
		}
		return 1;
	}

}