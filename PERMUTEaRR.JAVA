public boolean isPossible(int k, int[] arr1, int[] arr2) {
    // Your code goes here.
    
    Arrays.sort(arr1);
    
    Arrays.sort(arr2);
    
    int j=arr1.length-1;
    
    
    for(int i=0;i<arr1.length;i++){
        
        if(arr1[i]+arr2[j] < k){
            return false;
        }
        
        j--;
        
    }
    
    return true;
    
}