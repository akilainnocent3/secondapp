package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.repository.limits.model.ConsumedLimitsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.LimitsRepoImpl$reportAppUsage$1", f = "LimitsRepoImpl.kt", l = {77, 76}, m = "invokeSuspend", v = 2)
public final class les extends tje0 implements Function2<myh<? super BaseResponse<ConsumedLimitsResponse>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nes d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public les(nes nesVar, int i, v1b<? super les> v1bVar) {
        super(2, v1bVar);
        this.d = nesVar;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        les lesVar = new les(this.d, this.e, v1bVar);
        lesVar.c = obj;
        return lesVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<ConsumedLimitsResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((les) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
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
            goto L49
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            myh r0 = r7.a
            defpackage.uj50.b(r8)
            goto L3c
        L21:
            defpackage.uj50.b(r8)
            nes r8 = r7.d
            dds r8 = r8.a
            com.sportybet.repository.limits.model.AppUsageRequest r2 = new com.sportybet.repository.limits.model.AppUsageRequest
            int r6 = r7.e
            r2.<init>(r6)
            r7.c = r5
            r7.a = r0
            r7.b = r4
            java.lang.Object r8 = r8.e(r2, r7)
            if (r8 != r1) goto L3c
            goto L48
        L3c:
            r7.c = r5
            r7.a = r5
            r7.b = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L49
        L48:
            return r1
        L49:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.les.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
