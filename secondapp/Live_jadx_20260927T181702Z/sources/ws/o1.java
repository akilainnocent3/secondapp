package ws;

import io.appmetrica.analytics.BuildConfig;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final o1 f143775a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final Map<p1, Integer> f143776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final h f143777c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final a f143778c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final b f143779c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final c f143780c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final d f143781c = new d();

        public d() {
            super("local", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final e f143782c = new e();

        public e() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final f f143783c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // ws.p1
        @oy.l
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final g f143784c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final h f143785c = new h();

        public h() {
            super(BuildConfig.SDK_BUILD_FLAVOR, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i extends p1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final i f143786c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        Map mapG = fr.m1.g();
        mapG.put(f.f143783c, 0);
        mapG.put(e.f143782c, 0);
        mapG.put(b.f143779c, 1);
        mapG.put(g.f143784c, 1);
        h hVar = h.f143785c;
        mapG.put(hVar, 2);
        f143776b = fr.m1.d(mapG);
        f143777c = hVar;
    }

    @oy.m
    public final Integer a(@oy.l p1 first, @oy.l p1 second) {
        kotlin.jvm.internal.m0.p(first, "first");
        kotlin.jvm.internal.m0.p(second, "second");
        if (first == second) {
            return 0;
        }
        Map<p1, Integer> map = f143776b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || kotlin.jvm.internal.m0.g(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(@oy.l p1 visibility) {
        kotlin.jvm.internal.m0.p(visibility, "visibility");
        return visibility == e.f143782c || visibility == f.f143783c;
    }
}
