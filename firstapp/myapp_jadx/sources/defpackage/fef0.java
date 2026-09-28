package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {106, 107}, m = "invokeSuspend")
public final class fef0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ eef0 b;
    public final /* synthetic */ oef0 c;
    public final /* synthetic */ eef0.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fef0(eef0 eef0Var, oef0 oef0Var, eef0.a aVar, v1b<? super fef0> v1bVar) {
        super(2, v1bVar);
        this.b = eef0Var;
        this.c = oef0Var;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fef0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fef0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r4.c.a(r4.d, r4) == r0) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            defpackage.uj50.b(r5)
            goto L3a
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L17:
            defpackage.uj50.b(r5)
            goto L2d
        L1b:
            defpackage.uj50.b(r5)
            eef0 r5 = r4.b
            kotlin.jvm.functions.Function1<? super v1b<? super kotlin.Unit>, ? extends java.lang.Object> r5 = r5.F
            if (r5 == 0) goto L2d
            r4.a = r3
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L2d
            goto L39
        L2d:
            r4.a = r2
            oef0 r5 = r4.c
            eef0$a r1 = r4.d
            java.lang.Object r4 = r5.a(r1, r4)
            if (r4 != r0) goto L3a
        L39:
            return r0
        L3a:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fef0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
