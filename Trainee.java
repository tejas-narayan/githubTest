class Trainee{
String name;
String gender;
int age;
int id;
String stream;

void student(){
System.out.println(name + " is the student of Trainee");
System.out.println(name + " is a " + gender + " candidiate"); 
System.out.println(age + " is the age of " + name);
System.out.println(" ID of " + name + " is " + id );
System.out.println(name + " belongs to " + stream + " branch "); 
}

public static void main(String[] args){

Trainee tejas=new Trainee();
tejas.name="tejas";
tejas.gender="male";
tejas.age=24;
tejas.id=54;
tejas.stream="ISE";
tejas.student();

Trainee shwetha=new Trainee();
shwetha.name="shwetha";
shwetha.gender="female";
shwetha.age=22;
shwetha.id=51;
shwetha.stream="ECE";
shwetha.student();

Trainee namratha=new Trainee();
namratha.name="namratha";
namratha.gender="female";
namratha.age=21;
namratha.id=45;
namratha.stream="CSE";
namratha.student();

namratha.student();
}
}