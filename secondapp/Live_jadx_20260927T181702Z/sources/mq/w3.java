package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum w3 {
    LINEAR(n0.d.f115552l),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f114306c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<w3, String> f114307d = b.f114318g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, w3> f114308e = a.f114317g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f114316b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, w3> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f114317g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final w3 invoke(@oy.l String str) {
            return w3.f114306c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<w3, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f114318g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l w3 w3Var) {
            return w3.f114306c.b(w3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final w3 a(@oy.l String str) {
            w3 w3Var = w3.LINEAR;
            if (kotlin.jvm.internal.m0.g(str, w3Var.f114316b)) {
                return w3Var;
            }
            w3 w3Var2 = w3.EASE;
            if (kotlin.jvm.internal.m0.g(str, w3Var2.f114316b)) {
                return w3Var2;
            }
            w3 w3Var3 = w3.EASE_IN;
            if (kotlin.jvm.internal.m0.g(str, w3Var3.f114316b)) {
                return w3Var3;
            }
            w3 w3Var4 = w3.EASE_OUT;
            if (kotlin.jvm.internal.m0.g(str, w3Var4.f114316b)) {
                return w3Var4;
            }
            w3 w3Var5 = w3.EASE_IN_OUT;
            if (kotlin.jvm.internal.m0.g(str, w3Var5.f114316b)) {
                return w3Var5;
            }
            w3 w3Var6 = w3.SPRING;
            if (kotlin.jvm.internal.m0.g(str, w3Var6.f114316b)) {
                return w3Var6;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l w3 w3Var) {
            return w3Var.f114316b;
        }

        public c() {
        }
    }

    w3(String str) {
        this.f114316b = str;
    }
}
