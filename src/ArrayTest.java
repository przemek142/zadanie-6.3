public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator<String> arrayComparator= new ArrayComparator<>();
        ArrayComparator<Integer> arrayComparator2= new ArrayComparator<>();

        Integer[][] ar0a = {{1,2},{1,2}};
        Integer[][] ar0b = {{1,2},{1,2}};
        Integer[][] ar0c = {{1,2,3},{1,2,3}};


        String[] ar1a = {"a", "b","c"};
        String[] ar1b = {"a", "b","c"};
        String[] ar2a = {"a", "b","c"};
        String[] ar2b = {"a", "b","d"};
        String[] ar3a = {"a", "b","d"};
        String[] ar3b = {"a", "b"};
        Integer[] ar4a = {1,2,3,4,5};
        Integer[] ar4b = {11,2,3,4,5};


        if (arrayComparator.compare(ar1a,ar1b)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
        if (arrayComparator.compare(ar2a,ar2b)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
        if (arrayComparator.compare(ar3a,ar3b)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
        if (arrayComparator2.compare(ar4a,ar4a)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
        if (arrayComparator2.compare(ar4a,ar4b)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
        if (arrayComparator2.compare(ar0a,ar0a)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
        if (arrayComparator2.compare(ar0a,ar0b)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
        if (arrayComparator2.compare(ar0a,ar0c)){
            System.out.println("takie same");
        }else {
            System.out.println("inne");
        }
    }
}
