package yads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ro implements af2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155064b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mn2 f155066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f155067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ye2 f155068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f155069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ns2 f155070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mx0[] f155071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f155072j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f155074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f155075m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nx0 f155065c = new nx0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f155073k = Long.MIN_VALUE;

    public ro(int i10) {
        this.f155064b = i10;
    }

    public static int a(int i10) {
        return i10 & 128;
    }

    public static int b(int i10) {
        return i10 & 64;
    }

    public abstract int a(mx0 mx0Var);

    public abstract void a(long j10, long j11);

    public abstract void a(long j10, boolean z10);

    public abstract void a(mx0[] mx0VarArr, long j10, long j11);

    public zj1 c() {
        return null;
    }

    public abstract String d();

    public final boolean e() {
        return this.f155073k == Long.MIN_VALUE;
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract void h();

    public int l() {
        return 0;
    }

    public static int a(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 128;
    }

    public final ro b() {
        return this;
    }

    public /* bridge */ /* synthetic */ void a(float f10, float f11) {
    }

    public void a(boolean z10) {
    }

    public final pn0 a(int i10, mx0 mx0Var, Exception exc, boolean z10) {
        int iA;
        if (mx0Var == null || this.f155075m) {
            iA = 4;
        } else {
            this.f155075m = true;
            try {
                iA = a(mx0Var) & 7;
                this.f155075m = false;
            } catch (pn0 unused) {
                this.f155075m = false;
                iA = 4;
            } catch (Throwable th2) {
                this.f155075m = false;
                throw th2;
            }
        }
        String strD = d();
        int i11 = this.f155067e;
        int i12 = mx0Var == null ? 4 : iA;
        return new pn0(pn0.a(1, null, strD, i11, mx0Var, i12), exc, i10, 1, strD, i11, mx0Var, i12, null, SystemClock.elapsedRealtime(), z10);
    }

    public final void a(int i10, ye2 ye2Var) {
        this.f155067e = i10;
        this.f155068f = ye2Var;
    }

    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        ns2 ns2Var = this.f155070h;
        ns2Var.getClass();
        int iA = ns2Var.a(nx0Var, sa0Var, i10);
        if (iA == -4) {
            if (sa0Var.b(4)) {
                this.f155073k = Long.MIN_VALUE;
                return this.f155074l ? -4 : -3;
            }
            long j10 = sa0Var.f155334f + this.f155072j;
            sa0Var.f155334f = j10;
            this.f155073k = Math.max(this.f155073k, j10);
            return iA;
        }
        if (iA == -5) {
            mx0 mx0Var = nx0Var.f153250b;
            mx0Var.getClass();
            if (mx0Var.f152733q != Long.MAX_VALUE) {
                lx0 lx0Var = new lx0(mx0Var);
                lx0Var.f152196o = mx0Var.f152733q + this.f155072j;
                nx0Var.f153250b = new mx0(lx0Var);
            }
        }
        return iA;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // yads.af2
    public void handleMessage(int i10, Object obj) {
    }
}
