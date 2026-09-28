package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h71 extends saj implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Object value;
        Object objA;
        final String str2 = str;
        str2.getClass();
        final fb1 fb1Var = (fb1) this.receiver;
        fb1Var.getClass();
        fb1Var.C1(new Function1() { // from class: bb1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                twb.a aVar = (twb.a) obj;
                aVar.getClass();
                fb1 fb1Var2 = fb1Var;
                vjh0.c cVarA = fb1Var2.i.a(aVar.j, new vjh0.a.c(str2), fb1Var2.y1());
                return fb1.E1(twb.a.a(aVar, null, null, null, cVarA.a, cVarA.b, false, false, null, null, 63999));
            }
        });
        wwd0 wwd0Var = fb1Var.V;
        do {
            value = wwd0Var.getValue();
            objA = (twb) value;
            if (objA instanceof twb.b) {
                twb.b bVar = (twb.b) objA;
                vjh0.c cVarA = fb1Var.i.a(bVar.i, new vjh0.a.c(str2), fb1Var.y1());
                objA = twb.b.a(bVar, null, cVarA.a, cVarA.b, false, false, 63999);
            }
        } while (!wwd0Var.g(value, objA));
        return Unit.a;
    }
}
