package qv;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    @oy.l
    public static final <E> Set<E> a(int i10) {
        return Collections.newSetFromMap(new IdentityHashMap(i10));
    }

    public static final <T> T b(@oy.l ReentrantLock reentrantLock, @oy.l ds.a<? extends T> aVar) {
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.j0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.j0.c(1);
        }
    }
}
