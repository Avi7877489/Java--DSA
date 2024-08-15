package Arrays;

public class Introduction {
    public static void main(String[] args) {
        // Q: store a roll number

        int a = 19;

        // Q: store a person's name

        String name = "Avijit Ghosh";
        System.out.println(name);

        // Q: store 5 roll numbers

        int roll1 = 23;
        int roll2 = 55;
        int roll3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:

//        int[] rnos = new int[5];
        // or directly
//        int[] rons2 =  {23, 12, 45, 32,15};
//        System.out.println(rons2);

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);


//        for (String[] Element : arr) {
//            System.out.println(Element);
//        }

    }
}
