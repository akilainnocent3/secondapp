package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.components.MultiplierComponentsKt$MultiplierComponents$19$1", f = "MultiplierComponents.kt", l = {863, 867}, m = "invokeSuspend", v = 1)
public final class upw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upw(wd0<Float, ij0> wd0Var, ytw<Boolean> ytwVar, v1b<? super upw> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new upw(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((upw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[PHI: r10
      0x004d: PHI (r10v0 upw) = (r10v1 upw), (r10v3 upw) binds: [B:13:0x004a, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r10.b.f(r10, r12) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:18:0x005e). Please report as a decompilation issue!!! */
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
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            defpackage.uj50.b(r13)
            r10 = r12
            goto L5e
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r2
        L18:
            defpackage.uj50.b(r13)
            r10 = r12
            goto L4d
        L1d:
            defpackage.uj50.b(r13)
            ytw<java.lang.Boolean> r13 = r12.c
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L60
        L2e:
            java.lang.Float r6 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13)
            r13 = 0
            r1 = 6
            r5 = 500(0x1f4, float:7.0E-43)
            gzg0 r7 = defpackage.yi0.e(r5, r13, r2, r1)
            r12.a = r4
            wd0<java.lang.Float, ij0> r5 = r12.b
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r12 = defpackage.wd0.a(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L4d
            goto L5d
        L4d:
            java.lang.Float r12 = new java.lang.Float
            r13 = 0
            r12.<init>(r13)
            r10.a = r3
            wd0<java.lang.Float, ij0> r13 = r10.b
            java.lang.Object r12 = r13.f(r10, r12)
            if (r12 != r0) goto L5e
        L5d:
            return r0
        L5e:
            r12 = r10
            goto L2e
        L60:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
