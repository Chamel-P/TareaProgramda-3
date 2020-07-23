package tareaProgramada3.Algoritmos.daijstra;

public class principal {

	public static void main(String[] args) {

		int adjacency_matrix[][] = { { 0, 10, 0, 0, 0, 0 }, { 0, 0, 15, 0, 0, 0 }, { 15, 0, 0, 4, 10, 0 },
				{ 0, 12, 4, 0, 2, 1 }, { 0, 0, 4, 0, 0, 0 }, { 0, 15, 4, 0, 5, 0 } };

		Dijkstra djk = new Dijkstra();
		djk.dijkstra(adjacency_matrix, 1);

		new ImpresionDijkstra(djk.inicial, djk.distacia, djk.parentsP);

	}

}
