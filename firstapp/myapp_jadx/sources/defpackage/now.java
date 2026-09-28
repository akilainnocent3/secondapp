package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.onepunch.components.MultiplierComponentKt$MultiplierComponent$1$1$1$1", f = "MultiplierComponent.kt", l = {133, 134}, m = "invokeSuspend", v = 1)
public final class now extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ double d;
    public final /* synthetic */ ytw<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public now(boolean z, wd0<Float, ij0> wd0Var, double d, ytw<Boolean> ytwVar, v1b<? super now> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = wd0Var;
        this.d = d;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new now(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((now) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (defpackage.wd0.a(r12.c, r6, r7, null, null, r12, 12) == r0) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r12.a
            r2 = 0
            ytw<java.lang.Boolean> r3 = r12.e
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L13
            defpackage.uj50.b(r13)
            goto L5b
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r2
        L19:
            defpackage.uj50.b(r13)
            goto L3b
        L1d:
            defpackage.uj50.b(r13)
            boolean r13 = r12.b
            if (r13 == 0) goto L60
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r3.setValue(r13)
            java.lang.Float r13 = new java.lang.Float
            r1 = 1065353216(0x3f800000, float:1.0)
            r13.<init>(r1)
            r12.a = r5
            wd0<java.lang.Float, ij0> r1 = r12.c
            java.lang.Object r13 = r1.f(r12, r13)
            if (r13 != r0) goto L3b
            goto L5a
        L3b:
            double r5 = r12.d
            float r13 = (float) r5
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r13)
            r13 = 1500(0x5dc, float:2.102E-42)
            r1 = 6
            r5 = 0
            gzg0 r7 = defpackage.yi0.e(r13, r5, r2, r1)
            r12.a = r4
            wd0<java.lang.Float, ij0> r5 = r12.c
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r12 = defpackage.wd0.a(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L5b
        L5a:
            return r0
        L5b:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r3.setValue(r12)
        L60:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.now.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
