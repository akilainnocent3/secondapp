package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$bet$1", f = "LNPlaceBetViewModel.kt", l = {770, 782, 783, 784}, m = "invokeSuspend", v = 2)
public final class j2r extends tje0 implements Function2<lk50<? extends u2q>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f2r c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2r(f2r f2rVar, long j, v1b<? super j2r> v1bVar) {
        super(2, v1bVar);
        this.c = f2rVar;
        this.d = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j2r j2rVar = new j2r(this.c, this.d, v1bVar);
        j2rVar.b = obj;
        return j2rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends u2q> lk50Var, v1b<? super Unit> v1bVar) {
        return ((j2r) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (kotlin.Unit.a == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
    
        if (r3.b(r15, r14) == r6) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
