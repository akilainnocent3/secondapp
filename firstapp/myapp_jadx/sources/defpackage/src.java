package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class src<T> {
    public final wwd0 a = xwd0.a(cdh0.b);

    public final swd0<T> a() {
        return (swd0) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(swd0 swd0Var) {
        wwd0 wwd0Var;
        Object value;
        swd0 swd0Var2;
        swd0Var.getClass();
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            swd0Var2 = (swd0) value;
            if (swd0Var2 instanceof m340 ? true : Intrinsics.g(swd0Var2, cdh0.b)) {
                swd0Var2 = swd0Var;
            } else if (swd0Var2 instanceof ioc) {
                if (swd0Var.a > swd0Var2.a) {
                    swd0Var2 = swd0Var;
                }
            } else if (!(swd0Var2 instanceof mnh)) {
                uhc.a();
                return;
            }
        } while (!wwd0Var.g(value, swd0Var2));
    }
}
