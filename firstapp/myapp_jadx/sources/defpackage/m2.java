package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {1661, 1662}, m = "invokeSuspend")
public final class m2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ psw b;
    public final /* synthetic */ mp20.b c;
    public final /* synthetic */ rr7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(psw pswVar, mp20.b bVar, rr7 rr7Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = pswVar;
        this.c = bVar;
        this.d = rr7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m2(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r7.b.a(r2, r7) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            mp20$b r2 = r7.c
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r8)
            goto L36
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L19:
            defpackage.uj50.b(r8)
            goto L2b
        L1d:
            defpackage.uj50.b(r8)
            long r5 = defpackage.zr7.a
            r7.a = r4
            java.lang.Object r8 = defpackage.hkd.b(r5, r7)
            if (r8 != r0) goto L2b
            goto L35
        L2b:
            r7.a = r3
            psw r8 = r7.b
            java.lang.Object r8 = r8.a(r2, r7)
            if (r8 != r0) goto L36
        L35:
            return r0
        L36:
            rr7 r7 = r7.d
            r7.Q = r2
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
