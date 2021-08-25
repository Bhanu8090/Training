public class Java8Demo {

 

    public static void main(String[] args) {
        MyInterface.newMethod();
    }
  
}

interface MyInterface {

    static void newMethod() {
        System.out.println("MyInterface");
    }

}

interface MySecondInterface {

    static void newMethod() {
        System.out.println("MySecondInterface");
    }


}