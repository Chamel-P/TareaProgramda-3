package tareaProgramada3.Algoritmos;

import java.util.LinkedList;

public class BFSInMatrix {
	private int[][] IM;

	public BFSInMatrix(int length) {
		IM = new int[length][length];

	}

	public void BFS(int[][] grid, int s) {

		LinkedList<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[grid.length];
		visited[s] = true;
		queue.add(s);

		System.out.println("Grafo Ordenado");
		while (queue.size() != 0) {
			s = queue.remove();
			System.out.print(s + " ");
			int i = 0;
			while (i <= grid[s].length - 1) {
				int n = grid[s][i];
				if (!visited[n]) {
					visited[n] = true;
					
					IM[s][n] = 1;
					IM[n][s] = 1;

					queue.add(n);

				}
				i++;

			}

		}
	}

	public static void main(String[] args) {

		int[][] grid = new int[][] { { 1, 3 }, { 0, 3, 2, 4 }, { 1, 4 }, { 0, 1, 4, 5 }, { 1, 2, 3, 5, 6 }, { 3, 4, 6 },
				{ 5, 6 } };

		BFSInMatrix d = new BFSInMatrix(grid.length);

		d.BFS(grid, 2);

		System.out.println("\nMatriz de adyacencia");
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(d.IM[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
