package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.VipOnboardingKt$VipOnboardingTwo$3$3$1", f = "VipOnboarding.kt", l = {1803, 1804}, m = "invokeSuspend", v = 1)
public final class udi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udi0(float f, wd0<Float, ij0> wd0Var, ytw<Boolean> ytwVar, v1b<? super udi0> v1bVar) {
        super(2, v1bVar);
        this.b = f;
        this.c = wd0Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new udi0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((udi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (defpackage.wd0.a(r11.c, r5, r6, null, null, r11, 12) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.a
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L17
            if (r1 != r3) goto L10
            defpackage.uj50.b(r12)
            goto L6d
        L10:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L17:
            defpackage.uj50.b(r12)
            goto L4c
        L1b:
            defpackage.uj50.b(r12)
            float r12 = r11.b
            r1 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 < 0) goto L6d
            ytw<java.lang.Boolean> r12 = r11.d
            java.lang.Object r1 = r12.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r12.setValue(r1)
            java.lang.Float r12 = new java.lang.Float
            r1 = -1097229926(0xffffffffbe99999a, float:-0.3)
            r12.<init>(r1)
            r11.a = r2
            wd0<java.lang.Float, ij0> r1 = r11.c
            java.lang.Object r12 = r1.f(r11, r12)
            if (r12 != r0) goto L4c
            goto L6c
        L4c:
            java.lang.Float r5 = new java.lang.Float
            r12 = 1067869798(0x3fa66666, float:1.3)
            r5.<init>(r12)
            r12 = 0
            wkf r1 = defpackage.xkf.d
            r2 = 1200(0x4b0, float:1.682E-42)
            gzg0 r6 = defpackage.yi0.e(r2, r12, r1, r3)
            r11.a = r3
            wd0<java.lang.Float, ij0> r4 = r11.c
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L6d
        L6c:
            return r0
        L6d:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
