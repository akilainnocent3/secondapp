package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class me7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ me7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                fgb fgbVar = (fgb) obj;
                fgbVar.U1 = fgb.a.d;
                fgbVar.V1();
                break;
            case 2:
                ((Function1) obj).invoke(Boolean.TRUE);
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj;
                ylb0Var.S0().T1(true);
                ylb0Var.R0().T1(false);
                ((x5a0) ylb0Var.j1).setValue(Boolean.FALSE);
                ylb0Var.R0().R1(false);
                ylb0Var.S0().R1(false);
                break;
        }
        return Unit.a;
    }
}
