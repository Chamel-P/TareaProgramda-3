package tareaProgramada3.Algoritmos.daijstra;

public class ImpresionDijkstra {
	public ImpresionDijkstra(int inicial, int[] distancia, int[] parents) {
		int nVertices = distancia.length;
		System.out.print("Vertice\t Distancia\tCamino de nodos");

		for (int i = 0; i < nVertices; i++) {
			if (i != inicial) {
				System.out.print("\n" + inicial + " -> ");
				System.out.print(i + " \t\t ");
				System.out.print(distancia[i] + "\t\t");
				printPath(i, parents);
			}
		}
	}

	private static void printPath(int currentVertex, int[] parents) {

		if (currentVertex == -1) {
			return;
		}
		printPath(parents[currentVertex], parents);
		System.out.print(currentVertex + " ");
	}
}
