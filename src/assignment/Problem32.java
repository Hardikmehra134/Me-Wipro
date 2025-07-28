package assignment;

public class Problem32 {

	public static void main(String[] args) {
		
		try {
            //NegativeArraySizeException;
            //int[] arr = new int[-5];

            //ArrayIndexOutOfBoundsException;
            //int[] arr = new int[3];
            //int val = arr[5];

            // 3. StringIndexOutOfBoundsException
            // String str = "Java";
            // char ch = str.charAt(10);

            // 4. IndexOutOfBoundsException via List
            // java.util.List<String> list = new java.util.ArrayList<>();
            // list.add("A");
            // String item = list.get(3);

            // 5. NullPointerException
            // String text = null;
            // System.out.println(text.length());

            // 6. ArithmeticException
            int result = 10 / 0;

        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Caught General Exception");
            e.printStackTrace();
        }

        System.out.println("Program continues after exception handling.");
    }
}

/*
Caught ArithmeticException
java.lang.ArithmeticException: / by zero
	at Problem32.main(Problem32.java:34)
Program continues after exception handling.*/