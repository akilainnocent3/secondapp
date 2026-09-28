package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.data.repository.ResetPasswordRepoImpl$resetPassword$1", f = "ResetPasswordRepoImpl.kt", l = {55, 58}, m = "invokeSuspend", v = 2)
public final class mc50 extends tje0 implements Function2<myh<? super wvz>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nc50 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc50(nc50 nc50Var, String str, String str2, String str3, v1b<? super mc50> v1bVar) {
        super(2, v1bVar);
        this.c = nc50Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mc50 mc50Var = new mc50(this.c, this.d, this.e, this.f, v1bVar);
        mc50Var.b = obj;
        return mc50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super wvz> myhVar, v1b<? super Unit> v1bVar) {
        return ((mc50) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r1.emit(r8, r16) == r2) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.b
            myh r1 = (defpackage.myh) r1
            y5b r2 = defpackage.y5b.a
            int r3 = r0.a
            nc50 r4 = r0.c
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L25
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            defpackage.uj50.b(r17)
            goto L87
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r7
        L1f:
            defpackage.uj50.b(r17)
            r3 = r17
            goto L39
        L25:
            defpackage.uj50.b(r17)
            xxz r3 = r4.a
            r0.b = r1
            r0.a = r6
            java.lang.String r6 = r0.d
            java.lang.String r8 = r0.e
            java.lang.Object r3 = r3.p0(r6, r8, r0)
            if (r3 != r2) goto L39
            goto L86
        L39:
            com.sporty.android.common.network.data.BaseResponse r3 = (com.sporty.android.common.network.data.BaseResponse) r3
            java.lang.Object r3 = defpackage.n52.b(r3)
            com.sporty.android.core.model.security.otp.OTPCompleteResult r3 = (com.sporty.android.core.model.security.otp.OTPCompleteResult) r3
            tb50 r4 = r4.c
            r4.getClass()
            r3.getClass()
            java.lang.String r9 = r0.f
            r9.getClass()
            wvz r8 = new wvz
            java.lang.String r10 = r3.getUserId()
            java.lang.String r11 = r3.getAccessToken()
            java.lang.String r12 = r3.getRefreshToken()
            com.sporty.android.core.model.security.otp.SelfExclusion r4 = r3.getSelfExclusion()
            if (r4 == 0) goto L6c
            long r13 = r4.getEndDate()
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r13 = r4
            goto L6d
        L6c:
            r13 = r7
        L6d:
            int r4 = r3.getUserCert()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            java.lang.String r15 = r3.getLanguage()
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.b = r7
            r0.a = r5
            java.lang.Object r0 = r1.emit(r8, r0)
            if (r0 != r2) goto L87
        L86:
            return r2
        L87:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
