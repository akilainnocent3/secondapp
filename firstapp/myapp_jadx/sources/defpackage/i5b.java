package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.CoroutineCountDownTimer$startJob$1", f = "CoroutineCountDownTimer.kt", l = {24, 28, 32}, m = "invokeSuspend", v = 2)
public final class i5b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ h5b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5b(long j, h5b h5bVar, v1b<? super i5b> v1bVar) {
        super(2, v1bVar);
        this.b = j;
        this.c = h5bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i5b(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i5b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:13:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            y5b r1 = defpackage.y5b.a
            int r2 = r0.a
            r3 = 0
            long r4 = r0.b
            r6 = 3
            r7 = 2
            r8 = 1
            h5b r9 = r0.c
            r10 = 0
            if (r2 == 0) goto L27
            if (r2 == r8) goto L23
            if (r2 == r7) goto L1f
            if (r2 != r6) goto L19
            goto L27
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r3
        L1f:
            defpackage.uj50.b(r17)
            goto L56
        L23:
            defpackage.uj50.b(r17)
            goto L3f
        L27:
            defpackage.uj50.b(r17)
        L2a:
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r12 = r4 - r12
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 > 0) goto L46
            kotlin.jvm.functions.Function1<v1b<? super kotlin.Unit>, java.lang.Object> r2 = r9.d
            r0.a = r8
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L3f
            goto L81
        L3f:
            h5b$a$a r0 = h5b.a.C0624a.a
            r9.e = r0
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        L46:
            kotlin.jvm.functions.Function2<java.lang.Long, v1b<? super kotlin.Unit>, java.lang.Object> r2 = r9.c
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            r0.a = r7
            java.lang.Object r2 = r2.invoke(r14, r0)
            if (r2 != r1) goto L56
            goto L81
        L56:
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r12 = r4 - r12
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r12)
            long r12 = r2.longValue()
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 <= 0) goto L6a
            goto L6b
        L6a:
            r2 = r3
        L6b:
            if (r2 == 0) goto L72
            long r12 = r2.longValue()
            goto L73
        L72:
            r12 = r10
        L73:
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = java.lang.Math.min(r12, r14)
            r0.a = r6
            java.lang.Object r2 = defpackage.hkd.b(r12, r0)
            if (r2 != r1) goto L2a
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i5b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
