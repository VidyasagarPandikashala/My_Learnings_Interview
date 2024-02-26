package Java.StringBuffer;

/**
 * Introduction
 */
public class Introduction {

    public static void main(String[] args) {
        // Constructor type 1 - it allocates default size of 16 and it recalculates on
        // the append like the arraylist
        String name = "Sriram";
        StringBuffer sb = new StringBuffer();

        sb.append("welcome");
        sb.append(" " + name);

        System.out.println(sb.toString());
    }
}