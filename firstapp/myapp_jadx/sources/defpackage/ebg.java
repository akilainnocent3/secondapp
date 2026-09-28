package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.environment.EnvironmentManagerImpl$1", f = "EnvironmentManagerImpl.kt", l = {62, 72}, m = "invokeSuspend", v = 2)
public final class ebg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fbg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebg(fbg fbgVar, v1b<? super ebg> v1bVar) {
        super(2, v1bVar);
        this.b = fbgVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ebg(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ebg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (defpackage.kzh.b(defpackage.ozh.c(r8.a.a(), r8.d), new defpackage.vmh0(r8, null), r7) == r0) goto L31;
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            defpackage.uj50.b(r8)
            goto L81
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L18:
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L1c
            goto L2c
        L1c:
            r8 = move-exception
            goto L2f
        L1e:
            defpackage.uj50.b(r8)
            fbg r8 = r7.b     // Catch: java.lang.Throwable -> L1c
            r7.a = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r8 = r8.e(r7)     // Catch: java.lang.Throwable -> L1c
            if (r8 != r0) goto L2c
            goto L80
        L2c:
            tmh0 r8 = (defpackage.tmh0) r8     // Catch: java.lang.Throwable -> L1c
            goto L5c
        L2f:
            java.lang.String r1 = "SB_CONFIG"
            java.lang.String r5 = "UrlConfig init failed; using local default for process lifetime"
            android.util.Log.e(r1, r5, r8)
            fbg r8 = r7.b
            java.lang.Object r1 = r8.c
            monitor-enter(r1)
            tmh0 r5 = r8.d     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L5a
            java.lang.String r5 = "UrlConfig init failed; using local default for process lifetime"
            r8.e = r4     // Catch: java.lang.Throwable -> L58
            fbg$a r4 = r8.c()     // Catch: java.lang.Throwable -> L58
            tmh0 r6 = r8.d(r4)     // Catch: java.lang.Throwable -> L58
            tmh0 r4 = defpackage.fbg.f(r6, r4)     // Catch: java.lang.Throwable -> L58
            r8.d = r4     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = "SB_CONFIG"
            android.util.Log.w(r8, r5)     // Catch: java.lang.Throwable -> L58
            r8 = r4
            goto L5b
        L58:
            r7 = move-exception
            goto L84
        L5a:
            r8 = r5
        L5b:
            monitor-exit(r1)
        L5c:
            fbg r1 = r7.b
            dm8 r1 = r1.h
            r1.R(r8)
            fbg r8 = r7.b
            zmh0 r8 = r8.b
            r7.a = r3
            anh0 r1 = r8.a
            lyh r1 = r1.a()
            k5b r3 = r8.d
            lyh r1 = defpackage.ozh.c(r1, r3)
            vmh0 r3 = new vmh0
            r3.<init>(r8, r2)
            java.lang.Object r7 = defpackage.kzh.b(r1, r3, r7)
            if (r7 != r0) goto L81
        L80:
            return r0
        L81:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L84:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
