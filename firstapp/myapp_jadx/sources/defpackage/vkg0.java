package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalCheckHoldingViewModel$initUICountDown$1", f = "TradeAdditionalCheckHoldingViewModel.kt", l = {58, 60}, m = "invokeSuspend", v = 2)
public final class vkg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ wkg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkg0(wkg0 wkg0Var, v1b<? super vkg0> v1bVar) {
        super(2, v1bVar);
        this.c = wkg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vkg0(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vkg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (defpackage.hkd.b(1000, r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r1.a.emit(r4, r8) == r0) goto L19;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:10:0x001c). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r9)
            goto L6a
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L17:
            int r1 = r8.a
            defpackage.uj50.b(r9)
        L1c:
            r9 = r1
            goto L23
        L1e:
            defpackage.uj50.b(r9)
            r9 = 60
        L23:
            wkg0 r1 = r8.c
            if (r9 <= 0) goto L54
            wwd0 r1 = r1.c
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.sporty.android.common_ui.uitext.StringUiText r6 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r6 = new com.sporty.android.common_ui.uitext.ResourceUiText
            java.util.List r5 = defpackage.ay0.S(r5)
            r7 = 2132022922(0x7f14168a, float:1.9684277E38)
            r6.<init>(r7, r5)
            r1.getClass()
            r1.k(r2, r6)
            int r1 = r9 + (-1)
            r8.a = r1
            r8.b = r4
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = defpackage.hkd.b(r5, r8)
            if (r9 != r0) goto L1c
            goto L69
        L54:
            ku90<com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult> r1 = r1.e
            com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult r4 = new com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult
            r5 = 16383(0x3fff, float:2.2957E-41)
            r4.<init>(r2, r5)
            r8.a = r9
            r8.b = r3
            b390 r9 = r1.a
            java.lang.Object r8 = r9.emit(r4, r8)
            if (r8 != r0) goto L6a
        L69:
            return r0
        L6a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
