package Chap12_1;



public class InstanceOf3 {
    public static void main(String[] args) {
        Dog happy = new Dog();
        testAnimal(happy);

        Dove donald = new Dove();
        testAnimal(donald);
    }

    static void testAnimal(Animal animal){
        animal.move();
        if(animal instanceof Dog mydog){    //animal이 Dog 타입이면 이 변수를 Dog로 캐스팅하여
                                            // mydog에 대입하라는 뜻
            mydog.bark();
        }
        if(animal instanceof Dove mydove) {
            mydove.fly();
        }
    }
}
