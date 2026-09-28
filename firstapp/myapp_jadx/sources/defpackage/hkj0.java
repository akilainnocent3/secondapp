package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$initSportyPinState$1", f = "WithdrawBankViewModel.kt", l = {426}, m = "invokeSuspend", v = 2)
public final class hkj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ akj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkj0(akj0 akj0Var, v1b<? super hkj0> v1bVar) {
        super(2, v1bVar);
        this.b = akj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hkj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hkj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (kotlin.collections.a.c(com.sporty.android.core.model.service.CountryCodeName.SOUTH_AFRICA).contains(r1.a) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            akj0 r0 = r6.b
            y300$a r1 = r0.r0
            y5b r2 = defpackage.y5b.a
            int r3 = r6.a
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L18
            if (r3 != r5) goto L12
            defpackage.uj50.b(r7)
            goto L4c
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r4
        L18:
            defpackage.uj50.b(r7)
            boolean r7 = r1.q()
            if (r7 == 0) goto L94
            boolean r7 = r0.M0
            if (r7 != 0) goto L94
            boolean r7 = defpackage.q8d0.b
            if (r7 != 0) goto L3b
            r1.getClass()
            com.sporty.android.core.model.service.CountryCodeName r7 = com.sporty.android.core.model.service.CountryCodeName.SOUTH_AFRICA
            java.util.List r7 = kotlin.collections.a.c(r7)
            com.sporty.android.core.model.service.CountryCodeName r1 = r1.a
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L3b
            goto L94
        L3b:
            lyz r7 = r0.m0
            pu0$c r1 = pu0.c.a
            lyh r7 = r7.i0(r1)
            r6.a = r5
            java.lang.Object r7 = defpackage.bm50.p(r7, r6)
            if (r7 != r2) goto L4c
            return r2
        L4c:
            lk50 r7 = (defpackage.lk50) r7
            boolean r6 = r7 instanceof lk50.c
            r1 = 3
            if (r6 == 0) goto L70
            lk50$c r7 = (lk50.c) r7
            T r6 = r7.a
            com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo r6 = (com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo) r6
            com.sporty.android.core.model.security.sportypin.SportyPinStatus r6 = r6.getSportyPinStatus()
            com.sporty.android.core.model.security.sportypin.SportyPinStatus r7 = com.sporty.android.core.model.security.sportypin.SportyPinStatus.Disabled
            if (r6 != r7) goto L8b
            int r6 = defpackage.akj0.O0
            et7 r6 = defpackage.o8i0.d(r0)
            lkj0 r7 = new lkj0
            r7.<init>(r0, r4)
            defpackage.ej5.c(r6, r4, r4, r7, r1)
            goto L8b
        L70:
            boolean r6 = r7 instanceof lk50.a
            if (r6 == 0) goto L83
            int r6 = defpackage.akj0.O0
            et7 r6 = defpackage.o8i0.d(r0)
            lkj0 r7 = new lkj0
            r7.<init>(r0, r4)
            defpackage.ej5.c(r6, r4, r4, r7, r1)
            goto L8b
        L83:
            lk50$b r6 = lk50.b.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.g(r7, r6)
            if (r6 == 0) goto L90
        L8b:
            r0.M0 = r5
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L90:
            defpackage.uhc.a()
            return r4
        L94:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
