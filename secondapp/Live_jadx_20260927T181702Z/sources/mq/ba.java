package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum ba {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f108223c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<ba, String> f108224d = b.f108233g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, ba> f108225e = a.f108232g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f108231b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, ba> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f108232g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ba invoke(@oy.l String str) {
            return ba.f108223c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<ba, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f108233g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l ba baVar) {
            return ba.f108223c.b(baVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final ba a(@oy.l String str) {
            ba baVar = ba.LIGHT;
            if (kotlin.jvm.internal.m0.g(str, baVar.f108231b)) {
                return baVar;
            }
            ba baVar2 = ba.MEDIUM;
            if (kotlin.jvm.internal.m0.g(str, baVar2.f108231b)) {
                return baVar2;
            }
            ba baVar3 = ba.REGULAR;
            if (kotlin.jvm.internal.m0.g(str, baVar3.f108231b)) {
                return baVar3;
            }
            ba baVar4 = ba.BOLD;
            if (kotlin.jvm.internal.m0.g(str, baVar4.f108231b)) {
                return baVar4;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l ba baVar) {
            return baVar.f108231b;
        }

        public c() {
        }
    }

    ba(String str) {
        this.f108231b = str;
    }
}
