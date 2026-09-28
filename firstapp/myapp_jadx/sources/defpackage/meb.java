package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class meb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fgb b;

    public /* synthetic */ meb(fgb fgbVar, int i) {
        this.a = i;
        this.b = fgbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        fgb fgbVar = this.b;
        switch (i) {
            case 0:
                fgbVar.u0(fgbVar.S0());
                break;
            default:
                ylb0 ylb0Var = (ylb0) fgbVar;
                ylb0Var.R0().T1(true);
                ylb0Var.S0().T1(false);
                ((x5a0) ylb0Var.j1).setValue(Boolean.FALSE);
                ylb0Var.R0().R1(false);
                ylb0Var.S0().R1(false);
                break;
        }
        return Unit.a;
    }
}
