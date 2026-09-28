package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class neb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ neb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((x5a0) ((fgb) obj).F1).setValue(Boolean.FALSE);
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj;
                ylb0Var.p1 = 2;
                ul2 ul2VarS0 = ylb0Var.S0();
                boolean zBooleanValue = ((Boolean) ((x5a0) ylb0Var.N2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) ylb0Var.T2).getValue();
                ylb0Var.Y2(ul2VarS0, zBooleanValue, num != null ? num.intValue() : 0);
                break;
        }
        return Unit.a;
    }
}
