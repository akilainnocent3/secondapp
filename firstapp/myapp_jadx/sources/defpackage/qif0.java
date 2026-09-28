package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qif0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qif0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ulf0 ulf0Var;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                iif0 iif0Var = (iif0) obj4;
                v5b v5bVar = (v5b) obj3;
                xdf0 xdf0Var = (xdf0) obj;
                Context context = (Context) obj2;
                boolean zBooleanValue = ((Boolean) ((x5a0) iif0Var.n).getValue()).booleanValue();
                nk0 nk0VarI = iif0Var.i();
                String str = nk0VarI != null ? nk0VarI.b : null;
                ulf0 ulf0Var2 = iif0Var.x;
                if (ulf0Var2 != null) {
                    long j = ulf0Var2.a;
                    mly mlyVar = iif0Var.b;
                    ulf0Var = new ulf0(vlf0.a(mlyVar.b((int) (j >> 32)), mlyVar.b((int) (j & 4294967295L))));
                } else {
                    ulf0Var = null;
                }
                vj10 vj10Var = iif0Var.j;
                rif0 rif0Var = new rif0(iif0Var, v5bVar, context);
                qyd0 qyd0Var = jk10.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || ulf0Var == null || vj10Var == null || !(vj10Var instanceof gk10)) {
                    rif0Var.invoke(xdf0Var);
                    if (str != null && ulf0Var != null) {
                        yx20.a(xdf0Var, context, zBooleanValue, str, ulf0Var.a);
                    }
                } else {
                    String str2 = str;
                    ((gk10) vj10Var).c(xdf0Var, str2, ulf0Var.a, rif0Var);
                    yx20.a(xdf0Var, context, zBooleanValue, str2, ulf0Var.a);
                }
                break;
            default:
                ezj0 ezj0Var = (ezj0) obj4;
                czj0 czj0Var = (czj0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.G();
                } else if (ezj0Var != null) {
                    aVar.N(-676018802);
                    l0u.c(null, null, null, false, pp8.b(-1965770480, new l6q(ezj0Var, czj0Var), aVar), aVar, 24576, 15);
                    aVar.H();
                } else {
                    aVar.N(-675752605);
                    aVar.H();
                }
                break;
        }
        return Unit.a;
    }
}
