
package inheritence1;

class Lion extends Animal{
    int age=9;
    
    public Lion(int age){
//        super(26);                      //Gives call to Parent Constructor.
//        System.out.println("-------------------Lion super()------------------");
//        this.age=age;
          super(6,"Gorilla");             //Calling parent suitable-constructor with two parameters.
    }
    public Lion(){
     //   this(5);                    //Giving a call to one parametric Constructor.
          super(5);                   //calling parent Suitable-Constructor.
        }
    
    public void roar(){
       System.out.println(this.age);
       System.out.println("the "+ getAge()+" year old Lion says:Roar!");
    }
}
