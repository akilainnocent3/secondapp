package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum dq {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f108729c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<dq, String> f108730d = b.f108738g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, dq> f108731e = a.f108737g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f108736b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, dq> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f108737g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final dq invoke(@oy.l String str) {
            return dq.f108729c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<dq, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f108738g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l dq dqVar) {
            return dq.f108729c.b(dqVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final dq a(@oy.l String str) {
            dq dqVar = dq.FILL;
            if (kotlin.jvm.internal.m0.g(str, dqVar.f108736b)) {
                return dqVar;
            }
            dq dqVar2 = dq.NO_SCALE;
            if (kotlin.jvm.internal.m0.g(str, dqVar2.f108736b)) {
                return dqVar2;
            }
            dq dqVar3 = dq.FIT;
            if (kotlin.jvm.internal.m0.g(str, dqVar3.f108736b)) {
                return dqVar3;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l dq dqVar) {
            return dqVar.f108736b;
        }

        public c() {
        }
    }

    dq(String str) {
        this.f108736b = str;
    }
}
