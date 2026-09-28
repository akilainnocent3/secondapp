package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x290 extends qlr implements Function1<y290, Unit> {
    public final /* synthetic */ y290 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x290(y290 y290Var) {
        super(1);
        this.a = y290Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y290 y290Var) {
        this.a.h();
        return Unit.a;
    }
}
