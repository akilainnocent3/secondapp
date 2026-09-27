package lc;

import androidx.annotation.Nullable;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements f, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f103797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final f f103798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f103799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f103800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a0("requestLock")
    public f.a f103801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a0("requestLock")
    public f.a f103802f;

    public b(Object obj, @Nullable f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f103801e = aVar;
        this.f103802f = aVar;
        this.f103797a = obj;
        this.f103798b = fVar;
    }

    @Override // lc.f, lc.e
    public boolean a() {
        boolean z10;
        synchronized (this.f103797a) {
            try {
                z10 = this.f103799c.a() || this.f103800d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.f
    public void b(e eVar) {
        synchronized (this.f103797a) {
            try {
                if (eVar.equals(this.f103800d)) {
                    this.f103802f = f.a.FAILED;
                    f fVar = this.f103798b;
                    if (fVar != null) {
                        fVar.b(this);
                    }
                    return;
                }
                this.f103801e = f.a.FAILED;
                f.a aVar = this.f103802f;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f103802f = aVar2;
                    this.f103800d.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lc.f
    public boolean c(e eVar) {
        boolean zN;
        synchronized (this.f103797a) {
            zN = n();
        }
        return zN;
    }

    @Override // lc.e
    public void clear() {
        synchronized (this.f103797a) {
            try {
                f.a aVar = f.a.CLEARED;
                this.f103801e = aVar;
                this.f103799c.clear();
                if (this.f103802f != aVar) {
                    this.f103802f = aVar;
                    this.f103800d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lc.f
    public boolean d(e eVar) {
        boolean z10;
        synchronized (this.f103797a) {
            try {
                z10 = l() && eVar.equals(this.f103799c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.e
    public boolean e() {
        boolean z10;
        synchronized (this.f103797a) {
            try {
                f.a aVar = this.f103801e;
                f.a aVar2 = f.a.CLEARED;
                z10 = aVar == aVar2 && this.f103802f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.e
    public boolean f() {
        boolean z10;
        synchronized (this.f103797a) {
            try {
                f.a aVar = this.f103801e;
                f.a aVar2 = f.a.SUCCESS;
                z10 = aVar == aVar2 || this.f103802f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.f
    public void g(e eVar) {
        synchronized (this.f103797a) {
            try {
                if (eVar.equals(this.f103799c)) {
                    this.f103801e = f.a.SUCCESS;
                } else if (eVar.equals(this.f103800d)) {
                    this.f103802f = f.a.SUCCESS;
                }
                f fVar = this.f103798b;
                if (fVar != null) {
                    fVar.g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lc.f
    public f getRoot() {
        f root;
        synchronized (this.f103797a) {
            try {
                f fVar = this.f103798b;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // lc.e
    public boolean h(e eVar) {
        if (eVar instanceof b) {
            b bVar = (b) eVar;
            if (this.f103799c.h(bVar.f103799c) && this.f103800d.h(bVar.f103800d)) {
                return true;
            }
        }
        return false;
    }

    @Override // lc.f
    public boolean i(e eVar) {
        boolean z10;
        synchronized (this.f103797a) {
            try {
                z10 = m() && k(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f103797a) {
            try {
                f.a aVar = this.f103801e;
                f.a aVar2 = f.a.RUNNING;
                z10 = aVar == aVar2 || this.f103802f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.e
    public void j() {
        synchronized (this.f103797a) {
            try {
                f.a aVar = this.f103801e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f103801e = aVar2;
                    this.f103799c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @a0("requestLock")
    public final boolean k(e eVar) {
        f.a aVar = this.f103801e;
        f.a aVar2 = f.a.FAILED;
        if (aVar != aVar2) {
            return eVar.equals(this.f103799c);
        }
        if (!eVar.equals(this.f103800d)) {
            return false;
        }
        f.a aVar3 = this.f103802f;
        return aVar3 == f.a.SUCCESS || aVar3 == aVar2;
    }

    @a0("requestLock")
    public final boolean l() {
        f fVar = this.f103798b;
        return fVar == null || fVar.d(this);
    }

    @a0("requestLock")
    public final boolean m() {
        f fVar = this.f103798b;
        return fVar == null || fVar.i(this);
    }

    @a0("requestLock")
    public final boolean n() {
        f fVar = this.f103798b;
        return fVar == null || fVar.c(this);
    }

    public void o(e eVar, e eVar2) {
        this.f103799c = eVar;
        this.f103800d = eVar2;
    }

    @Override // lc.e
    public void pause() {
        synchronized (this.f103797a) {
            try {
                f.a aVar = this.f103801e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar == aVar2) {
                    this.f103801e = f.a.PAUSED;
                    this.f103799c.pause();
                }
                if (this.f103802f == aVar2) {
                    this.f103802f = f.a.PAUSED;
                    this.f103800d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
