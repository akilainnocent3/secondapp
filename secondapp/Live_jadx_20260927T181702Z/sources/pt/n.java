package pt;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f121042a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final d f121043b = new d(fu.e.BOOLEAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final d f121044c = new d(fu.e.CHAR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final d f121045d = new d(fu.e.BYTE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final d f121046e = new d(fu.e.SHORT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final d f121047f = new d(fu.e.INT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final d f121048g = new d(fu.e.FLOAT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final d f121049h = new d(fu.e.LONG);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final d f121050i = new d(fu.e.DOUBLE);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends n {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @oy.l
        public final n f121051j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@oy.l n elementType) {
            super(null);
            m0.p(elementType, "elementType");
            this.f121051j = elementType;
        }

        @oy.l
        public final n i() {
            return this.f121051j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final d a() {
            return n.f121043b;
        }

        @oy.l
        public final d b() {
            return n.f121045d;
        }

        @oy.l
        public final d c() {
            return n.f121044c;
        }

        @oy.l
        public final d d() {
            return n.f121050i;
        }

        @oy.l
        public final d e() {
            return n.f121048g;
        }

        @oy.l
        public final d f() {
            return n.f121047f;
        }

        @oy.l
        public final d g() {
            return n.f121049h;
        }

        @oy.l
        public final d h() {
            return n.f121046e;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends n {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @oy.l
        public final String f121052j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@oy.l String internalName) {
            super(null);
            m0.p(internalName, "internalName");
            this.f121052j = internalName;
        }

        @oy.l
        public final String i() {
            return this.f121052j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends n {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @oy.m
        public final fu.e f121053j;

        public d(@oy.m fu.e eVar) {
            super(null);
            this.f121053j = eVar;
        }

        @oy.m
        public final fu.e i() {
            return this.f121053j;
        }
    }

    public /* synthetic */ n(kotlin.jvm.internal.x xVar) {
        this();
    }

    @oy.l
    public String toString() {
        return p.f121054a.e(this);
    }

    public n() {
    }
}
