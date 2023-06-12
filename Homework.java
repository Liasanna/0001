public class ExcClass extends Exception {
 
    private String someString;
 
    public ExcClass (String string) {
        this.someString = string;
        System.out.println("Exception ExcClass");
    }
 
    public void myOwnExceptionMsg() {
        System.err.println("This is exception message for string: " + someString);
    }
}
 
public class TestExc {
 
    public static void main(String[] args) {
        try {
            String s = "SomeString";
            throw new ExcClass(s);
        } catch (ExcClass ex) {
            ex.myOwnExceptionMsg();
        }
    }
}
//Вывод
Exception ExcClass
This is exception message for string: SomeString
