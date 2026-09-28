package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iea0 extends saj implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Object value;
        Object value2;
        Object value3;
        String str2 = str;
        str2.getClass();
        rea0 rea0Var = (rea0) this.receiver;
        rea0Var.getClass();
        wwd0 wwd0Var = rea0Var.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, mea0.a((mea0) value, null, null, str2, false, 55)));
        if (str2.length() < 3) {
            jvd0 jvd0Var = rea0Var.y;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            wwd0 wwd0Var2 = rea0Var.v;
            kqz kqzVar = new kqz(new gzh(new xmz.d(m2g.a)), kqz.e, kqz.f, lqz.a);
            wwd0Var2.getClass();
            wwd0Var2.k(null, kqzVar);
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, mea0.a((mea0) value3, null, null, null, false, 15)));
        } else {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, mea0.a((mea0) value2, null, null, null, true, 47)));
            jvd0 jvd0Var2 = rea0Var.y;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
            }
            rea0Var.y = rea0Var.y1(new qea0(rea0Var, str2, null));
        }
        return Unit.a;
    }
}
