class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,int[]> mp = new HashMap<>();
        for(int[] piece: pieces){
            mp.put(piece[0],piece);
        }
        
        int s=0;
        while(s<arr.length){
            if(mp.containsKey(arr[s])){
                int []piece = mp.get(arr[s]);
                
                
                
            for(int i=0; i<piece.length; i++){
              if(arr[s]!=piece[i]){
                  return false;
              }    
                else{
                    s++;
                }
            }
                
            }
            else{
                return false;
            }
        }
        return true;
        
    }
