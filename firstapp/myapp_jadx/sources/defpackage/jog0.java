package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalUpstreamSmsViewModel$next$1", f = "TradeAdditionalUpstreamSmsViewModel.kt", l = {72, 77, 89}, m = "invokeSuspend", v = 2)
public final class jog0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iog0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jog0(String str, String str2, iog0 iog0Var, v1b<? super jog0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = str2;
        this.d = iog0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jog0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jog0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r2.a.emit(r0, r22) == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (r2.a.emit(r0, r22) == r4) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            iog0 r0 = r1.d
            ku90<com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult> r2 = r0.w
            wwd0 r3 = r0.i
            y5b r4 = defpackage.y5b.a
            int r5 = r1.a
            r6 = 16383(0x3fff, float:2.2957E-41)
            r7 = 0
            r8 = 3
            r9 = 1
            r10 = 2
            r11 = 0
            if (r5 == 0) goto L31
            if (r5 == r9) goto L2d
            if (r5 == r10) goto L25
            if (r5 != r8) goto L1f
            defpackage.uj50.b(r23)
            goto L82
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r11
        L25:
            defpackage.uj50.b(r23)     // Catch: java.lang.Throwable -> L2b
            r0 = r23
            goto L63
        L2b:
            r0 = move-exception
            goto L6a
        L2d:
            defpackage.uj50.b(r23)
            goto L9e
        L31:
            defpackage.uj50.b(r23)
            java.lang.String r5 = r1.b
            if (r5 == 0) goto L85
            java.lang.String r5 = r1.c
            if (r5 != 0) goto L3d
            goto L85
        L3d:
            c330$b r5 = c330.b.a
            r3.setValue(r5)
            sr10 r0 = r0.a     // Catch: java.lang.Throwable -> L2b
            com.sporty.android.core.model.pocket.common.TradeAdditionalRequest r12 = new com.sporty.android.core.model.pocket.common.TradeAdditionalRequest     // Catch: java.lang.Throwable -> L2b
            java.lang.String r14 = r1.b     // Catch: java.lang.Throwable -> L2b
            java.lang.String r15 = r1.c     // Catch: java.lang.Throwable -> L2b
            r20 = 120(0x78, float:1.68E-43)
            r21 = 0
            r13 = 2
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L2b
            r1.a = r10     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.p0(r12, r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 != r4) goto L63
            goto L9d
        L63:
            com.sporty.android.common.network.data.BaseResponse r0 = (com.sporty.android.common.network.data.BaseResponse) r0     // Catch: java.lang.Throwable -> L2b
            com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult r0 = defpackage.vmg0.a(r0)     // Catch: java.lang.Throwable -> L2b
            goto L74
        L6a:
            itf0$a r5 = defpackage.itf0.a
            r5.e(r0)
            com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult r0 = new com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult
            r0.<init>(r11, r6)
        L74:
            defpackage.bkj0.a(r7, r11, r3, r11)
            r1.a = r8
            b390 r2 = r2.a
            java.lang.Object r0 = r2.emit(r0, r1)
            if (r0 != r4) goto L82
            goto L9d
        L82:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        L85:
            itf0$a r0 = defpackage.itf0.a
            java.lang.String r3 = "tradeId or smsCode is null, unexpected."
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r0.d(r3, r5)
            com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult r0 = new com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult
            r0.<init>(r11, r6)
            r1.a = r9
            b390 r2 = r2.a
            java.lang.Object r0 = r2.emit(r0, r1)
            if (r0 != r4) goto L9e
        L9d:
            return r4
        L9e:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jog0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
