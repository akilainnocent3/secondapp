package androidx.compose.foundation.selection;

import androidx.compose.ui.d;
import defpackage.gnn;
import defpackage.kzf0;
import defpackage.psw;
import defpackage.su50;
import defpackage.xt50;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final d a(d dVar, boolean z, psw pswVar, boolean z2, su50 su50Var, Function1 function1) {
        return dVar.n(new ToggleableElement(z, pswVar, false, z2, su50Var, function1));
    }

    public static d b(d dVar, boolean z, su50 su50Var, Function1 function1) {
        return dVar.n(new ToggleableElement(z, null, true, true, su50Var, function1));
    }

    public static final d c(kzf0 kzf0Var, xt50 xt50Var, boolean z, su50 su50Var, Function0 function0) {
        if (xt50Var != null) {
            return new TriStateToggleableElement(kzf0Var, null, xt50Var, z, su50Var, function0);
        }
        if (xt50Var == null) {
            return new TriStateToggleableElement(kzf0Var, null, null, z, su50Var, function0);
        }
        b bVar = new b(xt50Var, kzf0Var, z, su50Var, function0);
        return androidx.compose.ui.c.a(d.a.b, gnn.a, bVar);
    }
}
