package tareaProgramada3.Algoritmos.kruskal;

public class principal {

	public static void main(String[] args) {
		int adjacency_matrix[][] = { { 0, 0, 0, 0 }, { 10, 0, 0, 0 }, { 6, 0, 0, 0 }, { 5, 15, 4, 0 } };
		
		kruskal graph = new kruskal(adjacency_matrix);

        graph.imprimir();;
      



	}
}
