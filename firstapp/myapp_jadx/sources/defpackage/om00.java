package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.personalinfo.presentation.PersonalInfoViewModel$onPostalCodeChanged$2", f = "PersonalInfoViewModel.kt", l = {95, 104}, m = "invokeSuspend", v = 2)
public final class om00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pm00 b;
    public final /* synthetic */ ijf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om00(pm00 pm00Var, ijf0 ijf0Var, v1b<? super om00> v1bVar) {
        super(2, v1bVar);
        this.b = pm00Var;
        this.c = ijf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new om00(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((om00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r4.z1(r1, r25) == r2) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            ijf0 r1 = r0.c
            nk0 r1 = r1.a
            y5b r2 = defpackage.y5b.a
            int r3 = r0.a
            pm00 r4 = r0.b
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L25
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L18
            defpackage.uj50.b(r26)
            goto L85
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L1f:
            defpackage.uj50.b(r26)
            r3 = r26
            goto L35
        L25:
            defpackage.uj50.b(r26)
            l6a0 r3 = r4.e
            java.lang.String r7 = r1.b
            r0.a = r6
            java.lang.Object r3 = r3.d(r7, r0)
            if (r3 != r2) goto L35
            goto L84
        L35:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L7a
            wwd0 r3 = r4.a
        L3f:
            java.lang.Object r0 = r3.getValue()
            r4 = r0
            hm00 r4 = (defpackage.hm00) r4
            com.sporty.android.common_ui.uitext.StringUiText r1 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r10 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r1 = 2132023701(0x7f141995, float:1.9685857E38)
            r10.<init>(r1)
            r23 = 0
            r24 = 524127(0x7ff5f, float:7.34458E-40)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            hm00 r1 = defpackage.hm00.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r3.g(r0, r1)
            if (r0 == 0) goto L3f
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        L7a:
            java.lang.String r1 = r1.b
            r0.a = r5
            java.lang.Object r0 = r4.z1(r1, r0)
            if (r0 != r2) goto L85
        L84:
            return r2
        L85:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
