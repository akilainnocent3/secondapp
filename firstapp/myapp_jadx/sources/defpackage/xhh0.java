package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final class xhh0 {
    public final vhh0 a;

    public xhh0(vhh0 vhh0Var) {
        this.a = vhh0Var;
    }

    public final String a(String str, String str2, avy avyVar, boolean z) {
        String strA;
        avyVar.getClass();
        phh0 phh0Var = null;
        if (str2 == null) {
            return null;
        }
        int iOrdinal = avyVar.ordinal();
        if (iOrdinal == 0) {
            phh0Var = phh0.a;
        } else if (iOrdinal == 1) {
            phh0Var = phh0.b;
        } else if (iOrdinal != 2) {
            uhc.a();
            return null;
        }
        uhh0 uhh0VarA = this.a.a(str, str2, z);
        return (uhh0VarA == null || (strA = uhh0VarA.a(str, str2, phh0Var, z)) == null) ? str2 : strA;
    }

    public final RegularMarketRule b(avy avyVar, RegularMarketRule regularMarketRule, String str, boolean z) {
        String str2;
        Object bVar;
        avyVar.getClass();
        if (regularMarketRule == null) {
            return null;
        }
        String str3 = regularMarketRule.a;
        String strA = a(str, str3, avyVar, z);
        if (strA == null) {
            str3.getClass();
            str2 = str3;
        } else {
            str2 = strA;
        }
        if (str2.equals(str3)) {
            return regularMarketRule;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = RegularMarketRule.a(str2, null);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        RegularMarketRule regularMarketRule2 = (RegularMarketRule) bVar;
        if (regularMarketRule2 != null) {
            return regularMarketRule2;
        }
        RegularMarketRule regularMarketRule3 = new RegularMarketRule(regularMarketRule.f, str2, regularMarketRule.b, regularMarketRule.e, regularMarketRule.c, "");
        String[] strArr = regularMarketRule.d;
        if (strArr == null || strArr.length == 0) {
            hb5.a("title must not be empty");
            return null;
        }
        regularMarketRule3.d = strArr;
        return regularMarketRule3;
    }

    public final whh0 c(RegularMarketRule regularMarketRule, String str, boolean z) {
        return d(str, regularMarketRule != null ? regularMarketRule.a : null, z);
    }

    public final whh0 d(String str, String str2, boolean z) {
        uhh0 uhh0VarA;
        phh0 phh0Var = null;
        if (str2 == null || (uhh0VarA = this.a.a(str, str2, z)) == null) {
            return null;
        }
        String strA = uhh0VarA.a(str, str2, null, z);
        if (strA == null) {
            strA = str2;
        }
        phh0 phh0Var2 = phh0.a;
        String strA2 = uhh0VarA.a(str, str2, phh0Var2, z);
        phh0 phh0Var3 = phh0.b;
        String strA3 = uhh0VarA.a(str, str2, phh0Var3, z);
        if (strA2 != null && !strA2.equals(strA) && str2.equals(strA2)) {
            phh0Var = phh0Var2;
        } else if (strA3 != null && !strA3.equals(strA) && str2.equals(strA3)) {
            phh0Var = phh0Var3;
        }
        return new whh0(uhh0VarA.b(), phh0Var, uhh0VarA.e());
    }

    public final boolean e(RegularMarketRule regularMarketRule, String str, boolean z) {
        return f(str, regularMarketRule != null ? regularMarketRule.a : null, z);
    }

    public final boolean f(String str, String str2, boolean z) {
        return this.a.a(str, str2, z) != null;
    }
}
