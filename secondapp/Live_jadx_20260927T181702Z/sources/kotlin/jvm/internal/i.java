package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    @oy.l
    public static final <T> Iterator<T> a(@oy.l T[] array) {
        m0.p(array, "array");
        return new h(array);
    }
}
