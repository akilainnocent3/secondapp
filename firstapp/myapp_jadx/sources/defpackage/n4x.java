package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.NCUseCase$markAsRead$1", f = "NCUseCase.kt", l = {86, 87}, m = "invokeSuspend", v = 2)
public final class n4x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public h4x a;
    public f4x b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h4x e;
    public final /* synthetic */ f4x f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4x(h4x h4xVar, f4x f4xVar, v1b<? super n4x> v1bVar) {
        super(2, v1bVar);
        this.e = h4xVar;
        this.f = f4xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n4x n4xVar = new n4x(this.e, this.f, v1bVar);
        n4xVar.d = obj;
        return n4xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n4x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r9 == r0) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            v5b r0 = (defpackage.v5b) r0
            y5b r0 = defpackage.y5b.a
            int r1 = r8.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            h4x r8 = r8.a
            v5b r8 = (defpackage.v5b) r8
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L60
            goto L5b
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r4
        L1f:
            f4x r1 = r8.b
            h4x r3 = r8.a
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L60
            goto L48
        L27:
            defpackage.uj50.b(r9)
            h4x r9 = r8.e
            f4x r1 = r8.f
            zi50$a r5 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L60
            m2l r5 = r9.b     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r1.c     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L60
            r8.d = r4     // Catch: java.lang.Throwable -> L60
            r8.a = r9     // Catch: java.lang.Throwable -> L60
            r8.b = r1     // Catch: java.lang.Throwable -> L60
            r8.c = r3     // Catch: java.lang.Throwable -> L60
            zed r3 = r5.a     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r3.putBoolean(r6, r7, r8)     // Catch: java.lang.Throwable -> L60
            if (r3 != r0) goto L47
            goto L5a
        L47:
            r3 = r9
        L48:
            sen r9 = r3.a     // Catch: java.lang.Throwable -> L60
            int r1 = r1.a     // Catch: java.lang.Throwable -> L60
            r8.d = r4     // Catch: java.lang.Throwable -> L60
            r8.a = r4     // Catch: java.lang.Throwable -> L60
            r8.b = r4     // Catch: java.lang.Throwable -> L60
            r8.c = r2     // Catch: java.lang.Throwable -> L60
            java.lang.Object r9 = r9.a(r1, r8)     // Catch: java.lang.Throwable -> L60
            if (r9 != r0) goto L5b
        L5a:
            return r0
        L5b:
            com.sporty.android.common.network.data.BaseResponse r9 = (com.sporty.android.common.network.data.BaseResponse) r9     // Catch: java.lang.Throwable -> L60
            zi50$a r8 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            zi50$a r8 = defpackage.zi50.b
        L62:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
