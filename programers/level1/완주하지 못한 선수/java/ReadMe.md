# 효율성 테스트를 통과못함 실패.........

## TAG : 해시맵 , Sort , getOrDefault


### 알고리즘 자체는 쉽게 풀렸음.

### 정확성 테스트는 통과하였지만, 효율성테스트에서 통과못해서 못품

### 다른사람의 풀이를 봤을때 Sort를 통한 풀이도 있지만, 소제목자체가 해시인만큼 solution2.java의 풀이가 의도에 맞는듯하다.

### 결국 나의 실패를 분석해보자면 나는 이중 for문을 썼기때문에 O(N^2)의 시간복잡도를 가지고 타인의 풀이는 for문이 더 많더라도 O(N)의 시간복잡도를 가지기 때문에 효율성이 더 좋다.

- 
  ### 나의 풀이 

1. 이중for문을 통해 participant와 completion의 값을 비교하였다.
2. 이 결과로 효율성테스트를 통과하지 못했다.

- 
  ### 타인의 풀이

```
Arrays.sort를 활용해 participant와 completion을 정렬하고
차례대로 값을 비교해 다른 값이 나올경우 return으로 간단하게 구현하였다.	
```

```
String,Integer 값을 가지는 HashMap을 선언 후 
participant의 값을 먼저 put한다. 
모든 value는 1을 가지지만, getOrDefault를 활용하여, 동명이인의 경우 value가 +1 되도록 한다.
다시한번 completion을 HashMap에 put하는데 이때 value는 -1하여 0이 되도록 한다.
결국 HashMap에 0이 아닌값을 가진 key가 완주하지 못한 사람이다.
```

```
HashMap 함수 활용
put
getOrDefault
get
keySet
remove
size
```