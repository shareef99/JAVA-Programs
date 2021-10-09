package UNIT2;

class FirstLevel {
    public void showA() {
        System.out.println("show method of First Level class");
    }
}

class SecondLevel extends FirstLevel {
    public void showB() {
        System.out.println("show method of Second Level class");
    }
}

class ThirdLevel extends SecondLevel {
    public void showC() {
        System.out.println("show method of Third Level class");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        ThirdLevel thirdLevel = new ThirdLevel();
        thirdLevel.showA(); // Inherited method
        thirdLevel.showB();
        thirdLevel.showC();
    }
}

// Output:-
// show method of First Level class
// show method of Second Level class
// show method of Third Level class