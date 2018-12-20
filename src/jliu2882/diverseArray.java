package jliu2882;

public class diverseArray {
    public static int arraySum(int[] arr){
        int count = 0;
        for(int num : arr){
            count+= num;
        }
        return count;
    }

    public static int[] rowSums(int[][] arr2d){
        int[] newArr = new int[arr2d.length];
        for(int i = 0; i < arr2d.length; i++){
            newArr[i] = arraySum(arr2d[i]);
        }
        return newArr;
    }

    public static boolean isDiverse(int[][] arr2d){
        int[] newArr = rowSums(arr2d);
        for(int i = 0; i < newArr.length; i++){
            for(int j = i+1; j <newArr.length;j++){
                if(newArr[i]==newArr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
