package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class z1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f7490i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7491a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7492b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7493c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7494d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7495e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7496f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7497g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7498h = false;

    public int a() {
        return this.f7497g ? this.f7491a : this.f7492b;
    }

    public int b() {
        return this.f7491a;
    }

    public int c() {
        return this.f7492b;
    }

    public int d() {
        return this.f7497g ? this.f7492b : this.f7491a;
    }

    public void e(int i10, int i11) {
        this.f7498h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f7495e = i10;
            this.f7491a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f7496f = i11;
            this.f7492b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f7497g) {
            return;
        }
        this.f7497g = z10;
        if (!this.f7498h) {
            this.f7491a = this.f7495e;
            this.f7492b = this.f7496f;
            return;
        }
        if (z10) {
            int i10 = this.f7494d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f7495e;
            }
            this.f7491a = i10;
            int i11 = this.f7493c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f7496f;
            }
            this.f7492b = i11;
            return;
        }
        int i12 = this.f7493c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f7495e;
        }
        this.f7491a = i12;
        int i13 = this.f7494d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f7496f;
        }
        this.f7492b = i13;
    }

    public void g(int i10, int i11) {
        this.f7493c = i10;
        this.f7494d = i11;
        this.f7498h = true;
        if (this.f7497g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f7491a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f7492b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f7491a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f7492b = i11;
        }
    }
}
