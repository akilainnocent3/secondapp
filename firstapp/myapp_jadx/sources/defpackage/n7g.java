package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n7g {
    public final ex4 a;
    public final lyz b;
    public final mgb0 c;
    public final uy0 d;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
        public final String a;
        public final AccountInfo b;

        public a(String str, AccountInfo accountInfo) {
            this.a = str;
            this.b = accountInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AccountInfo accountInfo = this.b;
            return iHashCode + (accountInfo != null ? accountInfo.hashCode() : 0);
        }

        public final String toString() {
            return "RequiredAccount(userId=" + this.a + ", info=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b {
        public final AssetsInfo a;

        public b(AssetsInfo assetsInfo) {
            this.a = assetsInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            AssetsInfo assetsInfo = this.a;
            if (assetsInfo == null) {
                return 0;
            }
            return assetsInfo.hashCode();
        }

        public final String toString() {
            return "RequiredAssetsInfo(info=" + this.a + ")";
        }
    }

    public n7g(ex4 ex4Var, lyz lyzVar, mgb0 mgb0Var, uy0 uy0Var) {
        ex4Var.getClass();
        lyzVar.getClass();
        mgb0Var.getClass();
        uy0Var.getClass();
        this.a = ex4Var;
        this.b = lyzVar;
        this.c = mgb0Var;
        this.d = uy0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(boolean z, x1b x1bVar) throws Throwable {
        p7g p7gVar;
        if (x1bVar instanceof p7g) {
            p7gVar = (p7g) x1bVar;
            int i = p7gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7gVar.c = i - Integer.MIN_VALUE;
            } else {
                p7gVar = new p7g(this, x1bVar);
            }
        } else {
            p7gVar = new p7g(this, x1bVar);
        }
        Object objP = p7gVar.a;
        y5b y5bVar = y5b.a;
        int i2 = p7gVar.c;
        if (i2 == 0) {
            uj50.b(objP);
            b bVarD = d(z);
            if (bVarD != null) {
                return bVarD;
            }
            if (!this.c.isLogin()) {
                return new b(null);
            }
            lyh<lk50<AssetsInfo>> lyhVarH = this.d.h(pu0.c.a);
            p7gVar.c = 1;
            objP = bm50.p(lyhVarH, p7gVar);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objP);
        }
        lk50 lk50Var = (lk50) objP;
        if (lk50Var instanceof lk50.c) {
            return new b((AssetsInfo) ((lk50.c) lk50Var).a);
        }
        if (lk50Var instanceof lk50.a) {
            throw ((lk50.a) lk50Var).a;
        }
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            ib5.a("Unexpected assets info loading result");
            return null;
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(boolean z, x1b x1bVar) {
        q7g q7gVar;
        AccountInfo accountInfoLastAccountInfo;
        AccountInfo accountInfo;
        if (x1bVar instanceof q7g) {
            q7gVar = (q7g) x1bVar;
            int i = q7gVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7gVar.d = i - Integer.MIN_VALUE;
            } else {
                q7gVar = new q7g(this, x1bVar);
            }
        } else {
            q7gVar = new q7g(this, x1bVar);
        }
        Object userId = q7gVar.b;
        y5b y5bVar = y5b.a;
        int i2 = q7gVar.d;
        if (i2 == 0) {
            uj50.b(userId);
            mgb0 mgb0Var = this.c;
            if (!mgb0Var.isLogin()) {
                return new a(null, null);
            }
            if (z || (accountInfoLastAccountInfo = mgb0Var.lastAccountInfo()) == null) {
                return null;
            }
            q7gVar.a = accountInfoLastAccountInfo;
            q7gVar.d = 1;
            userId = mgb0Var.getUserId(q7gVar);
            if (userId == y5bVar) {
                return y5bVar;
            }
            accountInfo = accountInfoLastAccountInfo;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            accountInfo = q7gVar.a;
            uj50.b(userId);
        }
        return new a((String) userId, accountInfo);
    }

    public final b d(boolean z) {
        AssetsInfo assetsInfoC;
        if (!this.c.isLogin()) {
            return new b(null);
        }
        if (z || (assetsInfoC = this.d.c()) == null) {
            return null;
        }
        return new b(assetsInfoC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(x1b x1bVar) {
        s7g s7gVar;
        BOConfigValueBundle bOConfigValueBundle;
        if (x1bVar instanceof s7g) {
            s7gVar = (s7g) x1bVar;
            int i = s7gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s7gVar.c = i - Integer.MIN_VALUE;
            } else {
                s7gVar = new s7g(this, x1bVar);
            }
        } else {
            s7gVar = new s7g(this, x1bVar);
        }
        Object objA = s7gVar.a;
        y5b y5bVar = y5b.a;
        int i2 = s7gVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            lyh<lk50<BOConfigValueBundle>> lyhVarA = this.a.a(pu0.b.a);
            s7gVar.c = 1;
            objA = s0i.a(lyhVarA, s7gVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (bOConfigValueBundle = (BOConfigValueBundle) cVar.a) == null) {
            return null;
        }
        return v7g.b(bOConfigValueBundle);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.x1b r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.t7g
            if (r0 == 0) goto L13
            r0 = r7
            t7g r0 = (defpackage.t7g) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            t7g r0 = new t7g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r7)
            goto L57
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r7)
            goto L41
        L35:
            defpackage.uj50.b(r7)
            r0.c = r5
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L41
            goto L56
        L41:
            com.sporty.android.core.model.config.tax.TaxConfigs r7 = (com.sporty.android.core.model.config.tax.TaxConfigs) r7
            if (r7 == 0) goto L46
            return r7
        L46:
            ex4 r6 = r6.a
            pu0$c r7 = pu0.c.a
            lyh r6 = r6.a(r7)
            r0.c = r4
            java.lang.Object r7 = defpackage.bm50.p(r6, r0)
            if (r7 != r1) goto L57
        L56:
            return r1
        L57:
            lk50 r7 = (defpackage.lk50) r7
            boolean r6 = r7 instanceof lk50.c
            if (r6 == 0) goto L70
            lk50$c r7 = (lk50.c) r7
            T r6 = r7.a
            com.sporty.android.core.model.config.bo.BOConfigValueBundle r6 = (com.sporty.android.core.model.config.bo.BOConfigValueBundle) r6
            com.sporty.android.core.model.config.tax.TaxConfigs r6 = defpackage.v7g.b(r6)
            if (r6 == 0) goto L6a
            return r6
        L6a:
            java.lang.String r6 = "Required Betslip tax configuration is missing or invalid"
            defpackage.ib5.a(r6)
            return r3
        L70:
            boolean r6 = r7 instanceof lk50.a
            if (r6 != 0) goto L86
            lk50$b r6 = lk50.b.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.g(r7, r6)
            if (r6 == 0) goto L82
            java.lang.String r6 = "Unexpected BO config loading result"
            defpackage.ib5.a(r6)
            return r3
        L82:
            defpackage.uhc.a()
            return r3
        L86:
            lk50$a r7 = (lk50.a) r7
            java.lang.Throwable r6 = r7.a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7g.f(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(boolean z, x1b x1bVar) throws Throwable {
        o7g o7gVar;
        String str;
        Object objP;
        String str2;
        String str3;
        lk50 lk50Var;
        AccountInfo accountInfo;
        Object userId;
        AccountInfo accountInfo2;
        String str4;
        if (x1bVar instanceof o7g) {
            o7gVar = (o7g) x1bVar;
            int i = o7gVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7gVar.i = i - Integer.MIN_VALUE;
            } else {
                o7gVar = new o7g(this, x1bVar);
            }
        } else {
            o7gVar = new o7g(this, x1bVar);
        }
        Object objC = o7gVar.e;
        Object obj = y5b.a;
        int i2 = o7gVar.i;
        mgb0 mgb0Var = this.c;
        if (i2 == 0) {
            uj50.b(objC);
            o7gVar.a = z;
            o7gVar.i = 1;
            objC = c(z, o7gVar);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = o7gVar.a;
            uj50.b(objC);
        } else {
            if (i2 == 2) {
                z = o7gVar.a;
                uj50.b(objC);
                str = (String) objC;
                lyh<lk50<AccountInfo>> lyhVarA = this.b.a(pu0.c.a);
                o7gVar.b = str;
                o7gVar.a = z;
                o7gVar.i = 3;
                objP = bm50.p(lyhVarA, o7gVar);
                if (objP != obj) {
                    str2 = str;
                    objC = objP;
                    str3 = str2;
                    lk50Var = (lk50) objC;
                    if (!(lk50Var instanceof lk50.c)) {
                        if (lk50Var instanceof lk50.a) {
                            throw ((lk50.a) lk50Var).a;
                        }
                        if (Intrinsics.g(lk50Var, lk50.b.a)) {
                            ib5.a("Unexpected account info loading result");
                            return null;
                        }
                        uhc.a();
                        return null;
                    }
                    accountInfo = (AccountInfo) ((lk50.c) lk50Var).a;
                    if (!mgb0Var.isLogin()) {
                        return new a(null, null);
                    }
                    o7gVar.b = str3;
                    o7gVar.c = accountInfo;
                    o7gVar.d = str3;
                    o7gVar.a = z;
                    o7gVar.i = 4;
                    userId = mgb0Var.getUserId(o7gVar);
                    if (userId != obj) {
                        objC = userId;
                        accountInfo2 = accountInfo;
                        str4 = str3;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                boolean z2 = o7gVar.a;
                String str5 = o7gVar.b;
                uj50.b(objC);
                str2 = str5;
                z = z2;
                str3 = str2;
                lk50Var = (lk50) objC;
                if (!(lk50Var instanceof lk50.c)) {
                    if (lk50Var instanceof lk50.a) {
                        throw ((lk50.a) lk50Var).a;
                    }
                    if (Intrinsics.g(lk50Var, lk50.b.a)) {
                        ib5.a("Unexpected account info loading result");
                        return null;
                    }
                    uhc.a();
                    return null;
                }
                accountInfo = (AccountInfo) ((lk50.c) lk50Var).a;
                if (!mgb0Var.isLogin()) {
                    return new a(null, null);
                }
                o7gVar.b = str3;
                o7gVar.c = accountInfo;
                o7gVar.d = str3;
                o7gVar.a = z;
                o7gVar.i = 4;
                userId = mgb0Var.getUserId(o7gVar);
                if (userId != obj) {
                    objC = userId;
                    accountInfo2 = accountInfo;
                    str4 = str3;
                }
                return obj;
            }
            if (i2 != 4) {
                ib5.a(DZsoPoBl.nUlfxVFhmourEZX);
                return null;
            }
            str3 = o7gVar.d;
            accountInfo2 = o7gVar.c;
            str4 = o7gVar.b;
            uj50.b(objC);
        }
        if (Intrinsics.g(str3, objC)) {
            mgb0Var.setAccountInfo(accountInfo2);
            return new a(str4, accountInfo2);
        }
        ib5.a("Account changed while loading Betslip prerequisites");
        return null;
        a aVar = (a) objC;
        if (aVar != null) {
            return aVar;
        }
        if (!mgb0Var.isLogin()) {
            return new a(null, null);
        }
        o7gVar.a = z;
        o7gVar.i = 2;
        objC = mgb0Var.getUserId(o7gVar);
        if (objC != obj) {
            str = (String) objC;
            lyh<lk50<AccountInfo>> lyhVarA2 = this.b.a(pu0.c.a);
            o7gVar.b = str;
            o7gVar.a = z;
            o7gVar.i = 3;
            objP = bm50.p(lyhVarA2, o7gVar);
            if (objP != obj) {
                str2 = str;
                objC = objP;
                str3 = str2;
                lk50Var = (lk50) objC;
                if (!(lk50Var instanceof lk50.c)) {
                    if (lk50Var instanceof lk50.a) {
                        throw ((lk50.a) lk50Var).a;
                    }
                    if (Intrinsics.g(lk50Var, lk50.b.a)) {
                        ib5.a("Unexpected account info loading result");
                        return null;
                    }
                    uhc.a();
                    return null;
                }
                accountInfo = (AccountInfo) ((lk50.c) lk50Var).a;
                if (!mgb0Var.isLogin()) {
                    return new a(null, null);
                }
                o7gVar.b = str3;
                o7gVar.c = accountInfo;
                o7gVar.d = str3;
                o7gVar.a = z;
                o7gVar.i = 4;
                userId = mgb0Var.getUserId(o7gVar);
                if (userId != obj) {
                    objC = userId;
                    accountInfo2 = accountInfo;
                    str4 = str3;
                    if (Intrinsics.g(str3, objC)) {
                        mgb0Var.setAccountInfo(accountInfo2);
                        return new a(str4, accountInfo2);
                    }
                    ib5.a("Account changed while loading Betslip prerequisites");
                    return null;
                }
            }
        }
        return obj;
    }
}
