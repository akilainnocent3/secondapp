package yl;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@cr.f
public final class h implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f159621b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f159622c = "FIREBASE_APPQUALITY_SESSION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final dl.b<ae.m> f159623a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    @cr.a
    public h(@oy.l dl.b<ae.m> transportFactoryProvider) {
        kotlin.jvm.internal.m0.p(transportFactoryProvider, "transportFactoryProvider");
        this.f159623a = transportFactoryProvider;
    }

    @Override // yl.i
    public void a(@oy.l m0 sessionEvent) {
        kotlin.jvm.internal.m0.p(sessionEvent, "sessionEvent");
        this.f159623a.get().a(f159622c, m0.class, ae.e.b("json"), new ae.k() { // from class: yl.g
            @Override // ae.k
            public final Object apply(Object obj) {
                return this.f159620a.c((m0) obj);
            }
        }).b(ae.f.j(sessionEvent));
    }

    public final byte[] c(m0 m0Var) {
        String strB = n0.f159653a.d().b(m0Var);
        kotlin.jvm.internal.m0.o(strB, "encode(...)");
        Log.d(m.f159644d, "Session Event Type: " + m0Var.g().name());
        byte[] bytes = strB.getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return bytes;
    }
}
