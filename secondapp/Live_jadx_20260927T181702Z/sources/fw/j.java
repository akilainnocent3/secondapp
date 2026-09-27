package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f85457a;

    static {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.m0.o(property, "getProperty(...)");
            objB = dr.i1.b(cv.j0.p1(property));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.i(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f85457a = num != null ? num.intValue() : 2097152;
    }
}
