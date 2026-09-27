package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2 f9643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c2 f9644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c2 f9645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c2 f9646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c2 f9647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c2 f9648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c2 f9649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c2 f9650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c2 f9651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c2 f9652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ c2[] f9653o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f9654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f9655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9656d;

    static {
        c2 c2Var = new c2("VOID", 0, Void.class, Void.class, null);
        f9643e = c2Var;
        Class cls = Integer.TYPE;
        c2 c2Var2 = new c2("INT", 1, cls, Integer.class, 0);
        f9644f = c2Var2;
        c2 c2Var3 = new c2("LONG", 2, Long.TYPE, Long.class, 0L);
        f9645g = c2Var3;
        c2 c2Var4 = new c2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f9646h = c2Var4;
        c2 c2Var5 = new c2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f9647i = c2Var5;
        c2 c2Var6 = new c2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f9648j = c2Var6;
        c2 c2Var7 = new c2("STRING", 6, String.class, String.class, "");
        f9649k = c2Var7;
        c2 c2Var8 = new c2("BYTE_STRING", 7, u.class, u.class, u.f10242g);
        f9650l = c2Var8;
        c2 c2Var9 = new c2("ENUM", 8, cls, Integer.class, null);
        f9651m = c2Var9;
        c2 c2Var10 = new c2("MESSAGE", 9, Object.class, Object.class, null);
        f9652n = c2Var10;
        f9653o = new c2[]{c2Var, c2Var2, c2Var3, c2Var4, c2Var5, c2Var6, c2Var7, c2Var8, c2Var9, c2Var10};
    }

    public c2(String $enum$name, int $enum$ordinal, Class type, Class boxedType, Object defaultDefault) {
        super($enum$name, $enum$ordinal);
        this.f9654b = type;
        this.f9655c = boxedType;
        this.f9656d = defaultDefault;
    }

    public static c2 valueOf(String name) {
        return (c2) Enum.valueOf(c2.class, name);
    }

    public static c2[] values() {
        return (c2[]) f9653o.clone();
    }

    public Class<?> d() {
        return this.f9655c;
    }

    public Object g() {
        return this.f9656d;
    }

    public Class<?> h() {
        return this.f9654b;
    }

    public boolean i(Class<?> t10) {
        return this.f9654b.isAssignableFrom(t10);
    }
}
