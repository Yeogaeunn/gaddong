import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ch12_2 {
    public static void main(String[] args) {

        Stream<Nation> n1 = Nation.nations.stream();
        Stream<Nation> n2 = n1.filter(x -> x.getType() == Nation.Type.LAND);

        String land = n2.map(x -> x.getName()).collect(Collectors.joining(", "));

        System.out.println(land);

    }
}

