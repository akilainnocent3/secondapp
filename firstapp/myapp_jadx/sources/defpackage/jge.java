package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.data.repository.DeviceManagementRepositoryImpl$blockDevice$1", f = "DeviceManagementRepositoryImpl.kt", l = {55, 55}, m = "invokeSuspend", v = 2)
public final class jge extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ sge e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jge(String str, String str2, sge sgeVar, v1b<? super jge> v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = str2;
        this.e = sgeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jge jgeVar = new jge(this.c, this.d, this.e, v1bVar);
        jgeVar.b = obj;
        return jgeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((jge) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.sporty.android.common.network.data.SprThrowable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L4e
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            defpackage.uj50.b(r8)
            goto L3c
        L1f:
            defpackage.uj50.b(r8)
            nf4 r8 = new nf4
            java.lang.String r2 = r7.c
            java.lang.String r6 = r7.d
            r8.<init>(r2, r6)
            sge r2 = r7.e
            o650 r2 = r2.a
            r7.b = r0
            r7.a = r4
            bfe r2 = r2.a
            java.lang.Object r8 = r2.b(r8, r7)
            if (r8 != r1) goto L3c
            goto L4d
        L3c:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            defpackage.n52.c(r8)
            kotlin.Unit r8 = kotlin.Unit.a
            r7.b = r5
            r7.a = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L4e
        L4d:
            return r1
        L4e:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jge.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
