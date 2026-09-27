package s;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import f0.k3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f128136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k3<p1.c, MenuItem> f128137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k3<p1.d, SubMenu> f128138n;

    public b(Context context) {
        this.f128136l = context;
    }

    public final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof p1.c)) {
            return menuItem;
        }
        p1.c cVar = (p1.c) menuItem;
        if (this.f128137m == null) {
            this.f128137m = new k3<>();
        }
        MenuItem menuItem2 = this.f128137m.get(cVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar2 = new c(this.f128136l, cVar);
        this.f128137m.put(cVar, cVar2);
        return cVar2;
    }

    public final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof p1.d)) {
            return subMenu;
        }
        p1.d dVar = (p1.d) subMenu;
        if (this.f128138n == null) {
            this.f128138n = new k3<>();
        }
        SubMenu subMenu2 = this.f128138n.get(dVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f128136l, dVar);
        this.f128138n.put(dVar, gVar);
        return gVar;
    }

    public final void g() {
        k3<p1.c, MenuItem> k3Var = this.f128137m;
        if (k3Var != null) {
            k3Var.clear();
        }
        k3<p1.d, SubMenu> k3Var2 = this.f128138n;
        if (k3Var2 != null) {
            k3Var2.clear();
        }
    }

    public final void h(int i10) {
        if (this.f128137m == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f128137m.size()) {
            if (this.f128137m.g(i11).getGroupId() == i10) {
                this.f128137m.j(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void i(int i10) {
        if (this.f128137m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f128137m.size(); i11++) {
            if (this.f128137m.g(i11).getItemId() == i10) {
                this.f128137m.j(i11);
                return;
            }
        }
    }
}
