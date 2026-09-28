package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$lotteryTabState$1$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bqq extends tje0 implements iaj<jxp, uf00<? extends jpq>, mmq, v1b<? super gsq.c>, Object> {
    public /* synthetic */ jxp a;
    public /* synthetic */ uf00 b;
    public /* synthetic */ mmq c;

    @Override // defpackage.iaj
    public final Object d(jxp jxpVar, uf00<? extends jpq> uf00Var, mmq mmqVar, v1b<? super gsq.c> v1bVar) {
        bqq bqqVar = new bqq(4, v1bVar);
        bqqVar.a = jxpVar;
        bqqVar.b = uf00Var;
        bqqVar.c = mmqVar;
        return bqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        ipq ipqVar;
        jxp jxpVar = this.a;
        uf00 uf00Var = this.b;
        mmq mmqVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Iterator<E> it = uf00Var.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((jpq) next).b);
        jpq jpqVar = (jpq) next;
        return new gsq.c(jxpVar, uf00Var, (jpqVar == null || (ipqVar = jpqVar.a) == null) ? vch0.a : ipqVar.a, mmqVar);
    }
}
