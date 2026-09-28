package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class glh0 {
    public static final /* synthetic */ int d = 0;
    public final mgb0 a;
    public final h530 b;
    public final vxt c;

    static {
        int i = vxt.i;
    }

    public glh0(mgb0 mgb0Var, h530 h530Var, vxt vxtVar) {
        mgb0Var.getClass();
        h530Var.getClass();
        this.a = mgb0Var;
        this.b = h530Var;
        this.c = vxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r5.g(r0, r6) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.flh0
            if (r0 == 0) goto L13
            r0 = r6
            flh0 r0 = (defpackage.flh0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            flh0 r0 = new flh0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.uj50.b(r6)
            goto L7c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L31:
            defpackage.uj50.b(r6)
            goto L5f
        L35:
            defpackage.uj50.b(r6)
            mgb0 r6 = r5.a
            boolean r6 = r6.isLogin()
            if (r6 != 0) goto L43
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L43:
            h530 r6 = r5.b
            lyh r6 = r6.k()
            elh0 r2 = new elh0
            r2.<init>(r6)
            yzh r6 = defpackage.bm50.a(r2)
            vl50 r6 = defpackage.bm50.f(r6)
            r0.c = r4
            java.lang.Object r6 = defpackage.s0i.c(r6, r0)
            if (r6 != r1) goto L5f
            goto L7b
        L5f:
            com.sporty.android.core.model.loyalty.UserTier r6 = (com.sporty.android.core.model.loyalty.UserTier) r6
            if (r6 == 0) goto L68
            boolean r6 = r6.isUserTierUnlocked()
            goto L69
        L68:
            r6 = 0
        L69:
            if (r6 == 0) goto L7c
            vxt r5 = r5.c
            wm20 r5 = r5.b()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.c = r3
            java.lang.Object r5 = r5.g(r0, r6)
            if (r5 != r1) goto L7c
        L7b:
            return r1
        L7c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glh0.a(x1b):java.lang.Object");
    }
}
