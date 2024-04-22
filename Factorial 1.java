import java.util.scanner;
class Factorial{
public static void main(string args[]){
int f;
System.out.println("Enter the number to cal Fact:");
Scanner obj=new scanner(System.ln);
f=obj.nextlnt();
int result=1;
for(int i=1;i<f;i++){
result=result*i;
}
System.out.println(result);
}
}