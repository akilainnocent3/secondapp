package b9;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static final <T> T a(@l ReentrantLock reentrantLock, @l ds.a<? extends T> block) {
        m0.p(reentrantLock, "<this>");
        m0.p(block, "block");
        reentrantLock.lock();
        try {
            return block.invoke();
        } finally {
            j0.d(1);
            reentrantLock.unlock();
            j0.c(1);
        }
    }
}
