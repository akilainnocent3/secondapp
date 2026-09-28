package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class izh {

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends x1b {
        public myh a;
        public wf40 b;
        public c77 c;
        public boolean d;
        public /* synthetic */ Object e;
        public int f;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return izh.b(null, null, false, this);
        }
    }

    public static final o67 a(tb5 tb5Var) {
        return new o67(tb5Var, true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:20:0x0045, B:23:0x004f), top: B:42:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(defpackage.myh<? super T> r7, defpackage.wf40<? extends T> r8, boolean r9, defpackage.v1b<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof izh.a
            if (r0 == 0) goto L13
            r0 = r10
            izh$a r0 = (izh.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            izh$a r0 = new izh$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L37
            boolean r9 = r0.d
            c77 r7 = r0.c
            wf40 r8 = r0.b
            myh r2 = r0.a
            defpackage.uj50.b(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L53
        L35:
            r7 = move-exception
            goto L8d
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L3d:
            boolean r9 = r0.d
            c77 r7 = r0.c
            wf40 r8 = r0.b
            myh r2 = r0.a
            defpackage.uj50.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L68
        L49:
            defpackage.uj50.b(r10)
            defpackage.h99.a(r7)
            c77 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L53:
            r0.a = r7     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r10     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L64
            goto L84
        L64:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L85
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L35
            r0.a = r2     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r7     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L84:
            return r1
        L85:
            if (r9 == 0) goto L8a
            r8.cancel(r3)
        L8a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L8d:
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            if (r9 == 0) goto L94
            defpackage.ry60.a(r8, r7)
        L94:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izh.b(myh, wf40, boolean, v1b):java.lang.Object");
    }

    public static final o67 c(tb5 tb5Var) {
        return new o67(tb5Var, false);
    }
}
