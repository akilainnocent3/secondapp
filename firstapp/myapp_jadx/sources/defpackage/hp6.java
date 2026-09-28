package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hp6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hp6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lp6 lp6Var = (lp6) obj2;
                ej5.c(o8i0.d(lp6Var), null, null, new kp6(lp6Var, ((Boolean) obj).booleanValue(), null), 3);
                return Unit.a;
            case 1:
                Float f = (Float) obj;
                f.getClass();
                ((Function1) ((ytw) obj2).getValue()).invoke(f);
                return Unit.a;
            case 2:
                String str = (String) obj;
                str.getClass();
                ee<sfp> eeVar = ((h8y) obj2).J;
                if (eeVar != null) {
                    eeVar.b(new sfp(str));
                    return Unit.a;
                }
                Intrinsics.n("jumpBankLauncher");
                throw null;
            default:
                int i2 = (int) (((jxo) obj).a & 4294967295L);
                u5a0 u5a0Var = (u5a0) ((n27) obj2).k;
                if (u5a0Var.D() != i2) {
                    u5a0Var.k(i2);
                }
                return Unit.a;
        }
    }
}
