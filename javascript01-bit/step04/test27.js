/* 주제: 함수 - 재귀호출 II 
- 꼬리 재귀(tail recursive call)
  - 재귀 호출하여 리턴한 값을 계산하지 않고 곧 바로 리턴하도록 만든다.
  - 이런 경우 스크립트 엔진이나 컴파일러가 
    스택 메모리를 과도하게 사용하지 않도록 자동으로 최적화를 수행한다.
  - 최적화를 수행 방법
    1) 일반적인 반복문으로 코드를 바꾸기도 한다.
    2) 스택 메모리를 증가시키지 않고 재사용하기도 한다.
*/
"use strict"

// Sigma(n)을 꼬리 재귀호출로 구현하기
function sigma(n, sum) {
  if (n < -100000) 
    return sum + n
  return sigma(n - 1, sum + n);
}

var result = sigma(5, 0)
console.log(result)





//
