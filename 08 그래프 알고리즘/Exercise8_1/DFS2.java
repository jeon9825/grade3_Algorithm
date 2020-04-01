import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class DFS2 {
	public static HashMap<Character, String> createGraph() {
		HashMap<Character, String> map = new HashMap<>();
		map.put('A', "BFH"); // A 정점에 인접한 정점 목록 등록
		map.put('B', "ACEF"); // B 정점에 인접한 정점 목록 등록
		map.put('C', "BDE");
		map.put('D', "CE");
		map.put('E', "BCD");
		map.put('F', "ABGH");
		map.put('G', "F");
		map.put('H', "AF");
		return map;
	}

	public static void DFS(HashMap<Character, String> graph, char start) {
		HashSet<Character> visited = new HashSet<>();
		Stack<Character> stack = new Stack<>();
		visited.add(start);
		stack.push(start);
		while (!stack.isEmpty()) {
			char v = stack.pop();
			System.out.print(v + " ");
			String ad = graph.get(v);
			for (char adve : ad.toCharArray()) {
				if (!visited.contains(adve)) {
					visited.add(adve);
					stack.push(adve);
				}
			}
		}
	}

	public static void main(String[] args) {
		DFS(createGraph(), 'A');
	}
}
