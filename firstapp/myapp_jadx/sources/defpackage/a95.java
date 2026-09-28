package defpackage;

import com.sporty.android.core.model.loyalty.ParticipateMissionRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a95 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        d95 d95Var = (d95) this.receiver;
        d85 d85Var = ((c95) d95Var.y.getValue()).c;
        d85.a aVar = d85Var instanceof d85.a ? (d85.a) d85Var : null;
        if (aVar != null) {
            g85 g85Var = aVar.a;
            if (g85Var.e && !aVar.b) {
                d95Var.i.a.a(ts40.s.a, k00.d);
                etz etzVar = d95Var.b;
                ParticipateMissionRequest participateMissionRequest = new ParticipateMissionRequest(String.valueOf(g85Var.a));
                etzVar.getClass();
                kzh.d(new g1i(etzVar.a.b(participateMissionRequest), new e95(d95Var, aVar, null)), o8i0.d(d95Var));
            }
        }
        return Unit.a;
    }
}
