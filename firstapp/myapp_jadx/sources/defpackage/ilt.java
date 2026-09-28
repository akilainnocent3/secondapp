package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ilt extends qlr implements Function1<tsr, Unit> {
    public static final ilt a = new ilt(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(tsr tsrVar) {
        tsrVar.i = true;
        return Unit.a;
    }
}
