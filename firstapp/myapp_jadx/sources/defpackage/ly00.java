package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onRetryClick$1", f = "PiggyBashViewModel.kt", l = {254, 255, 256, 264, 266, 267, 269, 272, 273}, m = "invokeSuspend", v = 1)
public final class ly00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kmx b;
    public final /* synthetic */ vx00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly00(kmx kmxVar, vx00 vx00Var, v1b<? super ly00> v1bVar) {
        super(2, v1bVar);
        this.b = kmxVar;
        this.c = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ly00(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ly00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r4.A1(r13) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r4.E1(r13) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r4.D1(r14, r13) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r4.z1(r13) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r4.A1(r13) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        if (r4.x1(r13) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        if (r4.H1(r13) == r0) goto L55;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
