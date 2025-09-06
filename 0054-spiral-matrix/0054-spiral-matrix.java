class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int rows=matrix.length;
       int cols=matrix[0].length;
       List<Integer> m1=new ArrayList<>();

       int top=0;int bottom=rows-1;
       int left=0;int right=cols-1;
      while(top<=bottom && left<=right){
       //right
       for(int i=left;i<=right;i++){
           m1.add(matrix[top][i]);
       }
       top++;
       
       //bottom
       for(int i=top;i<=bottom;i++){
        m1.add(matrix[i][right]);
       } 
        right--;
       if(top<=bottom){
       //left
       for(int i=right;i>=left;i--){
        m1.add(matrix[bottom][i]);
       
       }
       bottom--;
       }
       
      if(left<=right){
       //top
       for(int i=bottom;i>=top;i--){
        m1.add(matrix[i][left]);
       }
      
       left++;
      }
      }
      return m1;
    }
}