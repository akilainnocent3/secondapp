package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n14 extends saj implements Function1<u04, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(u04 u04Var) {
        Object value;
        Object value2;
        u04.a aVar;
        u04 u04Var2 = u04Var;
        u04Var2.getClass();
        wwd0 wwd0Var = ((s14) this.receiver).c;
        if (u04Var2 instanceof u04.a) {
            do {
                value2 = wwd0Var.getValue();
                aVar = (u04.a) u04Var2;
            } while (!wwd0Var.g(value2, q14.a((q14) value2, null, new p6e0.a(aVar.a, aVar.b), 1)));
        } else {
            if (!u04Var2.equals(u04.b.a)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, q14.a((q14) value, null, p6e0.b.a, 1)));
        }
        return Unit.a;
    }
}
