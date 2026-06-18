// Current approach works for most cases
// Need to improve handling for:
// See the comments. 
// [4, 7, 2, 9, 5]
// to find second largest i.e - 7

class Main {
    public static void main(String[] args) {
        int arr[] = {5,5,4};
        if(arr.length<2){
            System.out.println("Since array has less than 2 elements hence no distinct largest or second largest exists");
                return;
        }
        int max;
        int smax;
        boolean flag = false;
        
        if(arr[0]>arr[1]){
            max=arr[0];
            smax=arr[1];
            flag=true;
        }else if(arr[0]<arr[1]){
            max=arr[1];
            smax=arr[0];
            flag=true;
        }else{
            max=arr[0];
            smax=Integer.MIN_VALUE;
            flag=false;
        }
        
        for(int i=2;i<arr.length;i++){
                if(arr[i]>max){
                smax = max;
                max = arr[i];
                flag=true;
            }
            else if(max>arr[i] && arr[i]>smax){
                smax = arr[i];
                flag=true;
            }
        }
        if(!flag){
    System.out.println("No distinct second largest element exists");
}
else{
    System.out.println("Largest is " + max);
    System.out.println("Second largest is " + smax);
}
    }
}
