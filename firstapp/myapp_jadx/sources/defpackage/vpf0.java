package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vpf0 implements ha50, ca50 {
    public final ha50 a;
    public final Object b;
    public volatile pv90 c;
    public volatile ca50 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public vpf0(Object obj, ha50 ha50Var) {
        this.b = obj;
        this.a = ha50Var;
    }

    @Override // defpackage.ca50
    public final void a() {
        synchronized (this.b) {
            try {
                if (!ga50.a(this.f)) {
                    this.f = 2;
                    this.d.a();
                }
                if (!ga50.a(this.e)) {
                    this.e = 2;
                    this.c.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ha50, defpackage.ca50
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.b() || this.c.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.ca50
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.ha50
    public final boolean d(ca50 ca50Var) {
        boolean z;
        synchronized (this.b) {
            try {
                ha50 ha50Var = this.a;
                z = (ha50Var == null || ha50Var.d(this)) && ca50Var.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean f(ca50 ca50Var) {
        if (!(ca50Var instanceof vpf0)) {
            return false;
        }
        vpf0 vpf0Var = (vpf0) ca50Var;
        if (this.c == null) {
            if (vpf0Var.c != null) {
                return false;
            }
        } else if (!this.c.f(vpf0Var.c)) {
            return false;
        }
        if (this.d == null) {
            return vpf0Var.d == null;
        }
        return this.d.f(vpf0Var.d);
    }

    @Override // defpackage.ha50
    public final void g(ca50 ca50Var) {
        synchronized (this.b) {
            try {
                if (!ca50Var.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                ha50 ha50Var = this.a;
                if (ha50Var != null) {
                    ha50Var.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ha50] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ha50
    public final ha50 getRoot() {
        ?? root;
        synchronized (this.b) {
            try {
                ha50 ha50Var = this.a;
                this = this;
                if (ha50Var != null) {
                    root = ha50Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.ha50
    public final void h(ca50 ca50Var) {
        synchronized (this.b) {
            try {
                if (ca50Var.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                ha50 ha50Var = this.a;
                if (ha50Var != null) {
                    ha50Var.h(this);
                }
                if (!ga50.a(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ha50
    public final boolean i(ca50 ca50Var) {
        boolean z;
        synchronized (this.b) {
            try {
                ha50 ha50Var = this.a;
                z = (ha50Var == null || ha50Var.i(this)) && ca50Var.equals(this.c) && !b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ha50
    public final boolean j(ca50 ca50Var) {
        boolean z;
        synchronized (this.b) {
            try {
                ha50 ha50Var = this.a;
                z = (ha50Var == null || ha50Var.j(this)) && (ca50Var.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.k();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.k();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
