import java.util.ArrayList;

public class Part2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sixuan");
        names.add("Yuting");
        names.add("Leyu");
        names.add("Yunxian");
        names.add("Shiru");

        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchFirstAndLast(name));
        }

        System.out.println("Names = {" + String.join(", ", names) + "}");
        System.out.println("Names(switched) = {" + String.join(", ", switchedNames) + "}");
    }

    private static String switchFirstAndLast(String name) {
        if (name.length() > 1) {
            char firstChar = name.charAt(0);
            char lastChar = name.charAt(name.length() - 1);
    
            String switchedName = Character.toUpperCase(lastChar) +
                                  name.substring(1, name.length() - 1).toLowerCase() +
                                  Character.toLowerCase(firstChar);
    
            return switchedName;
        }
        return name;
    }
    
}
