import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Filho filho = new Filho();
        List<Method> metodos = Reflexao.getAllMethods(filho);
        List<Field> atributos = Reflexao.getAllFields(filho);
        for (Method metodo : metodos) {
            System.out.println(metodo.getName());
        }
        System.out.print("\n");
        for (Field atributo : atributos) {
            System.out.println(atributo.getName());
        }
    }
}