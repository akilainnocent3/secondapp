package androidx.window.layout;

import android.graphics.Rect;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f19961d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final da.b f19962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final b f19963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final r.c f19964c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final void a(@oy.l da.b bounds) {
            m0.p(bounds, "bounds");
            if (bounds.f() == 0 && bounds.b() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.c() != 0 && bounds.e() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final a f19965b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final b f19966c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final b f19967d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final String f19968a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @oy.l
            public final b a() {
                return b.f19966c;
            }

            @oy.l
            public final b b() {
                return b.f19967d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f19968a = str;
        }

        @oy.l
        public String toString() {
            return this.f19968a;
        }
    }

    public s(@oy.l da.b featureBounds, @oy.l b type, @oy.l r.c state) {
        m0.p(featureBounds, "featureBounds");
        m0.p(type, "type");
        m0.p(state, "state");
        this.f19962a = featureBounds;
        this.f19963b = type;
        this.f19964c = state;
        f19961d.a(featureBounds);
    }

    @Override // androidx.window.layout.r
    public boolean a() {
        b bVar = this.f19963b;
        b.a aVar = b.f19965b;
        if (m0.g(bVar, aVar.b())) {
            return true;
        }
        return m0.g(this.f19963b, aVar.a()) && m0.g(getState(), r.c.f19959d);
    }

    @Override // androidx.window.layout.r
    @oy.l
    public r.a b() {
        return (this.f19962a.f() == 0 || this.f19962a.b() == 0) ? r.a.f19950c : r.a.f19951d;
    }

    @oy.l
    public final b c() {
        return this.f19963b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(s.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        s sVar = (s) obj;
        return m0.g(this.f19962a, sVar.f19962a) && m0.g(this.f19963b, sVar.f19963b) && m0.g(getState(), sVar.getState());
    }

    @Override // androidx.window.layout.m
    @oy.l
    public Rect getBounds() {
        return this.f19962a.i();
    }

    @Override // androidx.window.layout.r
    @oy.l
    public r.b getOrientation() {
        return this.f19962a.f() > this.f19962a.b() ? r.b.f19955d : r.b.f19954c;
    }

    @Override // androidx.window.layout.r
    @oy.l
    public r.c getState() {
        return this.f19964c;
    }

    public int hashCode() {
        return (((this.f19962a.hashCode() * 31) + this.f19963b.hashCode()) * 31) + getState().hashCode();
    }

    @oy.l
    public String toString() {
        return ((Object) s.class.getSimpleName()) + " { " + this.f19962a + ", type=" + this.f19963b + ", state=" + getState() + " }";
    }
}
