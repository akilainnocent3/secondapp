package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum lp {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f111678c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<lp, String> f111679d = b.f111687g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, lp> f111680e = a.f111686g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f111685b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, lp> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f111686g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final lp invoke(@oy.l String str) {
            return lp.f111678c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<lp, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f111687g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l lp lpVar) {
            return lp.f111678c.b(lpVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final lp a(@oy.l String str) {
            lp lpVar = lp.DATA_CHANGE;
            if (kotlin.jvm.internal.m0.g(str, lpVar.f111685b)) {
                return lpVar;
            }
            lp lpVar2 = lp.STATE_CHANGE;
            if (kotlin.jvm.internal.m0.g(str, lpVar2.f111685b)) {
                return lpVar2;
            }
            lp lpVar3 = lp.VISIBILITY_CHANGE;
            if (kotlin.jvm.internal.m0.g(str, lpVar3.f111685b)) {
                return lpVar3;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l lp lpVar) {
            return lpVar.f111685b;
        }

        public c() {
        }
    }

    lp(String str) {
        this.f111685b = str;
    }
}
