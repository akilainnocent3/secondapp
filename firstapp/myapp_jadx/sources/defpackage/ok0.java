package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ok0(zy10 zy10Var) {
        this.a = 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(!(((nk0.a) obj) instanceof qrz));
            case 1:
                String str = (String) obj;
                str.getClass();
                wz.a(str.equals("plus") ? "StepAmountPlusRED" : "StepAmountMinusRED", "Pocket Rockets", "bet");
                return Unit.a;
            default:
                return Unit.a;
        }
    }

    public /* synthetic */ ok0(int i) {
        this.a = i;
    }
}
