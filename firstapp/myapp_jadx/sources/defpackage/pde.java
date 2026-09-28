package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.integrity.DeviceIntegrityRepositoryImpl$verify$1", f = "DeviceIntegrityRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, 41}, m = "invokeSuspend", v = 2)
public final class pde extends tje0 implements Function2<myh<? super BaseResponse<jde>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qde d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pde(qde qdeVar, String str, v1b<? super pde> v1bVar) {
        super(2, v1bVar);
        this.d = qdeVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pde pdeVar = new pde(this.d, this.e, v1bVar);
        pdeVar.c = obj;
        return pdeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<jde>> myhVar, v1b<? super Unit> v1bVar) {
        return ((pde) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
            qde r9 = r8.d
            hde r2 = r9.a
            ide r6 = new ide
            android.content.Context r9 = r9.c
            java.lang.String r9 = r9.getPackageName()
            r9.getClass()
            java.lang.String r7 = r8.e
            r6.<init>(r7, r9)
            r8.c = r5
            r8.a = r0
            r8.b = r4
            java.lang.Object r9 = r2.a(r6, r8)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pde.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
