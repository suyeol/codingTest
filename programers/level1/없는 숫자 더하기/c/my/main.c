#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
    int i = 0;
    int j = 0;
    
    for(i = 0; i < 10; i++) {
        int k = 0;
        for(j = 0; j < numbers_len; j++) {
            if(i == numbers[j])
            {
                k = 1;
                break;
            }
        }
        if(k != 1)
        {
            answer += i;
        }
    }
    return answer;
}