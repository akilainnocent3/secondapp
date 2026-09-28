package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class imx extends oz1<nox> {
    @Override // defpackage.fwa
    public final boolean c(owj0 owj0Var) {
        owj0Var.getClass();
        return owj0Var.j.a == sox.b;
    }

    @Override // defpackage.oz1
    public final int d() {
        return 7;
    }

    @Override // defpackage.oz1
    public final boolean e(nox noxVar) {
        nox noxVar2 = noxVar;
        noxVar2.getClass();
        int i = Build.VERSION.SDK_INT;
        boolean z = noxVar2.a;
        if (i >= 26) {
            return (z && noxVar2.b) ? false : true;
        }
        return !z;
    }
}
