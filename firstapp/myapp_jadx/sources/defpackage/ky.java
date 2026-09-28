package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.manager.AnTestManager$getCampaignVariant$1", f = "AnTestManager.kt", l = {72, 72, 73}, m = "invokeSuspend", v = 2)
public final class ky extends tje0 implements Function2<myh<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ly c;
    public final /* synthetic */ x66<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(ly lyVar, x66<Object> x66Var, v1b<? super ky> v1bVar) {
        super(2, v1bVar);
        this.c = lyVar;
        this.d = x66Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ky kyVar = new ky(this.c, this.d, v1bVar);
        kyVar.b = obj;
        return kyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        return ((ky) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 0
            x66<java.lang.Object> r4 = r9.d
            ly r5 = r9.c
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L2a
            if (r2 == r8) goto L26
            if (r2 == r7) goto L22
            if (r2 != r6) goto L1c
            defpackage.uj50.b(r10)
            goto L5a
        L1c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r3
        L22:
            defpackage.uj50.b(r10)
            goto L4d
        L26:
            defpackage.uj50.b(r10)
            goto L3c
        L2a:
            defpackage.uj50.b(r10)
            lyh r10 = r5.d(r4)
            r9.b = r0
            r9.a = r8
            java.lang.Object r10 = defpackage.s0i.a(r10, r9)
            if (r10 != r1) goto L3c
            goto L59
        L3c:
            java.lang.Enum r10 = (java.lang.Enum) r10
            if (r10 != 0) goto L4f
            hz r10 = r5.a
            r9.b = r0
            r9.a = r7
            java.lang.Object r10 = r10.j(r4, r9)
            if (r10 != r1) goto L4d
            goto L59
        L4d:
            java.lang.Enum r10 = (java.lang.Enum) r10
        L4f:
            r9.b = r3
            r9.a = r6
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
