package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum tm {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f113755c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<tm, String> f113756d = b.f113765g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, tm> f113757e = a.f113764g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f113763b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, tm> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f113764g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final tm invoke(@oy.l String str) {
            return tm.f113755c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<tm, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f113765g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l tm tmVar) {
            return tm.f113755c.b(tmVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final tm a(@oy.l String str) {
            tm tmVar = tm.TOP;
            if (kotlin.jvm.internal.m0.g(str, tmVar.f113763b)) {
                return tmVar;
            }
            tm tmVar2 = tm.CENTER;
            if (kotlin.jvm.internal.m0.g(str, tmVar2.f113763b)) {
                return tmVar2;
            }
            tm tmVar3 = tm.BOTTOM;
            if (kotlin.jvm.internal.m0.g(str, tmVar3.f113763b)) {
                return tmVar3;
            }
            tm tmVar4 = tm.BASELINE;
            if (kotlin.jvm.internal.m0.g(str, tmVar4.f113763b)) {
                return tmVar4;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l tm tmVar) {
            return tmVar.f113763b;
        }

        public c() {
        }
    }

    tm(String str) {
        this.f113763b = str;
    }
}
