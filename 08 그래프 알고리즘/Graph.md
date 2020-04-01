# 그래프
## 그래프의 표현
1) 인접 행렬(Adjacency Matrix)   
* 그래프를 2차원 배열로 구현한다.
```java    
int N = 6;
int[][] a = new int [N][N];
```   
* N은 정점의 총 수이다.
* a[i][j] == 1이면, 정점 i와 j 사이의 간선이 있음을 의미함.
* a[i][j] == 0이면, 정점 i와 j 사이의 간선이 없음을 의미함.

2) 인접 리스트 (Adjacency List)  
* N개의 링크드 리스트로 그래프를 표현한다.
* N은 정점의 수이다.
* i 번째 링크드 리스트에는 정점 i에 인접한 정점들이 들어있다.  
* 가중치 있는 그래프의 경우에 링크드 리스트에 가중치도 저장한다.

```java   
static final int N = 30; // 정점의 수

ArrayList[] list = new ArrayList[N];
for(int i = 0; i < list.length; i++){
    list[i]= new ArrayList<Integer>();

}

// a, b 사이 양방향 링크 추가
list[a].add(b);
list[b].add(a);
```   

3) 그래프 구현 in Java
* 가중치 없는 무향 그래프
```java    
public static Map<Character, String> createGraph1(){
    Map<Character, String> map = new HashMap<Character, String>();
    map.put('A', "BCD"); // A 정점에 인접한 정점 목록 등록
    map.put('B', "AC"); // B 정점에 인접한 정점 목록 등록
    map.put('C', "ABDE");
    map.put('D',"ACFG");
    map.put('E', "C"); 
    map.put('F', "DGH"); 
    map.put('G', "DFH"); 
    map.put('H', "FG"); 
    return map;
}
```   

* 가중치 없는 유향 그래프
```java   
public static Map<String, String[]> createGraph2() { 
    Map<String, String[]> map = new HashMap<>(); 
    map.put("철수", new String[] { "영희", "동건", "준호", "승우" }); 
    map.put("영희", new String[] { "철수", "동건" });
    map.put("준호", new String[] { "철수", "승우" }); 
    map.put("승우", new String[] { "재상" }); 
    map.put("동건", new String[] { "영희", "재상" }); 
    map.put("재상", new String[] { "승우" }); 
    return map; 
}
```   

* 가중치 있는 유향 그래프
```java   
class 인접정점{
    public String 정점;
    public int 가중치;

    public 인전정점(String 정점, int 가중치){
        this.정점 = 정점;
        this.가중치 = 가중치;
    }
}

public static Map<String, 인접정점[]> createGraph3() { 
    Map<String, 인접정점[]> map = new HashMap<>(); 
    map.put("철수", new 인접정점[] { new 인접정점("영희",8), new 인접정점("동건",7), new 인접정점("준호",5), new 인접정점("승우",6) }); 
    map.put("영희", new 인접정점[] { new 인접정점("철수",9), new 인접정점("동건",6) }); 
    map.put("준호", new 인접정점[] { new 인접정점("철수",8), new 인접정점("승우",5) });
    map.put("승우", new 인접정점[] { new 인접정점("재상",1) }); 
    map.put("동건", new 인접정점[] { new 인접정점("영희",9), new 인접정점("재상",5) }); 
    map.put("재상", new 인접정점[] { new 인접정점("승우",2) }); 
    return map; 
}
```   

## 너비우선탐색(BFS)과 깊이우선탐색(DFS)
1) 그래프 탐색 방법
* 너비 우선 탐색 - BFS(Breadth-First Search)
* 깊이 우선 탐색 - DFS(Depth-First Search)