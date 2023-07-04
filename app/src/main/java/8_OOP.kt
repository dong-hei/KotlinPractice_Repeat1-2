fun main(args: Array<String>){
    // 1. 추상화 : 공통성과 본질을 모아 추출 (I or 추상클래스로 표현)
    // People {move(), eat(), sleep(), study()}
    // boy{move(), eat(), sleep(), study()}
    // girl{move(), eat(), sleep(), study()}

    // 2. 상속 : 기존 클래스를 재활용
    // People class {move(), eat(), sleep(), study()} : 부모클래스
    // boy class{hangWithRobot()} : 자식클래스
    // girl class{hangWithDoll()} : 자식클래스

    //3. 다형성 : 어떤 객체의 속성이나 기능이 상황에 따라 여러 가지 형태를 가질 수 있는 성질
    // People Class {move()}
    // boy class {move() println("소년이 움직인다.")} <- overriding 을 통해서 바꾼다
    // girl class{move() println("소녀가 움직인다.")} <- overriding 을 통해서 바꾼다

    //4. 캡슐화 : 서로 연관있는 것들을 묶어서 외부로부터 보호
    // 정보를 은닉하기 위함
    // 접근제한자 : public의 경우는 모두가 접근 가능, private는 외부에서 사용 불가능
}