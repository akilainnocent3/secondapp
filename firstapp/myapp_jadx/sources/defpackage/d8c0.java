package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d8c0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final m9c0 m9c0Var = (m9c0) obj;
                m9c0Var.e = true;
                Long lY0 = m9c0Var.y0();
                if (m9c0Var.j0) {
                    MultiplierResponse multiplierResponse = m9c0Var.x0;
                    if (multiplierResponse != null) {
                        m9c0Var.c1().B1(multiplierResponse, m9c0Var.l2(), m9c0Var.y0, m9c0Var.h2, 0, new Function1() { // from class: y8c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                m9c0 m9c0Var2 = m9c0Var;
                                cgb.a(m9c0Var2.e1(), (String) ((x5a0) m9c0Var2.c1().v).getValue(), "cashout", (String) obj2);
                                return Unit.a;
                            }
                        }, lY0);
                    }
                } else {
                    m9c0Var.v0(m9c0Var.R0(), lY0);
                }
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
