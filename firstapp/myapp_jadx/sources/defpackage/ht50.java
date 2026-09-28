package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend")
public final class ht50 extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Function1<gly, Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ht50(Function1<? super gly, Unit> function1, v1b<? super ht50> v1bVar) {
        super(2, v1bVar);
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ht50 ht50Var = new ht50(this.d, v1bVar);
        ht50Var.c = obj;
        return ht50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((ht50) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r2) goto L11
            defpackage.uj50.b(r7)
            goto L52
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L17:
            java.lang.Object r1 = r6.c
            vp1 r1 = (defpackage.vp1) r1
            defpackage.uj50.b(r7)
            goto L32
        L1f:
            defpackage.uj50.b(r7)
            java.lang.Object r7 = r6.c
            r1 = r7
            vp1 r1 = (defpackage.vp1) r1
            r6.c = r1
            r6.b = r4
            java.lang.Object r7 = defpackage.i0a.a(r1, r6)
            if (r7 != r0) goto L32
            goto L51
        L32:
            m020 r7 = (defpackage.m020) r7
            r7.a()
            long r4 = r7.c
            gly r7 = new gly
            r7.<init>(r4)
            kotlin.jvm.functions.Function1<gly, kotlin.Unit> r4 = r6.d
            r4.invoke(r7)
            r6.c = r3
            r6.b = r2
            u4f0$a r7 = defpackage.u4f0.a
            c020 r7 = defpackage.c020.b
            java.lang.Object r7 = defpackage.u4f0.h(r1, r7, r6)
            if (r7 != r0) goto L52
        L51:
            return r0
        L52:
            m020 r7 = (defpackage.m020) r7
            if (r7 == 0) goto L59
            r7.a()
        L59:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
