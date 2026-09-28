package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$checkAndShowOddsChangeDlgIfNeeded$1", f = "BetSlipViewModel.kt", l = {1497, 1498, 1503, 1503}, m = "invokeSuspend", v = 2)
public final class o63 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public m2l a;
    public int b;
    public final /* synthetic */ q73 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(q73 q73Var, v1b v1bVar, boolean z) {
        super(2, v1bVar);
        this.c = q73Var;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o63(this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o63) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[PHI: r2 r5
      0x0077: PHI (r2v14 m2l) = (r2v13 m2l), (r2v18 m2l) binds: [B:30:0x0074, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v4 java.lang.Object) binds: [B:30:0x0074, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r2.a.putBoolean((java.lang.String) r5, r6, r18) == r1) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            y5b r1 = defpackage.y5b.a
            int r2 = r0.b
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            q73 r8 = r0.c
            if (r2 == 0) goto L36
            if (r2 == r7) goto L30
            if (r2 == r6) goto L2a
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1c
            defpackage.uj50.b(r19)
            goto L88
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r3
        L22:
            m2l r2 = r0.a
            defpackage.uj50.b(r19)
            r5 = r19
            goto L77
        L2a:
            defpackage.uj50.b(r19)
            r2 = r19
            goto L61
        L30:
            defpackage.uj50.b(r19)
            r2 = r19
            goto L4e
        L36:
            defpackage.uj50.b(r19)
            jrm r2 = r8.N
            boolean r2 = r2.l()
            if (r2 == 0) goto Lc5
            boolean r2 = r0.d
            if (r2 != 0) goto Lc5
            r0.b = r7
            java.lang.Object r2 = r8.R1(r0)
            if (r2 != r1) goto L4e
            goto L87
        L4e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lc5
            m990 r2 = r8.Q
            r0.b = r6
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L61
            goto L87
        L61:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L6a
            goto Lc5
        L6a:
            m2l r2 = r8.F
            r0.a = r2
            r0.b = r5
            java.lang.Object r5 = r8.I1(r0)
            if (r5 != r1) goto L77
            goto L87
        L77:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.a = r3
            r0.b = r4
            zed r2 = r2.a
            java.lang.Object r0 = r2.putBoolean(r5, r6, r0)
            if (r0 != r1) goto L88
        L87:
            return r1
        L88:
            ku90<com.sporty.android.common.uievent.a> r9 = r8.k1
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r10 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0 = 2132019310(0x7f14086e, float:1.9676951E38)
            r10.<init>(r0)
            com.sporty.android.common_ui.uitext.ResourceUiText r12 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0 = 2132019309(0x7f14086d, float:1.967695E38)
            r12.<init>(r0)
            com.sporty.android.common_ui.uitext.ResourceUiText r13 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0 = 2132018672(0x7f1405f0, float:1.9675657E38)
            r13.<init>(r0)
            com.sporty.android.common_ui.uitext.ResourceUiText r14 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0 = 2132018393(0x7f1404d9, float:1.9675091E38)
            r14.<init>(r0)
            java.lang.Integer r15 = new java.lang.Integer
            r0 = 2132084280(0x7f150638, float:1.9808726E38)
            r15.<init>(r0)
            n63 r0 = new n63
            r1 = 0
            r0.<init>(r8, r1)
            r17 = 130(0x82, float:1.82E-43)
            r11 = 0
            r16 = r0
            com.sporty.android.common.uievent.b.e(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        Lc5:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
