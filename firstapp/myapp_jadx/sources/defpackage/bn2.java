package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bn2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ bn2(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                fo2 fo2Var = (fo2) onCreateContextMenuListener;
                if (fo2Var.M == fo2.b.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = fo2Var.I;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryArchiveFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(fo2Var.K + fo2Var.J), Integer.valueOf(fo2Var.J));
                }
                return Unit.a;
            default:
                ((qub0) onCreateContextMenuListener).e2();
                return Unit.a;
        }
    }
}
