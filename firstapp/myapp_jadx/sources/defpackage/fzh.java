package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fzh implements lyh<Object> {
    public final /* synthetic */ Object[] a;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {110}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public fzh d;
        public myh e;
        public int f;
        public int i;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return fzh.this.collect(null, this);
        }
    }

    public fzh(Object[] objArr) {
        this.a = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.lyh
    public final java.lang.Object collect(defpackage.myh<? super java.lang.Object> r7, defpackage.v1b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fzh.a
            if (r0 == 0) goto L13
            r0 = r8
            fzh$a r0 = (fzh.a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fzh$a r0 = new fzh$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r6 = r0.i
            int r7 = r0.f
            myh r2 = r0.e
            fzh r4 = r0.d
            defpackage.uj50.b(r8)
            r8 = r2
            goto L5b
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L37:
            defpackage.uj50.b(r8)
            java.lang.Object[] r8 = r6.a
            int r8 = r8.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L42:
            if (r2 >= r6) goto L5f
            java.lang.Object[] r4 = r7.a
            r4 = r4[r2]
            r0.d = r7
            r0.e = r8
            r0.f = r2
            r0.i = r6
            r0.b = r3
            java.lang.Object r4 = r8.emit(r4, r0)
            if (r4 != r1) goto L59
            return r1
        L59:
            r4 = r7
            r7 = r2
        L5b:
            int r2 = r7 + 1
            r7 = r4
            goto L42
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzh.collect(myh, v1b):java.lang.Object");
    }
}
