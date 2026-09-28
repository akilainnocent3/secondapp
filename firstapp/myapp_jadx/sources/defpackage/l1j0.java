package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardBannerKt$WelcomeRewardsCard$1$1", f = "WelcomeRewardBanner.kt", l = {113, 114, 123}, m = "invokeSuspend", v = 2)
public final class l1j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ wcm e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ytw<Boolean> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1j0(float f, float f2, wd0 wd0Var, wcm wcmVar, boolean z, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = f;
        this.c = f2;
        this.d = wd0Var;
        this.e = wcmVar;
        this.f = z;
        this.i = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l1j0(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l1j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (defpackage.wd0.a(r14.d, r8, r9, null, null, r12, 12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r8.f(r14, r14) == r0) goto L25;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r14.a
            ytw<java.lang.Boolean> r2 = r14.i
            boolean r3 = r14.f
            r4 = 3
            float r5 = r14.b
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L21
            if (r1 != r4) goto L1a
            defpackage.uj50.b(r15)
            goto L82
        L1a:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            r14 = 0
            return r14
        L21:
            defpackage.uj50.b(r15)
            r12 = r14
            goto L61
        L26:
            defpackage.uj50.b(r15)
            goto L43
        L2a:
            defpackage.uj50.b(r15)
            float r15 = r14.c
            int r1 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            wd0<java.lang.Float, ij0> r8 = r14.d
            if (r1 <= 0) goto L73
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r15)
            r14.a = r7
            java.lang.Object r15 = r8.f(r14, r1)
            if (r15 != r0) goto L43
            goto L81
        L43:
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r5)
            r15 = 0
            f4c r1 = defpackage.xkf.a
            r4 = 1000(0x3e8, float:1.401E-42)
            gzg0 r9 = defpackage.yi0.e(r4, r15, r1, r6)
            r14.a = r6
            wd0<java.lang.Float, ij0> r7 = r14.d
            r10 = 0
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r0) goto L61
            goto L81
        L61:
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r5)
            wcm r15 = r12.e
            r15.invoke(r14)
            if (r3 == 0) goto L89
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r2.setValue(r14)
            goto L89
        L73:
            r12 = r14
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r5)
            r12.a = r4
            java.lang.Object r14 = r8.f(r12, r14)
            if (r14 != r0) goto L82
        L81:
            return r0
        L82:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            r2.setValue(r14)
        L89:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
