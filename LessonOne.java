public  class LessonOne{

   int count;
   


    public static void main(String[] args) {
        int scores[]= new int[5];
       LessonOne  lessonOne= new LessonOne();
       for (int j = 0; j < scores.length; j++) {
        lessonOne.insert(scores,j+1);
       }

       //lessonOne.print(scores);
       lessonOne.insertAtStart(scores,34);
       lessonOne.print(scores);
       
    }
    public void insert(int scores[],int val){
        scores[count++]=val;

    }


    public void insertAtStart(int x[], int val){
        for (int i = x.length-1; i>0; i--) {
            
            x[i]=x[i-1];
        }
        x[0]=val;

    }

    public void print(int scores[]){
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]+" ");
        }
    }
   
}


