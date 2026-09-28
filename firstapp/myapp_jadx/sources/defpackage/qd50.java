package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.passwordentry.impl.presentation.ResetPasswordViewModel$tryResetPassword$1", f = "ResetPasswordViewModel.kt", l = {113, 114, 119}, m = "invokeSuspend", v = 2)
public final class qd50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rd50 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd50(rd50 rd50Var, String str, v1b<? super qd50> v1bVar) {
        super(2, v1bVar);
        this.b = rd50Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qd50(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qd50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8.y1(r4, r20) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r8.y1(r4, r20) == r1) goto L35;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            y5b r1 = defpackage.y5b.a
            int r2 = r0.a
            r3 = 0
            java.lang.String r4 = r0.c
            r5 = 3
            r6 = 2
            r7 = 1
            rd50 r8 = r0.b
            if (r2 == 0) goto L27
            if (r2 == r7) goto L21
            if (r2 == r6) goto L1d
            if (r2 != r5) goto L17
            goto L1d
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r3
        L1d:
            defpackage.uj50.b(r21)
            goto L89
        L21:
            defpackage.uj50.b(r21)
            r2 = r21
            goto L5a
        L27:
            defpackage.uj50.b(r21)
            wwd0 r2 = r8.c
        L2c:
            java.lang.Object r9 = r2.getValue()
            r10 = r9
            tvz r10 = (defpackage.tvz) r10
            xce0$c r15 = xce0.c.a
            r18 = 0
            r19 = 239(0xef, float:3.35E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            tvz r10 = defpackage.tvz.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r9 = r2.g(r9, r10)
            if (r9 == 0) goto L2c
            boolean r2 = r8.w
            if (r2 == 0) goto L80
            lyz r2 = r8.a
            r0.a = r7
            java.lang.Object r2 = r2.H0(r0)
            if (r2 != r1) goto L5a
            goto L88
        L5a:
            lk50 r2 = (defpackage.lk50) r2
            boolean r5 = r2 instanceof lk50.c
            if (r5 == 0) goto L69
            r0.a = r6
            java.lang.Object r0 = r8.y1(r4, r0)
            if (r0 != r1) goto L89
            goto L88
        L69:
            boolean r0 = r2 instanceof lk50.a
            if (r0 == 0) goto L77
            lk50$a r2 = (lk50.a) r2
            java.lang.Throwable r0 = r2.a
            java.lang.String r1 = "checkIsLoggedIn failed"
            r8.x1(r1, r0)
            goto L89
        L77:
            boolean r0 = r2 instanceof lk50.b
            if (r0 == 0) goto L7c
            goto L89
        L7c:
            defpackage.uhc.a()
            return r3
        L80:
            r0.a = r5
            java.lang.Object r0 = r8.y1(r4, r0)
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
