package sv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    @cs.j(name = "isSchedulerWorker")
    public static final boolean a(@oy.l Thread thread) {
        return thread instanceof a.c;
    }

    @cs.j(name = "mayNotBlock")
    public static final boolean b(@oy.l Thread thread) {
        return (thread instanceof a.c) && ((a.c) thread).f135564d == a.d.CPU_ACQUIRED;
    }
}
