package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qdc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qdc(Object obj, int i) {
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
                break;
            default:
                x7c0 x7c0Var = (x7c0) obj;
                Long lY0 = x7c0Var.y0();
                if (x7c0Var.j0) {
                    MultiplierResponse multiplierResponse = x7c0Var.x0;
                    if (multiplierResponse != null) {
                        x7c0Var.c1().B1(multiplierResponse, x7c0Var.l2(), x7c0Var.y0, x7c0Var.h2, 1, new a7h(x7c0Var, 1), lY0);
                    }
                } else {
                    x7c0Var.v0(x7c0Var.S0(), lY0);
                }
                break;
        }
        return Unit.a;
    }
}
