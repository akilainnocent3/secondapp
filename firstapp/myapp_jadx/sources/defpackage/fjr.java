package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fjr implements uwd0<Long> {
    public final wwd0 a = xwd0.a(Long.valueOf(SystemClock.elapsedRealtime()));

    @Override // defpackage.a390
    public final List<Long> c() {
        return this.a.c();
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Long> myhVar, v1b<?> v1bVar) throws Throwable {
        this.a.collect(myhVar, v1bVar);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0051 -> B:17:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0053
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void e(defpackage.x1b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ejr
            if (r0 == 0) goto L13
            r0 = r8
            ejr r0 = (defpackage.ejr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ejr r0 = new ejr
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 == r4) goto L2d
            if (r2 != r3) goto L27
            goto L31
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return
        L2d:
            defpackage.uj50.b(r8)
            goto L49
        L31:
            defpackage.uj50.b(r8)
        L34:
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r0.c = r4
            wwd0 r2 = r7.a
            r2.setValue(r8)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L49
            goto L53
        L49:
            r0.c = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = defpackage.hkd.b(r5, r0)
            if (r8 != r1) goto L34
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjr.e(x1b):void");
    }

    @Override // defpackage.uwd0
    public final Long getValue() {
        return (Long) this.a.getValue();
    }
}
