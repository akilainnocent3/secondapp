package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f12361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b2 f12362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2 f12363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a2.a f12364d;

    public void a() {
        a2 a2Var = this.f12363c;
        if (a2Var != null) {
            a2Var.f(this.f12364d);
            this.f12361a.removeView(this.f12364d.f12292a);
            this.f12364d = null;
            this.f12363c = null;
        }
    }

    public final ViewGroup b() {
        return this.f12361a;
    }

    public void c(ViewGroup viewGroup, b2 b2Var) {
        a();
        this.f12361a = viewGroup;
        this.f12362b = b2Var;
    }

    public abstract void d(View view);

    public void f(Object obj) {
        i(obj);
        h(true);
    }

    public void g(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }

    public final void h(boolean z10) {
        a2.a aVar = this.f12364d;
        if (aVar != null) {
            g(aVar.f12292a, z10);
        }
    }

    public final void i(Object obj) {
        a2 a2VarA = this.f12362b.a(obj);
        a2 a2Var = this.f12363c;
        if (a2VarA != a2Var) {
            h(false);
            a();
            this.f12363c = a2VarA;
            if (a2VarA == null) {
                return;
            }
            a2.a aVarE = a2VarA.e(this.f12361a);
            this.f12364d = aVarE;
            d(aVarE.f12292a);
        } else if (a2Var == null) {
            return;
        } else {
            a2Var.f(this.f12364d);
        }
        this.f12363c.c(this.f12364d, obj);
        e(this.f12364d.f12292a);
    }

    public void j() {
        h(false);
    }

    public void e(View view) {
    }
}
