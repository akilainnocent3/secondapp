package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public pc0 a;

    public final void a(String str, String str2, uc80 uc80Var) {
        dnf0[] dnf0VarArr = uc80Var.b;
        int length = dnf0VarArr.length;
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder(str2.length() + uc80Var.d);
            sb.append(str2);
            String string = Integer.toString(uc80Var.c + i);
            for (int length2 = uc80Var.d - string.length(); length2 > 0; length2--) {
                sb.append('0');
            }
            sb.append(string);
            String string2 = sb.toString();
            dnf0 dnf0VarA = this.a.a(string2);
            dnf0VarArr[i] = dnf0VarA;
            if (dnf0VarA == null) {
                b9p.a(tx5.a("Region not found in atlas: ", string2, " (sequence: ", str, ")"));
                return;
            }
        }
    }

    public final pnv b(String str, String str2, uc80 uc80Var) {
        pnv pnvVar = new pnv(str);
        if (uc80Var != null) {
            a(str, str2, uc80Var);
            return pnvVar;
        }
        dnf0 dnf0VarA = this.a.a(str2);
        if (dnf0VarA != null) {
            pnvVar.i = dnf0VarA;
            return pnvVar;
        }
        b9p.a(tx5.a("Region not found in atlas: ", str2, " (mesh attachment: ", str, ")"));
        return null;
    }

    public final qs40 c(String str, String str2, uc80 uc80Var) {
        qs40 qs40Var = new qs40(str);
        if (uc80Var != null) {
            a(str, str2, uc80Var);
            return qs40Var;
        }
        dnf0 dnf0VarA = this.a.a(str2);
        if (dnf0VarA != null) {
            qs40Var.c = dnf0VarA;
            return qs40Var;
        }
        b9p.a(tx5.a("Region not found in atlas: ", str2, " (region attachment: ", str, ")"));
        return null;
    }
}
