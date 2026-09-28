package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class isr extends qlr implements Function1<tsr, Unit> {
    public static final isr a = new isr(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(tsr tsrVar) {
        tsrVar.T = true;
        return Unit.a;
    }
}
