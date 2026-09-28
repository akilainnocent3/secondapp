package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$FlyingBallAnimation$5$1", f = "OngoingComponent.kt", l = {769, 773, 774, 775, 783}, m = "invokeSuspend", v = 1)
public final class qwy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wd0<Float, ij0> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwy(wd0 wd0Var, v1b v1bVar, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qwy(this.c, v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qwy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r15.f(r16, r0) == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (defpackage.wd0.a(r16.c, r0, r2, null, null, r16, 12) == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (defpackage.wd0.a(r16.c, r0, r2, null, null, r16, 12) == r7) goto L38;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r16
            y5b r7 = defpackage.y5b.a
            int r0 = r5.a
            r1 = 6
            r2 = 0
            r3 = 50
            r4 = 5
            r6 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r0 == 0) goto L39
            if (r0 == r10) goto L35
            if (r0 == r9) goto L31
            if (r0 == r8) goto L2d
            if (r0 == r6) goto L28
            if (r0 != r4) goto L22
            defpackage.uj50.b(r17)
            goto Lbd
        L22:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r12
        L28:
            defpackage.uj50.b(r17)
            goto Lbf
        L2d:
            defpackage.uj50.b(r17)
            goto L7c
        L31:
            defpackage.uj50.b(r17)
            goto L71
        L35:
            defpackage.uj50.b(r17)
            goto L58
        L39:
            defpackage.uj50.b(r17)
            java.lang.String r0 = "ROUND_WAITING"
            java.lang.String r13 = r5.b
            boolean r0 = kotlin.jvm.internal.Intrinsics.g(r13, r0)
            r14 = 1065353216(0x3f800000, float:1.0)
            wd0<java.lang.Float, ij0> r15 = r5.c
            if (r0 == 0) goto L5b
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r14)
            r5.a = r10
            java.lang.Object r0 = r15.f(r5, r0)
            if (r0 != r7) goto L58
            goto Lbc
        L58:
            kotlin.Unit r0 = kotlin.Unit.a
            goto Lbf
        L5b:
            java.lang.String r0 = "ROUND_PRE_START"
            boolean r0 = kotlin.jvm.internal.Intrinsics.g(r13, r0)
            if (r0 == 0) goto L95
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r14)
            r5.a = r9
            java.lang.Object r0 = r15.f(r5, r0)
            if (r0 != r7) goto L71
            goto Lbc
        L71:
            r5.a = r8
            r8 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = defpackage.hkd.b(r8, r5)
            if (r0 != r7) goto L7c
            goto Lbc
        L7c:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r11)
            gzg0 r2 = defpackage.yi0.e(r3, r2, r12, r1)
            r5.a = r6
            r1 = r0
            wd0<java.lang.Float, ij0> r0 = r5.c
            r3 = 0
            r4 = 0
            r6 = 12
            java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto Lbf
            goto Lbc
        L95:
            java.lang.Object r0 = r15.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto La4
            goto Lbd
        La4:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r11)
            gzg0 r2 = defpackage.yi0.e(r3, r2, r12, r1)
            r5.a = r4
            r1 = r0
            wd0<java.lang.Float, ij0> r0 = r5.c
            r3 = 0
            r4 = 0
            r6 = 12
            java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto Lbd
        Lbc:
            return r7
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.a
        Lbf:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
