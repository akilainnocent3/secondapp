package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {882, 883}, m = "invokeSuspend")
public final class ake0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ cke0.a<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ake0(long j, cke0.a<Object> aVar, v1b<? super ake0> v1bVar) {
        super(2, v1bVar);
        this.b = j;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ake0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ake0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (defpackage.hkd.b(8, r10) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r10.a
            r2 = 8
            long r4 = r10.b
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L1f
            if (r1 == r7) goto L1b
            if (r1 != r6) goto L14
            defpackage.uj50.b(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L1b:
            defpackage.uj50.b(r11)
            goto L2d
        L1f:
            defpackage.uj50.b(r11)
            long r8 = r4 - r2
            r10.a = r7
            java.lang.Object r11 = defpackage.hkd.b(r8, r10)
            if (r11 != r0) goto L2d
            goto L35
        L2d:
            r10.a = r6
            java.lang.Object r11 = defpackage.hkd.b(r2, r10)
            if (r11 != r0) goto L36
        L35:
            return r0
        L36:
            cke0$a<java.lang.Object> r10 = r10.c
            bc6 r10 = r10.c
            if (r10 == 0) goto L4b
            zi50$a r11 = defpackage.zi50.b
            e020 r11 = new e020
            r11.<init>(r4)
            zi50$b r0 = new zi50$b
            r0.<init>(r11)
            r10.resumeWith(r0)
        L4b:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
