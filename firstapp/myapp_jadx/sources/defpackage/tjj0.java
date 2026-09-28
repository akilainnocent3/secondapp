package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$requestWithdraw$1", f = "WithdrawBankV2ViewModel.kt", l = {527, 534}, m = "invokeSuspend", v = 2)
public final class tjj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mjj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjj0(mjj0 mjj0Var, v1b<? super tjj0> v1bVar) {
        super(2, v1bVar);
        this.b = mjj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tjj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tjj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14) == r2) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            mjj0 r0 = r14.b
            wwd0 r1 = r0.G
            y5b r2 = defpackage.y5b.a
            int r3 = r14.a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L14
            defpackage.uj50.b(r15)
            goto L62
        L14:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            r14 = 0
            return r14
        L1b:
            defpackage.uj50.b(r15)
            goto L2d
        L1f:
            defpackage.uj50.b(r15)
            mgb0 r15 = r0.i0
            r14.a = r5
            java.lang.Object r15 = r15.getLastAccount(r14)
            if (r15 != r2) goto L2d
            goto L61
        L2d:
            if (r15 != 0) goto L37
            ku90<com.sporty.android.common.uievent.a> r14 = r0.f
            com.sporty.android.common.uievent.b.h(r14)
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        L37:
            com.sporty.android.core.model.pocket.withdraw.WithdrawRequest r5 = r0.M1()
            if (r5 != 0) goto L40
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        L40:
            tzs$b r15 = tzs.b.a
            r1.setValue(r15)
            xqj0 r3 = r0.j0
            r15 = r4
            y300$a r4 = r0.u0
            ku90<com.sporty.android.common.uievent.a> r6 = r0.f
            ku90<spg0> r7 = r0.v
            ku90<m480> r8 = r0.y
            ku90<tng0> r9 = r0.A
            ku90<kqj0> r10 = r0.d0
            ljj0 r11 = r0.G0
            ku90<pdd0> r12 = r0.K
            r14.a = r15
            r13 = r14
            java.lang.Object r14 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r2) goto L62
        L61:
            return r2
        L62:
            tzs$a r14 = tzs.a.a
            r1.setValue(r14)
            ku90<kqj0> r14 = r0.d0
            defpackage.lqj0.a(r14)
            ku90<spg0> r14 = r0.v
            defpackage.vpg0.d(r14)
            java.lang.String r14 = ""
            r0.x1(r14)
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
