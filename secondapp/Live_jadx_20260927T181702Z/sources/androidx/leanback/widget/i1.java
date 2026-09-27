package androidx.leanback.widget;

import android.annotation.SuppressLint;
import android.database.Observable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12669d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12670a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b2 f12672c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends Observable<b> {
        public boolean a() {
            return ((Observable) this).mObservers.size() > 0;
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).b(i10, i11);
            }
        }

        public void d(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).d(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }
    }

    public i1(b2 b2Var) {
        r(b2Var);
    }

    public abstract Object a(int i10);

    public long b(int i10) {
        return -1L;
    }

    public final a2 c(Object obj) {
        b2 b2Var = this.f12672c;
        if (b2Var != null) {
            return b2Var.a(obj);
        }
        throw new IllegalStateException("Presenter selector must not be null");
    }

    public final b2 d() {
        return this.f12672c;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public final boolean e() {
        return this.f12670a.a();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean f() {
        return this.f12671b;
    }

    public boolean g() {
        return false;
    }

    public final void h() {
        this.f12670a.b();
    }

    public final void i(int i10, int i11) {
        this.f12670a.c(i10, i11);
    }

    public final void j(int i10, int i11) {
        this.f12670a.d(i10, i11);
    }

    public final void k(int i10, int i11, Object obj) {
        this.f12670a.e(i10, i11, obj);
    }

    public final void l(int i10, int i11) {
        this.f12670a.f(i10, i11);
    }

    public final void m(int i10, int i11) {
        this.f12670a.g(i10, i11);
    }

    public final void p(b bVar) {
        this.f12670a.registerObserver(bVar);
    }

    public final void q(boolean z10) {
        boolean z11 = this.f12671b != z10;
        this.f12671b = z10;
        if (z11) {
            n();
        }
    }

    public final void r(b2 b2Var) {
        if (b2Var == null) {
            throw new IllegalArgumentException("Presenter selector must not be null");
        }
        b2 b2Var2 = this.f12672c;
        boolean z10 = false;
        boolean z11 = b2Var2 != null;
        if (z11 && b2Var2 != b2Var) {
            z10 = true;
        }
        this.f12672c = b2Var;
        if (z10) {
            o();
        }
        if (z11) {
            h();
        }
    }

    public abstract int s();

    public final void t() {
        this.f12670a.unregisterAll();
    }

    public final void u(b bVar) {
        this.f12670a.unregisterObserver(bVar);
    }

    public i1(a2 a2Var) {
        r(new s2(a2Var));
    }

    public i1() {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public void b(int i10, int i11) {
            a();
        }

        public void c(int i10, int i11) {
            a();
        }

        public void d(int i10, int i11, Object obj) {
            a();
        }

        public void e(int i10, int i11) {
            a();
        }

        public void f(int i10, int i11) {
            a();
        }

        public void a() {
        }
    }

    public void n() {
    }

    public void o() {
    }
}
