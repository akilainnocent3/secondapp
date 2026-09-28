package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class en2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fo2 fo2Var = (fo2) obj;
                if (fo2Var.L == fo2.b.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = fo2Var.H;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(fo2Var.K + fo2Var.J), Integer.valueOf(fo2Var.J));
                }
                return Unit.a;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
