package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.component.PotWinAndBetButtonKt$shimmerOverlay$1$1", f = "PotWinAndBetButton.kt", l = {237, 239}, m = "invokeSuspend", v = 2)
public final class p720 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p720(wd0 wd0Var, v1b v1bVar, boolean z) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p720(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p720) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (defpackage.wd0.a(r11.b, r5, r6, null, null, r11, 12) == r0) goto L17;
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
            goto L5d
        L10:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L17:
            defpackage.uj50.b(r12)
            goto L30
        L1b:
            defpackage.uj50.b(r12)
            java.lang.Float r12 = new java.lang.Float
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.<init>(r1)
            r11.a = r2
            wd0<java.lang.Float, ij0> r1 = r11.b
            java.lang.Object r12 = r1.f(r11, r12)
            if (r12 != r0) goto L30
            goto L5c
        L30:
            boolean r12 = r11.c
            if (r12 == 0) goto L5d
            java.lang.Float r5 = new java.lang.Float
            r12 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12)
            r12 = 0
            wkf r1 = defpackage.xkf.d
            r2 = 1200(0x4b0, float:1.682E-42)
            gzg0 r12 = defpackage.yi0.e(r2, r12, r1, r3)
            l850 r1 = defpackage.l850.a
            r6 = 0
            r2 = 4
            cgn r6 = defpackage.yi0.a(r12, r1, r6, r2)
            r11.a = r3
            wd0<java.lang.Float, ij0> r4 = r11.b
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p720.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
