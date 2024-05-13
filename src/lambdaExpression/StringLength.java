package lambdaExpression;

public interface StringLength {
    int lenght(String str);
}
class Main4{
    public static void main(String[] args) {

        StringLength stringLength= str->str.length();

        System.out.println(stringLength.lenght("shrey"));;
   }
}
