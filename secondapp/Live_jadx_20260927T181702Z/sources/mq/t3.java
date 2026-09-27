package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum t3 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f113546c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<t3, String> f113547d = b.f113556g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, t3> f113548e = a.f113555g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f113554b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, t3> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f113555g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final t3 invoke(@oy.l String str) {
            return t3.f113546c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<t3, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f113556g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l t3 t3Var) {
            return t3.f113546c.b(t3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final t3 a(@oy.l String str) {
            t3 t3Var = t3.TOP;
            if (kotlin.jvm.internal.m0.g(str, t3Var.f113554b)) {
                return t3Var;
            }
            t3 t3Var2 = t3.CENTER;
            if (kotlin.jvm.internal.m0.g(str, t3Var2.f113554b)) {
                return t3Var2;
            }
            t3 t3Var3 = t3.BOTTOM;
            if (kotlin.jvm.internal.m0.g(str, t3Var3.f113554b)) {
                return t3Var3;
            }
            t3 t3Var4 = t3.BASELINE;
            if (kotlin.jvm.internal.m0.g(str, t3Var4.f113554b)) {
                return t3Var4;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l t3 t3Var) {
            return t3Var.f113554b;
        }

        public c() {
        }
    }

    t3(String str) {
        this.f113554b = str;
    }
}
