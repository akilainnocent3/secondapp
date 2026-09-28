package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ksz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ksz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((y.a) obj).s((y) obj2, 0, 0, 0.0f);
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    q1c0Var.V0();
                    q1c0Var.getChildFragmentManager().a0();
                } else {
                    q1c0Var.Z0();
                }
                break;
        }
        return Unit.a;
    }
}
