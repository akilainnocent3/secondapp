package wi;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wi.a f143233a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wi.a f143234b = new C1505b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wi.a f143235c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wi.a f143236d = new d();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements wi.a {
        @Override // wi.a
        public wi.c a(float f10, float f11, float f12, float f13) {
            return wi.c.a(255, v.o(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: renamed from: wi.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C1505b implements wi.a {
        @Override // wi.a
        public wi.c a(float f10, float f11, float f12, float f13) {
            return wi.c.b(v.o(255, 0, f11, f12, f10), 255);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements wi.a {
        @Override // wi.a
        public wi.c a(float f10, float f11, float f12, float f13) {
            return wi.c.b(v.o(255, 0, f11, f12, f10), v.o(0, 255, f11, f12, f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements wi.a {
        @Override // wi.a
        public wi.c a(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return wi.c.b(v.o(255, 0, f11, f14, f10), v.o(0, 255, f14, f12, f10));
        }
    }

    public static wi.a a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f143233a : f143234b;
        }
        if (i10 == 1) {
            return z10 ? f143234b : f143233a;
        }
        if (i10 == 2) {
            return f143235c;
        }
        if (i10 == 3) {
            return f143236d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
