package defpackage;

import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class itk0 extends kqk0 {
    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        String str2;
        ktk0 ktk0Var = ktk0.ADD;
        int iOrdinal = r5l0.e(str).ordinal();
        int i = 0;
        if (iOrdinal == 3) {
            r5l0.a(2, "ASSIGN", arrayList);
            ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
            if (!(ipk0VarB instanceof ypk0)) {
                hb5.a(inm.a("Expected string for assign var. got ", ipk0VarB.getClass().getCanonicalName()));
                return null;
            }
            String str3 = ((ypk0) ipk0VarB).a;
            if (!g3l0Var.d(str3)) {
                hb5.a(inm.a("Attempting to assign undefined value ", str3));
                return null;
            }
            ipk0 ipk0VarB2 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
            g3l0Var.e(str3, ipk0VarB2);
            return ipk0VarB2;
        }
        if (iOrdinal == 14) {
            r5l0.b(2, "CONST", arrayList);
            if (arrayList.size() % 2 != 0) {
                hb5.a(hce0.a(arrayList.size(), "CONST requires an even number of arguments, found "));
                return null;
            }
            while (i < arrayList.size() - 1) {
                ipk0 ipk0VarB3 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(i));
                if (!(ipk0VarB3 instanceof ypk0)) {
                    hb5.a(inm.a("Expected string for const name. got ", ipk0VarB3.getClass().getCanonicalName()));
                    return null;
                }
                String str4 = ((ypk0) ipk0VarB3).a;
                g3l0Var.f(str4, g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(i + 1)));
                g3l0Var.d.put(str4, Boolean.TRUE);
                i += 2;
            }
            return ipk0.o;
        }
        if (iOrdinal == 24) {
            r5l0.b(1, "EXPRESSION_LIST", arrayList);
            ipk0 ipk0VarB4 = ipk0.o;
            while (i < arrayList.size()) {
                ipk0VarB4 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(i));
                if (ipk0VarB4 instanceof ynk0) {
                    ib5.a("ControlValue cannot be in an expression list");
                    return null;
                }
                i++;
            }
            return ipk0VarB4;
        }
        if (iOrdinal == 33) {
            r5l0.a(1, "GET", arrayList);
            ipk0 ipk0VarB5 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
            if (ipk0VarB5 instanceof ypk0) {
                return g3l0Var.g(((ypk0) ipk0VarB5).a);
            }
            hb5.a(inm.a("Expected string for get var. got ", ipk0VarB5.getClass().getCanonicalName()));
            return null;
        }
        if (iOrdinal == 49) {
            r5l0.a(0, "NULL", arrayList);
            return ipk0.p;
        }
        if (iOrdinal == 58) {
            r5l0.a(3, "SET_PROPERTY", arrayList);
            ipk0 ipk0Var = (ipk0) arrayList.get(0);
            pqk0 pqk0Var = g3l0Var.b;
            pqk0 pqk0Var2 = g3l0Var.b;
            ipk0 ipk0VarB6 = pqk0Var.b(g3l0Var, ipk0Var);
            ipk0 ipk0VarB7 = pqk0Var2.b(g3l0Var, (ipk0) arrayList.get(1));
            ipk0 ipk0VarB8 = pqk0Var2.b(g3l0Var, (ipk0) arrayList.get(2));
            if (ipk0VarB6 == ipk0.o || ipk0VarB6 == ipk0.p) {
                ib5.a(lx5.a("Can't set property ", ipk0VarB7.zzc(), " of ", ipk0VarB6.zzc()));
                return null;
            }
            if ((ipk0VarB6 instanceof pnk0) && (ipk0VarB7 instanceof eok0)) {
                ((pnk0) ipk0VarB6).l(((eok0) ipk0VarB7).a.intValue(), ipk0VarB8);
                return ipk0VarB8;
            }
            if (!(ipk0VarB6 instanceof rok0)) {
                return ipk0VarB8;
            }
            ((rok0) ipk0VarB6).e(ipk0VarB7.zzc(), ipk0VarB8);
            return ipk0VarB8;
        }
        if (iOrdinal == 17) {
            if (arrayList.isEmpty()) {
                return new pnk0();
            }
            pnk0 pnk0Var = new pnk0();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ipk0 ipk0VarB9 = g3l0Var.b.b(g3l0Var, (ipk0) obj);
                if (ipk0VarB9 instanceof ynk0) {
                    ib5.a("Failed to evaluate array element");
                    return null;
                }
                pnk0Var.l(i, ipk0VarB9);
                i++;
            }
            return pnk0Var;
        }
        if (iOrdinal == 18) {
            if (arrayList.isEmpty()) {
                return new vok0();
            }
            if (arrayList.size() % 2 != 0) {
                hb5.a(hce0.a(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                return null;
            }
            vok0 vok0Var = new vok0();
            while (i < arrayList.size() - 1) {
                ipk0 ipk0VarB10 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(i));
                ipk0 ipk0VarB11 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(i + 1));
                if ((ipk0VarB10 instanceof ynk0) || (ipk0VarB11 instanceof ynk0)) {
                    ib5.a("Failed to evaluate map entry");
                    return null;
                }
                vok0Var.e(ipk0VarB10.zzc(), ipk0VarB11);
                i += 2;
            }
            return vok0Var;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            r5l0.a(2, "GET_PROPERTY", arrayList);
            ipk0 ipk0VarB12 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
            ipk0 ipk0VarB13 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
            if ((ipk0VarB12 instanceof pnk0) && r5l0.d(ipk0VarB13)) {
                return ((pnk0) ipk0VarB12).k(ipk0VarB13.zzd().intValue());
            }
            if (ipk0VarB12 instanceof rok0) {
                return ((rok0) ipk0VarB12).b(ipk0VarB13.zzc());
            }
            if (ipk0VarB12 instanceof ypk0) {
                if ("length".equals(ipk0VarB13.zzc())) {
                    return new eok0(Double.valueOf(((ypk0) ipk0VarB12).a.length()));
                }
                if (r5l0.d(ipk0VarB13)) {
                    double dDoubleValue = ipk0VarB13.zzd().doubleValue();
                    String str5 = ((ypk0) ipk0VarB12).a;
                    if (dDoubleValue < str5.length()) {
                        return new ypk0(String.valueOf(str5.charAt(ipk0VarB13.zzd().intValue())));
                    }
                }
            }
            return ipk0.o;
        }
        switch (iOrdinal) {
            case 62:
                r5l0.a(1, "TYPEOF", arrayList);
                ipk0 ipk0VarB14 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
                if (ipk0VarB14 instanceof bqk0) {
                    str2 = "undefined";
                } else if (ipk0VarB14 instanceof unk0) {
                    str2 = "boolean";
                } else if (ipk0VarB14 instanceof eok0) {
                    str2 = "number";
                } else if (ipk0VarB14 instanceof ypk0) {
                    str2 = "string";
                } else if (ipk0VarB14 instanceof fpk0) {
                    str2 = "function";
                } else {
                    if ((ipk0VarB14 instanceof lpk0) || (ipk0VarB14 instanceof ynk0)) {
                        ljh.a("Unsupported value type %s in typeof", new Object[]{ipk0VarB14});
                        return null;
                    }
                    str2 = "object";
                }
                return new ypk0(str2);
            case 63:
                r5l0.a(0, "UNDEFINED", arrayList);
                return ipk0.o;
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                r5l0.b(1, "VAR", arrayList);
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ipk0 ipk0VarB15 = g3l0Var.b.b(g3l0Var, (ipk0) obj2);
                    if (!(ipk0VarB15 instanceof ypk0)) {
                        hb5.a(inm.a("Expected string for var name. got ", ipk0VarB15.getClass().getCanonicalName()));
                        return null;
                    }
                    g3l0Var.f(((ypk0) ipk0VarB15).a, ipk0.o);
                }
                return ipk0.o;
            default:
                b(str);
                throw null;
        }
    }
}
