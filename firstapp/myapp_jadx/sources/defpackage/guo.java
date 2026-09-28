package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class guo implements auo {
    public final zi7 a;
    public final zto b;
    public final iuo c;
    public vtw<z7e> d;
    public vtw<com.sporty.android.common.uievent.a> e;
    public vtw<spg0> f;
    public final ku90<Unit> i = new ku90<>();
    public final wwd0 v = xwd0.a(xi7.b.a);

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.manager.InsufficientFundsUiManagerImpl", f = "InsufficientFundsUiManagerImpl.kt", l = {100, 105, 110}, m = "resolveInsufficientFunds", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return guo.this.E0(null, null, this);
        }
    }

    public guo(zi7 zi7Var, zto ztoVar, iuo iuoVar) {
        this.a = zi7Var;
        this.b = ztoVar;
        this.c = iuoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        if (defpackage.gi8.a(r8, r10, r7, r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e0, code lost:
    
        if (defpackage.gi8.b(r8, r10, r7, r0) == r1) goto L70;
     */
    @Override // defpackage.auo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E0(defpackage.xi7 r8, com.sporty.android.core.model.pocket.common.ChannelAsset.Channel r9, defpackage.v1b<? super defpackage.ds> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guo.E0(xi7, com.sporty.android.core.model.pocket.common.ChannelAsset$Channel, v1b):java.lang.Object");
    }

    @Override // defpackage.auo
    public final uwd0<xi7> U() {
        return e1i.b(this.v);
    }

    @Override // defpackage.auo
    public final void g0() {
        this.i.a(Unit.a);
    }

    @Override // defpackage.auo
    public final void n(vtw vtwVar, vtw vtwVar2, v340 v340Var, v340 v340Var2, wwd0 wwd0Var, vtw vtwVar3, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        vtwVar3.getClass();
        this.e = vtwVar;
        this.d = vtwVar2;
        this.f = vtwVar3;
        kzh.d(new g1i(r0i.d(r1i.b(new f1i(v340Var2), new f1i(wwd0Var), new buo(v340Var), new xzh(this.i, new cuo(2, null)), new duo(5, null)), new euo(this, null)), new fuo(this, null)), et7Var);
    }
}
