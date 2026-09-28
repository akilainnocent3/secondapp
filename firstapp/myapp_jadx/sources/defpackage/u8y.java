package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u8y extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        y9y y9yVar = (y9y) this.receiver;
        wwd0 wwd0Var = y9yVar.W;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, x8y.a((x8y) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383)));
        String str = y9yVar.O;
        if (str != null) {
            y9yVar.d.b(str);
        }
        return Unit.a;
    }
}
