package zi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public final class f0 extends n {
    public static boolean a(@zq.a Object a10, @zq.a Object b10) {
        if (a10 != b10) {
            return a10 != null && a10.equals(b10);
        }
        return true;
    }

    public static int b(@zq.a Object... objects) {
        return Arrays.hashCode(objects);
    }
}
