package zi;

import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@yi.d
@k
public final class a0 {
    public static void a(Buffer b10) {
        b10.clear();
    }

    public static void b(Buffer b10) {
        b10.flip();
    }

    public static void c(Buffer b10, int limit) {
        b10.limit(limit);
    }

    public static void d(Buffer b10, int position) {
        b10.position(position);
    }
}
