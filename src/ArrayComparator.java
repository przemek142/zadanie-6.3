public class ArrayComparator<T> {
    public boolean compare(T[] array1, T[] array2) {

        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public boolean compare(T[][] array1, T[][] array2) {

        if (array1.length != array2.length && array1[0].length == array2[0].length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                } else {
                    for (int j = 0; j < array1[i].length; j++) {
                        if (array1[i][j] != array2[i][j]) {
                            return false;
                        }
                    }

                }
            }
            return true;
        }
    }
}
