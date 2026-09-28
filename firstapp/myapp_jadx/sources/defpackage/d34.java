package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.data.repository.BettingStreakRepositoryImpl$applyStreakRepairTool$1", f = "BettingStreakRepositoryImpl.kt", l = {55, 56}, m = "invokeSuspend", v = 2)
public final class d34 extends tje0 implements Function2<myh<? super p04>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n34 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d34(n34 n34Var, boolean z, v1b<? super d34> v1bVar) {
        super(2, v1bVar);
        this.c = n34Var;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d34 d34Var = new d34(this.c, this.d, v1bVar);
        d34Var.b = obj;
        return d34Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super p04> myhVar, v1b<? super Unit> v1bVar) {
        return ((d34) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            n34 r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L21
            if (r2 == r6) goto L1d
            if (r2 != r5) goto L17
            defpackage.uj50.b(r8)
            goto L5b
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1d:
            defpackage.uj50.b(r8)
            goto L33
        L21:
            defpackage.uj50.b(r8)
            x430 r8 = r4.a
            r7.b = r0
            r7.a = r6
            boolean r2 = r7.d
            java.lang.Object r8 = r8.t(r2, r7)
            if (r8 != r1) goto L33
            goto L5a
        L33:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            java.lang.Object r8 = defpackage.n52.b(r8)
            com.sporty.android.core.model.loyalty.streak.BettingStreakApplyToolDto r8 = (com.sporty.android.core.model.loyalty.streak.BettingStreakApplyToolDto) r8
            s04 r2 = r4.c
            r2.getClass()
            r8.getClass()
            p04 r2 = new p04
            boolean r4 = r8.getChanged()
            java.lang.String r8 = r8.getHint()
            r2.<init>(r4, r8)
            r7.b = r3
            r7.a = r5
            java.lang.Object r7 = r0.emit(r2, r7)
            if (r7 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d34.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
