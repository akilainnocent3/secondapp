package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s76(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.b(((Number) ((Function0) obj2).invoke()).floatValue());
                break;
            default:
                zy10 zy10Var = (zy10) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i2 = zy10Var.t0;
                if (i2 == zy10Var.u0) {
                    zt50 zt50Var = zy10Var.b;
                    if (zt50Var != null) {
                        zt50Var.S.setCashoutAmount(iIntValue);
                    }
                } else {
                    int i3 = zy10Var.v0;
                    zt50 zt50Var2 = zy10Var.b;
                    if (i2 == i3) {
                        if (zt50Var2 != null) {
                            zt50Var2.R.setCashoutAmount(iIntValue);
                        }
                    } else if (zt50Var2 != null) {
                        zt50Var2.z.setCashoutAmount(iIntValue);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
