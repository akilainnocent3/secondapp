package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s83 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s83(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                ab8 ab8Var = (ab8) obj;
                if (ab8Var.J == ab8.a.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = ab8Var.F;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(ab8Var.I + ab8Var.H), Integer.valueOf(ab8Var.H));
                }
                return Unit.a;
        }
    }
}
