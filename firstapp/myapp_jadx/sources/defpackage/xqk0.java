package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xqk0 extends kqk0 {
    public static fpk0 c(g3l0 g3l0Var, ArrayList arrayList) {
        ktk0 ktk0Var = ktk0.ADD;
        r5l0.b(2, "FN", arrayList);
        ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
        ipk0 ipk0VarB2 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
        if (!(ipk0VarB2 instanceof pnk0)) {
            hb5.a(inm.a("FN requires an ArrayValue of parameter names found ", ipk0VarB2.getClass().getCanonicalName()));
            return null;
        }
        List listH = ((pnk0) ipk0VarB2).h();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new fpk0(ipk0VarB.zzc(), (ArrayList) listH, arrayList2, g3l0Var);
    }

    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        ktk0 ktk0Var = ktk0.ADD;
        int iOrdinal = r5l0.e(str).ordinal();
        if (iOrdinal == 2) {
            r5l0.a(3, "APPLY", arrayList);
            ipk0 ipk0Var = (ipk0) arrayList.get(0);
            pqk0 pqk0Var = g3l0Var.b;
            pqk0 pqk0Var2 = g3l0Var.b;
            ipk0 ipk0VarB = pqk0Var.b(g3l0Var, ipk0Var);
            String strZzc = pqk0Var2.b(g3l0Var, (ipk0) arrayList.get(1)).zzc();
            ipk0 ipk0VarB2 = pqk0Var2.b(g3l0Var, (ipk0) arrayList.get(2));
            if (!(ipk0VarB2 instanceof pnk0)) {
                hb5.a(inm.a("Function arguments for Apply are not a list found ", ipk0VarB2.getClass().getCanonicalName()));
                return null;
            }
            if (!strZzc.isEmpty()) {
                return ipk0VarB.c(strZzc, g3l0Var, (ArrayList) ((pnk0) ipk0VarB2).h());
            }
            hb5.a("Function name for apply is undefined");
            return null;
        }
        if (iOrdinal == 15) {
            r5l0.a(0, "BREAK", arrayList);
            return ipk0.q;
        }
        if (iOrdinal == 25) {
            return c(g3l0Var, arrayList);
        }
        if (iOrdinal == 41) {
            r5l0.b(2, "IF", arrayList);
            ipk0 ipk0Var2 = (ipk0) arrayList.get(0);
            pqk0 pqk0Var3 = g3l0Var.b;
            pqk0 pqk0Var4 = g3l0Var.b;
            ipk0 ipk0VarB3 = pqk0Var3.b(g3l0Var, ipk0Var2);
            ipk0 ipk0VarB4 = pqk0Var4.b(g3l0Var, (ipk0) arrayList.get(1));
            ipk0 ipk0VarB5 = arrayList.size() > 2 ? pqk0Var4.b(g3l0Var, (ipk0) arrayList.get(2)) : null;
            ipk0 ipk0Var3 = ipk0.o;
            ipk0 ipk0VarB6 = ipk0VarB3.zze().booleanValue() ? g3l0Var.b((pnk0) ipk0VarB4) : ipk0VarB5 != null ? g3l0Var.b((pnk0) ipk0VarB5) : ipk0Var3;
            return true != (ipk0VarB6 instanceof ynk0) ? ipk0Var3 : ipk0VarB6;
        }
        if (iOrdinal == 54) {
            return new pnk0(arrayList);
        }
        if (iOrdinal == 57) {
            if (arrayList.isEmpty()) {
                return ipk0.s;
            }
            r5l0.a(1, "RETURN", arrayList);
            return new ynk0("return", g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                r5l0.b(2, "DEFINE_FUNCTION", arrayList);
                fpk0 fpk0VarC = c(g3l0Var, arrayList);
                String str2 = fpk0VarC.a;
                if (str2 == null) {
                    g3l0Var.e("", fpk0VarC);
                    return fpk0VarC;
                }
                g3l0Var.e(str2, fpk0VarC);
                return fpk0VarC;
            }
            if (iOrdinal == 60) {
                r5l0.a(3, "SWITCH", arrayList);
                ipk0 ipk0Var4 = (ipk0) arrayList.get(0);
                pqk0 pqk0Var5 = g3l0Var.b;
                pqk0 pqk0Var6 = g3l0Var.b;
                ipk0 ipk0VarB7 = pqk0Var5.b(g3l0Var, ipk0Var4);
                ipk0 ipk0VarB8 = pqk0Var6.b(g3l0Var, (ipk0) arrayList.get(1));
                ipk0 ipk0VarB9 = pqk0Var6.b(g3l0Var, (ipk0) arrayList.get(2));
                if (!(ipk0VarB8 instanceof pnk0)) {
                    hb5.a("Malformed SWITCH statement, cases are not a list");
                    return null;
                }
                if (!(ipk0VarB9 instanceof pnk0)) {
                    hb5.a("Malformed SWITCH statement, case statements are not a list");
                    return null;
                }
                pnk0 pnk0Var = (pnk0) ipk0VarB8;
                pnk0 pnk0Var2 = (pnk0) ipk0VarB9;
                boolean z = false;
                for (int i = 0; i < pnk0Var.j(); i++) {
                    if (z || ipk0VarB7.equals(pqk0Var6.b(g3l0Var, pnk0Var.k(i)))) {
                        ipk0 ipk0VarB10 = pqk0Var6.b(g3l0Var, pnk0Var2.k(i));
                        if (ipk0VarB10 instanceof ynk0) {
                            return ((ynk0) ipk0VarB10).b.equals("break") ? ipk0.o : ipk0VarB10;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (pnk0Var.j() + 1 == pnk0Var2.j()) {
                    ipk0 ipk0VarB11 = pqk0Var6.b(g3l0Var, pnk0Var2.k(pnk0Var.j()));
                    if (ipk0VarB11 instanceof ynk0) {
                        String str3 = ((ynk0) ipk0VarB11).b;
                        if (str3.equals("return") || str3.equals("continue")) {
                            return ipk0VarB11;
                        }
                    }
                }
                return ipk0.o;
            }
            if (iOrdinal == 61) {
                r5l0.a(3, "TERNARY", arrayList);
                ipk0 ipk0Var5 = (ipk0) arrayList.get(0);
                pqk0 pqk0Var7 = g3l0Var.b;
                pqk0 pqk0Var8 = g3l0Var.b;
                return pqk0Var7.b(g3l0Var, ipk0Var5).zze().booleanValue() ? pqk0Var8.b(g3l0Var, (ipk0) arrayList.get(1)) : pqk0Var8.b(g3l0Var, (ipk0) arrayList.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return g3l0Var.c().b(new pnk0(arrayList));
                case 12:
                    r5l0.a(0, "BREAK", arrayList);
                    return ipk0.r;
                case 13:
                    break;
                default:
                    b(str);
                    throw null;
            }
        }
        if (arrayList.isEmpty()) {
            return ipk0.o;
        }
        ipk0 ipk0VarB12 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
        return ipk0VarB12 instanceof pnk0 ? g3l0Var.b((pnk0) ipk0VarB12) : ipk0.o;
    }
}
