package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {705, 708, 716}, m = "invokeSuspend")
public final class r8f extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public aq40 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wyb0 e;
    public final /* synthetic */ goq f;
    public final /* synthetic */ p5g0 i;
    public final /* synthetic */ y7f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8f(wyb0 wyb0Var, goq goqVar, p5g0 p5g0Var, y7f y7fVar, v1b v1bVar) {
        super(2, v1bVar);
        this.e = wyb0Var;
        this.f = goqVar;
        this.i = p5g0Var;
        this.v = y7fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r8f r8fVar = new r8f(this.e, this.f, this.i, this.v, v1bVar);
        r8fVar.d = obj;
        return r8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((r8f) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Type inference failed for: r9v0, types: [p8f] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L30
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L16
            defpackage.uj50.b(r12)
            r10 = r11
            goto L91
        L16:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r2
        L1c:
            aq40 r1 = r11.b
            java.lang.Object r4 = r11.d
            vp1 r4 = (defpackage.vp1) r4
            defpackage.uj50.b(r12)
            r10 = r11
            goto L62
        L27:
            java.lang.Object r1 = r11.d
            vp1 r1 = (defpackage.vp1) r1
            defpackage.uj50.b(r12)
        L2e:
            r5 = r1
            goto L43
        L30:
            defpackage.uj50.b(r12)
            java.lang.Object r12 = r11.d
            r1 = r12
            vp1 r1 = (defpackage.vp1) r1
            r11.d = r1
            r11.c = r5
            java.lang.Object r12 = defpackage.u4f0.b(r1, r11, r4)
            if (r12 != r0) goto L2e
            goto L90
        L43:
            m020 r12 = (defpackage.m020) r12
            aq40 r1 = new aq40
            r1.<init>()
            long r6 = r12.a
            int r8 = r12.i
            p8f r9 = new p8f
            r9.<init>()
            r11.d = r5
            r11.b = r1
            r11.c = r4
            r10 = r11
            java.lang.Object r12 = defpackage.y8f.b(r5, r6, r8, r9, r10)
            if (r12 != r0) goto L61
            goto L90
        L61:
            r4 = r5
        L62:
            m020 r12 = (defpackage.m020) r12
            if (r12 == 0) goto La1
            wyb0 r11 = r10.e
            java.lang.Object r11 = r11.b
            aq40 r11 = (defpackage.aq40) r11
            r5 = 0
            r11.a = r5
            kotlin.Unit r11 = kotlin.Unit.a
            float r11 = r1.a
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r11)
            goq r11 = r10.f
            r11.invoke(r12, r1)
            long r5 = r12.a
            q8f r12 = new q8f
            r12.<init>()
            r10.d = r2
            r10.b = r2
            r10.c = r3
            java.lang.Object r12 = defpackage.y8f.i(r4, r5, r12, r10)
            if (r12 != r0) goto L91
        L90:
            return r0
        L91:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L9f
            p5g0 r11 = r10.i
            r11.invoke()
            goto La1
        L9f:
            kotlin.Unit r11 = kotlin.Unit.a
        La1:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
