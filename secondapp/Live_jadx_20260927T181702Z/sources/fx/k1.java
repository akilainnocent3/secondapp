package fx;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class k1 {
    @oy.l
    public static final byte[] a(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<this>");
        byte[] bytes = str.getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @oy.l
    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    @oy.l
    public static final String c(@oy.l byte[] bArr) {
        kotlin.jvm.internal.m0.p(bArr, "<this>");
        return new String(bArr, cv.g.f77202b);
    }

    public static final <T> T d(@oy.l ReentrantLock reentrantLock, @oy.l ds.a<? extends T> action) {
        kotlin.jvm.internal.m0.p(reentrantLock, "<this>");
        kotlin.jvm.internal.m0.p(action, "action");
        reentrantLock.lock();
        try {
            return action.invoke();
        } finally {
            kotlin.jvm.internal.j0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.j0.c(1);
        }
    }
}
