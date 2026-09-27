package xi;

import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(21)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xi.a f145144a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi.a f145145b = new C1527b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xi.a f145146c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xi.a f145147d = new d();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements xi.a {
        @Override // xi.a
        public xi.c a(float f10, float f11, float f12, float f13) {
            return xi.c.a(255, w.o(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: renamed from: xi.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C1527b implements xi.a {
        @Override // xi.a
        public xi.c a(float f10, float f11, float f12, float f13) {
            return xi.c.b(w.o(255, 0, f11, f12, f10), 255);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements xi.a {
        @Override // xi.a
        public xi.c a(float f10, float f11, float f12, float f13) {
            return xi.c.b(w.o(255, 0, f11, f12, f10), w.o(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements xi.a {
        @Override // xi.a
        public xi.c a(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return xi.c.b(w.o(255, 0, f11, f14, f10), w.o(0, 255, f14, f12, f10));
        }
    }

    public static xi.a a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f145144a : f145145b;
        }
        if (i10 == 1) {
            return z10 ? f145145b : f145144a;
        }
        if (i10 == 2) {
            return f145146c;
        }
        if (i10 == 3) {
            return f145147d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
