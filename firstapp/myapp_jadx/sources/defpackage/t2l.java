package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
public final class t2l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wf40 a;
    public c77 b;
    public int c;
    public final /* synthetic */ tb5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2l(tb5 tb5Var, v1b v1bVar) {
        super(2, v1bVar);
        this.d = tb5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t2l(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t2l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0032, B:19:0x003a, B:14:0x0025, B:20:0x004f, B:13:0x001f), top: B:27:0x0006 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002f -> B:17:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            c77 r1 = r6.b
            wf40 r4 = r6.a
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L12
            goto L32
        L12:
            r6 = move-exception
            goto L57
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L1a:
            defpackage.uj50.b(r7)
            tb5 r4 = r6.d
            tb5$a r7 = new tb5$a     // Catch: java.lang.Throwable -> L12
            r7.<init>()     // Catch: java.lang.Throwable -> L12
            r1 = r7
        L25:
            r6.a = r4     // Catch: java.lang.Throwable -> L12
            r6.b = r1     // Catch: java.lang.Throwable -> L12
            r6.c = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r7 = r1.b(r6)     // Catch: java.lang.Throwable -> L12
            if (r7 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L12
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L4f
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L12
            kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r7 = defpackage.v2l.b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r7.set(r5)     // Catch: java.lang.Throwable -> L12
            c5a0$a r7 = defpackage.c5a0.e     // Catch: java.lang.Throwable -> L12
            r7.getClass()     // Catch: java.lang.Throwable -> L12
            c5a0.a.f()     // Catch: java.lang.Throwable -> L12
            goto L25
        L4f:
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L12
            r4.cancel(r2)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L57:
            throw r6     // Catch: java.lang.Throwable -> L58
        L58:
            r7 = move-exception
            defpackage.ry60.a(r4, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
