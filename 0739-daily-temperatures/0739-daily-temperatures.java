class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int arr[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&temp[st.peek()]<temp[i]){
                arr[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(temp[j]>temp[i]){
        //             arr[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        return arr;
    }
}