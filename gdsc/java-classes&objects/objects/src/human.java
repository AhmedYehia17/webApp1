public class human {

    String Name;
    int Age;
    double Weight;
    human(String name, int age , double weight){
       this.Name=name;
       this.Age=age;
       this.Weight=weight;
    }

    void eat(){
        System.out.println(this.Name + " is eating");
    }

    void drinking(){
        System.out.println(this.Name + " is drinking");
    }


}

