package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$initBannerAd$1", f = "BaseTradingViewModel.kt", l = {197, 201}, m = "invokeSuspend", v = 2)
public final class n72 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k72 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n72(k72 k72Var, v1b<? super n72> v1bVar) {
        super(2, v1bVar);
        this.d = k72Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n72 n72Var = new n72(this.d, v1bVar);
        n72Var.c = obj;
        return n72Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n72) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r12 == r1) goto L26;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.c
            v5b r0 = (defpackage.v5b) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r11.b
            r3 = 2
            r4 = 1
            k72 r5 = r11.d
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            defpackage.uj50.b(r12)     // Catch: java.lang.Throwable -> L17
            goto L64
        L17:
            r11 = move-exception
            goto L69
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r6
        L1f:
            long r7 = r11.a
            defpackage.uj50.b(r12)
            goto L3b
        L25:
            defpackage.uj50.b(r12)
            long r7 = java.lang.System.currentTimeMillis()
            mgb0 r12 = r5.e
            r11.c = r0
            r11.a = r7
            r11.b = r4
            java.lang.Object r12 = r12.getSelfExclusionUTCTimeStamp(r11)
            if (r12 != r1) goto L3b
            goto L63
        L3b:
            java.lang.Number r12 = (java.lang.Number) r12
            long r9 = r12.longValue()
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L48
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L48:
            y200 r12 = r5.B1()
            java.lang.String r12 = r12.d()
            if (r12 != 0) goto L55
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L55:
            zi50$a r0 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L17
            wl r0 = r5.c     // Catch: java.lang.Throwable -> L17
            r11.c = r6     // Catch: java.lang.Throwable -> L17
            r11.b = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r12 = r0.a(r12, r11)     // Catch: java.lang.Throwable -> L17
            if (r12 != r1) goto L64
        L63:
            return r1
        L64:
            com.sporty.android.core.model.ads.Ads r12 = (com.sporty.android.core.model.ads.Ads) r12     // Catch: java.lang.Throwable -> L17
            zi50$a r11 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L17
            goto L70
        L69:
            zi50$a r12 = defpackage.zi50.b
            zi50$b r12 = new zi50$b
            r12.<init>(r11)
        L70:
            java.lang.Throwable r11 = defpackage.zi50.a(r12)
            if (r11 == 0) goto L80
            itf0$a r0 = defpackage.itf0.a
            java.lang.String r1 = "SB_COMMON"
            r0.q(r1)
            r0.o(r11)
        L80:
            boolean r11 = r12 instanceof zi50.b
            if (r11 == 0) goto L85
            r12 = r6
        L85:
            com.sporty.android.core.model.ads.Ads r12 = (com.sporty.android.core.model.ads.Ads) r12
            if (r12 == 0) goto L91
            wwd0 r11 = r5.W
            r11.getClass()
            r11.k(r6, r12)
        L91:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n72.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
