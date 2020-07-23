package tareaProgramada3.Algoritmos;

import java.util.Stack;

public class TopologicalSort {
	private int j;
	private int[][] matrixP;

	TopologicalSort() {
		matrixP = new int[][] { {}, {}, { 3 }, { 1 }, { 0, 1 }, { 2, 0 } };
		j = 0;
	}

	void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
		visited[v] = true;

		while (j <= matrixP[v].length - 1) {
			int n = matrixP[v][j];
			if (!visited[n]) {
				
				topologicalSortUtil(n, visited, stack);
			}
			j++;
		}
		j = 0;
		stack.push(new Integer(v));
	}

	void topologicalSort() {
		Stack<Integer> stack = new Stack<Integer>();

		boolean visited[] = new boolean[matrixP.length];

		for (int i = 0; i < matrixP.length; i++)
			if (visited[i] == false)
				topologicalSortUtil(i, visited, stack);

		while (stack.empty() == false)
			System.out.print(stack.pop() + " ");
	}

	public static void main(String args[]) {
		TopologicalSort g = new TopologicalSort();
		System.out.println("Ordenamiento topologico del grafo: ");

		g.topologicalSort();
		
	}
}
