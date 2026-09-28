package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", l = {304, 306}, m = "invokeSuspend")
public final class z930 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ x930 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z930(x930 x930Var, v1b<? super z930> v1bVar) {
        super(2, v1bVar);
        this.b = x930Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z930(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z930) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r5.s2(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5.t2(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return r0;
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
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L14:
            defpackage.uj50.b(r5)
            goto L33
        L18:
            defpackage.uj50.b(r5)
            x930 r5 = r4.b
            boolean r1 = r5.F
            if (r1 != 0) goto L2a
            r4.a = r3
            java.lang.Object r4 = r5.s2(r4)
            if (r4 != r0) goto L33
            goto L32
        L2a:
            r4.a = r2
            java.lang.Object r4 = r5.t2(r4)
            if (r4 != r0) goto L33
        L32:
            return r0
        L33:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z930.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
