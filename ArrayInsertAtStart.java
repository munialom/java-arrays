public class ArrayInsertAtStart {

    int count;
    public static void main(String[] args) {

        int scores[]= new int [5];
       
        /*create object of class ArrayInsertAtStart */
        ArrayInsertAtStart is= new ArrayInsertAtStart();
        for (int i = 0; i < scores.length; i++) {
            is.autoInsertArrayValues(scores, i+1);
        }
        
        is.insertAtStart(scores, 100);
        is.printArray(scores);
        
        
        
    }

    /**write a method that inserts array element at to start index 0 
     * this method will have to parameters 
     * one will be array input 
     * other will be value to be placed a the start
     * we will loop through the data and assign the values
     * point to note array reads based on index
     * to find the array index of the last element in the array 
     * we subtract 1 from the array length 
     * the value at i will be equal to length-1
     * the value of i should be greater than zero{because array lenth is a value greate than zero if one element length is 1 id 2 elements lenght is tow}
     * 
    */

    public void insertAtStart(int x[],int Val){

        for (int i = x.length-1; i> 0; i--) {
            x[i]=x[i-1];
            
        }
        x[0]=Val;
      

    }

    /*printing values of an array object  */
    public void printArray(int x []){

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }

    }

    /*
     * points to note here  
     * array decalered as int x[]
     * dyanmic values at x[i],x[20],x[45],x[77]
     * so to insert based on length calculated and value at
     */
    public void autoInsertArrayValues(int y[], int val){
        
            y[count++]=val;
            
        
    }

 

      


}
