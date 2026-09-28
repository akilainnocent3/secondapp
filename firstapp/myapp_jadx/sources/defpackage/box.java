package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class box implements fwa {
    public final ConnectivityManager a;

    public box(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.fwa
    public final boolean a(owj0 owj0Var) {
        if (!c(owj0Var)) {
            return false;
        }
        ib5.a("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.fwa
    public final jv5 b(lxa lxaVar) {
        lxaVar.getClass();
        return hzh.a(new aox(lxaVar, this, null));
    }

    @Override // defpackage.fwa
    public final boolean c(owj0 owj0Var) {
        owj0Var.getClass();
        return owj0Var.j.a() != null;
    }
}
