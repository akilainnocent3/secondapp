package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class cnx extends oz1<nox> {
    public static final String b = jgt.g("NetworkMeteredCtrlr");

    @Override // defpackage.fwa
    public final boolean c(owj0 owj0Var) {
        owj0Var.getClass();
        return owj0Var.j.a == sox.e;
    }

    @Override // defpackage.oz1
    public final int d() {
        return 7;
    }

    @Override // defpackage.oz1
    public final boolean e(nox noxVar) {
        nox noxVar2 = noxVar;
        noxVar2.getClass();
        boolean z = noxVar2.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && noxVar2.c) ? false : true;
        }
        jgt.e().a(b, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z;
    }
}
