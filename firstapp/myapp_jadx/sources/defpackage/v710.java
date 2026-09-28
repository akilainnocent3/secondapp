package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v710 extends saj implements Function1<Double, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Double d) {
        ((hhp) this.receiver).set(Double.valueOf(d.doubleValue()));
        return Unit.a;
    }
}
