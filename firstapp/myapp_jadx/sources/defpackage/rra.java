package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rra implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rra(Object obj, int i) {
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
                return Unit.a;
            default:
                pl60 pl60Var = (pl60) obj;
                if (pl60Var.G == pl60.a.b) {
                    n010 n010Var = pl60Var.C;
                    if (n010Var == null) {
                        Intrinsics.n("betHistoryArchiveFetchManager");
                        throw null;
                    }
                    n010Var.invoke(Integer.valueOf(pl60Var.E + pl60Var.D), Integer.valueOf(pl60Var.D));
                }
                return Unit.a;
        }
    }
}
