package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.b;
import androidx.camera.core.e;
import defpackage.ir60;
import defpackage.jan;
import defpackage.m4f0;
import defpackage.ut90;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements jan {
    public final jan d;
    public final Surface e;
    public m4f0 f;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public final ir60 g = new b.a() { // from class: ir60
        @Override // androidx.camera.core.b.a
        public final void g(b bVar) {
            m4f0 m4f0Var;
            e eVar = this.a;
            synchronized (eVar.a) {
                try {
                    int i = eVar.b - 1;
                    eVar.b = i;
                    if (eVar.c && i == 0) {
                        eVar.close();
                    }
                    m4f0Var = eVar.f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (m4f0Var != null) {
                m4f0Var.g(bVar);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [ir60] */
    public e(jan janVar) {
        this.d = janVar;
        this.e = janVar.getSurface();
    }

    @Override // defpackage.jan
    public final c a() {
        ut90 ut90Var;
        synchronized (this.a) {
            c cVarA = this.d.a();
            if (cVarA != null) {
                this.b++;
                ut90Var = new ut90(cVarA);
                ut90Var.d(this.g);
            } else {
                ut90Var = null;
            }
        }
        return ut90Var;
    }

    @Override // defpackage.jan
    public final int b() {
        int iB;
        synchronized (this.a) {
            iB = this.d.b();
        }
        return iB;
    }

    @Override // defpackage.jan
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.d.c();
        }
        return iC;
    }

    @Override // defpackage.jan
    public final void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jan
    public final int d() {
        int iD;
        synchronized (this.a) {
            iD = this.d.d();
        }
        return iD;
    }

    @Override // defpackage.jan
    public final void e() {
        synchronized (this.a) {
            this.d.e();
        }
    }

    @Override // defpackage.jan
    public final int f() {
        int iF;
        synchronized (this.a) {
            iF = this.d.f();
        }
        return iF;
    }

    public final void g() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.d.e();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jan
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.d.getSurface();
        }
        return surface;
    }

    @Override // defpackage.jan
    public final void h(final jan.a aVar, Executor executor) {
        synchronized (this.a) {
            this.d.h(new jan.a() { // from class: hr60
                @Override // jan.a
                public final void a(jan janVar) {
                    aVar.a(this.a);
                }
            }, executor);
        }
    }

    @Override // defpackage.jan
    public final c i() {
        ut90 ut90Var;
        synchronized (this.a) {
            c cVarI = this.d.i();
            if (cVarI != null) {
                this.b++;
                ut90Var = new ut90(cVarI);
                ut90Var.d(this.g);
            } else {
                ut90Var = null;
            }
        }
        return ut90Var;
    }
}
