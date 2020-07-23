package tareaProgramada3.Algoritmos.daijstra;

public class Dijkstra {
	public int inicial;
	public int[] distacia;
	public int[] parentsP;

	public void dijkstra(int[][] m, int inicial) {

		int[] distacia = new int[m.length];
		boolean[] added = new boolean[m.length];
		for (int i = 0; i < m.length; i++)
			distacia[i] = Integer.MAX_VALUE;
		distacia[inicial] = 0;
		int[] parents = new int[m.length];
		parents[inicial] = -1;
		for (int i = 1; i < m.length; i++) {
			int V = 0;
			int D = Integer.MAX_VALUE;
			for (int j = 0; j < m.length; j++) {
				if (!added[j] && distacia[j] < D) {
					V = j;
					D = distacia[j];
				}
			}
			added[V] = true;
			for (int j = 0; j < m.length; j++) {
				int ED = m[V][j];
				if (ED > 0 && ((D + ED) < distacia[j])) {
					parents[j] = V;
					distacia[j] = D + ED;
				}
			}
		}
		this.inicial = inicial;
		this.distacia = distacia;
		this.parentsP = parents;
	}
}
