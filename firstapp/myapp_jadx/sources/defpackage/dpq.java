package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyScreenKt$rememberBackToTopState$3$1$1", f = "LNLobbyScreen.kt", l = {532, 533}, m = "invokeSuspend", v = 2)
public final class dpq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ ytw c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpq(zzr zzrVar, ytw ytwVar, ytw ytwVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = ytwVar;
        this.d = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dpq(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dpq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r6.f(0, 0, r5) == r0) goto L20;
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
            ytw<java.lang.Boolean> r2 = r5.d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L14
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L12
            goto L46
        L12:
            r5 = move-exception
            goto L59
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L1b:
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L12
            goto L38
        L1f:
            defpackage.uj50.b(r6)
            cpq r6 = new cpq     // Catch: java.lang.Throwable -> L12
            r6.<init>()     // Catch: java.lang.Throwable -> L12
            r5.a = r4     // Catch: java.lang.Throwable -> L12
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()     // Catch: java.lang.Throwable -> L12
            r4w r1 = defpackage.t4w.a(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r6 = r1.P(r6, r5)     // Catch: java.lang.Throwable -> L12
            if (r6 != r0) goto L38
            goto L45
        L38:
            zzr r6 = r5.b     // Catch: java.lang.Throwable -> L12
            r5.a = r3     // Catch: java.lang.Throwable -> L12
            uv60 r1 = defpackage.zzr.x     // Catch: java.lang.Throwable -> L12
            r1 = 0
            java.lang.Object r6 = r6.f(r1, r1, r5)     // Catch: java.lang.Throwable -> L12
            if (r6 != r0) goto L46
        L45:
            return r0
        L46:
            ytw r5 = r5.c     // Catch: java.lang.Throwable -> L12
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5     // Catch: java.lang.Throwable -> L12
            r5.invoke()     // Catch: java.lang.Throwable -> L12
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r2.setValue(r5)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.setValue(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
