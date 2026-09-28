package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vn8 extends qlr implements Function0<Unit> {
    public final /* synthetic */ rn8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn8(rn8 rn8Var) {
        super(0);
        this.a = rn8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.reportFullyDrawn();
        return Unit.a;
    }
}
