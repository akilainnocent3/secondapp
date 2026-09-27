package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum s3 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f113136c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<s3, String> f113137d = b.f113147g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, s3> f113138e = a.f113146g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f113145b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, s3> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f113146g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final s3 invoke(@oy.l String str) {
            return s3.f113136c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<s3, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f113147g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l s3 s3Var) {
            return s3.f113136c.b(s3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final s3 a(@oy.l String str) {
            s3 s3Var = s3.LEFT;
            if (kotlin.jvm.internal.m0.g(str, s3Var.f113145b)) {
                return s3Var;
            }
            s3 s3Var2 = s3.CENTER;
            if (kotlin.jvm.internal.m0.g(str, s3Var2.f113145b)) {
                return s3Var2;
            }
            s3 s3Var3 = s3.RIGHT;
            if (kotlin.jvm.internal.m0.g(str, s3Var3.f113145b)) {
                return s3Var3;
            }
            s3 s3Var4 = s3.START;
            if (kotlin.jvm.internal.m0.g(str, s3Var4.f113145b)) {
                return s3Var4;
            }
            s3 s3Var5 = s3.END;
            if (kotlin.jvm.internal.m0.g(str, s3Var5.f113145b)) {
                return s3Var5;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l s3 s3Var) {
            return s3Var.f113145b;
        }

        public c() {
        }
    }

    s3(String str) {
        this.f113145b = str;
    }
}
