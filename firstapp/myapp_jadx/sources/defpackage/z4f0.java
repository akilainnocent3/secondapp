package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {498, 500}, m = "invokeSuspend")
public final class z4f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c9p c;
    public final /* synthetic */ Function2<v5b, v1b<? super Unit>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z4f0(c9p c9pVar, Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super z4f0> v1bVar) {
        super(2, v1bVar);
        this.c = c9pVar;
        this.d = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z4f0 z4f0Var = new z4f0(this.c, this.d, v1bVar);
        z4f0Var.b = obj;
        return z4f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z4f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r5.d.invoke(r1, r5) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.b
            v5b r1 = (defpackage.v5b) r1
            defpackage.uj50.b(r6)
            goto L34
        L1f:
            defpackage.uj50.b(r6)
            java.lang.Object r6 = r5.b
            r1 = r6
            v5b r1 = (defpackage.v5b) r1
            r5.b = r1
            r5.a = r4
            c9p r6 = r5.c
            java.lang.Object r6 = r6.join(r5)
            if (r6 != r0) goto L34
            goto L40
        L34:
            r5.b = r2
            r5.a = r3
            kotlin.jvm.functions.Function2<v5b, v1b<? super kotlin.Unit>, java.lang.Object> r6 = r5.d
            java.lang.Object r5 = r6.invoke(r1, r5)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
