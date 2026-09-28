package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c4j0 extends qlr implements Function1<pb80, Unit> {
    public final /* synthetic */ niv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4j0(niv nivVar) {
        super(1);
        this.a = nivVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(pb80 pb80Var) {
        b0g0.a(pb80Var, this.a);
        return Unit.a;
    }
}
