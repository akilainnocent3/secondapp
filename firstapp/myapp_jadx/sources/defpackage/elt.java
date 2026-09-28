package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class elt extends qlr implements Function0<Unit> {
    public final /* synthetic */ blt a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elt(blt bltVar, long j) {
        super(0);
        this.a = bltVar;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ykt yktVarX1 = this.a.f.a().x1();
        yktVarX1.getClass();
        yktVarX1.d0(this.b);
        return Unit.a;
    }
}
