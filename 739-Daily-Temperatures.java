class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[] wait=new int[temperatures.length];
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<temperatures.length;i++){
        while(!(st.isEmpty()) && temperatures[i]> temperatures[st.peek()]){
            int prev=st.pop();
            wait[prev]=i-prev;
        }
        st.push(i);
       }
       return wait;   

       /* int[] wait=new int[temperatures.length];
         for(int i=0;i<temperatures.length;i++){
             for(int j=i+1;j<temperatures.length;j++){
                   if(temperatures[i]<temperatures[j]){
                    wait[i]=Math.abs(j-i);
                    break;
                   }
             }
         }
         return wait;
*/
    }
}