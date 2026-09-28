package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.data.repository.DeviceManagementRepositoryImpl$forceLogoutDevice$1", f = "DeviceManagementRepositoryImpl.kt", l = {105, 106}, m = "invokeSuspend", v = 2)
public final class mge extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ sge d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mge(v1b v1bVar, sge sgeVar, String str) {
        super(2, v1bVar);
        this.c = str;
        this.d = sgeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mge mgeVar = new mge(v1bVar, this.d, this.c);
        mgeVar.b = obj;
        return mgeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((mge) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L4c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            defpackage.uj50.b(r7)
            goto L3a
        L1f:
            defpackage.uj50.b(r7)
            tsi r7 = new tsi
            java.lang.String r2 = r6.c
            r7.<init>(r2)
            sge r2 = r6.d
            o650 r2 = r2.a
            r6.b = r0
            r6.a = r4
            bfe r2 = r2.a
            java.lang.Object r7 = r2.h(r7, r6)
            if (r7 != r1) goto L3a
            goto L4b
        L3a:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            defpackage.n52.c(r7)
            kotlin.Unit r7 = kotlin.Unit.a
            r6.b = r5
            r6.a = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L4c
        L4b:
            return r1
        L4c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mge.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
