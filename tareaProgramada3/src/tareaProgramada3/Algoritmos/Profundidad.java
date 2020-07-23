package tareaProgramada3.Algoritmos;

public class Profundidad {
	private int[][] Matrixz;
	private int[][] Matrixzady;

	public Profundidad() {
		Matrixz = new int[][] { { 1, 3 }, { 0, 3, 2, 4 }, { 1, 4 }, { 0, 1, 4, 5 }, { 1, 2, 3, 5, 6 }, { 3, 4, 6 },
				{ 5, 4 } };
		Matrixzady = new int[Matrixz.length][Matrixz.length];
	}

	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v + " ");

		int i = 0;
		while (i <= Matrixz[v].length - 1) {
			int n = Matrixz[v][i];
			if (!visited[n]) {
				Matrixzady[v][n] = 1;
				Matrixzady[n][v] = 1;
				DFSUtil(n, visited);
			}
			i++;
		}
	}

	void DFS(int v) {
		boolean visited[] = new boolean[Matrixz.length];

		DFSUtil(v, visited);
	}

	public static void main(String[] args) {

		Profundidad g = new Profundidad();
		System.out.println("Recorrido en profundidad de un grafo representado como matriz: ");
		g.DFS(2);
		System.out.println("\nMatriz de adyacencia");
		for (int i = 0; i < g.Matrixz.length; i++) {
			for (int j = 0; j < g.Matrixz.length; j++) {
				System.out.print(g.Matrixzady[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
