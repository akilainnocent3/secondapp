package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class sdc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sdc(Object obj, int i) {
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
            default:
                x7c0 x7c0Var = (x7c0) obj;
                x7c0Var.p1 = 2;
                ul2 ul2VarS0 = x7c0Var.S0();
                boolean zBooleanValue = ((Boolean) ((x5a0) x7c0Var.y2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) x7c0Var.z2).getValue();
                x7c0Var.Y2(ul2VarS0, zBooleanValue, num != null ? num.intValue() : 0);
                break;
        }
        return Unit.a;
    }
}
