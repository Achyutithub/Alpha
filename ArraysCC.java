import java.util.*;
public class ArraysCC {
    public static void update(int Marks[]) {
        for(int i=0; i<Marks.length; i++) {
            Marks[i] = Marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int Marks[] = {97, 98, 99};
        update(Marks);
        System.out.println(Marks[0]);
        System.out.println(Marks[1]);
        System.out.println(Marks[2]);
    }
}
