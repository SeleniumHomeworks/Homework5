package NestedClass;

public class InnerOuter {
   InnerClass1 Inner1 = new InnerClass1();
    InnerClass2 Inner2 = new InnerClass2();
    public void Outerclass(){
        System.out.println("This method belongs to the outer class");
    }


    public class InnerClass1{


        public void Innerclass(){
            System.out.println("this method belongs to the inner class");

        }
        public void Innerclass2(){
            System.out.println("this method also belongs to inner class");
        }
    }

public class InnerClass2{

        public void Innerclass2(){
            System.out.println("this method belongs to InnerClass2");
        }
}

}
