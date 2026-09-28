package defpackage;

import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity$initViewModel$8", f = "TradingActivity.kt", l = {446, 452}, m = "invokeSuspend", v = 2)
public final class bpg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ TradingActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpg0(TradingActivity tradingActivity, v1b<? super bpg0> v1bVar) {
        super(2, v1bVar);
        this.b = tradingActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bpg0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bpg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r1.c(r3, r7, r6) == r0) goto L26;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L13
            defpackage.uj50.b(r7)
            goto L6a
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L19:
            defpackage.uj50.b(r7)
            goto L3a
        L1d:
            defpackage.uj50.b(r7)
            int r7 = com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity.X
            qpg0 r7 = r3.A1()
            t990 r7 = r7.e
            uwd0 r7 = r7.a()
            f1i r1 = new f1i
            r1.<init>(r7)
            r6.a = r5
            java.lang.Object r7 = defpackage.s0i.a(r1, r6)
            if (r7 != r0) goto L3a
            goto L63
        L3a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6a
            log0 r7 = r3.b
            if (r7 == 0) goto L64
            int r7 = r7.ordinal()
            if (r7 == 0) goto L55
            if (r7 != r5) goto L51
            vtp r7 = defpackage.vtp.WITHDRAW_PAGE
            goto L57
        L51:
            defpackage.uhc.a()
            return r2
        L55:
            vtp r7 = defpackage.vtp.DEPOSIT_PAGE
        L57:
            tta r1 = r3.getConfirmNameDialogLauncher()
            r6.a = r4
            java.lang.Object r6 = r1.c(r3, r7, r6)
            if (r6 != r0) goto L6a
        L63:
            return r0
        L64:
            java.lang.String r6 = "tradeType"
            kotlin.jvm.internal.Intrinsics.n(r6)
            throw r2
        L6a:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
