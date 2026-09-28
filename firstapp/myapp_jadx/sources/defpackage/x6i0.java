package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class x6i0 extends qlr implements Function0<Unit> {
    public final /* synthetic */ s9s a;
    public final /* synthetic */ w6i0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6i0(s9s s9sVar, w6i0 w6i0Var) {
        super(0);
        this.a = s9sVar;
        this.b = w6i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.d(this.b);
        return Unit.a;
    }
}
