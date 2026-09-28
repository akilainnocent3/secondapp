package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bgn {
    public static final Object a(Function1 function1, x1b x1bVar) {
        yfn yfnVar = (yfn) x1bVar.getContext().get(yfn.a.a);
        if (yfnVar == null) {
            return t4w.a(x1bVar.getContext()).P(function1, x1bVar);
        }
        new agn(function1, null);
        return yfnVar.b0();
    }
}
