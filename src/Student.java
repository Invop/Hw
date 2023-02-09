import java.util.Arrays;

public class Student {

    public static String _Name = "DefName";
    public static String _AvgScore = "0";

     private static String[][] Student = new String[0][2];

     private static String[][]SortedStudent;
     private static int Q = 0;
    public Student(String _Name, String _AvgScore){
        this._Name=_Name;
        this._AvgScore=_AvgScore;
        Student = append(Student,this._Name,this._AvgScore);
    }

    public static void SortByName(int q){
        Q=q;
        String _tempName="";
        String _tempScore="";
        for (int i = 0; i < Student.length; i++) {
            for (int j = i+1; j < Student.length; j++) {
                if(Student[i][0].compareToIgnoreCase(Student[j][0])>0){
                    _tempName = Student[i][0];
                    _tempScore = Student[i][1];
                    Student[i][0]=Student[j][0];
                    Student[i][1]=Student[j][1];
                    Student[j][0]=_tempName;
                    Student[j][1]=_tempScore;
                }
            }
        }
    }

    public static void SortByScore(){
        String _tempName="";
        String _tempScore="";
        for (int i = 0; i < Student.length; i++) {
            for (int j = i+1; j < Student.length; j++) {
                if(Student[i][1].compareToIgnoreCase(Student[j][1])>0){
                    _tempName = Student[i][0];
                    _tempScore = Student[i][1];
                    Student[i][0]=Student[j][0];
                    Student[i][1]=Student[j][1];
                    Student[j][0]=_tempName;
                    Student[j][1]=_tempScore;
                }
            }
        }
    }


    private static String[][] append(String[][] arr, String _elementName , String _elementAvg) {
        String[][] array = new String[arr.length+1][2];
        System.arraycopy(arr, 0, array, 0, arr.length);
        array[arr.length][0] = _elementName;
        array[arr.length][1] = _elementAvg;
        return array;
    }

    public static void ReturnStudent(){
        for (int i = 0; i < Student.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(Student[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(Q!=2)
        {
            for(int i=0; i<Student.length;i++){
            for (int j = 0; j < 2; j++) {
                sb.append(Student[i][j]+" ");
            }
            sb.append("\n");
        }}
        else {
            for(int i=Student.length-1; i>=0;i--){
                for (int j = 0;j<2; j++) {
                    sb.append(Student[i][j]+" ");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
