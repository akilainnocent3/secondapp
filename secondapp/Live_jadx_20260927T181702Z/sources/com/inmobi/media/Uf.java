package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Uf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static F8 f55630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3908p5 f55631c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uf f55629a = new Uf();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f55632d = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r7 == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rr.d r7) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Uf.a(rr.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r7 == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(rr.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Tf
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Tf r0 = (com.inmobi.media.Tf) r0
            int r1 = r0.f55546c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55546c = r1
            goto L18
        L13:
            com.inmobi.media.Tf r0 = new com.inmobi.media.Tf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f55544a
            java.lang.Object r1 = qr.d.l()
            int r2 = r0.f55546c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            dr.j1.n(r7)
            goto Lae
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            dr.j1.n(r7)
            goto L76
        L39:
            dr.j1.n(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.media.Uf.f55632d
            r2 = 0
            boolean r7 = r7.compareAndSet(r4, r2)
            if (r7 == 0) goto Lb1
            com.inmobi.media.F8 r7 = com.inmobi.media.Uf.f55630b
            if (r7 == 0) goto L76
            r0.f55546c = r4
            com.inmobi.media.m7 r7 = r7.f54607d
            r7.getClass()
            com.inmobi.media.Wf r2 = com.inmobi.media.Wf.STOPPED
            com.inmobi.media.Wf r4 = r7.f55900d
            com.inmobi.media.Wf r5 = com.inmobi.media.Wf.STARTED
            if (r4 != r5) goto L68
            r7.f55900d = r2
            java.lang.Object r7 = r7.e(r0)
            java.lang.Object r2 = qr.d.l()
            if (r7 != r2) goto L65
            goto L6a
        L65:
            dr.w2 r7 = dr.w2.f79517a
            goto L6a
        L68:
            dr.w2 r7 = dr.w2.f79517a
        L6a:
            java.lang.Object r2 = qr.d.l()
            if (r7 != r2) goto L71
            goto L73
        L71:
            dr.w2 r7 = dr.w2.f79517a
        L73:
            if (r7 != r1) goto L76
            goto Lad
        L76:
            com.inmobi.media.p5 r7 = com.inmobi.media.Uf.f55631c
            if (r7 == 0) goto Lb1
            r0.f55546c = r3
            java.lang.String r2 = "p5"
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.m0.o(r2, r3)
            com.inmobi.media.cf r7 = r7.f57285d
            r7.getClass()
            com.inmobi.media.Wf r2 = com.inmobi.media.Wf.STOPPED
            com.inmobi.media.Wf r3 = r7.f55900d
            com.inmobi.media.Wf r4 = com.inmobi.media.Wf.STARTED
            if (r3 != r4) goto La0
            r7.f55900d = r2
            java.lang.Object r7 = r7.d(r0)
            java.lang.Object r0 = qr.d.l()
            if (r7 != r0) goto L9d
            goto La2
        L9d:
            dr.w2 r7 = dr.w2.f79517a
            goto La2
        La0:
            dr.w2 r7 = dr.w2.f79517a
        La2:
            java.lang.Object r0 = qr.d.l()
            if (r7 != r0) goto La9
            goto Lab
        La9:
            dr.w2 r7 = dr.w2.f79517a
        Lab:
            if (r7 != r1) goto Lae
        Lad:
            return r1
        Lae:
            dr.w2 r7 = dr.w2.f79517a
            return r7
        Lb1:
            dr.w2 r7 = dr.w2.f79517a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Uf.b(rr.d):java.lang.Object");
    }
}
