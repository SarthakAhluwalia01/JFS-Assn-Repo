package com.company;



class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
        boolean valueFound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toCheckValue)
                valueFound=true;
        }
        return valueFound;
    }
}


public class Assignment1Q7 {

    public static void main(String[] args) {

        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray searchArray = new SearchArray();

        if (searchArray.searchArray(arr, valueToCheck)) {
            System.out.println("Element is present in the array");
        }
        else
        {
            System.out.println("Element is not present in the array");
        }

    }

}