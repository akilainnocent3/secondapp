package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b050 extends saj implements Function1<ijf0, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ijf0 ijf0Var) {
        Object value;
        ijf0 ijf0Var2 = ijf0Var;
        ijf0Var2.getClass();
        s050 s050Var = (s050) this.receiver;
        s050Var.getClass();
        r95 r95Var = s050Var.e;
        String str = ijf0Var2.a.b;
        r95Var.getClass();
        str.getClass();
        if (str.length() <= 11) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            wwd0 wwd0Var = s050Var.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, l050.a((l050) value, null, ijf0Var2, null, null, true, false, null, false, false, false, 997)));
            jvd0 jvd0Var = s050Var.y;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            s050Var.y = ej5.c(o8i0.d(s050Var), null, null, new q050(s050Var, ijf0Var2, null), 3);
        }
        return Unit.a;
    }
}
