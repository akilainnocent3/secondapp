package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class i32 {
    public final Context a;
    public nj90<tfe0, MenuItem> b;
    public nj90<cge0, SubMenu> c;

    public i32(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof tfe0)) {
            return menuItem;
        }
        tfe0 tfe0Var = (tfe0) menuItem;
        nj90<tfe0, MenuItem> nj90Var = this.b;
        if (nj90Var == null) {
            nj90Var = new nj90<>();
            this.b = nj90Var;
        }
        MenuItem menuItem2 = nj90Var.get(tfe0Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        kmv kmvVar = new kmv(this.a, tfe0Var);
        this.b.put(tfe0Var, kmvVar);
        return kmvVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof cge0)) {
            return subMenu;
        }
        cge0 cge0Var = (cge0) subMenu;
        nj90<cge0, SubMenu> nj90Var = this.c;
        if (nj90Var == null) {
            nj90Var = new nj90<>();
            this.c = nj90Var;
        }
        SubMenu subMenu2 = nj90Var.get(cge0Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        ice0 ice0Var = new ice0(this.a, cge0Var);
        this.c.put(cge0Var, ice0Var);
        return ice0Var;
    }
}
