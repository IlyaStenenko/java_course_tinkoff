package edu.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Task5 {

    private Task5() {}

    public static List<String> parseContacts(List<String> contacts, String compareMetod) {
        if (contacts == null) {
            return new ArrayList<>();
        }
        List<String> result;
        result = contacts.stream().sorted((o1, o2) -> {
            List<String> split1 = List.of(o1.split(" "));
            List<String> split2 = List.of(o2.split(" "));
            if (compareMetod.equals("ASC")) {
                return split1.get(split1.size() - 1).compareTo(split2.get(split2.size() - 1));
            } else if (compareMetod.equals("DESC")) {
                return split2.get(split2.size() - 1).compareTo(split1.get(split1.size() - 1));
            }
            return 0;
        }).collect(Collectors.toList());
        return result;
    }
}



