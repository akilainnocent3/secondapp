package yads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class az2 implements oa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy2 f146979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f146980b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f146981c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f146982d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa0[] f146983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ua0[] f146984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f146985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f146986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sa0 f146987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t43 f146988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f146989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f146990l;

    public az2(sa0[] sa0VarArr, ua0[] ua0VarArr) {
        this.f146983e = sa0VarArr;
        this.f146985g = sa0VarArr.length;
        for (int i10 = 0; i10 < this.f146985g; i10++) {
            this.f146983e[i10] = c();
        }
        this.f146984f = ua0VarArr;
        this.f146986h = ua0VarArr.length;
        for (int i11 = 0; i11 < this.f146986h; i11++) {
            this.f146984f[i11] = d();
        }
        zy2 zy2Var = new zy2((fz2) this);
        this.f146979a = zy2Var;
        zy2Var.start();
    }

    @Override // yads.oa0
    public final Object a() {
        synchronized (this.f146980b) {
            try {
                t43 t43Var = this.f146988j;
                if (t43Var != null) {
                    throw t43Var;
                }
                if (this.f146982d.isEmpty()) {
                    return null;
                }
                return (ua0) this.f146982d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract t43 a(sa0 sa0Var, ua0 ua0Var, boolean z10);

    @Override // yads.oa0
    public final Object b() {
        sa0 sa0Var;
        synchronized (this.f146980b) {
            try {
                t43 t43Var = this.f146988j;
                if (t43Var != null) {
                    throw t43Var;
                }
                if (this.f146987i != null) {
                    throw new IllegalStateException();
                }
                int i10 = this.f146985g;
                if (i10 == 0) {
                    sa0Var = null;
                } else {
                    sa0[] sa0VarArr = this.f146983e;
                    int i11 = i10 - 1;
                    this.f146985g = i11;
                    sa0Var = sa0VarArr[i11];
                }
                this.f146987i = sa0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sa0Var;
    }

    public abstract w43 c();

    public abstract ez2 d();

    public final boolean e() {
        t43 t43Var;
        t43 t43VarA;
        synchronized (this.f146980b) {
            while (!this.f146990l && (this.f146981c.isEmpty() || this.f146986h <= 0)) {
                try {
                    this.f146980b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f146990l) {
                return false;
            }
            sa0 sa0Var = (sa0) this.f146981c.removeFirst();
            ua0[] ua0VarArr = this.f146984f;
            int i10 = this.f146986h - 1;
            this.f146986h = i10;
            ua0 ua0Var = ua0VarArr[i10];
            boolean z10 = this.f146989k;
            this.f146989k = false;
            if (sa0Var.b(4)) {
                ua0Var.f155526b = 4 | ua0Var.f155526b;
            } else {
                if (sa0Var.b(Integer.MIN_VALUE)) {
                    ua0Var.f155526b |= Integer.MIN_VALUE;
                }
                if (sa0Var.b(134217728)) {
                    ua0Var.f155526b = 134217728 | ua0Var.f155526b;
                }
                try {
                    t43VarA = a(sa0Var, ua0Var, z10);
                } catch (OutOfMemoryError e10) {
                    t43Var = new t43("Unexpected decode error", e10);
                    t43VarA = t43Var;
                } catch (RuntimeException e11) {
                    t43Var = new t43("Unexpected decode error", e11);
                    t43VarA = t43Var;
                }
                if (t43VarA != null) {
                    synchronized (this.f146980b) {
                        this.f146988j = t43VarA;
                    }
                    return false;
                }
            }
            synchronized (this.f146980b) {
                try {
                    if (this.f146989k || ua0Var.b(Integer.MIN_VALUE)) {
                        ua0Var.b();
                    } else {
                        this.f146982d.addLast(ua0Var);
                    }
                    sa0Var.b();
                    sa0[] sa0VarArr = this.f146983e;
                    int i11 = this.f146985g;
                    this.f146985g = i11 + 1;
                    sa0VarArr[i11] = sa0Var;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    public final void f() {
        if (this.f146981c.isEmpty() || this.f146986h <= 0) {
            return;
        }
        this.f146980b.notify();
    }

    @Override // yads.oa0
    public final void flush() {
        synchronized (this.f146980b) {
            try {
                this.f146989k = true;
                sa0 sa0Var = this.f146987i;
                if (sa0Var != null) {
                    sa0Var.b();
                    sa0[] sa0VarArr = this.f146983e;
                    int i10 = this.f146985g;
                    this.f146985g = i10 + 1;
                    sa0VarArr[i10] = sa0Var;
                    this.f146987i = null;
                }
                while (!this.f146981c.isEmpty()) {
                    sa0 sa0Var2 = (sa0) this.f146981c.removeFirst();
                    sa0Var2.b();
                    sa0[] sa0VarArr2 = this.f146983e;
                    int i11 = this.f146985g;
                    this.f146985g = i11 + 1;
                    sa0VarArr2[i11] = sa0Var2;
                }
                while (!this.f146982d.isEmpty()) {
                    ((ua0) this.f146982d.removeFirst()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        int i10 = this.f146985g;
        sa0[] sa0VarArr = this.f146983e;
        if (i10 != sa0VarArr.length) {
            throw new IllegalStateException();
        }
        for (sa0 sa0Var : sa0VarArr) {
            sa0Var.c(1024);
        }
    }

    @Override // yads.oa0
    public final void release() {
        synchronized (this.f146980b) {
            this.f146990l = true;
            this.f146980b.notify();
        }
        try {
            this.f146979a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        synchronized (this.f146980b) {
            try {
                t43 t43Var = this.f146988j;
                if (t43Var == null) {
                    if (w43Var == this.f146987i) {
                        this.f146981c.addLast(w43Var);
                        if (!this.f146981c.isEmpty() && this.f146986h > 0) {
                            this.f146980b.notify();
                        }
                        this.f146987i = null;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw t43Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
