package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class mw4 implements yrm {
    public final en20 a;

    public mw4(en20 en20Var) {
        en20Var.getClass();
        this.a = en20Var;
    }

    public static String p(String str, sp40 sp40Var) {
        int i = sp40Var.a;
        int i2 = sp40Var.b;
        int i3 = sp40Var.c;
        StringBuilder sb = new StringBuilder(str);
        sb.append("_u");
        sb.append(i);
        sb.append("_c");
        sb.append(i2);
        return t7l.b(i3, "_t", sb);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r10.a("bonus_vault_toast_campaign_ending_shown", false, r0) == r1) goto L36;
     */
    @Override // defpackage.yrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.jw4
            if (r0 == 0) goto L13
            r0 = r12
            jw4 r0 = (defpackage.jw4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jw4 r0 = new jw4
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            en20 r10 = r11.a
            if (r2 == 0) goto L4e
            if (r2 == r7) goto L4a
            if (r2 == r6) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L37
            defpackage.uj50.b(r12)
            goto L87
        L37:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L3e:
            defpackage.uj50.b(r12)
            goto L7b
        L42:
            defpackage.uj50.b(r12)
            goto L70
        L46:
            defpackage.uj50.b(r12)
            goto L65
        L4a:
            defpackage.uj50.b(r12)
            goto L5c
        L4e:
            defpackage.uj50.b(r12)
            r0.c = r7
            java.lang.String r12 = "bonus_vault_toast_one_bet_left_last_shown_at"
            java.lang.Object r12 = r10.c(r8, r0, r12)
            if (r12 != r1) goto L5c
            goto L86
        L5c:
            r0.c = r6
            java.lang.Object r11 = r11.o(r0)
            if (r11 != r1) goto L65
            goto L86
        L65:
            r0.c = r5
            java.lang.String r11 = "bonus_vault_toast_fully_unengaged_last_shown_at"
            java.lang.Object r11 = r10.c(r8, r0, r11)
            if (r11 != r1) goto L70
            goto L86
        L70:
            r0.c = r4
            java.lang.String r11 = "bonus_vault_toast_partially_unengaged_last_shown_at"
            java.lang.Object r11 = r10.c(r8, r0, r11)
            if (r11 != r1) goto L7b
            goto L86
        L7b:
            r0.c = r3
            java.lang.String r11 = "bonus_vault_toast_campaign_ending_shown"
            r12 = 0
            java.lang.Object r11 = r10.a(r11, r12, r0)
            if (r11 != r1) goto L87
        L86:
            return r1
        L87:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw4.a(x1b):java.lang.Object");
    }

    @Override // defpackage.yrm
    public final Object b(aw4 aw4Var) {
        return this.a.b("bonus_vault_toast_campaign_ending_shown", false, aw4Var);
    }

    @Override // defpackage.yrm
    public final Object c(sp40 sp40Var, vv4 vv4Var) {
        return this.a.d(p("bonus_vault_toast_redeem_v2_first_seen_at", sp40Var), vv4Var);
    }

    @Override // defpackage.yrm
    public final Object d(long j, zv4 zv4Var) {
        Object objC = this.a.c(j, zv4Var, "bonus_vault_toast_one_bet_left_last_shown_at");
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.yrm
    public final Object e(zv4 zv4Var) {
        Object objA = this.a.a("bonus_vault_toast_campaign_ending_shown", true, zv4Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    @Override // defpackage.yrm
    public final Object f(long j, zv4 zv4Var) {
        Object objC = this.a.c(j, zv4Var, "bonus_vault_toast_partially_unengaged_last_shown_at");
        return objC == y5b.a ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r8.c(0, r0, r9) == r1) goto L21;
     */
    @Override // defpackage.yrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.sp40 r9, defpackage.x1b r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.lw4
            if (r0 == 0) goto L13
            r0 = r10
            lw4 r0 = (defpackage.lw4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lw4 r0 = new lw4
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 0
            en20 r8 = r8.a
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 == r7) goto L35
            if (r2 != r6) goto L2f
            defpackage.uj50.b(r10)
            goto L60
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L35:
            sp40 r9 = r0.a
            defpackage.uj50.b(r10)
            goto L4f
        L3b:
            defpackage.uj50.b(r10)
            java.lang.String r10 = "bonus_vault_toast_redeem_v2_first_seen_at"
            java.lang.String r10 = p(r10, r9)
            r0.a = r9
            r0.d = r7
            java.lang.Object r10 = r8.c(r4, r0, r10)
            if (r10 != r1) goto L4f
            goto L5f
        L4f:
            java.lang.String r10 = "bonus_vault_toast_redeem_v2_last_shown_at"
            java.lang.String r9 = p(r10, r9)
            r0.a = r3
            r0.d = r6
            java.lang.Object r8 = r8.c(r4, r0, r9)
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw4.g(sp40, x1b):java.lang.Object");
    }

    @Override // defpackage.yrm
    public final Object h(sp40 sp40Var, long j, vv4 vv4Var) {
        Object objC = this.a.c(j, vv4Var, p("bonus_vault_toast_redeem_v2_first_seen_at", sp40Var));
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.yrm
    public final Object i(fw4 fw4Var) {
        return this.a.d("bonus_vault_toast_partially_unengaged_last_shown_at", fw4Var);
    }

    @Override // defpackage.yrm
    public final Object j(sp40 sp40Var, gw4 gw4Var) {
        return this.a.d(p("bonus_vault_toast_redeem_v2_last_shown_at", sp40Var), gw4Var);
    }

    @Override // defpackage.yrm
    public final Object k(dw4 dw4Var) {
        return this.a.d("bonus_vault_toast_fully_unengaged_last_shown_at", dw4Var);
    }

    @Override // defpackage.yrm
    public final Object l(long j, zv4 zv4Var) {
        Object objC = this.a.c(j, zv4Var, "bonus_vault_toast_fully_unengaged_last_shown_at");
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.yrm
    public final Object m(ew4 ew4Var) {
        return this.a.d("bonus_vault_toast_one_bet_left_last_shown_at", ew4Var);
    }

    @Override // defpackage.yrm
    public final Object n(sp40 sp40Var, long j, zv4 zv4Var) {
        Object objC = this.a.c(j, zv4Var, p("bonus_vault_toast_redeem_v2_last_shown_at", sp40Var));
        return objC == y5b.a ? objC : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9.c(0, r0, "bonus_vault_toast_negative_redeem_reminder_last_shown_at") == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.x1b r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.kw4
            if (r0 == 0) goto L13
            r0 = r10
            kw4 r0 = (defpackage.kw4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kw4 r0 = new kw4
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            en20 r9 = r9.a
            if (r2 == 0) goto L47
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L34
            defpackage.uj50.b(r10)
            goto L74
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L3b:
            defpackage.uj50.b(r10)
            goto L69
        L3f:
            defpackage.uj50.b(r10)
            goto L5e
        L43:
            defpackage.uj50.b(r10)
            goto L53
        L47:
            defpackage.uj50.b(r10)
            r0.c = r6
            java.lang.Object r10 = r9.e(r0)
            if (r10 != r1) goto L53
            goto L73
        L53:
            r0.c = r5
            java.lang.String r10 = "bonus_vault_toast_ready_to_claim_first_seen_at"
            java.lang.Object r10 = r9.c(r7, r0, r10)
            if (r10 != r1) goto L5e
            goto L73
        L5e:
            r0.c = r4
            java.lang.String r10 = "bonus_vault_toast_positive_redeem_reminder_last_shown_at"
            java.lang.Object r10 = r9.c(r7, r0, r10)
            if (r10 != r1) goto L69
            goto L73
        L69:
            r0.c = r3
            java.lang.String r10 = "bonus_vault_toast_negative_redeem_reminder_last_shown_at"
            java.lang.Object r9 = r9.c(r7, r0, r10)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw4.o(x1b):java.lang.Object");
    }
}
