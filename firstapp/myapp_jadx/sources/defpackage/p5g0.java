package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p5g0 implements Function0 {
    public final /* synthetic */ aq40 a;
    public final /* synthetic */ uf00 b;
    public final /* synthetic */ osw c;

    public /* synthetic */ p5g0(aq40 aq40Var, uf00 uf00Var, osw oswVar) {
        this.a = aq40Var;
        this.b = uf00Var;
        this.c = oswVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        aq40 aq40Var = this.a;
        float f = aq40Var.a;
        osw oswVar = this.c;
        if (f < 0.0f && oswVar.D() < b.j(this.b)) {
            oswVar.k(oswVar.D() + 1);
        } else if (aq40Var.a > 0.0f && oswVar.D() > 0) {
            oswVar.k(oswVar.D() - 1);
        }
        return Unit.a;
    }
}
