import java.time.LocalDate;
import java.time.Period;

public class MyClass {
        String name;
        String lastname;
        LocalDate age;
        String food;
        String [] lessons;
        String [] lessons2;
        String hobby;

        MyClass(){

        }

        MyClass( String name,String lastname, LocalDate age,String food,String [] lessons){
            this.name =name;
            this.lastname=lastname;
            this.age = age;
            this.food= food;
            this.lessons = lessons;
        }
        MyClass ( String name,String lastname, LocalDate age,String food,String hobby, String [] lessons2){
            this.name =name;
            this.lastname=lastname;
            this.age = age;
            this.food=food;
            this.hobby=hobby;
            this.lessons2=lessons2;

        }
        public int getAge() {
            LocalDate currentDate= LocalDate.now();
            Period years=Period.between(age,currentDate);
            return years.getYears();





        }


    }



