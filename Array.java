import java.util.*;

class LinearSearch {
    public static int search( int marks[], int key){
        for (int i=0; i<marks.length;i++){
           if (marks[i]= key){   
            return i;
        }
        return -1;}

    }
    public static void main(String[] args) {
        int marks[] = {55,67,99};
        int key = 67;  
        search(marks);
        System.out.println(marks);
        
    }
}
