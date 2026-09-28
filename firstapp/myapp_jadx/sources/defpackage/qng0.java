package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalSmsViewModel$resend$1", f = "TradeAdditionalSmsViewModel.kt", l = {122, 133}, m = "invokeSuspend", v = 2)
public final class qng0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sng0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qng0(sng0 sng0Var, v1b<? super qng0> v1bVar) {
        super(2, v1bVar);
        this.b = sng0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qng0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qng0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r9.a.emit(r0, r8) == r2) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            sng0 r0 = r8.b
            wwd0 r1 = r0.y
            y5b r2 = defpackage.y5b.a
            int r3 = r8.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L16
            defpackage.uj50.b(r9)
            goto La1
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r6
        L1c:
            defpackage.uj50.b(r9)
            goto L44
        L20:
            defpackage.uj50.b(r9)
            r1.getClass()
            l6b$b r9 = l6b.b.a
            r1.k(r6, r9)
            q900 r9 = r0.a
            uqm r3 = r0.c
            android.accounts.Account r3 = r3.getAccount()
            if (r3 == 0) goto L38
            java.lang.String r3 = r3.name
            goto L39
        L38:
            r3 = r6
        L39:
            java.lang.String r7 = r0.e
            r8.a = r5
            java.lang.Object r9 = r9.c(r3, r7, r8)
            if (r9 != r2) goto L44
            goto L7f
        L44:
            sgn r9 = (defpackage.sgn) r9
            boolean r3 = r9 instanceof sgn.b
            if (r3 == 0) goto L5e
            l6b$a r8 = new l6b$a
            r2 = 60
            r8.<init>(r2)
            r1.getClass()
            r1.k(r6, r8)
            sgn$b r9 = (sgn.b) r9
            java.lang.String r8 = r9.a
            r0.e = r8
            goto La1
        L5e:
            boolean r3 = r9 instanceof sgn.c
            r5 = 0
            if (r3 == 0) goto L80
            itf0$a r9 = defpackage.itf0.a
            java.lang.String r1 = "is verifying SMS, upstream is not expected."
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r9.d(r1, r3)
            ku90<com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult> r9 = r0.C
            com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult r0 = new com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult
            r1 = 16383(0x3fff, float:2.2957E-41)
            r0.<init>(r6, r1)
            r8.a = r4
            b390 r9 = r9.a
            java.lang.Object r8 = r9.emit(r0, r8)
            if (r8 != r2) goto La1
        L7f:
            return r2
        L80:
            boolean r8 = r9 instanceof sgn.a
            if (r8 == 0) goto La4
            wwd0 r8 = r0.v
            sgn$a r9 = (sgn.a) r9
            java.lang.String r9 = r9.b
            com.sporty.android.common_ui.uitext.StringUiText r9 = defpackage.vch0.e(r9)
            if (r9 == 0) goto L91
            goto L93
        L91:
            com.sporty.android.common_ui.uitext.ResourceUiText r9 = defpackage.vch0.b
        L93:
            r8.setValue(r9)
            l6b$a r8 = new l6b$a
            r8.<init>(r5)
            r1.getClass()
            r1.k(r6, r8)
        La1:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        La4:
            defpackage.uhc.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qng0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
