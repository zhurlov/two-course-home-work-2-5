public class Validate{

    public static String validateString(String value, String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }

    public static int validateInt(int variable, int substitution){
        return variable == 0 || variable <= -1 ? substitution : variable;
    }

    public static double validateDouble (double variable, double substitution){
        return variable == 0.0 || variable <= -1.0 ? substitution : variable;
    }
    public static boolean validateBoolean(boolean variable, boolean substitution){
        if (variable != false){
            System.out.println("есть разрешения управления автомобилем:");
        } else {
            System.out.println("запрет вождения:");
        }
        return substitution ;
    }
}