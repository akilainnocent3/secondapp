package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class io50 {
    public static final Set<String> a;
    public static final Set<Integer> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(429, 502, 503, 504)));

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(8);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(14);
        hashSet.add(15);
        a = Collections.unmodifiableSet((Set) hashSet.stream().map(new ho50()).collect(Collectors.toSet()));
    }
}
