package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dix implements Function1 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ dix() {
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((ifx) obj).f;
            default:
                String str = (String) obj;
                str.getClass();
                wz.a(str.equals("plus") ? "StepAmountPlusPURPLE" : "StepAmountMinusPURPLE", "Pocket Rockets", "bet");
                return Unit.a;
        }
    }

    public /* synthetic */ dix(zy10 zy10Var) {
    }
}
