package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ohd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ohd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tef0) obj).close();
                break;
            default:
                vad0 vad0Var = (vad0) obj;
                vad0Var.p1 = 1;
                ul2 ul2VarR0 = vad0Var.R0();
                boolean zBooleanValue = ((Boolean) ((x5a0) vad0Var.y2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) vad0Var.A2).getValue();
                vad0Var.Y2(ul2VarR0, zBooleanValue, num != null ? num.intValue() : 0);
                break;
        }
        return Unit.a;
    }
}
