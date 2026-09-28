package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1389, 1407, 1431}, m = "invokeSuspend")
public final class h10 extends tje0 implements iaj<t00, n9f<Object>, Object, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ t00 b;
    public /* synthetic */ n9f c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i20<Object> e;
    public final /* synthetic */ float f;
    public final /* synthetic */ xi0<Float> i;
    public final /* synthetic */ aq40 v;
    public final /* synthetic */ h4d<Float> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(i20<Object> i20Var, float f, xi0<Float> xi0Var, aq40 aq40Var, h4d<Float> h4dVar, v1b<? super h10> v1bVar) {
        super(4, v1bVar);
        this.e = i20Var;
        this.f = f;
        this.i = xi0Var;
        this.v = aq40Var;
        this.w = h4dVar;
    }

    @Override // defpackage.iaj
    public final Object d(t00 t00Var, n9f<Object> n9fVar, Object obj, v1b<? super Unit> v1bVar) {
        aq40 aq40Var = this.v;
        h4d<Float> h4dVar = this.w;
        h10 h10Var = new h10(this.e, this.f, this.i, aq40Var, h4dVar, v1bVar);
        h10Var.b = t00Var;
        h10Var.c = n9fVar;
        h10Var.d = obj;
        return h10Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (defpackage.sje0.d(r1, r5, false, r3, r16) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (androidx.compose.foundation.gestures.a.d(r16.e, r14, r0, r3, r10, r16.i, r16) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (androidx.compose.foundation.gestures.a.d(r16.e, r15, r0, r3, r10, r16.i, r16) == r7) goto L42;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
