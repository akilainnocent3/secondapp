package androidx.leanback.widget;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13123b = -1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a[] f13124a = {new a()};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13125a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13126b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13127c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f13128d = 50.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13129e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13130f;

        public final int a() {
            int i10 = this.f13126b;
            return i10 != -1 ? i10 : this.f13125a;
        }

        public final int b() {
            return this.f13127c;
        }

        public final float c() {
            return this.f13128d;
        }

        public final int d() {
            return this.f13125a;
        }

        public boolean e() {
            return this.f13130f;
        }

        public final boolean f() {
            return this.f13129e;
        }

        public final void g(boolean z10) {
            this.f13130f = z10;
        }

        public final void h(int i10) {
            this.f13126b = i10;
        }

        public final void i(int i10) {
            this.f13127c = i10;
        }

        public final void j(float f10) {
            if ((f10 < 0.0f || f10 > 100.0f) && f10 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f13128d = f10;
        }

        public final void k(boolean z10) {
            this.f13129e = z10;
        }

        public final void l(int i10) {
            this.f13125a = i10;
        }
    }

    public a[] a() {
        return this.f13124a;
    }

    public boolean b() {
        return this.f13124a.length > 1;
    }

    public void c(a[] aVarArr) {
        if (aVarArr == null || aVarArr.length < 1) {
            throw new IllegalArgumentException();
        }
        this.f13124a = aVarArr;
    }
}
