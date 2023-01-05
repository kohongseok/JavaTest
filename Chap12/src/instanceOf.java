public class instanceOf {
    public static void main(String[] args) {
        Dog happy = new Dog();
        testAnimal(happy);
    }

    private static void testAnimal(Animal animal) { // Dog타입의 happy 매개변수를 던져도
                                                    // 부모 타입의 형식변수 animal이
                                                    // 자식 타입의 실인수 happy를 대입 받을 수 있음
        Dog mydog = (Dog)animal;  // 동물을 개로 강제 변환
        mydog.move();
        mydog.bark();
    }
}
