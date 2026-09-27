package z6;

import androidx.annotation.Nullable;
import java.io.IOException;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f160550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f160551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f160552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f160553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f160554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f160555f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f160561l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public z f160563n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f160565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f160566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f160567r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f160556g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f160557h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f160558i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f160559j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f160560k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f160562m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v0 f160564o = new v0();

    public void a(f6.v vVar) throws IOException {
        vVar.readFully(this.f160564o.f(), 0, this.f160564o.j());
        this.f160564o.j0(0);
        this.f160565p = false;
    }

    public void b(v0 v0Var) {
        v0Var.w(this.f160564o.f(), 0, this.f160564o.j());
        this.f160564o.j0(0);
        this.f160565p = false;
    }

    public long c(int i10) {
        return this.f160559j[i10];
    }

    public void d(int i10) {
        this.f160564o.f0(i10);
        this.f160561l = true;
        this.f160565p = true;
    }

    public void e(int i10, int i11) {
        this.f160554e = i10;
        this.f160555f = i11;
        if (this.f160557h.length < i10) {
            this.f160556g = new long[i10];
            this.f160557h = new int[i10];
        }
        if (this.f160558i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f160558i = new int[i12];
            this.f160559j = new long[i12];
            this.f160560k = new boolean[i12];
            this.f160562m = new boolean[i12];
        }
    }

    public void f() {
        this.f160554e = 0;
        this.f160566q = 0L;
        this.f160567r = false;
        this.f160561l = false;
        this.f160565p = false;
        this.f160563n = null;
    }

    public boolean g(int i10) {
        return this.f160561l && this.f160562m[i10];
    }
}
