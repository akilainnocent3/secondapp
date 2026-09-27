package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum s8 {
    STRING("string"),
    INTEGER("integer"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT("dict"),
    ARRAY("array");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f113178c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<s8, String> f113179d = b.f113193g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, s8> f113180e = a.f113192g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f113191b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, s8> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f113192g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final s8 invoke(@oy.l String str) {
            return s8.f113178c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<s8, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f113193g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l s8 s8Var) {
            return s8.f113178c.b(s8Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final s8 a(@oy.l String str) {
            s8 s8Var = s8.STRING;
            if (kotlin.jvm.internal.m0.g(str, s8Var.f113191b)) {
                return s8Var;
            }
            s8 s8Var2 = s8.INTEGER;
            if (kotlin.jvm.internal.m0.g(str, s8Var2.f113191b)) {
                return s8Var2;
            }
            s8 s8Var3 = s8.NUMBER;
            if (kotlin.jvm.internal.m0.g(str, s8Var3.f113191b)) {
                return s8Var3;
            }
            s8 s8Var4 = s8.BOOLEAN;
            if (kotlin.jvm.internal.m0.g(str, s8Var4.f113191b)) {
                return s8Var4;
            }
            s8 s8Var5 = s8.DATETIME;
            if (kotlin.jvm.internal.m0.g(str, s8Var5.f113191b)) {
                return s8Var5;
            }
            s8 s8Var6 = s8.COLOR;
            if (kotlin.jvm.internal.m0.g(str, s8Var6.f113191b)) {
                return s8Var6;
            }
            s8 s8Var7 = s8.URL;
            if (kotlin.jvm.internal.m0.g(str, s8Var7.f113191b)) {
                return s8Var7;
            }
            s8 s8Var8 = s8.DICT;
            if (kotlin.jvm.internal.m0.g(str, s8Var8.f113191b)) {
                return s8Var8;
            }
            s8 s8Var9 = s8.ARRAY;
            if (kotlin.jvm.internal.m0.g(str, s8Var9.f113191b)) {
                return s8Var9;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l s8 s8Var) {
            return s8Var.f113191b;
        }

        public c() {
        }
    }

    s8(String str) {
        this.f113191b = str;
    }
}
