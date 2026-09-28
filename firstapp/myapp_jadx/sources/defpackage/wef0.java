package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {182, 183, 185, 185}, m = "invokeSuspend")
public final class wef0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Throwable a;
    public int b;
    public final /* synthetic */ xef0 c;
    public final /* synthetic */ oef0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wef0(xef0 xef0Var, oef0 oef0Var, v1b<? super wef0> v1bVar) {
        super(2, v1bVar);
        this.c = xef0Var;
        this.d = oef0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wef0(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wef0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r8.invoke(r7) == r0) goto L37;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            xef0 r6 = r7.c
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 == r2) goto L1b
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1b:
            java.lang.Throwable r7 = r7.a
            defpackage.uj50.b(r8)
            goto L6a
        L21:
            defpackage.uj50.b(r8)
            goto L57
        L25:
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L4a
        L29:
            r8 = move-exception
            goto L5a
        L2b:
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L3f
        L2f:
            defpackage.uj50.b(r8)
            kotlin.jvm.functions.Function1<? super v1b<? super kotlin.Unit>, ? extends java.lang.Object> r8 = r6.G     // Catch: java.lang.Throwable -> L29
            if (r8 == 0) goto L3f
            r7.b = r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L29
            if (r8 != r0) goto L3f
            goto L68
        L3f:
            oef0 r8 = r7.d     // Catch: java.lang.Throwable -> L29
            r7.b = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r8.a(r6, r7)     // Catch: java.lang.Throwable -> L29
            if (r8 != r0) goto L4a
            goto L68
        L4a:
            kotlin.jvm.functions.Function1<? super v1b<? super kotlin.Unit>, ? extends java.lang.Object> r8 = r6.H
            if (r8 == 0) goto L57
            r7.b = r3
            java.lang.Object r7 = r8.invoke(r7)
            if (r7 != r0) goto L57
            goto L68
        L57:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L5a:
            kotlin.jvm.functions.Function1<? super v1b<? super kotlin.Unit>, ? extends java.lang.Object> r1 = r6.H
            if (r1 == 0) goto L6b
            r7.a = r8
            r7.b = r2
            java.lang.Object r7 = r1.invoke(r7)
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            r7 = r8
        L6a:
            r8 = r7
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wef0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
