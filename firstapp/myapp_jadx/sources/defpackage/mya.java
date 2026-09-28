package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mya {
    public final yb00 a;

    public mya(yb00 yb00Var) {
        yb00Var.getClass();
        this.a = yb00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        lya lyaVar;
        if (x1bVar instanceof lya) {
            lyaVar = (lya) x1bVar;
            int i = lyaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lyaVar.d = i - Integer.MIN_VALUE;
            } else {
                lyaVar = new lya(this, x1bVar);
            }
        } else {
            lyaVar = new lya(this, x1bVar);
        }
        Object objF = lyaVar.b;
        y5b y5bVar = y5b.a;
        int i2 = lyaVar.d;
        String str = CaBJCMnsV.vLCOK;
        yb00 yb00Var = this.a;
        if (i2 == 0) {
            uj50.b(objF);
            lyaVar.d = 1;
            objF = yb00Var.a.f(co20.f(str), lyaVar);
            if (objF != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = lyaVar.a;
            uj50.b(objF);
            return str2;
        }
        uj50.b(objF);
        String str3 = (String) objF;
        if (str3 != null) {
            if (StringsKt.U(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                lyaVar.a = str3;
                lyaVar.d = 2;
                return yb00Var.a.b(str, lyaVar) == y5bVar ? y5bVar : str3;
            }
        }
        return null;
    }
}
