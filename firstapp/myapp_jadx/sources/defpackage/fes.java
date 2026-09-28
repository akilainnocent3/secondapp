package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.repository.limits.model.LimitResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.LimitsRepoImpl$getBettingLimit$1", f = "LimitsRepoImpl.kt", l = {41, 40}, m = "invokeSuspend", v = 2)
public final class fes extends tje0 implements Function2<myh<? super BaseResponse<List<? extends LimitResponse>>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ nes d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fes(nes nesVar, v1b<? super fes> v1bVar) {
        super(2, v1bVar);
        this.d = nesVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fes fesVar = new fes(this.d, v1bVar);
        fesVar.c = obj;
        return fesVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends LimitResponse>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((fes) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
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
            goto L4c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L3f
        L21:
            defpackage.uj50.b(r7)
            nes r7 = r6.d
            dds r7 = r7.a
            rcs$a r2 = defpackage.rcs.b
            uag r2 = defpackage.aoj.f
            java.lang.String r2 = defpackage.coj.a(r2)
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.String r4 = "1"
            java.lang.Object r7 = r7.b(r4, r2, r6)
            if (r7 != r1) goto L3f
            goto L4b
        L3f:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L4c
        L4b:
            return r1
        L4c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fes.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
