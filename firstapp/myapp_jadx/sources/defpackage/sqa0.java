package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class sqa0 implements yxd0<gng> {
    public static final sqa0 a = new sqa0();

    @Override // defpackage.yxd0
    public final int a(gng gngVar, ptu ptuVar) {
        gng gngVar2 = gngVar;
        return qtu.j(nqa0.a.d, gngVar2.a() - gngVar2.getAttributes().size()) + cyd0.b(nqa0.a.c, gngVar2.getAttributes(), ptuVar) + cyd0.e(nqa0.a.b, AnalyticsParam.EVENT_PARAM_EXCEPTION, ptuVar) + qtu.e(nqa0.a.a, gngVar2.b());
    }

    @Override // defpackage.yxd0
    public final void b(me80 me80Var, gng gngVar, ptu ptuVar) throws IOException {
        gng gngVar2 = gngVar;
        me80Var.g(nqa0.a.a, gngVar2.b());
        me80Var.P(nqa0.a.b, AnalyticsParam.EVENT_PARAM_EXCEPTION, ptuVar);
        me80Var.F(nqa0.a.c, gngVar2.getAttributes(), ptuVar);
        me80Var.V(nqa0.a.d, gngVar2.a() - gngVar2.getAttributes().size());
    }
}
