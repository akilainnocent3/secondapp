package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ab80 extends qlr implements Function1<pb80, Unit> {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab80(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(pb80 pb80Var) {
        lb80.c(pb80Var, this.a);
        return Unit.a;
    }
}
