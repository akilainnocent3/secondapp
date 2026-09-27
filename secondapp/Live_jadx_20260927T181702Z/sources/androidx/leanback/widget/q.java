package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q extends h2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f12905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<WeakReference<a>> f12907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b2 f12908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i1 f12909l;

    public q(Object obj) {
        super(null);
        this.f12906i = true;
        this.f12908k = new e();
        this.f12909l = new f(this.f12908k);
        this.f12904g = obj;
        B();
    }

    public final void A(Object obj) {
        if (obj != this.f12904g) {
            this.f12904g = obj;
            t();
        }
    }

    public final void B() {
        if (this.f12904g == null) {
            throw new IllegalArgumentException("Object cannot be null");
        }
    }

    @Deprecated
    public final void h(int i10, d dVar) {
        n().w(i10, dVar);
    }

    @Deprecated
    public final void i(d dVar) {
        n().x(dVar);
    }

    public final void j(a aVar) {
        if (this.f12907j == null) {
            this.f12907j = new ArrayList<>();
        } else {
            int i10 = 0;
            while (i10 < this.f12907j.size()) {
                a aVar2 = this.f12907j.get(i10).get();
                if (aVar2 == null) {
                    this.f12907j.remove(i10);
                } else if (aVar2 == aVar) {
                    return;
                } else {
                    i10++;
                }
            }
        }
        this.f12907j.add(new WeakReference<>(aVar));
    }

    public d k(int i10) {
        i1 i1VarM = m();
        if (i1VarM == null) {
            return null;
        }
        for (int i11 = 0; i11 < i1VarM.s(); i11++) {
            d dVar = (d) i1VarM.a(i11);
            if (dVar.g(i10)) {
                return dVar;
            }
        }
        return null;
    }

    @Deprecated
    public final List<d> l() {
        return n().H();
    }

    public final i1 m() {
        return this.f12909l;
    }

    public final f n() {
        return (f) this.f12909l;
    }

    public final Drawable o() {
        return this.f12905h;
    }

    public final Object p() {
        return this.f12904g;
    }

    public boolean q() {
        return this.f12906i;
    }

    public final void r() {
        if (this.f12907j != null) {
            int i10 = 0;
            while (i10 < this.f12907j.size()) {
                a aVar = this.f12907j.get(i10).get();
                if (aVar == null) {
                    this.f12907j.remove(i10);
                } else {
                    aVar.a(this);
                    i10++;
                }
            }
        }
    }

    public final void s() {
        if (this.f12907j != null) {
            int i10 = 0;
            while (i10 < this.f12907j.size()) {
                a aVar = this.f12907j.get(i10).get();
                if (aVar == null) {
                    this.f12907j.remove(i10);
                } else {
                    aVar.b(this);
                    i10++;
                }
            }
        }
    }

    public final void t() {
        if (this.f12907j != null) {
            int i10 = 0;
            while (i10 < this.f12907j.size()) {
                a aVar = this.f12907j.get(i10).get();
                if (aVar == null) {
                    this.f12907j.remove(i10);
                } else {
                    aVar.c(this);
                    i10++;
                }
            }
        }
    }

    @Deprecated
    public final boolean u(d dVar) {
        return n().D(dVar);
    }

    public final void v(a aVar) {
        if (this.f12907j != null) {
            int i10 = 0;
            while (i10 < this.f12907j.size()) {
                a aVar2 = this.f12907j.get(i10).get();
                if (aVar2 == null) {
                    this.f12907j.remove(i10);
                } else {
                    if (aVar2 == aVar) {
                        this.f12907j.remove(i10);
                        return;
                    }
                    i10++;
                }
            }
        }
    }

    public final void w(i1 i1Var) {
        if (i1Var != this.f12909l) {
            this.f12909l = i1Var;
            if (i1Var.d() == null) {
                this.f12909l.r(this.f12908k);
            }
            r();
        }
    }

    public final void x(Context context, Bitmap bitmap) {
        this.f12905h = new BitmapDrawable(context.getResources(), bitmap);
        s();
    }

    public final void y(Drawable drawable) {
        if (this.f12905h != drawable) {
            this.f12905h = drawable;
            s();
        }
    }

    public void z(boolean z10) {
        if (z10 != this.f12906i) {
            this.f12906i = z10;
            s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {
        public void a(q qVar) {
        }

        public void b(q qVar) {
        }

        public void c(q qVar) {
        }
    }
}
