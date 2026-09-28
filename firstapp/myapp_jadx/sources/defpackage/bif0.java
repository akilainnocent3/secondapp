package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {218, 219}, m = "invokeSuspend")
public final class bif0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iif0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bif0(iif0 iif0Var, v1b<? super bif0> v1bVar) {
        super(1, v1bVar);
        this.b = iif0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new bif0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((bif0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r2.m(r5) == r0) goto L15;
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
            iif0 r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r6)
            goto L32
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L29
        L1d:
            defpackage.uj50.b(r6)
            r5.a = r4
            java.lang.Object r6 = r2.s(r5)
            if (r6 != r0) goto L29
            goto L31
        L29:
            r5.a = r3
            java.lang.Object r5 = r2.m(r5)
            if (r5 != r0) goto L32
        L31:
            return r0
        L32:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bif0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
