package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class uox extends oz1<nox> {
    @Override // defpackage.fwa
    public final boolean c(owj0 owj0Var) {
        owj0Var.getClass();
        sox soxVar = owj0Var.j.a;
        if (soxVar != sox.c) {
            return Build.VERSION.SDK_INT >= 30 && soxVar == sox.f;
        }
        return true;
    }

    @Override // defpackage.oz1
    public final int d() {
        return 7;
    }

    @Override // defpackage.oz1
    public final boolean e(nox noxVar) {
        nox noxVar2 = noxVar;
        noxVar2.getClass();
        return !noxVar2.a || noxVar2.c;
    }
}
