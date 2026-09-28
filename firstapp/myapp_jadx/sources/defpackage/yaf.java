package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.state.DraggableLazyListState$onDragStop$1", f = "DraggableLazyListState.kt", l = {207, 208}, m = "invokeSuspend", v = 2)
public final class yaf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ abf b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yaf(abf abfVar, float f, v1b<? super yaf> v1bVar) {
        super(2, v1bVar);
        this.b = abfVar;
        this.c = f;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yaf(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yaf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (defpackage.wd0.a(r6, r7, r8, null, null, r13, 12) == r0) goto L15;
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
            r3 = 2
            abf r4 = r13.b
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r14)
            goto L55
        L13:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r2
        L19:
            defpackage.uj50.b(r14)
            goto L32
        L1d:
            defpackage.uj50.b(r14)
            wd0<java.lang.Float, ij0> r14 = r4.o
            java.lang.Float r1 = new java.lang.Float
            float r6 = r13.c
            r1.<init>(r6)
            r13.a = r5
            java.lang.Object r14 = r14.f(r13, r1)
            if (r14 != r0) goto L32
            goto L54
        L32:
            wd0<java.lang.Float, ij0> r6 = r4.o
            java.lang.Float r7 = new java.lang.Float
            r14 = 0
            r7.<init>(r14)
            java.lang.Float r1 = new java.lang.Float
            r8 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r8)
            r8 = 1137180672(0x43c80000, float:400.0)
            fkd0 r8 = defpackage.yi0.d(r14, r8, r1, r5)
            r13.a = r3
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L55
        L54:
            return r0
        L55:
            ytw r13 = r4.n
            x5a0 r13 = (defpackage.x5a0) r13
            r13.setValue(r2)
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yaf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
