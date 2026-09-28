package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.components.ComposeBetContainerInitiatedKt$RoundsPlayed$1$1", f = "ComposeBetContainerInitiated.kt", l = {2521, 2526, 2532}, m = "invokeSuspend", v = 1)
public final class w5a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ ytw<Integer> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5a(int i, wd0 wd0Var, v1b v1bVar, ytw ytwVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = wd0Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w5a(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w5a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (defpackage.wd0.a(r11.c, r7, r8, null, null, r11, 12) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r13.a
            r2 = 0
            r3 = 500(0x1f4, float:7.0E-43)
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1d
            if (r1 == r5) goto L12
            r13 = 3
            if (r1 != r13) goto L16
        L12:
            defpackage.uj50.b(r14)
            goto L75
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            r13 = 0
            return r13
        L1d:
            defpackage.uj50.b(r14)
            r11 = r13
            goto L59
        L22:
            defpackage.uj50.b(r14)
            ytw<java.lang.Integer> r14 = r13.d
            java.lang.Object r1 = r14.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r6 = r13.b
            if (r6 == r1) goto L75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r14.setValue(r1)
            java.lang.Float r7 = new java.lang.Float
            r14 = 1069547520(0x3fc00000, float:1.5)
            r7.<init>(r14)
            wkf r14 = defpackage.xkf.d
            gzg0 r8 = defpackage.yi0.e(r3, r2, r14, r5)
            r13.a = r4
            wd0<java.lang.Float, ij0> r6 = r13.c
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L59
            goto L74
        L59:
            java.lang.Float r7 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r13)
            wkf r13 = defpackage.xkf.d
            gzg0 r8 = defpackage.yi0.e(r3, r2, r13, r5)
            r11.a = r5
            wd0<java.lang.Float, ij0> r6 = r11.c
            r9 = 0
            r10 = 0
            r12 = 12
            java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L75
        L74:
            return r0
        L75:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
