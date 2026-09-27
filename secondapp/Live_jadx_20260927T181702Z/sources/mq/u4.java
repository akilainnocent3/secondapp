package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum u4 {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f113878c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<u4, String> f113879d = b.f113890g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, u4> f113880e = a.f113889g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f113888b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, u4> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f113889g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final u4 invoke(@oy.l String str) {
            return u4.f113878c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<u4, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f113890g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l u4 u4Var) {
            return u4.f113878c.b(u4Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final u4 a(@oy.l String str) {
            u4 u4Var = u4.SOURCE_IN;
            if (kotlin.jvm.internal.m0.g(str, u4Var.f113888b)) {
                return u4Var;
            }
            u4 u4Var2 = u4.SOURCE_ATOP;
            if (kotlin.jvm.internal.m0.g(str, u4Var2.f113888b)) {
                return u4Var2;
            }
            u4 u4Var3 = u4.DARKEN;
            if (kotlin.jvm.internal.m0.g(str, u4Var3.f113888b)) {
                return u4Var3;
            }
            u4 u4Var4 = u4.LIGHTEN;
            if (kotlin.jvm.internal.m0.g(str, u4Var4.f113888b)) {
                return u4Var4;
            }
            u4 u4Var5 = u4.MULTIPLY;
            if (kotlin.jvm.internal.m0.g(str, u4Var5.f113888b)) {
                return u4Var5;
            }
            u4 u4Var6 = u4.SCREEN;
            if (kotlin.jvm.internal.m0.g(str, u4Var6.f113888b)) {
                return u4Var6;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l u4 u4Var) {
            return u4Var.f113888b;
        }

        public c() {
        }
    }

    u4(String str) {
        this.f113888b = str;
    }
}
