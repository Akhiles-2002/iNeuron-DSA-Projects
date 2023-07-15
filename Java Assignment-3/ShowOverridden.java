class Parent{
    public void belongProperty(){
        System.out.println("This Property is belong to the Parent Class");
    }
}

class Child extends Parent{
    @Override
    public void belongProperty(){
        System.out.println("This Property is belong to the Child Class");
    }
}

public class ShowOverridden{
    public static void main(String[] args){
        Parent parent = new Child();
        parent.belongProperty();
    }
}