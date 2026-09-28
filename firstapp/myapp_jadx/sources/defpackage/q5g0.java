package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class q5g0 implements PointerInputEventHandler {
    public final /* synthetic */ uf00<t5g0> a;
    public final /* synthetic */ osw b;

    public q5g0(uf00<t5g0> uf00Var, osw oswVar) {
        this.a = uf00Var;
        this.b = oswVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        aq40 aq40Var = new aq40();
        wyb0 wyb0Var = new wyb0(aq40Var, 1);
        p5g0 p5g0Var = new p5g0(aq40Var, this.a, this.b);
        goq goqVar = new goq(1, aq40Var);
        float f = y8f.a;
        Object objB = dqi.b(u020Var, new r8f(wyb0Var, goqVar, p5g0Var, new y7f(0), null), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
