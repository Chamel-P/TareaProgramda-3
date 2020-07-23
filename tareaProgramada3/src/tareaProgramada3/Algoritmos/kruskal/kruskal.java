package tareaProgramada3.Algoritmos.kruskal;

public class kruskal {

	int[][] matrix;
	boolean[] visitado;
	edge[] Edges;

	public kruskal(int[][] matrix) {
		this.matrix = matrix;
		this.Edges = new edge[matrix.length];
		this.visitado = new boolean[matrix.length];
	}

	class edge {
		int peso; 
		int src;
		int destino;
		public edge(int source, int destiny, int weigth) {
			this.src = source;
			this.destino = destiny;
			this.peso = weigth;
		}
	}

	public edge ObtenerEfge() {

		int peso = Integer.MAX_VALUE;
		int src = 0;
		int destino = 0;

		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				if (matrix[x][y] < peso && !visitado[y] && matrix[x][y] != 0 && x != y) {
					src = x;
					destino = y;
					peso = matrix[x][y];
				}
			}
		}
		visitado[destino] = true;
		return new edge(src, destino, peso);
	}

	public void kruskalfuncion() {
		int index = 0;
		while (index < matrix.length - 1) {
			edge route = ObtenerEfge();
			if (route != null) {
				Edges[index] = route;
			}
			index++;
		}
	}

	public void imprimir() {
		kruskalfuncion();

		int index = 0;
		while (index < matrix.length - 1) {

			System.out.println(
					(Edges[index].src + 1) + "--" + (Edges[index].destino + 1) + " == " + Edges[index].peso + "\n");

			index++;
		}

	}

}
