package androidx.compose.foundation;

import android.view.KeyEvent;
import defpackage.emp;
import defpackage.gnn;
import defpackage.ifn;
import defpackage.mfn;
import defpackage.olp;
import defpackage.psw;
import defpackage.qr7;
import defpackage.su50;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, psw pswVar, ifn ifnVar, boolean z, su50 su50Var, Function0 function0) {
        androidx.compose.ui.d dVarA;
        if (ifnVar instanceof mfn) {
            dVarA = new ClickableElement(pswVar, (mfn) ifnVar, false, z, null, su50Var, function0);
        } else if (ifnVar == null) {
            dVarA = new ClickableElement(pswVar, null, false, z, null, su50Var, function0);
        } else {
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.a.b;
            if (pswVar != null) {
                dVarA = g.a(aVar, pswVar, ifnVar).n(new ClickableElement(pswVar, null, false, z, null, su50Var, function0));
            } else {
                dVarA = androidx.compose.ui.c.a(aVar, gnn.a, new c(ifnVar, z, su50Var, function0));
            }
        }
        return dVar.n(dVarA);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, psw pswVar, ifn ifnVar, boolean z, su50 su50Var, Function0 function0, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            su50Var = null;
        }
        return a(dVar, pswVar, ifnVar, z2, su50Var, function0);
    }

    public static androidx.compose.ui.d c(Function0 function0) {
        return androidx.compose.ui.c.a(androidx.compose.ui.d.a.b, gnn.a, new qr7(function0));
    }

    public static androidx.compose.ui.d d(androidx.compose.ui.d dVar, boolean z, String str, su50 su50Var, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return dVar.n(new ClickableElement(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : su50Var, function0));
    }

    public static androidx.compose.ui.d e(androidx.compose.ui.d dVar, psw pswVar, Function0 function0) {
        return dVar.n(new CombinedClickableElement(pswVar, function0));
    }

    public static final boolean f(KeyEvent keyEvent) {
        long jA = emp.a(keyEvent);
        int i = olp.r;
        return olp.a(jA, olp.h) || olp.a(jA, olp.k) || olp.a(jA, olp.q) || olp.a(jA, olp.j);
    }
}
