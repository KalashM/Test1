public class Test {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 7, 8};
        String[] strings = {"Anna", "Marina", "Jeka"};
        String[] strings2 = {"panda", "cat", "dog"};
        concat(strings, strings2);
    }

    public static String[] concat (String[] array1, String[] array2){
        String[] resConcat = new String[array1.length + array2.length ];
        for (int i=0;i<array1.length; i++){
            resConcat[i]= array1[i];
        }
        for (int i=0; i<array2.length; i++){
            resConcat[i+array1.length] = array2[i];
        }

        for (int i=0; i<resConcat.length; i++) {
            System.out.println(resConcat[i]);
        }
        return resConcat;
    }
}

