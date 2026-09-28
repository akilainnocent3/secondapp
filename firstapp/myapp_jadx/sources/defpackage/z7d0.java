package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.plugin.sportypicks.presentation.SportyPicksViewModel$loadData$1", f = "SportyPicksViewModel.kt", l = {79, 84, 95}, m = "invokeSuspend", v = 2)
public final class z7d0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c8d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7d0(c8d0 c8d0Var, v1b<? super z7d0> v1bVar) {
        super(2, v1bVar);
        this.c = c8d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z7d0 z7d0Var = new z7d0(this.c, v1bVar);
        z7d0Var.b = obj;
        return z7d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z7d0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3 A[LOOP:0: B:29:0x00ad->B:31:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        if (r12 == r3) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
