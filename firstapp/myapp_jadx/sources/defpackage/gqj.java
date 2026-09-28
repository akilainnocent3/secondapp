package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$2$1$1$2", f = "GameplayScreen.kt", l = {259, 261}, m = "invokeSuspend", v = 1)
public final class gqj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m6a0<Long, Boolean> b;
    public final /* synthetic */ ooj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(m6a0<Long, Boolean> m6a0Var, ooj oojVar, v1b<? super gqj> v1bVar) {
        super(2, v1bVar);
        this.b = m6a0Var;
        this.c = oojVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gqj(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gqj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (defpackage.hkd.b(1500, r8) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 2
            r3 = 1
            ooj r4 = r8.c
            m6a0<java.lang.Long, java.lang.Boolean> r5 = r8.b
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            defpackage.uj50.b(r9)
            goto L56
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L1b:
            defpackage.uj50.b(r9)
            goto L3c
        L1f:
            defpackage.uj50.b(r9)
            r9 = r4
            ooj$b r9 = (ooj.b) r9
            long r6 = r9.a
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.put(r9, r1)
            r8.a = r3
            r6 = 100
            java.lang.Object r9 = defpackage.hkd.b(r6, r8)
            if (r9 != r0) goto L3c
            goto L55
        L3c:
            r9 = r4
            ooj$b r9 = (ooj.b) r9
            long r6 = r9.a
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.put(r9, r1)
            r8.a = r2
            r1 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r8 = defpackage.hkd.b(r1, r8)
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            ooj$b r4 = (ooj.b) r4
            long r8 = r4.a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r5.put(r0, r8)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
