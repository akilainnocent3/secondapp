package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class flc {
    public static final /* synthetic */ int a = 0;
    public static l9c b;

    public static final elc a(float f, float f2, float f3, float f4) {
        return new elc(new h7f(f), new h7f(f2), new h7f(f3), new h7f(f4));
    }

    public static elc b(int i) {
        return a((i & 1) != 0 ? 0.0f : 8.0f, (i & 2) != 0 ? 0.0f : 8.0f, (i & 4) != 0 ? 0.0f : 8.0f, (i & 8) != 0 ? 0.0f : 8.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (41 == r6) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double c(int r6, long r7, long r9, long r11, java.util.List r13) {
        /*
            r0 = 0
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Exception -> L21
            r2 = 0
        L7:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Exception -> L21
            if (r3 == 0) goto L23
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Exception -> L21
            com.sporty.android.core.model.common.Range r3 = (com.sporty.android.core.model.common.Range) r3     // Catch: java.lang.Exception -> L21
            long r4 = r3.lower     // Catch: java.lang.Exception -> L21
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 < 0) goto L7
            long r4 = r3.upper     // Catch: java.lang.Exception -> L21
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L7
            r2 = r3
            goto L7
        L21:
            r6 = move-exception
            goto L8c
        L23:
            c100 r13 = defpackage.c100.e     // Catch: java.lang.Exception -> L21
            r13 = 10
            if (r13 != r6) goto L59
            r6 = 1
            if (r2 == 0) goto L36
            int r9 = r2.getFeeType()     // Catch: java.lang.Exception -> L21
            if (r9 != r6) goto L36
            long r6 = r2.amount     // Catch: java.lang.Exception -> L21
            double r6 = (double) r6     // Catch: java.lang.Exception -> L21
            return r6
        L36:
            if (r2 == 0) goto L53
            int r9 = r2.getFeeType()     // Catch: java.lang.Exception -> L21
            r10 = 2
            if (r9 != r10) goto L53
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L21
            double r7 = (double) r7     // Catch: java.lang.Exception -> L21
            double r10 = r2.ratio     // Catch: java.lang.Exception -> L21
            double r7 = r7 * r10
            r9.<init>(r7)     // Catch: java.lang.Exception -> L21
            java.math.RoundingMode r7 = java.math.RoundingMode.FLOOR     // Catch: java.lang.Exception -> L21
            java.math.BigDecimal r6 = r9.setScale(r6, r7)     // Catch: java.lang.Exception -> L21
            double r6 = r6.doubleValue()     // Catch: java.lang.Exception -> L21
            return r6
        L53:
            if (r2 == 0) goto L75
            r2.getFeeType()     // Catch: java.lang.Exception -> L21
            return r0
        L59:
            c100 r13 = defpackage.c100.e     // Catch: java.lang.Exception -> L21
            r13 = 21
            r2 = 0
            if (r13 == r6) goto L81
            c100 r13 = defpackage.c100.e     // Catch: java.lang.Exception -> L21
            r13 = 20
            if (r13 != r6) goto L68
            goto L81
        L68:
            c100 r13 = defpackage.c100.e     // Catch: java.lang.Exception -> L21
            r13 = 40
            if (r13 == r6) goto L76
            c100 r13 = defpackage.c100.e     // Catch: java.lang.Exception -> L21
            r13 = 41
            if (r13 != r6) goto L75
            goto L76
        L75:
            return r0
        L76:
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 <= 0) goto L7f
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 < 0) goto L7f
            return r0
        L7f:
            double r6 = (double) r11
            return r6
        L81:
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 <= 0) goto L8a
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 < 0) goto L8a
            return r0
        L8a:
            double r6 = (double) r11
            return r6
        L8c:
            r6.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flc.c(int, long, long, long, java.util.List):double");
    }
}
