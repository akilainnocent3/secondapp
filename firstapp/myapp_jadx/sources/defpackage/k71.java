package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k71 extends saj implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z;
        Object value;
        Object objA;
        boolean zBooleanValue = bool.booleanValue();
        wwd0 wwd0Var = ((fb1) this.receiver).V;
        while (true) {
            Object value2 = wwd0Var.getValue();
            Object objE1 = (twb) value2;
            if (objE1 instanceof twb.a) {
                z = zBooleanValue;
                objE1 = fb1.E1(twb.a.a((twb.a) objE1, null, null, null, null, false, z, false, null, null, 59391));
            } else {
                z = zBooleanValue;
            }
            if (wwd0Var.g(value2, objE1)) {
                break;
            }
            zBooleanValue = z;
        }
        do {
            value = wwd0Var.getValue();
            objA = (twb) value;
            if (objA instanceof twb.b) {
                boolean z2 = z;
                objA = twb.b.a((twb.b) objA, null, null, false, z2, false, 59391);
                z = z2;
            }
        } while (!wwd0Var.g(value, objA));
        return Unit.a;
    }
}
