package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y3i0 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        p4i0 p4i0Var = (p4i0) this.receiver;
        String str = (String) p4i0Var.a.b("article_id");
        if (str != null) {
            wwd0 wwd0Var = p4i0Var.e;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, o4i0.a((o4i0) value, true, null, null, false, true, n1a0.c, false, 6)));
            ej5.c(o8i0.d(p4i0Var), null, null, new q4i0(p4i0Var, str, null), 3);
            p4i0Var.x1(str);
        }
        return Unit.a;
    }
}
