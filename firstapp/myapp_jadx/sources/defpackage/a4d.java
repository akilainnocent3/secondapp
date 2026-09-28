package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantViewModel$clearOverride$1", f = "DebugVariantViewModel.kt", l = {80, 83}, m = "invokeSuspend", v = 2)
public final class a4d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y3d b;
    public final /* synthetic */ x66<?> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4d(y3d y3dVar, x66<?> x66Var, v1b<? super a4d> v1bVar) {
        super(2, v1bVar);
        this.b = y3dVar;
        this.c = x66Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a4d(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a4d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
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
            int r1 = r6.a
            x66<?> r2 = r6.c
            y3d r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L14
            defpackage.uj50.b(r7)
            goto L3f
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)
            goto L2d
        L1f:
            defpackage.uj50.b(r7)
            yqm r7 = r3.a
            r6.a = r5
            java.lang.Object r7 = r7.i(r2, r6)
            if (r7 != r0) goto L2d
            goto L3e
        L2d:
            y3d$c$b r7 = new y3d$c$b
            java.lang.String r1 = r2.a
            r7.<init>(r1)
            b390 r1 = r3.e
            r6.a = r4
            java.lang.Object r6 = r1.emit(r7, r6)
            if (r6 != r0) goto L3f
        L3e:
            return r0
        L3f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
