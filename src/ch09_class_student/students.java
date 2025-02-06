package ch09_class_student;

import ch09_class_utill.utillClass;

/**
 * class Name : students
 * Author      : EH
 * Created Date: 2025. 2. 5.
 * Version     : 1.0
 * Purpose     : {자바기초}
 * Description : {class 기초}
 */
public class students {
    // 1. 필드 속성값
    // public: 공개, 프로젝트 어디서든 사용 가능
    // private: 비공개, 현재 클래스 내에서만 접근 가능
    private String name;  // 학생의 이름
    private int kor;      // 국어 점수
    private int eng;      // 영어 점수
    private int math;     // 수학 점수
    private double avg;   // 평균 점수

    // 2. 생성자 (class는 생성자를 정의하지 않아도 무조건 클래스명의 생성자가 있음)
    // 학생 이름만 입력받아 객체를 생성하는 생성자
    public students(String name) {
        this.name = name;  // 입력받은 이름을 필드에 저장
        save();            // 학생 등록 메시지 출력
    }

    // 기본 생성자 (매개변수 없이 객체 생성 시 사용)
    public students() {

    }

    // 학생 이름과 과목 점수를 입력받아 객체를 생성하는 생성자
    public students(String name, int kor, int eng, int math) {
        super();  // 부모 클래스의 생성자를 호출 (Object 클래스의 생성자)
        this.name = name;  // 학생 이름
        this.kor = kor;    // 국어 점수
        this.eng = eng;    // 영어 점수
        this.math = math;  // 수학 점수
    }

    // 3. 객체를 문자열로 출력하기 위한 toString 메소드 재정의
    @Override
    public String toString() {
        return "students [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
    }

    // 4. Getter & Setter 메소드들
    // 학생 이름을 반환하는 getter 메소드
    public String getName() {
        return name;
    }

    // 학생 이름을 설정하는 setter 메소드
    public void setName(String name) {
        this.name = name;
    }

    // 국어 점수를 반환하는 getter 메소드
    public int getKor() {
        return kor;
    }

    // 국어 점수를 설정하는 setter 메소드
    public void setKor(int kor) {
        this.kor = kor;
        setAvg();  // 점수 설정 후 평균 계산
    }

    // 영어 점수를 반환하는 getter 메소드
    public int getEng() {
        return eng;
    }

    // 영어 점수를 설정하는 setter 메소드
    public void setEng(int eng) {
        this.eng = eng;
        setAvg();  // 점수 설정 후 평균 계산
    }

    // 수학 점수를 반환하는 getter 메소드
    public int getMath() {
        return math;
    }

    // 수학 점수를 설정하는 setter 메소드
    public void setMath(int math) {
        this.math = math;
        setAvg();  // 점수 설정 후 평균 계산
    }

    // 5. 평균을 계산하는 private 메소드
    private void setAvg() {
        this.avg = utillClass.weRound((kor + eng + math) / 3.0, 2);  // 국어, 영어, 수학 점수의 평균을 계산하고, 소수점 둘째 자리로 반올림
    }

    // 6. 학생 이름을 출력하는 메소드
    public void nm() {
        System.out.println(name + "입니다");
    }

    // 7. 학생 등록 메시지를 출력하는 private 메소드
    private void save() {
        System.out.println(name + " 등록됨");
    }

    // 8. static 메소드: 클래스명으로 호출 가능한 메소드
    public static void check() {
        System.out.println("student 의 static method class명.check 로 호출 가능");
    }
}
