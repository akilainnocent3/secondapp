package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class am00 extends saj implements Function1<ijf0, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ijf0 ijf0Var) {
        pm00 pm00Var;
        ijf0 ijf0Var2 = ijf0Var;
        ijf0Var2.getClass();
        pm00 pm00Var2 = (pm00) this.receiver;
        pm00Var2.getClass();
        l6a0 l6a0Var = pm00Var2.e;
        String str = ijf0Var2.a.b;
        l6a0Var.getClass();
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return Unit.a;
            }
        }
        if (str.length() <= 8) {
            wwd0 wwd0Var = pm00Var2.a;
            while (true) {
                Object value = wwd0Var.getValue();
                wwd0 wwd0Var2 = wwd0Var;
                pm00Var = pm00Var2;
                if (wwd0Var2.g(value, hm00.a((hm00) value, null, null, null, null, ijf0Var2, null, "", true, false, false, null, null, null, null, null, null, null, null, null, 524047))) {
                    break;
                }
                wwd0Var = wwd0Var2;
                pm00Var2 = pm00Var;
            }
            jvd0 jvd0Var = pm00Var.D;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            pm00Var.D = ej5.c(o8i0.d(pm00Var), null, null, new om00(pm00Var, ijf0Var2, null), 3);
        }
        return Unit.a;
    }
}
