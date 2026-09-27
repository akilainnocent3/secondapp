package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum kp {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f111456c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<kp, String> f111457d = b.f111466g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, kp> f111458e = a.f111465g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f111464b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, kp> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f111465g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final kp invoke(@oy.l String str) {
            return kp.f111456c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<kp, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f111466g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l kp kpVar) {
            return kp.f111456c.b(kpVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final kp a(@oy.l String str) {
            kp kpVar = kp.NONE;
            if (kotlin.jvm.internal.m0.g(str, kpVar.f111464b)) {
                return kpVar;
            }
            kp kpVar2 = kp.DATA_CHANGE;
            if (kotlin.jvm.internal.m0.g(str, kpVar2.f111464b)) {
                return kpVar2;
            }
            kp kpVar3 = kp.STATE_CHANGE;
            if (kotlin.jvm.internal.m0.g(str, kpVar3.f111464b)) {
                return kpVar3;
            }
            kp kpVar4 = kp.ANY_CHANGE;
            if (kotlin.jvm.internal.m0.g(str, kpVar4.f111464b)) {
                return kpVar4;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l kp kpVar) {
            return kpVar.f111464b;
        }

        public c() {
        }
    }

    kp(String str) {
        this.f111464b = str;
    }
}
