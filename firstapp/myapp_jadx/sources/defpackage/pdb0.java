package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.feature.splash.SplashViewModel$onAppFirstLaunch$1", f = "SplashViewModel.kt", l = {52, 53}, m = "invokeSuspend", v = 2)
public final class pdb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rdb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdb0(rdb0 rdb0Var, v1b<? super pdb0> v1bVar) {
        super(2, v1bVar);
        this.b = rdb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pdb0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pdb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r6.j(r5, r1) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            rdb0 r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r6)
            goto L40
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L33
        L1d:
            defpackage.uj50.b(r6)
            m2l r6 = r2.a
            cfd[] r1 = defpackage.cfd.b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.a = r4
            zed r6 = r6.a
            java.lang.String r4 = "isFirst"
            java.lang.Object r6 = r6.putBoolean(r4, r1, r5)
            if (r6 != r0) goto L33
            goto L3f
        L33:
            tb5 r6 = r2.y
            kotlin.Unit r1 = kotlin.Unit.a
            r5.a = r3
            java.lang.Object r5 = r6.j(r5, r1)
            if (r5 != r0) goto L40
        L3f:
            return r0
        L40:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
