import model.Student;

public class Main {


    public static void main(String[] args) {

        Student gustav = new Student("Gustav","Mustermann","C9AB",23,70);
        Student maria = new Student("Maria","Musterfrau","C9AB",25,71);

        System.out.println(gustav);
        System.out.println("Sind Maria und Gustav in der selben Klasse "+ gustav.equals(maria));
        System.out.println(" ");


        int[] StudenteniD={1,2,3};
        int i=0;

        while(i<3){
            String [] studentennamen={"Philipp","Tim","Jan"};
            String [] studentennamen2={"Philipp","Tim","Jan"};

            Student ____ = new Student(studentennamen[i],StudenteniD[i]);

            System.out.println(____.toString());
            i++;
        }



    }

}
