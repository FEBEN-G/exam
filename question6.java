package question6;

public class question6 {
    
        public static void main(String[] args) {
            int[] array = {3, 7, 1, 9, 4};
            int index = 2;
            int[] NewArray = deleteElement(array, index);
            System.out.println("New Array: ");
            for (int num : NewArray) {
                System.out.print(num + " ");
            }
        }

        public static int[] deleteElement(int[] array, int index) {
            
            if (index < 0 || index >= array.length) {
                System.out.println("Index is not valid.");
                return array;            }

            int[] newArray = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }

            return newArray;
        }


}
    

