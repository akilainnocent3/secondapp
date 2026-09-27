package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum r6 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f112979c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<r6, String> f112980d = b.f112992g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, r6> f112981e = a.f112991g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f112990b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, r6> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f112991g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final r6 invoke(@oy.l String str) {
            return r6.f112979c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<r6, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f112992g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l r6 r6Var) {
            return r6.f112979c.b(r6Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final r6 a(@oy.l String str) {
            r6 r6Var = r6.TOP;
            if (kotlin.jvm.internal.m0.g(str, r6Var.f112990b)) {
                return r6Var;
            }
            r6 r6Var2 = r6.CENTER;
            if (kotlin.jvm.internal.m0.g(str, r6Var2.f112990b)) {
                return r6Var2;
            }
            r6 r6Var3 = r6.BOTTOM;
            if (kotlin.jvm.internal.m0.g(str, r6Var3.f112990b)) {
                return r6Var3;
            }
            r6 r6Var4 = r6.BASELINE;
            if (kotlin.jvm.internal.m0.g(str, r6Var4.f112990b)) {
                return r6Var4;
            }
            r6 r6Var5 = r6.SPACE_BETWEEN;
            if (kotlin.jvm.internal.m0.g(str, r6Var5.f112990b)) {
                return r6Var5;
            }
            r6 r6Var6 = r6.SPACE_AROUND;
            if (kotlin.jvm.internal.m0.g(str, r6Var6.f112990b)) {
                return r6Var6;
            }
            r6 r6Var7 = r6.SPACE_EVENLY;
            if (kotlin.jvm.internal.m0.g(str, r6Var7.f112990b)) {
                return r6Var7;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l r6 r6Var) {
            return r6Var.f112990b;
        }

        public c() {
        }
    }

    r6(String str) {
        this.f112990b = str;
    }
}
