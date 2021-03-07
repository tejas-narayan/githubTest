class Flower{
String name;
String color;
void Blooming(){
System.out.println(name + " is blooming");
}
public static void main(String[] args){

Flower rose=new Flower();
rose.name="rose";
rose.color="red";
rose.Blooming();

Flower jasmine=new Flower();
jasmine.name="jasmine";
jasmine.color="white";
jasmine.Blooming();

}
}


