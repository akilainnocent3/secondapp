package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum q6 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f112740c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<q6, String> f112741d = b.f112754g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, q6> f112742e = a.f112753g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f112752b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, q6> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f112753g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final q6 invoke(@oy.l String str) {
            return q6.f112740c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<q6, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f112754g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l q6 q6Var) {
            return q6.f112740c.b(q6Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final q6 a(@oy.l String str) {
            q6 q6Var = q6.LEFT;
            if (kotlin.jvm.internal.m0.g(str, q6Var.f112752b)) {
                return q6Var;
            }
            q6 q6Var2 = q6.CENTER;
            if (kotlin.jvm.internal.m0.g(str, q6Var2.f112752b)) {
                return q6Var2;
            }
            q6 q6Var3 = q6.RIGHT;
            if (kotlin.jvm.internal.m0.g(str, q6Var3.f112752b)) {
                return q6Var3;
            }
            q6 q6Var4 = q6.START;
            if (kotlin.jvm.internal.m0.g(str, q6Var4.f112752b)) {
                return q6Var4;
            }
            q6 q6Var5 = q6.END;
            if (kotlin.jvm.internal.m0.g(str, q6Var5.f112752b)) {
                return q6Var5;
            }
            q6 q6Var6 = q6.SPACE_BETWEEN;
            if (kotlin.jvm.internal.m0.g(str, q6Var6.f112752b)) {
                return q6Var6;
            }
            q6 q6Var7 = q6.SPACE_AROUND;
            if (kotlin.jvm.internal.m0.g(str, q6Var7.f112752b)) {
                return q6Var7;
            }
            q6 q6Var8 = q6.SPACE_EVENLY;
            if (kotlin.jvm.internal.m0.g(str, q6Var8.f112752b)) {
                return q6Var8;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l q6 q6Var) {
            return q6Var.f112752b;
        }

        public c() {
        }
    }

    q6(String str) {
        this.f112752b = str;
    }
}
