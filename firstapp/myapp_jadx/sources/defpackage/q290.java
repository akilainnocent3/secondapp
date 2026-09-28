package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q290 extends qlr implements Function1<tcf, Unit> {
    public final /* synthetic */ wsr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q290(wsr wsrVar) {
        super(1);
        this.a = wsrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(tcf tcfVar) {
        this.a.b2();
        return Unit.a;
    }
}
