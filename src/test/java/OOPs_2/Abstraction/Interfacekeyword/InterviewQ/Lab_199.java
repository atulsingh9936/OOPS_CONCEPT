package OOPs_2.Abstraction.Interfacekeyword.InterviewQ;

public class Lab_199 {

}

interface I1{}
interface I2{}
class A{} //complete class
class B{}
abstract class C{} //  incomplete class
class Test1 extends A{} // single inheritance
class Test2 extends B{}
//class Test3 extends A,B{} - mutiple inheritance(with class it is  ot allowed)
class test4 implements I1,I2{} // multiple inheritance is allowed with the help of interface
class Test5 extends A implements I1,I2{}
//class Test6 implements I1 extends A{} -> not ok
//interface I3 extends A{}
//interface I4 implement A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{}
//interface I7 extends C{}