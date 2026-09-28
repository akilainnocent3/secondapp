package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBExtraBallDTO;
import com.sportygames.speedybingo.data.dto.SBExtraBallRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.data.repo.SpeedyBingoRepositoryImpl$extraBall$1", f = "SpeedyBingoRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class mua0 extends tje0 implements Function2<myh<? super HTTPResponse<SBExtraBallDTO>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sua0 d;
    public final /* synthetic */ SBExtraBallRequest e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mua0(sua0 sua0Var, SBExtraBallRequest sBExtraBallRequest, v1b<? super mua0> v1bVar) {
        super(2, v1bVar);
        this.d = sua0Var;
        this.e = sBExtraBallRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mua0 mua0Var = new mua0(this.d, this.e, v1bVar);
        mua0Var.c = obj;
        return mua0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super HTTPResponse<SBExtraBallDTO>> myhVar, v1b<? super Unit> v1bVar) {
        return ((mua0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
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
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L44
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L37
        L21:
            defpackage.uj50.b(r7)
            sua0 r7 = r6.d
            cua0 r7 = r7.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            com.sportygames.speedybingo.data.dto.SBExtraBallRequest r2 = r6.e
            java.lang.Object r7 = r7.h(r2, r6)
            if (r7 != r1) goto L37
            goto L43
        L37:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L44
        L43:
            return r1
        L44:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mua0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
