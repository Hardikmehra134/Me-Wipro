package assignment;

public class Probelm42{
    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2(); 
        } catch (Exception e) {
            System.out.println("Exception caught in someMethod: " + e.getMessage());
            throw e; 
        }
    }

    public static void main(String[] args) {
        try {
            someMethod(); 
        } catch (Exception e) {
            System.out.println("Exception caught in main method:");
            e.printStackTrace(); 
        }
    }
}

/*
Exception caught in someMethod: Exception thrown in someMethod2
Exception caught in main method:
java.lang.Exception: Exception thrown in someMethod2
	at WiproAssignment1Java/assignment.Probelm42.someMethod2(Probelm42.java:5)
	at WiproAssignment1Java/assignment.Probelm42.someMethod(Probelm42.java:10)
	at WiproAssignment1Java/assignment.Probelm42.main(Probelm42.java:19)
*/