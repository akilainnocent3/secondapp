package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dm00 extends saj implements Function1<ijf0, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ijf0 ijf0Var) {
        Object value;
        ijf0 ijf0Var2 = ijf0Var;
        ijf0Var2.getClass();
        pm00 pm00Var = (pm00) this.receiver;
        pm00Var.getClass();
        nk0 nk0Var = ijf0Var2.a;
        if (nk0Var.b.length() <= 12) {
            String str = nk0Var.b;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            wwd0 wwd0Var = pm00Var.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, hm00.a((hm00) value, null, null, null, null, null, null, null, false, false, false, ijf0Var2, null, null, null, null, null, null, null, null, 519167)));
        }
        return Unit.a;
    }
}
