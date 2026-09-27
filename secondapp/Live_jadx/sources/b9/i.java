package b9;

import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static final <T> T a(@l Object lock, @l ds.a<? extends T> block) {
        T tInvoke;
        m0.p(lock, "lock");
        m0.p(block, "block");
        synchronized (lock) {
            try {
                tInvoke = block.invoke();
                j0.d(1);
            } finally {
                j0.d(1);
                j0.c(1);
            }
        }
        return tInvoke;
    }
}
