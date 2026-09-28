package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.components.LuckyWheelKt$LuckyWheel$3$1", f = "LuckyWheel.kt", l = {172, 176, 209}, m = "invokeSuspend", v = 2)
public final class h9u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ccb0 b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ p9u d;
    public final /* synthetic */ Function0<Unit> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9u(ccb0 ccb0Var, wd0<Float, ij0> wd0Var, p9u p9uVar, Function0<Unit> function0, v1b<? super h9u> v1bVar) {
        super(2, v1bVar);
        this.b = ccb0Var;
        this.c = wd0Var;
        this.d = p9uVar;
        this.e = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h9u(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h9u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (defpackage.wd0.a(r13.c, r7, r8, null, null, r11, 12) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (defpackage.wd0.a(r6, r7, r8, null, null, r13, 12) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r6.g(r13) == r0) goto L33;
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
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1b
            if (r1 == r5) goto L1b
            if (r1 != r3) goto L15
            defpackage.uj50.b(r14)
            r11 = r13
            goto L73
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r2
        L1b:
            defpackage.uj50.b(r14)
            goto Lb6
        L20:
            defpackage.uj50.b(r14)
            ccb0 r14 = r13.b
            int r14 = r14.ordinal()
            wd0<java.lang.Float, ij0> r6 = r13.c
            if (r14 == 0) goto Lac
            r1 = 0
            r7 = 1135869952(0x43b40000, float:360.0)
            if (r14 == r4) goto L7f
            if (r14 != r5) goto L7b
            p9u r14 = r13.d
            if (r14 == 0) goto L78
            float r14 = r14.c
            java.lang.Object r2 = r6.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r4 = r2 / r7
            double r8 = (double) r4
            double r8 = java.lang.Math.floor(r8)
            float r4 = (float) r8
            float r4 = r4 * r7
            float r4 = r4 + r14
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 > 0) goto L53
            float r4 = r4 + r7
        L53:
            r14 = 1161035776(0x45340000, float:2880.0)
            float r4 = r4 + r14
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r4)
            r14 = 5000(0x1388, float:7.006E-42)
            f4c r2 = defpackage.xkf.b
            gzg0 r8 = defpackage.yi0.e(r14, r1, r2, r5)
            r13.a = r3
            wd0<java.lang.Float, ij0> r6 = r13.c
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L73
            goto Lb5
        L73:
            kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r11.e
            r13.invoke()
        L78:
            kotlin.Unit r13 = kotlin.Unit.a
            goto Lb6
        L7b:
            defpackage.uhc.a()
            return r2
        L7f:
            r11 = r13
            java.lang.Object r13 = r6.d()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r13 = r13 + r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r13)
            r13 = 1000(0x3e8, float:1.401E-42)
            wkf r14 = defpackage.xkf.d
            gzg0 r13 = defpackage.yi0.e(r13, r1, r14, r5)
            r3 = 0
            r14 = 6
            cgn r8 = defpackage.yi0.a(r13, r2, r3, r14)
            r11.a = r5
            r9 = 0
            r10 = 0
            r12 = 12
            java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto Lb6
            goto Lb5
        Lac:
            r11 = r13
            r11.a = r4
            java.lang.Object r13 = r6.g(r11)
            if (r13 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
