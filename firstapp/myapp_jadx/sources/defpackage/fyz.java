package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.data.PatronDeviceRepositoryImpl$logoutDevices$1", f = "PatronDeviceRepositoryImpl.kt", l = {48, 52}, m = "invokeSuspend", v = 2)
public final class fyz extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hyz c;
    public final /* synthetic */ List<String> d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyz(hyz hyzVar, List<String> list, String str, v1b<? super fyz> v1bVar) {
        super(2, v1bVar);
        this.c = hyzVar;
        this.d = list;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fyz fyzVar = new fyz(this.c, this.d, this.e, v1bVar);
        fyzVar.b = obj;
        return fyzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((fyz) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r9)
            goto L54
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L1b:
            defpackage.uj50.b(r9)
            goto L42
        L1f:
            defpackage.uj50.b(r9)
            hyz r9 = r8.c
            zxz r2 = r9.a
            yxz r9 = r9.b
            r9.getClass()
            java.util.List<java.lang.String> r9 = r8.d
            r9.getClass()
            com.sporty.android.core.model.patron.LogoutDeviceRequest r6 = new com.sporty.android.core.model.patron.LogoutDeviceRequest
            java.lang.String r7 = r8.e
            r6.<init>(r9, r7)
            r8.b = r0
            r8.a = r5
            java.lang.Object r9 = r2.e(r6, r8)
            if (r9 != r1) goto L42
            goto L53
        L42:
            com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9
            defpackage.n52.c(r9)
            kotlin.Unit r9 = kotlin.Unit.a
            r8.b = r3
            r8.a = r4
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
