package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.data.repository.WelcomeRewardRepositoryImpl$getNonFtdEngagement$1", f = "WelcomeRewardRepositoryImpl.kt", l = {18, 18}, m = "invokeSuspend", v = 2)
public final class p2j0 extends tje0 implements Function2<myh<? super BaseResponse<NonFtdEngagement>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q2j0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2j0(q2j0 q2j0Var, v1b<? super p2j0> v1bVar) {
        super(2, v1bVar);
        this.d = q2j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p2j0 p2j0Var = new p2j0(this.d, v1bVar);
        p2j0Var.c = obj;
        return p2j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<NonFtdEngagement>> myhVar, v1b<? super Unit> v1bVar) {
        return ((p2j0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
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
            goto L42
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            goto L35
        L21:
            defpackage.uj50.b(r7)
            q2j0 r7 = r6.d
            xxz r7 = r7.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.lang.Object r7 = r7.X0(r6)
            if (r7 != r1) goto L35
            goto L41
        L35:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L42
        L41:
            return r1
        L42:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
