package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class spr extends saj implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Object value;
        boolean zBooleanValue = bool.booleanValue();
        wwd0 wwd0Var = ((lqr) this.receiver).a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, jqr.a((jqr) value, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, false, zBooleanValue, false, false, false, false, 16252927)));
        return Unit.a;
    }
}
