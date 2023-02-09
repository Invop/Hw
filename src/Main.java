import sun.util.resources.cldr.ga.CalendarData_ga_IE;

import java.io.IOException;

public class Main {
    //Змінна Ім'я
    private static String _GetName;
    //Змінна Середній бал
    private static String _GetAvgScore;
    //Екземпляр класу Student
    private static Student _newStudent;
    //Змінна (обране сортування)
    private static int _SortQ;

    //Виклик методів
    public static void main(String[] args) throws IOException {
        AddStudent();
        SortOption();
        System.out.println(_newStudent.toString());
    }
    //Вибір методу сортування
    private static void SortOption(){
        System.out.println("Choose sorting option: 1 By name(Ascending) , 2 By name(Descending), 3 By student's GPA.");
        _SortQ = DataInput.getInt();
        if(_SortQ==1){
            Student.SortByName(1);
        } else if (_SortQ==2) {
            Student.SortByName(2);
        } else if (_SortQ==3) {
            Student.SortByScore();
        }
        else {System.out.println("please enter a valid value");SortOption();}
    }

    //Отримання даних про студента (з клавіатури)
    private static void AddStudent() throws IOException {
        while (true){
        System.out.println("Enter Name");
        _GetName = DataInput.getString();
        CheckScore();
        _newStudent = new Student(_GetName,_GetAvgScore);
        System.out.println("Enter n if u want to stop");
        String _GetAnswToStop = DataInput.getString();
        if(_GetAnswToStop.equals("n"))break;
        }
    }
    //Перевірка Середнього балу (>0)
    private static void CheckScore() throws IOException {
        System.out.println("Enter Avg Score");
        _GetAvgScore = DataInput.getString();
        if(Integer.valueOf(_GetAvgScore)<=0){
            System.out.println("Average score cannot be <0");CheckScore();
        }
    }

}