package r;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f123313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f123314c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, Menu menu);

        void c(b bVar);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f123313b;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f123314c;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int i10);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.f123313b = obj;
    }

    public abstract void r(int i10);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z10) {
        this.f123314c = z10;
    }
}
