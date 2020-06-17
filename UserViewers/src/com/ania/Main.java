package com.ania;

import javax.swing.text.View;
import java.util.*;
import java.util.stream.*;

class Views {
    Views(long x)
    {
        viewCount = Optional.of(x);
    }
    Views()
    {
        viewCount = Optional.empty();
    }
    public Optional<Long> getViewCount() {
        return viewCount;
    }

    private Optional<Long> viewCount;
}

class User {
    //??
}

public class Main {

    public static Map<User, Long> getUserWithViews(Map<User, Views>... views) {


        Map<User, Long> res = Arrays.stream(views)
                .filter(m -> m != null)
                .filter(m -> m.isEmpty() != true)
                .flatMap(m -> m.entrySet().stream())
                .filter(s -> s.getKey() != null)
                .filter(s -> s.getValue().getViewCount().isPresent())
                .map(v -> new AbstractMap.SimpleEntry<>(v.getKey(), v.getValue().getViewCount().get()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1 + v2));

//        for (Map<User, Views> map : views ) {
//           Map<User, Long> cos2 = map.entrySet().stream()
//                    .filter(s->s.getKey() != null)
//                   .filter(s -> s.getValue().getViewCount().isPresent())
//                    .collect(Collectors.toMap(Map.Entry::getKey, s->s.getValue().getViewCount().get()));
//        }


//        for (Map<User, Views> map : views) {
//            if (map == null) {
//                continue;
//            }
//            for (User user : map.keySet()) {
//                if (user == null) {
//                    continue;
//                }
//                Views views1 = map.get(user);
//                Optional<Long> viewCount = views1.getViewCount();
//                if (!viewCount.isPresent()) {
//                    continue;
//                }
//                Long viewLong = viewCount.get();
//                res.put(user, viewLong);
//            }
//        }
        return res;
    }

    public static void main(String[] args) {
        Map<User, Views> testMap = new HashMap<>();
        testMap.put(new User(), new Views(10));
        testMap.put(new User(), new Views(10));
        testMap.put(new User(), new Views(10));
        testMap.put(new User(), new Views(10));
        testMap.put(null, new Views(10));
        testMap.put(null, new Views());
        testMap.put(new User(), new Views());
        System.out.println(getUserWithViews(testMap,testMap, null).size());
    }
}
