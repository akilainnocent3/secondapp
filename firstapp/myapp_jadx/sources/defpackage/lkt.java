package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {87, 91}, m = "invokeSuspend")
public final class lkt extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public m020 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fff0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkt(fff0 fff0Var, v1b<? super lkt> v1bVar) {
        super(2, v1bVar);
        this.e = fff0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lkt lktVar = new lkt(this.e, v1bVar);
        lktVar.d = obj;
        return lktVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((lkt) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
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
            fff0 r2 = r12.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L18
            m020 r1 = r12.b
            java.lang.Object r4 = r12.d
            vp1 r4 = (defpackage.vp1) r4
            defpackage.uj50.b(r13)
            goto L52
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            r12 = 0
            return r12
        L1f:
            java.lang.Object r1 = r12.d
            vp1 r1 = (defpackage.vp1) r1
            defpackage.uj50.b(r13)
            goto L3a
        L27:
            defpackage.uj50.b(r13)
            java.lang.Object r13 = r12.d
            r1 = r13
            vp1 r1 = (defpackage.vp1) r1
            r12.d = r1
            r12.c = r4
            java.lang.Object r13 = defpackage.u4f0.b(r1, r12, r3)
            if (r13 != r0) goto L3a
            goto L51
        L3a:
            m020 r13 = (defpackage.m020) r13
            long r4 = r13.c
            r2.a()
            r4 = r1
            r1 = r13
        L43:
            r12.d = r4
            r12.b = r1
            r12.c = r3
            c020 r13 = defpackage.c020.b
            java.lang.Object r13 = r4.l1(r13, r12)
            if (r13 != r0) goto L52
        L51:
            return r0
        L52:
            b020 r13 = (defpackage.b020) r13
            java.util.List<m020> r13 = r13.a
            int r5 = r13.size()
            r6 = 0
        L5b:
            if (r6 >= r5) goto L75
            java.lang.Object r7 = r13.get(r6)
            m020 r7 = (defpackage.m020) r7
            long r8 = r7.a
            long r10 = r1.a
            boolean r8 = defpackage.k020.a(r8, r10)
            if (r8 == 0) goto L72
            boolean r7 = r7.d
            if (r7 == 0) goto L72
            goto L43
        L72:
            int r6 = r6 + 1
            goto L5b
        L75:
            r2.d()
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
