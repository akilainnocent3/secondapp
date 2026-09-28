package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.views.SportyJetFragment$ThunderAnimationController$1$1", f = "SportyJetFragment.kt", l = {1498, 1499, 1500, 1501, 1502, 1505}, m = "invokeSuspend", v = 1)
public final class u7c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xpf0 b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ ytw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7c0(xpf0 xpf0Var, wd0 wd0Var, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = xpf0Var;
        this.c = wd0Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u7c0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u7c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073 A[PHI: r12
      0x0073: PHI (r12v8 u7c0) = (r12v1 u7c0), (r12v9 u7c0) binds: [B:11:0x0030, B:17:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008e A[PHI: r12
      0x008e: PHI (r12v7 u7c0) = (r12v2 u7c0), (r12v8 u7c0) binds: [B:10:0x002b, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[PHI: r12
      0x00a9: PHI (r12v6 u7c0) = (r12v3 u7c0), (r12v7 u7c0) binds: [B:9:0x0025, B:23:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4 A[PHI: r12
      0x00c4: PHI (r12v5 u7c0) = (r12v4 u7c0), (r12v6 u7c0) binds: [B:8:0x001f, B:26:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (defpackage.hkd.b(3000, r12) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        if (r14.c.f(r14, r14) == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cd -> B:31:0x00d0). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
