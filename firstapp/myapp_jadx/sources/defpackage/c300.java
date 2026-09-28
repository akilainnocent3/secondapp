package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c300 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                y200 y200Var = (y200) obj;
                y200Var.getClass();
                return y200Var.j();
            default:
                String str = (String) obj;
                str.getClass();
                wz.a("BetStepClicked", "Sporty Hero", "1", str);
                return Unit.a;
        }
    }
}
