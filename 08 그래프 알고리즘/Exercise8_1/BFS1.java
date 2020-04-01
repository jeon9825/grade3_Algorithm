import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS1 {
	public static HashMap<Character, String> createGraph() {
		HashMap<Character, String> map = new HashMap<>();
		map.put('A', "BCD"); // A 정점에 인접한 정점 목록 등록
		map.put('B', "AC"); // B 정점에 인접한 정점 목록 등록
		map.put('C', "ABDE");
		map.put('D', "ACFG");
		map.put('E', "C");
		map.put('F', "DGH");
		map.put('G', "DFH");
		map.put('H', "FG");
		return map;
	}

	public static void BFS(HashMap<Character, String> graph, char start) {
		HashSet<Character> visited = new HashSet<>();
		Queue<Character> queue = new LinkedList<Character>(); // 다음에 방문할 정점 목록
		visited.add(start);
		queue.add(start);
		while (!queue.isEmpty()) {
			char v = queue.remove();
			System.out.print(v+" ");
			String ad = graph.get(v);
			for (char adve : ad.toCharArray()) {
				if (!visited.contains(adve)) {
					visited.add(adve);
					queue.add(adve);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFS(createGraph(), 'A');
	}

}
