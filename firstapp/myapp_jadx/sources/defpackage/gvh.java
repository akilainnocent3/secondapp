package defpackage;

import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class gvh {
    public static final List<Integer> a;
    public static final int b;

    static {
        List<Integer> listK = b.k(11, 13, 14, 16, 17, 18, 20, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47);
        a = listK;
        b = listK.size() + 17;
    }

    public static final int a(int i) {
        if (i <= 17) {
            return 2;
        }
        int i2 = i - 18;
        List<Integer> list = a;
        if (i2 < list.size()) {
            return list.get(i2).intValue();
        }
        mae0.a(hce0.a(i2, "Index out of bounds: "));
        return 0;
    }
}
