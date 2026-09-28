package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {225, 226}, m = "invokeSuspend")
public final class cif0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iif0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cif0(iif0 iif0Var, v1b<? super cif0> v1bVar) {
        super(1, v1bVar);
        this.b = iif0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new cif0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((cif0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r3.m(r5) == r0) goto L15;
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
            r2 = 2
            iif0 r3 = r5.b
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r2) goto L12
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
            java.lang.Object r6 = r3.s(r5)
            if (r6 != r0) goto L29
            goto L31
        L29:
            r5.a = r2
            java.lang.Object r5 = r3.m(r5)
            if (r5 != r0) goto L32
        L31:
            return r0
        L32:
            r3.C = r4
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cif0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
