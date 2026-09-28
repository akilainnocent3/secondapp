package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportytv.data.MyProgram;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.repository.SportyTvRepoImpl$getMyProgramList$1", f = "SportyTvRepoImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class cfd0 extends tje0 implements Function2<myh<? super BaseResponse<MyProgram>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bfd0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfd0(bfd0 bfd0Var, String str, String str2, v1b v1bVar) {
        super(2, v1bVar);
        this.d = bfd0Var;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cfd0 cfd0Var = new cfd0(this.d, this.e, this.f, v1bVar);
        cfd0Var.c = obj;
        return cfd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<MyProgram>> myhVar, v1b<? super Unit> v1bVar) {
        return ((cfd0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L51
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            myh r0 = r7.a
            defpackage.uj50.b(r8)
            goto L3b
        L21:
            defpackage.uj50.b(r8)
            bfd0 r8 = r7.d
            vdd0 r8 = r8.a
            r7.c = r5
            r7.a = r0
            r7.b = r4
            java.lang.String r2 = r7.e
            java.lang.String r4 = r7.f
            r6 = 10
            java.lang.Object r8 = r8.c(r2, r4, r6, r7)
            if (r8 != r1) goto L3b
            goto L50
        L3b:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            if (r8 != 0) goto L44
            com.sporty.android.common.network.data.BaseResponse r8 = new com.sporty.android.common.network.data.BaseResponse
            r8.<init>()
        L44:
            r7.c = r5
            r7.a = r5
            r7.b = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
