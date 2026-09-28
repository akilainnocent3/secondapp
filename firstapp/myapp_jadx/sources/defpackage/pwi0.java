package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.WaitingComponentKt$WaitingComponent$4$1", f = "WaitingComponent.kt", l = {116, 117}, m = "invokeSuspend", v = 1)
public final class pwi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwi0(wd0 wd0Var, v1b v1bVar, String str) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pwi0(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pwi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (defpackage.wd0.a(r11.b, r5, r6, null, null, r11, 12) == r0) goto L19;
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r12)
            goto L55
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r2
        L17:
            defpackage.uj50.b(r12)
            goto L29
        L1b:
            defpackage.uj50.b(r12)
            r11.a = r4
            r4 = 530(0x212, double:2.62E-321)
            java.lang.Object r12 = defpackage.hkd.b(r4, r11)
            if (r12 != r0) goto L29
            goto L54
        L29:
            java.lang.String r12 = r11.c
            java.lang.String r1 = "ROUND_PRE_START"
            boolean r12 = kotlin.jvm.internal.Intrinsics.g(r12, r1)
            if (r12 == 0) goto L36
            r12 = 1069547520(0x3fc00000, float:1.5)
            goto L38
        L36:
            r12 = 1065353216(0x3f800000, float:1.0)
        L38:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r12)
            r12 = 0
            r1 = 6
            r4 = 500(0x1f4, float:7.0E-43)
            gzg0 r6 = defpackage.yi0.e(r4, r12, r2, r1)
            r11.a = r3
            wd0<java.lang.Float, ij0> r4 = r11.b
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
