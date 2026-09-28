package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantViewModel$applyOverride$1", f = "DebugVariantViewModel.kt", l = {70, 74}, m = "invokeSuspend", v = 2)
public final class z3d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y3d b;
    public final /* synthetic */ x66<?> c;
    public final /* synthetic */ csm<?> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3d(y3d y3dVar, x66<?> x66Var, csm<?> csmVar, v1b<? super z3d> v1bVar) {
        super(2, v1bVar);
        this.b = y3dVar;
        this.c = x66Var;
        this.d = csmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z3d(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z3d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            csm<?> r2 = r7.d
            x66<?> r3 = r7.c
            r4 = 2
            r5 = 1
            y3d r6 = r7.b
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L16
            defpackage.uj50.b(r8)
            goto L48
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1d:
            defpackage.uj50.b(r8)
            goto L2f
        L21:
            defpackage.uj50.b(r8)
            yqm r8 = r6.a
            r7.a = r5
            java.lang.Object r8 = r8.f(r3, r2, r7)
            if (r8 != r0) goto L2f
            goto L47
        L2f:
            y3d$c$a r8 = new y3d$c$a
            java.lang.String r1 = r3.a
            r6.getClass()
            java.lang.String r2 = defpackage.y3d.x1(r2)
            r8.<init>(r1, r2)
            b390 r1 = r6.e
            r7.a = r4
            java.lang.Object r7 = r1.emit(r8, r7)
            if (r7 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
