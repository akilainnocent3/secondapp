package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class o90 extends qlr implements Function0<Unit> {
    public final /* synthetic */ r90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(r90 r90Var) {
        super(0);
        this.a = r90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        w5b.c(this.a.c, null);
        return Unit.a;
    }
}
