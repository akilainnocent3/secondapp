package androidx.leanback.app;

import androidx.leanback.widget.h2;
import androidx.leanback.widget.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class w extends i1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11870h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f11871i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f11872j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f11873k = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f11874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i1.b f11876g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends i1.b {
        public a() {
        }

        @Override // androidx.leanback.widget.i1.b
        public void a() {
            w.this.z();
            w.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends i1.b {
        public b() {
        }

        @Override // androidx.leanback.widget.i1.b
        public void a() {
            w.this.z();
            g(16, -1, -1);
        }

        @Override // androidx.leanback.widget.i1.b
        public void c(int i10, int i11) {
            int i12 = w.this.f11875f;
            if (i10 <= i12) {
                g(2, i10, Math.min(i11, (i12 - i10) + 1));
            }
        }

        @Override // androidx.leanback.widget.i1.b
        public void e(int i10, int i11) {
            w wVar = w.this;
            int i12 = wVar.f11875f;
            if (i10 <= i12) {
                wVar.f11875f = i12 + i11;
                g(4, i10, i11);
                return;
            }
            wVar.z();
            int i13 = w.this.f11875f;
            if (i13 > i12) {
                g(4, i12 + 1, i13 - i12);
            }
        }

        @Override // androidx.leanback.widget.i1.b
        public void f(int i10, int i11) {
            int i12 = (i10 + i11) - 1;
            w wVar = w.this;
            int i13 = wVar.f11875f;
            if (i12 < i13) {
                wVar.f11875f = i13 - i11;
                g(8, i10, i11);
                return;
            }
            wVar.z();
            int i14 = w.this.f11875f;
            int i15 = i13 - i14;
            if (i15 > 0) {
                g(8, Math.min(i14 + 1, i10), i15);
            }
        }

        public void g(int i10, int i11, int i12) {
            w.this.y(i10, i11, i12);
        }
    }

    public w(i1 i1Var) {
        super(i1Var.d());
        this.f11874e = i1Var;
        z();
        if (i1Var.g()) {
            this.f11876g = new b();
        } else {
            this.f11876g = new a();
        }
        w();
    }

    @Override // androidx.leanback.widget.i1
    public Object a(int i10) {
        return this.f11874e.a(i10);
    }

    @Override // androidx.leanback.widget.i1
    public int s() {
        return this.f11875f + 1;
    }

    public void w() {
        z();
        this.f11874e.p(this.f11876g);
    }

    public void x() {
        this.f11874e.u(this.f11876g);
    }

    public void y(int i10, int i11, int i12) {
        if (i10 == 2) {
            j(i11, i12);
            return;
        }
        if (i10 == 4) {
            l(i11, i12);
            return;
        }
        if (i10 == 8) {
            m(i11, i12);
        } else {
            if (i10 == 16) {
                h();
                return;
            }
            throw new IllegalArgumentException("Invalid event type " + i10);
        }
    }

    public void z() {
        this.f11875f = -1;
        for (int iS = this.f11874e.s() - 1; iS >= 0; iS--) {
            if (((h2) this.f11874e.a(iS)).d()) {
                this.f11875f = iS;
                return;
            }
        }
    }
}
