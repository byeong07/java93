/* class 문법의 용도: 관련된 메서드를 묶는 용도 V
 * => 클래스라는 문법을 통해 서로 관련된 메서드를 별도의 블록으로 
 *    묶어 두는 것 까지는 좋았다.
 * => 현재 상태에서 문제는 
 *    회원의 성적을 개별적으로 관리할 수 없다는 사실이다.
 */
package step06;

public class Test02_5 {
  
  public static void main(String[] args) {
    // 홍길동, 임꺽정, 유관순 회원의 성적 정보를 따로 보관할 수 없는 치명적인 문제가 있다.
    Member.init("홍길동", 100, 100, 100);
    Member.init("임꺽정", 90, 90, 90); // 기존의 Member 클래스에 있는 변수 값을 변경한다.
    Member.init("유관순", 80, 80, 80); // 기존의 Member 클래스에 있는 변수 값을 변경한다.
    
    Member.compute(); // 현재 유관순의 성적을 계산한다.
    Member.print(); // 현재 유관순의 성적을 출력한다.
    
    // 이유?
    // 클래스에 선언된 static 변수는
    // 클래스에 소속된 변수("클래스 변수"라고 부른다)로서 그 클래스의 모든 메서드가 공유한다.
    // 즉 값을 개별적으로 관리할 수 없다!
    // 이것이 static이 붙은 변수의 한계다.
  }

}
