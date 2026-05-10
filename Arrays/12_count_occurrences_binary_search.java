// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// arr = [1,2,2,2,3,4]
// target = 2
// 1
// arr = [1,3,5,7]
// target = 2
// -1

class Main {
    static int first(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int pos = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                pos = mid;
                end=mid-1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (pos);
    }
    
    static int last(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        int pos = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                pos = mid;
                start=mid+1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (pos);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int target = 2;
        
        int r1 = first(arr, target);
        int r2 = last(arr, target);
        
        if(r1==-1){
            // we can also check for r2, if one gives -1 then other must also be -1 since the target is not to be found in the array
            System.out.println("0");
        }else{
            System.out.println(r2-r1+1);
        }
    }
}
