package pris.stack;

public class NumberofStudentsUnabletoEatLunch1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int one = 0;
        int zero = 0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                zero++;
            }else{
                one++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0 && zero>0){
                zero--;
            }else if(sandwiches[i]==1 && one>0){
                one--;
            }else{
                return one + zero;
            }
        }
        return 0;
    }
}
