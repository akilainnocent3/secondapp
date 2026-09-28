package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class va8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bb8 bb8Var = (bb8) obj;
                if (bb8Var.G == bb8.a.b) {
                    wlb wlbVar = bb8Var.C;
                    if (wlbVar == null) {
                        Intrinsics.n("betHistoryFetchManager");
                        throw null;
                    }
                    wlbVar.invoke(Integer.valueOf(bb8Var.F + bb8Var.E), Integer.valueOf(bb8Var.E));
                }
                return Unit.a;
            default:
                return Float.valueOf(((Number) ((twd0) obj).getValue()).floatValue());
        }
    }
}
