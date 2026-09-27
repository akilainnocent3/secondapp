package mq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum vj {
    DP("dp"),
    SP("sp"),
    PX("px");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f114232c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<vj, String> f114233d = b.f114241g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, vj> f114234e = a.f114240g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f114239b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, vj> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f114240g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final vj invoke(@oy.l String str) {
            return vj.f114232c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<vj, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f114241g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l vj vjVar) {
            return vj.f114232c.b(vjVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final vj a(@oy.l String str) {
            vj vjVar = vj.DP;
            if (kotlin.jvm.internal.m0.g(str, vjVar.f114239b)) {
                return vjVar;
            }
            vj vjVar2 = vj.SP;
            if (kotlin.jvm.internal.m0.g(str, vjVar2.f114239b)) {
                return vjVar2;
            }
            vj vjVar3 = vj.PX;
            if (kotlin.jvm.internal.m0.g(str, vjVar3.f114239b)) {
                return vjVar3;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l vj vjVar) {
            return vjVar.f114239b;
        }

        public c() {
        }
    }

    vj(String str) {
        this.f114239b = str;
    }
}
