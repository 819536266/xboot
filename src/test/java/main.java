import cn.exrick.xboot.modules.base.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()

                .ifPresent(System.out::println);

        Arrays.asList("a1", "a2", "a3")
                .parallelStream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
