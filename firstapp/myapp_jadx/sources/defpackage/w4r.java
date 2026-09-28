package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w4r implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w4r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(new zxq.w(false));
                break;
            default:
                m9c0 m9c0Var = (m9c0) obj;
                int i2 = 1;
                m9c0Var.f = true;
                Long lY0 = m9c0Var.y0();
                if (m9c0Var.j0) {
                    MultiplierResponse multiplierResponse = m9c0Var.x0;
                    if (multiplierResponse != null) {
                        m9c0Var.c1().B1(multiplierResponse, m9c0Var.l2(), m9c0Var.y0, m9c0Var.h2, 1, new ch00(m9c0Var, i2), lY0);
                    }
                } else {
                    m9c0Var.v0(m9c0Var.S0(), lY0);
                }
                break;
        }
        return Unit.a;
    }
}
