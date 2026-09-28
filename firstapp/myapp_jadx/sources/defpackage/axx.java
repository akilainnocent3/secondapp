package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class axx extends qlr implements Function0<Unit> {
    public final /* synthetic */ ywx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axx(ywx ywxVar) {
        super(0);
        this.a = ywxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ywx ywxVar = this.a;
        lc6 lc6Var = ywxVar.W;
        lc6Var.getClass();
        ywxVar.n1(lc6Var, ywxVar.V);
        return Unit.a;
    }
}
