package lc;

import androidx.annotation.Nullable;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class l implements f, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final f f103858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f103859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f103860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f103861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a0("requestLock")
    public f.a f103862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a0("requestLock")
    public f.a f103863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a0("requestLock")
    public boolean f103864g;

    public l(Object obj, @Nullable f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f103862e = aVar;
        this.f103863f = aVar;
        this.f103859b = obj;
        this.f103858a = fVar;
    }

    @a0("requestLock")
    private boolean k() {
        f fVar = this.f103858a;
        return fVar == null || fVar.d(this);
    }

    @a0("requestLock")
    private boolean l() {
        f fVar = this.f103858a;
        return fVar == null || fVar.i(this);
    }

    @a0("requestLock")
    private boolean m() {
        f fVar = this.f103858a;
        return fVar == null || fVar.c(this);
    }

    @Override // lc.f, lc.e
    public boolean a() {
        boolean z10;
        synchronized (this.f103859b) {
            try {
                z10 = this.f103861d.a() || this.f103860c.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.f
    public void b(e eVar) {
        synchronized (this.f103859b) {
            try {
                if (!eVar.equals(this.f103860c)) {
                    this.f103863f = f.a.FAILED;
                    return;
                }
                this.f103862e = f.a.FAILED;
                f fVar = this.f103858a;
                if (fVar != null) {
                    fVar.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lc.f
    public boolean c(e eVar) {
        boolean z10;
        synchronized (this.f103859b) {
            try {
                z10 = m() && (eVar.equals(this.f103860c) || this.f103862e != f.a.SUCCESS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.e
    public void clear() {
        synchronized (this.f103859b) {
            this.f103864g = false;
            f.a aVar = f.a.CLEARED;
            this.f103862e = aVar;
            this.f103863f = aVar;
            this.f103861d.clear();
            this.f103860c.clear();
        }
    }

    @Override // lc.f
    public boolean d(e eVar) {
        boolean z10;
        synchronized (this.f103859b) {
            try {
                z10 = k() && eVar.equals(this.f103860c) && this.f103862e != f.a.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.e
    public boolean e() {
        boolean z10;
        synchronized (this.f103859b) {
            z10 = this.f103862e == f.a.CLEARED;
        }
        return z10;
    }

    @Override // lc.e
    public boolean f() {
        boolean z10;
        synchronized (this.f103859b) {
            z10 = this.f103862e == f.a.SUCCESS;
        }
        return z10;
    }

    @Override // lc.f
    public void g(e eVar) {
        synchronized (this.f103859b) {
            try {
                if (eVar.equals(this.f103861d)) {
                    this.f103863f = f.a.SUCCESS;
                    return;
                }
                this.f103862e = f.a.SUCCESS;
                f fVar = this.f103858a;
                if (fVar != null) {
                    fVar.g(this);
                }
                if (!this.f103863f.g()) {
                    this.f103861d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lc.f
    public f getRoot() {
        f root;
        synchronized (this.f103859b) {
            try {
                f fVar = this.f103858a;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // lc.e
    public boolean h(e eVar) {
        if (eVar instanceof l) {
            l lVar = (l) eVar;
            if (this.f103860c != null ? this.f103860c.h(lVar.f103860c) : lVar.f103860c == null) {
                if (this.f103861d == null) {
                    if (lVar.f103861d == null) {
                        return true;
                    }
                } else if (this.f103861d.h(lVar.f103861d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // lc.f
    public boolean i(e eVar) {
        boolean z10;
        synchronized (this.f103859b) {
            try {
                z10 = l() && eVar.equals(this.f103860c) && !a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // lc.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f103859b) {
            z10 = this.f103862e == f.a.RUNNING;
        }
        return z10;
    }

    @Override // lc.e
    public void j() {
        synchronized (this.f103859b) {
            try {
                this.f103864g = true;
                try {
                    if (this.f103862e != f.a.SUCCESS) {
                        f.a aVar = this.f103863f;
                        f.a aVar2 = f.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f103863f = aVar2;
                            this.f103861d.j();
                        }
                    }
                    if (this.f103864g) {
                        f.a aVar3 = this.f103862e;
                        f.a aVar4 = f.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f103862e = aVar4;
                            this.f103860c.j();
                        }
                    }
                    this.f103864g = false;
                } catch (Throwable th2) {
                    this.f103864g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void n(e eVar, e eVar2) {
        this.f103860c = eVar;
        this.f103861d = eVar2;
    }

    @Override // lc.e
    public void pause() {
        synchronized (this.f103859b) {
            try {
                if (!this.f103863f.g()) {
                    this.f103863f = f.a.PAUSED;
                    this.f103861d.pause();
                }
                if (!this.f103862e.g()) {
                    this.f103862e = f.a.PAUSED;
                    this.f103860c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
