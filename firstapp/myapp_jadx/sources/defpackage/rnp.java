package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rnp implements snp {
    public final ooa0 a;
    public tnp b;
    public k4i c;

    public rnp(ooa0 ooa0Var) {
        this.a = ooa0Var;
    }

    public final tnp a() {
        tnp tnpVar = this.b;
        if (tnpVar != null) {
            return tnpVar;
        }
        Intrinsics.n("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        Function1<snp, Unit> function1;
        ooa0 ooa0Var;
        if (i == 7) {
            function1 = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                function1 = a().b;
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                function1 = a().c;
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                ib5.a("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            k4i k4iVar = this.c;
            if (k4iVar != null) {
                k4iVar.c(1);
                return true;
            }
            Intrinsics.n("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (ooa0Var = this.a) == null) {
                return false;
            }
            ooa0Var.b();
            return true;
        }
        k4i k4iVar2 = this.c;
        if (k4iVar2 != null) {
            k4iVar2.c(2);
            return true;
        }
        Intrinsics.n("focusManager");
        throw null;
    }
}
