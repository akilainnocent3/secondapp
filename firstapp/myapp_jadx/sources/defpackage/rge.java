package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.data.repository.DeviceManagementRepositoryImpl$verifyDeviceLogoutPassword$1", f = "DeviceManagementRepositoryImpl.kt", l = {67, 68}, m = "invokeSuspend", v = 2)
public final class rge extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sge c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rge(v1b v1bVar, sge sgeVar, String str) {
        super(2, v1bVar);
        this.c = sgeVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rge rgeVar = new rge(v1bVar, this.c, this.d);
        rgeVar.b = obj;
        return rgeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
        return ((rge) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r7)
            goto L51
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L3a
        L1f:
            defpackage.uj50.b(r7)
            sge r7 = r6.c
            o650 r7 = r7.a
            r6.b = r0
            r6.a = r5
            bfe r7 = r7.a
            xzh0 r2 = new xzh0
            java.lang.String r5 = r6.d
            r2.<init>(r5)
            java.lang.Object r7 = r7.a(r2, r6)
            if (r7 != r1) goto L3a
            goto L50
        L3a:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            java.lang.Object r7 = defpackage.n52.b(r7)
            yzh0 r7 = (defpackage.yzh0) r7
            java.lang.String r7 = r7.getToken()
            r6.b = r3
            r6.a = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rge.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
