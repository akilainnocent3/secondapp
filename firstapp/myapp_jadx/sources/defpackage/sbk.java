package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.placebet.data.data.LNDrawDetailDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetPlaceBetConfigFlowUseCase$invoke$betConfig$1", f = "GetPlaceBetConfigFlowUseCase.kt", l = {74, 76}, m = "invokeSuspend", v = 2)
public final class sbk extends tje0 implements Function2<myh<? super BaseResponse<LNDrawDetailDTO>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zbk c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbk(v1b v1bVar, zbk zbkVar, String str) {
        super(2, v1bVar);
        this.c = zbkVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sbk sbkVar = new sbk(v1bVar, this.c, this.d);
        sbkVar.b = obj;
        return sbkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<LNDrawDetailDTO>> myhVar, v1b<? super Unit> v1bVar) {
        return ((sbk) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (defpackage.kzh.c(r0, r9, r8) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            zbk r3 = r8.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r9)
            goto L65
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r6
        L1d:
            defpackage.uj50.b(r9)
            goto L43
        L21:
            defpackage.uj50.b(r9)
            n37 r9 = r3.b
            java.lang.String r2 = r8.d
            r2.getClass()
            java.lang.Object r9 = r9.a
            b8k r9 = (defpackage.b8k) r9
            l1i r9 = r9.a()
            ack r7 = new ack
            r7.<init>(r9, r2)
            r8.b = r0
            r8.a = r5
            java.lang.Object r9 = defpackage.s0i.a(r7, r8)
            if (r9 != r1) goto L43
            goto L64
        L43:
            r9.getClass()
            erq r9 = (defpackage.erq) r9
            java.lang.String r9 = r9.j
            a7q r2 = r3.c
            r9.getClass()
            i6u r3 = r2.b
            v6q r5 = new v6q
            r5.<init>(r2, r9, r6)
            or60 r9 = r3.c(r5)
            r8.b = r6
            r8.a = r4
            java.lang.Object r8 = defpackage.kzh.c(r0, r9, r8)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
