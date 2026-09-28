package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g71 extends saj implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Object value;
        Object objA;
        String str2 = str;
        str2.getClass();
        fb1 fb1Var = (fb1) this.receiver;
        fb1Var.getClass();
        fb1Var.C1(new ab1(0, fb1Var, str2));
        wwd0 wwd0Var = fb1Var.V;
        do {
            value = wwd0Var.getValue();
            objA = (twb) value;
            if (objA instanceof twb.b) {
                twb.b bVar = (twb.b) objA;
                objA = twb.b.a(bVar, null, fb1Var.i.a(bVar.i, new vjh0.a.C1215a(str2), fb1Var.y1()).a, false, false, false, 65023);
            }
        } while (!wwd0Var.g(value, objA));
        return Unit.a;
    }
}
