package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ax2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ax2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(yw2.e.a);
                return Unit.a;
            default:
                fgg fggVar = (fgg) obj;
                fggVar.n0 = 1;
                bo1 bo1Var = (bo1) fggVar.a;
                if (bo1Var == null) {
                    return null;
                }
                bo1Var.B1();
                return Unit.a;
        }
    }
}
