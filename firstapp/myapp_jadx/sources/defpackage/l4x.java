package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.NCUseCase$deletePersonalNotification$1", f = "NCUseCase.kt", l = {104, 105}, m = "invokeSuspend", v = 2)
public final class l4x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public h4x a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h4x e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4x(h4x h4xVar, int i, v1b<? super l4x> v1bVar) {
        super(2, v1bVar);
        this.e = h4xVar;
        this.f = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l4x l4xVar = new l4x(this.e, this.f, v1bVar);
        l4xVar.d = obj;
        return l4xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l4x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r7.e(r1, r6) == r0) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            v5b r0 = (defpackage.v5b) r0
            y5b r0 = defpackage.y5b.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            h4x r6 = r6.a
            v5b r6 = (defpackage.v5b) r6
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L19:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r4
        L1f:
            int r1 = r6.b
            h4x r3 = r6.a
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L5a
            goto L42
        L27:
            defpackage.uj50.b(r7)
            h4x r7 = r6.e
            int r1 = r6.f
            zi50$a r5 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L5a
            sen r5 = r7.a     // Catch: java.lang.Throwable -> L5a
            r6.d = r4     // Catch: java.lang.Throwable -> L5a
            r6.a = r7     // Catch: java.lang.Throwable -> L5a
            r6.b = r1     // Catch: java.lang.Throwable -> L5a
            r6.c = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r3 = r5.f(r1, r6)     // Catch: java.lang.Throwable -> L5a
            if (r3 != r0) goto L41
            goto L54
        L41:
            r3 = r7
        L42:
            com.sportybet.feature.notificationcenter.db.NCDatabase r7 = r3.c     // Catch: java.lang.Throwable -> L5a
            v2x r7 = r7.y()     // Catch: java.lang.Throwable -> L5a
            r6.d = r4     // Catch: java.lang.Throwable -> L5a
            r6.a = r4     // Catch: java.lang.Throwable -> L5a
            r6.c = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r7.e(r1, r6)     // Catch: java.lang.Throwable -> L5a
            if (r6 != r0) goto L55
        L54:
            return r0
        L55:
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L5a
            zi50$a r6 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            zi50$a r6 = defpackage.zi50.b
        L5c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l4x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
