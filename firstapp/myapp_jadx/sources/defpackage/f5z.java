package defpackage;

import com.sporty.android.platform.features.newotp.model.AuthenticationMethodData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.biootp.OtpBiometricPromptHandlerImpl$executeBiometricAuthFlow$2", f = "OtpBiometricPromptHandlerImpl.kt", l = {114, 115, 122}, m = "invokeSuspend", v = 2)
public final class f5z extends tje0 implements Function2<myh<? super AuthenticationMethodData>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h5z c;
    public final /* synthetic */ qd4.c d;
    public final /* synthetic */ j6c e;
    public final /* synthetic */ Function0<lyh<lk50<Unit>>> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f5z(h5z h5zVar, qd4.c cVar, j6c j6cVar, Function0<? extends lyh<? extends lk50<Unit>>> function0, v1b<? super f5z> v1bVar) {
        super(2, v1bVar);
        this.c = h5zVar;
        this.d = cVar;
        this.e = j6cVar;
        this.f = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f5z f5zVar = new f5z(this.c, this.d, this.e, this.f, v1bVar);
        f5zVar.b = obj;
        return f5zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super AuthenticationMethodData> myhVar, v1b<? super Unit> v1bVar) {
        return ((f5z) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (defpackage.kzh.c(r7, r1, r11) == r8) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.b
            r7 = r0
            myh r7 = (defpackage.myh) r7
            y5b r8 = defpackage.y5b.a
            int r0 = r11.a
            r9 = 3
            r1 = 2
            r2 = 1
            h5z r3 = r11.c
            r10 = 0
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L27
            if (r0 == r1) goto L22
            if (r0 != r9) goto L1c
            defpackage.uj50.b(r12)
            goto Lbb
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r10
        L22:
            defpackage.uj50.b(r12)
            r0 = r12
            goto L7a
        L27:
            defpackage.uj50.b(r12)
            r0 = r12
            goto L4a
        L2c:
            defpackage.uj50.b(r12)
            x3k r0 = r3.c
            r11.b = r7
            r11.a = r2
            oc4 r2 = r0.a
            uqm r0 = r0.b
            java.lang.String r0 = r0.getPhoneNumber()
            r0.getClass()
            qd4$c r4 = r11.d
            java.lang.Object r0 = r2.b(r0, r4, r11)
            if (r0 != r8) goto L4a
            goto Lba
        L4a:
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            uyh0 r0 = r3.b
            r11.b = r7
            r11.a = r1
            w74 r1 = r0.a
            uqm r2 = r0.b
            java.lang.String r2 = r2.getPhoneNumber()
            r2.getClass()
            psm r3 = r0.c
            java.lang.String r3 = r3.P()
            ysm r0 = r0.d
            ysm$a r0 = r0.a()
            java.lang.String r0 = r0.a
            j6c r5 = r11.e
            r6 = r3
            r3 = r0
            r0 = r1
            r1 = r6
            r6 = r11
            java.lang.Object r0 = r0.g(r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L7a
            goto Lba
        L7a:
            com.sporty.android.common.network.data.BaseResponse r0 = (com.sporty.android.common.network.data.BaseResponse) r0
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto L90
            kotlin.jvm.functions.Function0<lyh<lk50<kotlin.Unit>>> r0 = r11.f
            java.lang.Object r0 = r0.invoke()
            lyh r0 = (defpackage.lyh) r0
            i5z r1 = new i5z
            r1.<init>(r0)
            goto Lb0
        L90:
            com.sporty.android.platform.features.newotp.model.AuthenticationMethodData r0 = new com.sporty.android.platform.features.newotp.model.AuthenticationMethodData
            lk50$a r1 = new lk50$a
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Biometric verification failed"
            r2.<init>(r3)
            com.sporty.android.common_ui.uitext.StringUiText r3 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r3 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r4 = 2132018146(0x7f1403e2, float:1.967459E38)
            r3.<init>(r4)
            r1.<init>(r2, r3)
            r0.<init>(r10, r1)
            gzh r1 = new gzh
            r1.<init>(r0)
        Lb0:
            r11.b = r10
            r11.a = r9
            java.lang.Object r0 = defpackage.kzh.c(r7, r1, r11)
            if (r0 != r8) goto Lbb
        Lba:
            return r8
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
