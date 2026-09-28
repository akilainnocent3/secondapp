package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.data.repository.BettingStreakRepositoryImpl$getBettingStreakHistory$1", f = "BettingStreakRepositoryImpl.kt", l = {60, 61}, m = "invokeSuspend", v = 2)
public final class g34 extends tje0 implements Function2<myh<? super t04>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n34 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g34(n34 n34Var, v1b<? super g34> v1bVar) {
        super(2, v1bVar);
        this.c = n34Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g34 g34Var = new g34(this.c, v1bVar);
        g34Var.b = obj;
        return g34Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super t04> myhVar, v1b<? super Unit> v1bVar) {
        return ((g34) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g34.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
