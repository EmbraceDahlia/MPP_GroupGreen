package lab11Part2.exercise12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;

    private MySingletonLazy() {
        System.out.println("Created a singleton.");
    }

    public static MySingletonLazy getInstance() {
//        if (instance == null)
//            instance = new MySingletonLazy();
//        return instance;
        return Optional.ofNullable(instance).orElseGet(() -> {
            instance = new MySingletonLazy();
            return instance;
        });
    }
}
