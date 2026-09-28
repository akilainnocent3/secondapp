package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sh6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sh6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                xh6 xh6Var = (xh6) obj;
                return new hi6(xh6Var.a, new ei6(xh6Var), xh6Var.A);
            default:
                oh60 oh60Var = (oh60) obj;
                if (oh60Var.D == oh60.a.b) {
                    tw10 tw10Var = oh60Var.z;
                    if (tw10Var == null) {
                        Intrinsics.n("betHistoryFetchManager");
                        throw null;
                    }
                    tw10Var.invoke(Integer.valueOf(oh60Var.C + oh60Var.B), Integer.valueOf(oh60Var.B));
                }
                return Unit.a;
        }
    }
}
