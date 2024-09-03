class Parent {
    protected void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child Display");
    }
}

public class Est {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}