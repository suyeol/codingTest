# 

## TAG : 큐


### ArrayList를 큐로 사용하였다. 물론 큐 객체가 따로 있겠지만...

### 큐를 이용해 먼저 들어온 트럭이 먼저 나가는 식으로 이용하는 문제 같았다. 

### 큐 == 다리 인데 다리를 한칸씩 건너는 행위를 표현하는게 어려웠다. 

### 나는 0 을 add 함으로써 다리를 건너는 행위로 구현하였다. 

- 
  ### 나의 풀이 

1. trcuk을 ArrayList로 변환
2. ArrayList 형태의 bridge 선언
3. bridge 크기와 bridge_length가 다 차면 맨앞의 bridge를 비움 ( 다리를 다 건너면 내리는 행위 )
4. 더 올라탈수 있다면 atruck 비우고 bridge에 추가.
5. 더 올라탈수 없다면 0을 추가.
6. atruck이 비워지면 마지막 올라탄 트럭이 다리를 다 건널때까지 시간 더함


- 
  ### 타인의 풀이


```
truck이라는 클래스를 만들어서 클래스 안에 move라는 변수를 생성함으로써 다리를 건너는 행위를 구현하였다. 
대기중인 트럭 큐가 있고 다리에 올라간 트럭 큐가 있다. 

```

```
Queue<Truck> moveQ = new LinkedList<>();
moveQ.isEmpty()
moveQ.offer(t);
moveQ.poll();
moveQ.peek()
```





