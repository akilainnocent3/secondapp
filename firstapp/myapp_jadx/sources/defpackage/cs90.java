package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class cs90 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(ss90.c.a.a);
                break;
            default:
                final vad0 vad0Var = (vad0) obj;
                vad0Var.e = true;
                if (vad0Var.j0) {
                    MultiplierResponse multiplierResponse = vad0Var.x0;
                    if (multiplierResponse != null) {
                        vad0Var.c1().B1(multiplierResponse, vad0Var.l2(), vad0Var.y0, vad0Var.h2, 0, new Function1() { // from class: bad0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                vad0 vad0Var2 = vad0Var;
                                cgb.a(vad0Var2.e1(), (String) ((x5a0) vad0Var2.c1().v).getValue(), "cashout", (String) obj2);
                                return Unit.a;
                            }
                        }, null);
                    }
                } else {
                    vad0Var.v0(vad0Var.R0(), null);
                }
                break;
        }
        return Unit.a;
    }
}
