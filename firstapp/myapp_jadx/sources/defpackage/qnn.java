package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qnn {
    public static final a c = new a();
    public final String a;
    public final String b;

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        
            if (r7 == r9) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [sph] */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, sph] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(defpackage.sph r8, defpackage.x1b r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof defpackage.pnn
                if (r0 == 0) goto L13
                r0 = r9
                pnn r0 = (defpackage.pnn) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                pnn r0 = new pnn
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r7 = r0.b
                y5b r9 = defpackage.y5b.a
                int r1 = r0.d
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                java.lang.String r5 = ""
                if (r1 == 0) goto L45
                if (r1 == r4) goto L3b
                if (r1 != r3) goto L34
                java.lang.Object r8 = r0.a
                java.lang.String r8 = (java.lang.String) r8
                defpackage.uj50.b(r7)     // Catch: java.lang.Exception -> L32
                goto L7d
            L32:
                r7 = move-exception
                goto L84
            L34:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L3b:
                java.lang.Object r8 = r0.a
                sph r8 = (defpackage.sph) r8
                defpackage.uj50.b(r7)     // Catch: java.lang.Exception -> L43
                goto L5a
            L43:
                r7 = move-exception
                goto L64
            L45:
                defpackage.uj50.b(r7)
                com.google.android.gms.tasks.Task r7 = r8.getToken()     // Catch: java.lang.Exception -> L43
                r7.getClass()     // Catch: java.lang.Exception -> L43
                r0.a = r8     // Catch: java.lang.Exception -> L43
                r0.d = r4     // Catch: java.lang.Exception -> L43
                java.lang.Object r7 = defpackage.z5f0.a(r7, r0)     // Catch: java.lang.Exception -> L43
                if (r7 != r9) goto L5a
                goto L7c
            L5a:
                snn r7 = (defpackage.snn) r7     // Catch: java.lang.Exception -> L43
                java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L43
                r6 = r8
                r8 = r7
                r7 = r6
                goto L6b
            L64:
                java.lang.String r1 = "Error getting authentication token."
                android.util.Log.w(r2, r1, r7)
                r7 = r8
                r8 = r5
            L6b:
                com.google.android.gms.tasks.Task r7 = r7.getId()     // Catch: java.lang.Exception -> L32
                r7.getClass()     // Catch: java.lang.Exception -> L32
                r0.a = r8     // Catch: java.lang.Exception -> L32
                r0.d = r3     // Catch: java.lang.Exception -> L32
                java.lang.Object r7 = defpackage.z5f0.a(r7, r0)     // Catch: java.lang.Exception -> L32
                if (r7 != r9) goto L7d
            L7c:
                return r9
            L7d:
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
                if (r7 != 0) goto L82
                goto L89
            L82:
                r5 = r7
                goto L89
            L84:
                java.lang.String r9 = "Error getting Firebase installation id ."
                android.util.Log.w(r2, r9, r7)
            L89:
                qnn r7 = new qnn
                r7.<init>(r5, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qnn.a.a(sph, x1b):java.lang.Object");
        }
    }

    public qnn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
