package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$checkSuccessScenarios$1", f = "ResetPwdViewModel.kt", l = {225, 233}, m = "invokeSuspend", v = 2)
public final class kf50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ nf50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf50(int i, nf50 nf50Var, v1b<? super kf50> v1bVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = nf50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kf50(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kf50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r13.a
            r2 = 1
            nf50 r3 = r13.c
            r4 = 2
            if (r1 == 0) goto L19
            if (r1 == r2) goto Le
            if (r1 != r4) goto L12
        Le:
            defpackage.uj50.b(r14)
            goto L7f
        L12:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            r13 = 0
            return r13
        L19:
            defpackage.uj50.b(r14)
            r14 = 10000(0x2710, float:1.4013E-41)
            int r1 = r13.b
            if (r1 == r14) goto L63
            r14 = 11609(0x2d59, float:1.6268E-41)
            if (r1 == r14) goto L49
            r14 = 11612(0x2d5c, float:1.6272E-41)
            if (r1 == r14) goto L49
            r14 = 19000(0x4a38, float:2.6625E-41)
            if (r1 == r14) goto L2f
            goto L7f
        L2f:
            b390 r14 = r3.c
            rb90 r1 = new rb90
            com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r5 = 2132018160(0x7f1403f0, float:1.9674619E38)
            r2.<init>(r5)
            r1.<init>(r2)
            r13.a = r4
            java.lang.Object r13 = r14.emit(r1, r13)
            if (r13 != r0) goto L7f
            goto L62
        L49:
            b390 r14 = r3.c
            rb90 r1 = new rb90
            com.sporty.android.common_ui.uitext.StringUiText r4 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r4 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r5 = 2132021319(0x7f141047, float:1.9681026E38)
            r4.<init>(r5)
            r1.<init>(r4)
            r13.a = r2
            java.lang.Object r13 = r14.emit(r1, r13)
            if (r13 != r0) goto L7f
        L62:
            return r0
        L63:
            wwd0 r13 = r3.a
        L65:
            java.lang.Object r14 = r13.getValue()
            r4 = r14
            gxo r4 = (defpackage.gxo) r4
            r11 = 0
            r12 = 447(0x1bf, float:6.26E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            gxo r0 = defpackage.gxo.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r13.g(r14, r0)
            if (r14 == 0) goto L65
        L7f:
            wwd0 r14 = r3.a
        L81:
            java.lang.Object r13 = r14.getValue()
            r0 = r13
            gxo r0 = (defpackage.gxo) r0
            r7 = 0
            r8 = 503(0x1f7, float:7.05E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            gxo r0 = defpackage.gxo.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r13 = r14.g(r13, r0)
            if (r13 == 0) goto L81
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
