package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", l = {536, 539, 547}, m = "invokeSuspend")
public final class u8f extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public aq40 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c8f e;
    public final /* synthetic */ Function2<m020, Float, Unit> f;
    public final /* synthetic */ Function0<Unit> i;
    public final /* synthetic */ e8f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8f(c8f c8fVar, Function2 function2, Function0 function0, e8f e8fVar, v1b v1bVar) {
        super(2, v1bVar);
        this.e = c8fVar;
        this.f = function2;
        this.i = function0;
        this.v = e8fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u8f u8fVar = new u8f(this.e, this.f, this.i, this.v, v1bVar);
        u8fVar.d = obj;
        return u8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((u8f) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r13 == r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r12.c
            r2 = 0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L28
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L17
            defpackage.uj50.b(r13)
            r11 = r12
            goto L89
        L17:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r3
        L1d:
            aq40 r1 = r12.b
            java.lang.Object r5 = r12.d
            vp1 r5 = (defpackage.vp1) r5
            defpackage.uj50.b(r13)
            r11 = r12
            goto L63
        L28:
            java.lang.Object r1 = r12.d
            vp1 r1 = (defpackage.vp1) r1
            defpackage.uj50.b(r13)
        L2f:
            r6 = r1
            goto L44
        L31:
            defpackage.uj50.b(r13)
            java.lang.Object r13 = r12.d
            r1 = r13
            vp1 r1 = (defpackage.vp1) r1
            r12.d = r1
            r12.c = r6
            java.lang.Object r13 = defpackage.u4f0.b(r1, r12, r5)
            if (r13 != r0) goto L2f
            goto L88
        L44:
            m020 r13 = (defpackage.m020) r13
            aq40 r1 = new aq40
            r1.<init>()
            long r7 = r13.a
            int r9 = r13.i
            s8f r10 = new s8f
            r10.<init>(r1, r2)
            r12.d = r6
            r12.b = r1
            r12.c = r5
            r11 = r12
            java.lang.Object r13 = defpackage.y8f.d(r6, r7, r9, r10, r11)
            if (r13 != r0) goto L62
            goto L88
        L62:
            r5 = r6
        L63:
            m020 r13 = (defpackage.m020) r13
            if (r13 == 0) goto L99
            kotlin.Unit r12 = kotlin.Unit.a
            float r12 = r1.a
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r12)
            kotlin.jvm.functions.Function2<m020, java.lang.Float, kotlin.Unit> r12 = r11.f
            r12.invoke(r13, r1)
            long r6 = r13.a
            t8f r13 = new t8f
            r13.<init>(r12, r2)
            r11.d = r3
            r11.b = r3
            r11.c = r4
            java.lang.Object r13 = defpackage.y8f.l(r5, r6, r13, r11)
            if (r13 != r0) goto L89
        L88:
            return r0
        L89:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r12 = r13.booleanValue()
            if (r12 == 0) goto L97
            kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r11.i
            r12.invoke()
            goto L99
        L97:
            kotlin.Unit r12 = kotlin.Unit.a
        L99:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
