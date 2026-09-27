package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class v1 {
    @oy.l
    public static final s1 a() {
        return new h(Thread.currentThread());
    }

    @dr.f1
    @f1
    @j2
    public static final boolean b(@oy.l Thread thread) {
        if (thread instanceof sv.a.c) {
            return ((sv.a.c) thread).m();
        }
        return false;
    }

    public static final void c(@oy.l ds.a<dr.w2> aVar) {
        aVar.invoke();
    }

    @j2
    public static final long d() {
        s1 s1VarA = s3.f100876a.a();
        if (s1VarA != null) {
            return s1VarA.Y0();
        }
        return Long.MAX_VALUE;
    }

    @dr.f1
    @f1
    @j2
    public static final long e() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof sv.a.c) {
            return ((sv.a.c) threadCurrentThread).q();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + threadCurrentThread);
    }
}
