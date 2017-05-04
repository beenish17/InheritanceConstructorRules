
package inheritence1;
//Important:
//1:if thr is one-argument constructor in parent class thr should be One argument constructor in Childs class.
//2:In case child have no argument constructor and parent have it,then child class should explicitly define a constructor with super() call.
 class Animal {
    private int age;            //Cant be accessed.
    private String name;
    
    Animal(int age,String name){
        //Example:1
//        super();                //Call to Parent-Constructor defined in java.lang.Object.
//        System.out.println("this is Parent'a Super()");
//        this.age=age;

       //Example:2
          super();                 //Call to Parent-Constructor defined in java.lang.Object.
          this.age=age;
          this.name=name;
    }
    Animal(int age){
       // super();
        this.age=age;
        this.name=null;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
