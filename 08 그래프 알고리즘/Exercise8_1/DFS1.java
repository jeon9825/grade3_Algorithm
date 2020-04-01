import java.util.HashMap;
import java.util.HashSet;

public class DFS1 {
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
		DFS(graph, start, new HashSet<>());
	}

	public static void DFS(HashMap<Character, String> graph, char start, HashSet<Character> visited) {
		visited.add(start);
		System.out.print(start + " ");
		String ad = graph.get(start);
		for (char adve : ad.toCharArray()) {
			if (!visited.contains(adve))
				DFS(graph, adve, visited);
		}
	}
	
	public static void main(String[] args) {
		DFS(createGraph(), 'A');
	}
}
