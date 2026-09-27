package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class o1 extends n1 {
    @ur.f
    public static final <R> R l(Object lock, ds.a<? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.m0.p(lock, "lock");
        kotlin.jvm.internal.m0.p(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                kotlin.jvm.internal.j0.d(1);
            } finally {
                kotlin.jvm.internal.j0.d(1);
                kotlin.jvm.internal.j0.c(1);
            }
        }
        return rInvoke;
    }
}
