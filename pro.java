class Win7{
void stop(){
System.out.println("stop7");
}
}
class Win8 extends Win7 {
void stop(){
System.out.println("stop8");
}
}
class Run{
public static void main(String[] args){
Win8 w=new Win8();
w.stop();
}}