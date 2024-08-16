import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reflexao {
    
    public static List<Method> getAllMethods(Object obj) {
        List<Method> methods = new ArrayList<>();
        Class<?> clazz = obj.getClass();
        while (clazz != null && !clazz.equals(Object.class)) {
            Method[] methodsArray = clazz.getDeclaredMethods();
            for (Method method : methodsArray) {
                if (!methods.contains(method)) {
                    methods.add(method);
                }
            }
            clazz = clazz.getSuperclass();
        }
        return methods;
    }

    public static List<Field> getAllFields(Object obj) {
        List<Field> fields = new ArrayList<>();
        Class<?> clazz = obj.getClass();
        while (clazz != null && !clazz.equals(Object.class)) {
            Field[] fieldsArray = clazz.getDeclaredFields();
            for (Field field : fieldsArray) {
                if (!fields.contains(field)) {
                    fields.add(field);
                }
            }
            clazz = clazz.getSuperclass();
        }
        return fields;
    }
}
