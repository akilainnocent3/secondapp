package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class rgn {
    public final oc4 a;
    public final uqm b;
    public final i1p c;

    @c0d(c = "com.sporty.android.platform.features.newotp.domain.InitBiometricAuthContextUseCase", f = "InitBiometricAuthContextUseCase.kt", l = {19, 21}, m = "invoke", v = 2)
    public static final class a extends x1b {
        public rgn a;
        public /* synthetic */ Object b;
        public int d;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return rgn.this.a(this);
        }
    }

    public rgn(oc4 oc4Var, uqm uqmVar, i1p i1pVar) {
        oc4Var.getClass();
        uqmVar.getClass();
        i1pVar.getClass();
        this.a = oc4Var;
        this.b = uqmVar;
        this.c = i1pVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r8 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.v1b<? super defpackage.nc4> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rgn.a
            if (r0 == 0) goto L13
            r0 = r8
            rgn$a r0 = (rgn.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rgn$a r0 = new rgn$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L70
        L2c:
            r7 = move-exception
            goto L77
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L34:
            rgn r7 = r0.a
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L4c
        L3a:
            defpackage.uj50.b(r8)
            zi50$a r8 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L2c
            i1p r8 = r7.c     // Catch: java.lang.Throwable -> L2c
            r0.a = r7     // Catch: java.lang.Throwable -> L2c
            r0.d = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = r8.a(r3, r0)     // Catch: java.lang.Throwable -> L2c
            if (r8 != r1) goto L4c
            goto L6f
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L55
            goto L56
        L55:
            r7 = r6
        L56:
            if (r7 == 0) goto L73
            oc4 r8 = r7.a     // Catch: java.lang.Throwable -> L2c
            uqm r7 = r7.b     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r7.getPhoneNumber()     // Catch: java.lang.Throwable -> L2c
            r7.getClass()     // Catch: java.lang.Throwable -> L2c
            com.sporty.android.core.model.security.biometric.CryptoPurpose r2 = com.sporty.android.core.model.security.biometric.CryptoPurpose.Decryption     // Catch: java.lang.Throwable -> L2c
            r0.a = r6     // Catch: java.lang.Throwable -> L2c
            r0.d = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = r8.a(r7, r2, r0)     // Catch: java.lang.Throwable -> L2c
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            nc4 r8 = (defpackage.nc4) r8     // Catch: java.lang.Throwable -> L2c
            goto L74
        L73:
            r8 = r6
        L74:
            zi50$a r7 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L2c
            goto L7e
        L77:
            zi50$a r8 = defpackage.zi50.b
            zi50$b r8 = new zi50$b
            r8.<init>(r7)
        L7e:
            java.lang.Throwable r7 = defpackage.zi50.a(r8)
            if (r7 != 0) goto L86
            r6 = r8
            goto L93
        L86:
            itf0$a r8 = defpackage.itf0.a
            java.lang.String r0 = "Error initializing biometric auth: "
            java.lang.String r7 = defpackage.a320.a(r0, r7)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r8.d(r7, r0)
        L93:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgn.a(v1b):java.lang.Object");
    }
}
