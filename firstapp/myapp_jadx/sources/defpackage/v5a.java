package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.crashInitiated.components.ComposeBetContainerInitiatedKt$ResultantButtonNew$1$1", f = "ComposeBetContainerInitiated.kt", l = {2239, 2240}, m = "invokeSuspend", v = 1)
public final class v5a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ Function0<Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5a(boolean z, wd0<Float, ij0> wd0Var, Function0<Unit> function0, v1b<? super v5a> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = wd0Var;
        this.d = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v5a(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v5a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (defpackage.wd0.a(r11.c, r5, r6, null, null, r9, 12) == r0) goto L17;
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
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L19
            if (r1 != r3) goto L11
            defpackage.uj50.b(r12)
            r9 = r11
            goto L55
        L11:
            r11 = 0
            java.lang.String r11 = com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb.rjqMzYeqPaa
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L19:
            defpackage.uj50.b(r12)
            goto L35
        L1d:
            defpackage.uj50.b(r12)
            boolean r12 = r11.b
            if (r12 == 0) goto L5a
            java.lang.Float r12 = new java.lang.Float
            r1 = 0
            r12.<init>(r1)
            r11.a = r2
            wd0<java.lang.Float, ij0> r1 = r11.c
            java.lang.Object r12 = r1.f(r11, r12)
            if (r12 != r0) goto L35
            goto L54
        L35:
            java.lang.Float r5 = new java.lang.Float
            r12 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12)
            r12 = 0
            f4c r1 = defpackage.xkf.b
            r2 = 500(0x1f4, float:7.0E-43)
            gzg0 r6 = defpackage.yi0.e(r2, r12, r1, r3)
            r11.a = r3
            wd0<java.lang.Float, ij0> r4 = r11.c
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r9.d
            r11.invoke()
        L5a:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
