package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hwa0 extends saj implements Function1<ijf0, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ijf0 ijf0Var) {
        Object value;
        ijf0 ijf0Var2 = ijf0Var;
        ijf0Var2.getClass();
        zwa0 zwa0Var = (zwa0) this.receiver;
        zwa0Var.getClass();
        rxo rxoVar = zwa0Var.i;
        nk0 nk0Var = ijf0Var2.a;
        String str = nk0Var.b;
        rxoVar.getClass();
        str.getClass();
        if (str.length() <= 18) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            zwa0Var.V = true;
            wwd0 wwd0Var = zwa0Var.E;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, wwa0.a((wwa0) value, null, null, ijf0Var2, false, false, 27)));
            zwa0Var.D1(nk0Var.b);
        }
        return Unit.a;
    }
}
