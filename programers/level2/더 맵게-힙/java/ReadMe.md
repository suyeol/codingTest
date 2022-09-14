# 

## TAG : 힙 , 우선순위 큐


### 내 풀이가 무엇이 잘못되었는지 이해를 못하겠다. 

### while문의 조건이 ascoville.size > 1 에서 ascoville.get(0) < K 

### if(ascoville.size() < 2) return -1;

### if(diffK < K) 안하고 다 add 하는 이유 

### 만약 {1, 7, 9}, 7 이 나왔다면???? 이것도 섞나? -1 리턴하나? 

### 섞는다 생각해보니 -1이 리턴되는 경우는 아무리 다 더해도 K를 넘을수 없는 경우이다. 

### 모든 음식을 계속 루프돌려야 할것같다.

- 
  ### 나의 풀이 

1. Array에 K이하만 담음
2. 작은 순으로 정렬
3. 0 , 1 에서 빼서 섞음
4. 섞은게 낮으면 Array에 추가


- 
  ### 타인의 풀이

```
Queue<Integer> queue = new LinkedList<>();//큐 생성
FIFO(First In First Out)
offer : 데이터를 집어넣음
poll : 가장 먼저 들어간 데이터가 나옴
peek : 가장 먼저 들어간 데이터를 확인
```
```
PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
가장 가중치가 낮은 순서로 poll, peek()을 할 수 있는 자료구조
Min Heap으로 데이터를 sort 시켜놓고 데이터를 출력하는 자료구조
offer : 데이터를 집어넣음
poll : 가장 작은 데이터가 나옴
peek : 가장 작은 데이터를 확인
```




