package dj;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@f
@yi.b
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[][] f79343b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[][] f79344a;

    public b(char[][] replacementArray) {
        this.f79344a = replacementArray;
    }

    public static b a(Map<Character, String> replacements) {
        return new b(b(replacements));
    }

    @yi.e
    public static char[][] b(Map<Character, String> map) {
        l0.E(map);
        if (map.isEmpty()) {
            return f79343b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = map.get(ch2).toCharArray();
        }
        return cArr;
    }

    public char[][] c() {
        return this.f79344a;
    }
}
