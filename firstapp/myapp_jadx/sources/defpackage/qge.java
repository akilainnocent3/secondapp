package defpackage;

import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.data.repository.DeviceManagementRepositoryImpl$verifyDeviceLogoutOtp$1", f = "DeviceManagementRepositoryImpl.kt", l = {90, 91}, m = "invokeSuspend", v = 2)
public final class qge extends tje0 implements Function2<myh<? super OTPGeneralResult>, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ sge i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qge(String str, String str2, String str3, sge sgeVar, v1b<? super qge> v1bVar) {
        super(2, v1bVar);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.i = sgeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qge qgeVar = new qge(this.d, this.e, this.f, this.i, v1bVar);
        qgeVar.c = obj;
        return qgeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super OTPGeneralResult> myhVar, v1b<? super Unit> v1bVar) {
        return ((qge) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.emit((com.sporty.android.core.model.security.otp.OTPGeneralResult) r9, r8) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r9)
            goto L54
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r5
        L1b:
            defpackage.uj50.b(r9)
            goto L3e
        L1f:
            defpackage.uj50.b(r9)
            wzh0 r9 = new wzh0
            java.lang.String r2 = r8.e
            java.lang.String r6 = r8.f
            java.lang.String r7 = r8.d
            r9.<init>(r7, r2, r6)
            sge r2 = r8.i
            o650 r2 = r2.a
            r8.c = r0
            r8.b = r4
            bfe r2 = r2.a
            java.lang.Object r9 = r2.c(r9, r8)
            if (r9 != r1) goto L3e
            goto L53
        L3e:
            com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9
            java.lang.Object r9 = defpackage.n52.b(r9)
            r2 = r9
            com.sporty.android.core.model.security.otp.OTPGeneralResult r2 = (com.sporty.android.core.model.security.otp.OTPGeneralResult) r2
            r8.c = r5
            r8.a = r9
            r8.b = r3
            java.lang.Object r8 = r0.emit(r2, r8)
            if (r8 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qge.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
