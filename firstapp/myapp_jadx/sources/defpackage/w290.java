package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class w290 extends qlr implements Function0<Unit> {
    public final /* synthetic */ y290 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w290(y290 y290Var) {
        super(0);
        this.a = y290Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.d();
        return Unit.a;
    }
}
