package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {1676, 1681, 1682}, m = "invokeSuspend")
public final class k2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public mp20.c a;
    public int b;
    public final /* synthetic */ rr7 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ psw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(rr7 rr7Var, long j, psw pswVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = rr7Var;
        this.d = j;
        this.e = pswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k2(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r3.a(r1, r8) == r0) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.b
            r2 = 0
            psw r3 = r8.e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L26
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L16
            defpackage.uj50.b(r9)
            goto L5a
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L1c:
            mp20$c r1 = r8.a
            defpackage.uj50.b(r9)
            goto L4f
        L22:
            defpackage.uj50.b(r9)
            goto L38
        L26:
            defpackage.uj50.b(r9)
            rr7 r9 = r8.c
            jvd0 r9 = r9.W
            if (r9 == 0) goto L38
            r8.b = r6
            java.lang.Object r9 = defpackage.i9p.c(r9, r8)
            if (r9 != r0) goto L38
            goto L59
        L38:
            mp20$b r9 = new mp20$b
            long r6 = r8.d
            r9.<init>(r6)
            mp20$c r1 = new mp20$c
            r1.<init>(r9)
            r8.a = r1
            r8.b = r5
            java.lang.Object r9 = r3.a(r9, r8)
            if (r9 != r0) goto L4f
            goto L59
        L4f:
            r8.a = r2
            r8.b = r4
            java.lang.Object r8 = r3.a(r1, r8)
            if (r8 != r0) goto L5a
        L59:
            return r0
        L5a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
