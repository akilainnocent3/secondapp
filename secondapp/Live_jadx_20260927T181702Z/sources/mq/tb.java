package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum tb {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f113609c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<tb, String> f113610d = b.f113619g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, tb> f113611e = a.f113618g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f113617b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, tb> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f113618g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final tb invoke(@oy.l String str) {
            return tb.f113609c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<tb, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f113619g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l tb tbVar) {
            return tb.f113609c.b(tbVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final tb a(@oy.l String str) {
            tb tbVar = tb.FILL;
            if (kotlin.jvm.internal.m0.g(str, tbVar.f113617b)) {
                return tbVar;
            }
            tb tbVar2 = tb.NO_SCALE;
            if (kotlin.jvm.internal.m0.g(str, tbVar2.f113617b)) {
                return tbVar2;
            }
            tb tbVar3 = tb.FIT;
            if (kotlin.jvm.internal.m0.g(str, tbVar3.f113617b)) {
                return tbVar3;
            }
            tb tbVar4 = tb.STRETCH;
            if (kotlin.jvm.internal.m0.g(str, tbVar4.f113617b)) {
                return tbVar4;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l tb tbVar) {
            return tbVar.f113617b;
        }

        public c() {
        }
    }

    tb(String str) {
        this.f113617b = str;
    }
}
