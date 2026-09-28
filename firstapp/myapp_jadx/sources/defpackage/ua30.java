package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.push.PushRepositoryImpl$switchAllNotificationSettings$2", f = "PushRepositoryImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class ua30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lk50.c a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ra30 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua30(ra30 ra30Var, boolean z, v1b<? super ua30> v1bVar) {
        super(2, v1bVar);
        this.d = ra30Var;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ua30 ua30Var = new ua30(this.d, this.e, v1bVar);
        ua30Var.c = obj;
        return ua30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ua30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r10 = r9;
        r9 = r10;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            ra30 r0 = r9.d
            wwd0 r1 = r0.d
            java.lang.Object r2 = r9.c
            v5b r2 = (defpackage.v5b) r2
            y5b r2 = defpackage.y5b.a
            int r3 = r9.b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 != r5) goto L1a
            lk50$c r9 = r9.a
            defpackage.uj50.b(r10)     // Catch: java.lang.Throwable -> L18
            goto L5f
        L18:
            r10 = move-exception
            goto L6d
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r4
        L20:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r1.getValue()
            lk50 r10 = (defpackage.lk50) r10
            boolean r3 = r10 instanceof lk50.c
            if (r3 != 0) goto L30
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L30:
            java.lang.Object r3 = r1.getValue()
            r6 = r3
            lk50 r6 = (defpackage.lk50) r6
            ta30 r6 = new ta30
            boolean r7 = r9.e
            r6.<init>()
            lk50 r6 = defpackage.bm50.l(r10, r6)
            boolean r3 = r1.g(r3, r6)
            if (r3 == 0) goto L30
            zi50$a r3 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L69
            ha30 r0 = r0.a     // Catch: java.lang.Throwable -> L69
            r9.c = r4     // Catch: java.lang.Throwable -> L69
            r3 = r10
            lk50$c r3 = (lk50.c) r3     // Catch: java.lang.Throwable -> L69
            r9.a = r3     // Catch: java.lang.Throwable -> L69
            r9.b = r5     // Catch: java.lang.Throwable -> L69
            java.lang.Object r9 = r0.c(r7, r9)     // Catch: java.lang.Throwable -> L69
            if (r9 != r2) goto L5c
            return r2
        L5c:
            r8 = r10
            r10 = r9
            r9 = r8
        L5f:
            com.sporty.android.common.network.data.BaseResponse r10 = (com.sporty.android.common.network.data.BaseResponse) r10     // Catch: java.lang.Throwable -> L18
            defpackage.n52.c(r10)     // Catch: java.lang.Throwable -> L18
            kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L18
            zi50$a r0 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L18
            goto L75
        L69:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L6d:
            zi50$a r0 = defpackage.zi50.b
            zi50$b r0 = new zi50$b
            r0.<init>(r10)
            r10 = r0
        L75:
            java.lang.Throwable r0 = defpackage.zi50.a(r10)
            if (r0 == 0) goto L88
        L7b:
            java.lang.Object r0 = r1.getValue()
            r2 = r0
            lk50 r2 = (defpackage.lk50) r2
            boolean r0 = r1.g(r0, r9)
            if (r0 == 0) goto L7b
        L88:
            defpackage.uj50.b(r10)
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
