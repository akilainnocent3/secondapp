package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zwx extends qlr implements Function2<lc6, v6l, Unit> {
    public final /* synthetic */ ywx a;
    public final /* synthetic */ axx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwx(ywx ywxVar, axx axxVar) {
        super(2);
        this.a = ywxVar;
        this.b = axxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(lc6 lc6Var, v6l v6lVar) {
        lc6 lc6Var2 = lc6Var;
        v6l v6lVar2 = v6lVar;
        ywx ywxVar = this.a;
        tsr tsrVar = ywxVar.E;
        if (tsrVar.i()) {
            ywxVar.W = lc6Var2;
            ywxVar.V = v6lVar2;
            xsr.a(tsrVar).getSnapshotObserver().a(ywxVar, ywx.d0, this.b);
            ywxVar.Z = false;
        } else {
            ywxVar.Z = true;
        }
        return Unit.a;
    }
}
