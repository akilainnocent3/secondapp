package mq;

import com.ironsource.C4511sd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum ae {
    NONE("none"),
    SINGLE(C4511sd.f63581d);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final c f107941c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<ae, String> f107942d = b.f107949g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final ds.l<String, ae> f107943e = a.f107948g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f107947b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<String, ae> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f107948g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ae invoke(@oy.l String str) {
            return ae.f107941c.a(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<ae, String> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f107949g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@oy.l ae aeVar) {
            return ae.f107941c.b(aeVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final ae a(@oy.l String str) {
            ae aeVar = ae.NONE;
            if (kotlin.jvm.internal.m0.g(str, aeVar.f107947b)) {
                return aeVar;
            }
            ae aeVar2 = ae.SINGLE;
            if (kotlin.jvm.internal.m0.g(str, aeVar2.f107947b)) {
                return aeVar2;
            }
            return null;
        }

        @oy.l
        public final String b(@oy.l ae aeVar) {
            return aeVar.f107947b;
        }

        public c() {
        }
    }

    ae(String str) {
        this.f107947b = str;
    }
}
