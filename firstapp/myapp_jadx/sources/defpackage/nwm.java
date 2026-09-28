package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sportybet.android.account.international.data.model.INTRegisterRequest;
import com.sportybet.android.account.international.data.model.INTRegisterResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.data.repo.INTRepoImpl$intRegisterFlow$1", f = "INTRepoImpl.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, 41}, m = "invokeSuspend", v = 2)
public final class nwm extends tje0 implements Function2<myh<? super BaseResponse<INTRegisterResponse>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mwm d;
    public final /* synthetic */ INTRegisterRequest e;
    public final /* synthetic */ CaptchaHeader f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwm(mwm mwmVar, INTRegisterRequest iNTRegisterRequest, CaptchaHeader captchaHeader, v1b<? super nwm> v1bVar) {
        super(2, v1bVar);
        this.d = mwmVar;
        this.e = iNTRegisterRequest;
        this.f = captchaHeader;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nwm nwmVar = new nwm(this.d, this.e, this.f, v1bVar);
        nwmVar.c = obj;
        return nwmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<INTRegisterResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((nwm) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r9)
            goto L52
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r5
        L1b:
            myh r0 = r8.a
            defpackage.uj50.b(r9)
            goto L45
        L21:
            defpackage.uj50.b(r9)
            mwm r9 = r8.d
            wum r9 = r9.a
            com.sportybet.android.account.international.data.model.INTRegisterRequest r2 = r8.e
            java.util.Map r2 = r2.toFormUrlEncodedMap()
            com.sporty.android.core.model.captcha.CaptchaHeader r6 = r8.f
            java.lang.String r7 = r6.getUuid()
            java.lang.String r6 = r6.getToken()
            r8.c = r5
            r8.a = r0
            r8.b = r4
            java.lang.Object r9 = r9.a(r2, r7, r6, r8)
            if (r9 != r1) goto L45
            goto L51
        L45:
            r8.c = r5
            r8.a = r5
            r8.b = r3
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
