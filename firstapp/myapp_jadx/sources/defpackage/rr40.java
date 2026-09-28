package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.refscall.data.dto.RCBetResponseDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportygames.refscall.data.repo.RefsCallRepositoryImpl$bet$1", f = "RefsCallRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, 41}, m = "invokeSuspend", v = 1)
public final class rr40 extends tje0 implements Function2<myh<? super HTTPResponse<RCBetResponseDTO>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yr40 d;
    public final /* synthetic */ tq30 e;
    public final /* synthetic */ double f;
    public final /* synthetic */ String i;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr40(yr40 yr40Var, tq30 tq30Var, double d, String str, String str2, v1b<? super rr40> v1bVar) {
        super(2, v1bVar);
        this.d = yr40Var;
        this.e = tq30Var;
        this.f = d;
        this.i = str;
        this.v = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rr40 rr40Var = new rr40(this.d, this.e, this.f, this.i, this.v, v1bVar);
        rr40Var.c = obj;
        return rr40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super HTTPResponse<RCBetResponseDTO>> myhVar, v1b<? super Unit> v1bVar) {
        return ((rr40) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.c
            myh r1 = (defpackage.myh) r1
            y5b r2 = defpackage.y5b.a
            int r3 = r0.b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L25
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L17
            defpackage.uj50.b(r17)
            goto L60
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r6
        L1d:
            myh r1 = r0.a
            defpackage.uj50.b(r17)
            r3 = r17
            goto L53
        L25:
            defpackage.uj50.b(r17)
            yr40 r3 = r0.d
            kr40 r3 = r3.a
            com.sportygames.refscall.data.dto.RCBetRequestDTO r7 = new com.sportygames.refscall.data.dto.RCBetRequestDTO
            tq30 r8 = r0.e
            java.lang.String r8 = r8.a
            double r9 = r0.f
            java.lang.String r14 = r0.v
            if (r14 == 0) goto L3f
            java.lang.Double r11 = new java.lang.Double
            r11.<init>(r9)
            r15 = r11
            goto L40
        L3f:
            r15 = r6
        L40:
            java.lang.String r13 = r0.i
            r11 = r9
            r7.<init>(r8, r9, r11, r13, r14, r15)
            r0.c = r6
            r0.a = r1
            r0.b = r5
            java.lang.Object r3 = r3.b(r7, r0)
            if (r3 != r2) goto L53
            goto L5f
        L53:
            r0.c = r6
            r0.a = r6
            r0.b = r4
            java.lang.Object r0 = r1.emit(r3, r0)
            if (r0 != r2) goto L60
        L5f:
            return r2
        L60:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
