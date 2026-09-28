package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class scg implements ha50, ca50 {
    public final Object a;
    public final ha50 b;
    public volatile ca50 c;
    public volatile ca50 d;
    public int e = 3;
    public int f = 3;

    public scg(Object obj, ha50 ha50Var) {
        this.a = obj;
        this.b = ha50Var;
    }

    @Override // defpackage.ca50
    public final void a() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.a();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ha50, defpackage.ca50
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.b() || this.d.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ha50
    public final boolean d(ca50 ca50Var) {
        boolean z;
        synchronized (this.a) {
            ha50 ha50Var = this.b;
            z = (ha50Var == null || ha50Var.d(this)) && ca50Var.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean f(ca50 ca50Var) {
        if (ca50Var instanceof scg) {
            scg scgVar = (scg) ca50Var;
            if (this.c.f(scgVar.c) && this.d.f(scgVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ha50
    public final void g(ca50 ca50Var) {
        synchronized (this.a) {
            try {
                if (ca50Var.equals(this.d)) {
                    this.f = 5;
                    ha50 ha50Var = this.b;
                    if (ha50Var != null) {
                        ha50Var.g(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.k();
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
        synchronized (this.a) {
            try {
                ha50 ha50Var = this.b;
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
        synchronized (this.a) {
            try {
                if (ca50Var.equals(this.c)) {
                    this.e = 4;
                } else if (ca50Var.equals(this.d)) {
                    this.f = 4;
                }
                ha50 ha50Var = this.b;
                if (ha50Var != null) {
                    ha50Var.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ha50
    public final boolean i(ca50 ca50Var) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.a) {
            ha50 ha50Var = this.b;
            z = false;
            if (ha50Var == null || ha50Var.i(this)) {
                if (this.e != 5) {
                    zEquals = ca50Var.equals(this.c);
                } else {
                    zEquals = ca50Var.equals(this.d) && ((i = this.f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.ca50
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.ha50
    public final boolean j(ca50 ca50Var) {
        boolean z;
        synchronized (this.a) {
            ha50 ha50Var = this.b;
            z = ha50Var == null || ha50Var.j(this);
        }
        return z;
    }

    @Override // defpackage.ca50
    public final void k() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
