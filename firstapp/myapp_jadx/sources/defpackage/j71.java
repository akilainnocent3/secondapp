package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j71 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        Object objE1;
        Object value2;
        Object objA;
        fb1 fb1Var = (fb1) this.receiver;
        fb1Var.getClass();
        cth0 cth0Var = fb1Var.v;
        wwd0 wwd0Var = fb1Var.V;
        do {
            value = wwd0Var.getValue();
            objE1 = (twb) value;
            if (objE1 instanceof twb.a) {
                twb.a aVar = (twb.a) objE1;
                cth0.a aVarA = cth0Var.a(aVar.j, fb1Var.y1());
                objE1 = fb1.E1(twb.a.a(aVar, null, null, null, aVarA.a, aVarA.b, false, !aVar.l, null, null, 59903));
            }
        } while (!wwd0Var.g(value, objE1));
        do {
            value2 = wwd0Var.getValue();
            objA = (twb) value2;
            if (objA instanceof twb.b) {
                twb.b bVar = (twb.b) objA;
                cth0.a aVarA2 = cth0Var.a(bVar.i, fb1Var.y1());
                objA = twb.b.a(bVar, null, aVarA2.a, aVarA2.b, false, !bVar.k, 59903);
            }
        } while (!wwd0Var.g(value2, objA));
        return Unit.a;
    }
}
