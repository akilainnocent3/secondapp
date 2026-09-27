package jf;

import androidx.annotation.Nullable;
import eh.t0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f100068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f100069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f100070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f100071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f100072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f100073f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f100079l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public p f100081n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f100083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f100084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f100085r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f100074g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f100075h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f100076i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f100077j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f100078k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f100080m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t0 f100082o = new t0();

    public void a(af.n nVar) throws IOException {
        nVar.readFully(this.f100082o.e(), 0, this.f100082o.g());
        this.f100082o.Y(0);
        this.f100083p = false;
    }

    public void b(t0 t0Var) {
        t0Var.n(this.f100082o.e(), 0, this.f100082o.g());
        this.f100082o.Y(0);
        this.f100083p = false;
    }

    public long c(int i10) {
        return this.f100077j[i10];
    }

    public void d(int i10) {
        this.f100082o.U(i10);
        this.f100079l = true;
        this.f100083p = true;
    }

    public void e(int i10, int i11) {
        this.f100072e = i10;
        this.f100073f = i11;
        if (this.f100075h.length < i10) {
            this.f100074g = new long[i10];
            this.f100075h = new int[i10];
        }
        if (this.f100076i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f100076i = new int[i12];
            this.f100077j = new long[i12];
            this.f100078k = new boolean[i12];
            this.f100080m = new boolean[i12];
        }
    }

    public void f() {
        this.f100072e = 0;
        this.f100084q = 0L;
        this.f100085r = false;
        this.f100079l = false;
        this.f100083p = false;
        this.f100081n = null;
    }

    public boolean g(int i10) {
        return this.f100079l && this.f100080m[i10];
    }
}
