package xs;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    @oy.l
    public static final g a(@oy.l g first, @oy.l g second) {
        m0.p(first, "first");
        m0.p(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new k(first, second);
    }
}
