package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zo70 extends qlr implements Function1<bp70, Comparable<?>> {
    public static final zo70 a = new zo70(1);

    @Override // kotlin.jvm.functions.Function1
    public final Comparable<?> invoke(bp70 bp70Var) {
        return Integer.valueOf(bp70Var.c.b());
    }
}
