package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum v3 {
    NORMAL("normal"),
    REVERSE("reverse"),
    ALTERNATE(sc.p.f130188p),
    ALTERNATE_REVERSE("alternate_reverse");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f114088c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<v3, String> f114089d = b.f114098g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, v3> f114090e = a.f114097g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f114096b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, v3> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f114097g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final v3 invoke(@oy.l String str) {
            return v3.f114088c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<v3, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f114098g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l v3 v3Var) {
            return v3.f114088c.b(v3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final v3 a(@oy.l String str) {
            v3 v3Var = v3.NORMAL;
            if (kotlin.jvm.internal.m0.g(str, v3Var.f114096b)) {
                return v3Var;
            }
            v3 v3Var2 = v3.REVERSE;
            if (kotlin.jvm.internal.m0.g(str, v3Var2.f114096b)) {
                return v3Var2;
            }
            v3 v3Var3 = v3.ALTERNATE;
            if (kotlin.jvm.internal.m0.g(str, v3Var3.f114096b)) {
                return v3Var3;
            }
            v3 v3Var4 = v3.ALTERNATE_REVERSE;
            if (kotlin.jvm.internal.m0.g(str, v3Var4.f114096b)) {
                return v3Var4;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l v3 v3Var) {
            return v3Var.f114096b;
        }

        public c() {
        }
    }

    v3(String str) {
        this.f114096b = str;
    }
}
