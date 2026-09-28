package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$nameUpdateWithCertStatus$1", f = "TxListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q7h0 extends tje0 implements iaj<m7l, Boolean, zsp, v1b<? super fex>, Object> {
    public /* synthetic */ m7l a;
    public /* synthetic */ boolean b;
    public /* synthetic */ zsp c;

    @Override // defpackage.iaj
    public final Object d(m7l m7lVar, Boolean bool, zsp zspVar, v1b<? super fex> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        q7h0 q7h0Var = new q7h0(4, v1bVar);
        q7h0Var.a = m7lVar;
        q7h0Var.b = zBooleanValue;
        q7h0Var.c = zspVar;
        return q7h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        m7l m7lVar = this.a;
        boolean z = this.b;
        zsp zspVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return ((m7lVar instanceof m7l.e) && z) ? new fex(zspVar, m7l.c.a) : new fex(zspVar, m7lVar);
    }
}
