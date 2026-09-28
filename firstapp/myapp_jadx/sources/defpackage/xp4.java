package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class xp4<T> implements myh {
    public final /* synthetic */ qq4 a;

    @c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$downloadCmsData$5", f = "BonusCupViewModel.kt", l = {253, 254}, m = "emit", v = 1)
    public static final class a extends x1b {
        public qq4 a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ xp4<T> d;
        public int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xp4<? super T> xp4Var, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.d = xp4Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.emit(null, this);
        }
    }

    public xp4(qq4 qq4Var) {
        this.a = qq4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r7.x1(r0) == r1) goto L24;
     */
    @Override // defpackage.myh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(defpackage.xxs<com.sportygames.newcms.b> r7, defpackage.v1b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xp4.a
            if (r0 == 0) goto L13
            r0 = r8
            xp4$a r0 = (xp4.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            xp4$a r0 = new xp4$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            qq4 r6 = r0.a
            com.sportygames.newcms.b r6 = (com.sportygames.newcms.b) r6
            defpackage.uj50.b(r8)
            goto L6b
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L35:
            int r6 = r0.b
            qq4 r7 = r0.a
            defpackage.uj50.b(r8)
            goto L5e
        L3d:
            defpackage.uj50.b(r8)
            T r7 = r7.b
            com.sportygames.newcms.b r7 = (com.sportygames.newcms.b) r7
            if (r7 == 0) goto L6b
            qq4 r6 = r6.a
            wwd0 r8 = r6.F
            r0.a = r6
            r2 = 0
            r0.b = r2
            r0.e = r4
            r8.getClass()
            r8.k(r5, r7)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r1) goto L5c
            goto L6a
        L5c:
            r7 = r6
            r6 = r2
        L5e:
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r6 = r7.x1(r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp4.emit(xxs, v1b):java.lang.Object");
    }
}
