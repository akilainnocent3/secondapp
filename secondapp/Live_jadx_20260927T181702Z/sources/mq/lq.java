package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum lq {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f111688c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<lq, String> f111689d = b.f111697g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, lq> f111690e = a.f111696g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f111695b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, lq> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f111696g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final lq invoke(@oy.l String str) {
            return lq.f111688c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<lq, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f111697g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l lq lqVar) {
            return lq.f111688c.b(lqVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final lq a(@oy.l String str) {
            lq lqVar = lq.VISIBLE;
            if (kotlin.jvm.internal.m0.g(str, lqVar.f111695b)) {
                return lqVar;
            }
            lq lqVar2 = lq.INVISIBLE;
            if (kotlin.jvm.internal.m0.g(str, lqVar2.f111695b)) {
                return lqVar2;
            }
            lq lqVar3 = lq.GONE;
            if (kotlin.jvm.internal.m0.g(str, lqVar3.f111695b)) {
                return lqVar3;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l lq lqVar) {
            return lqVar.f111695b;
        }

        public c() {
        }
    }

    lq(String str) {
        this.f111695b = str;
    }
}
