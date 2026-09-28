package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ysk0 extends kqk0 {
    public static ipk0 c(ssk0 ssk0Var, ipk0 ipk0Var, ipk0 ipk0Var2) {
        if (ipk0Var instanceof Iterable) {
            return d(ssk0Var, ((Iterable) ipk0Var).iterator(), ipk0Var2);
        }
        hb5.a("Non-iterable type in for...of loop.");
        return null;
    }

    public static ipk0 d(ssk0 ssk0Var, Iterator it, ipk0 ipk0Var) {
        if (it != null) {
            while (it.hasNext()) {
                ipk0 ipk0VarB = ssk0Var.a((ipk0) it.next()).b((pnk0) ipk0Var);
                if (ipk0VarB instanceof ynk0) {
                    ynk0 ynk0Var = (ynk0) ipk0VarB;
                    String str = ynk0Var.b;
                    if ("break".equals(str)) {
                        return ipk0.o;
                    }
                    if ("return".equals(str)) {
                        return ynk0Var;
                    }
                }
            }
        }
        return ipk0.o;
    }

    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        ktk0 ktk0Var = ktk0.ADD;
        int iOrdinal = r5l0.e(str).ordinal();
        if (iOrdinal == 65) {
            r5l0.a(4, "WHILE", arrayList);
            ipk0 ipk0Var = (ipk0) arrayList.get(0);
            ipk0 ipk0Var2 = (ipk0) arrayList.get(1);
            ipk0 ipk0Var3 = (ipk0) arrayList.get(2);
            ipk0 ipk0Var4 = (ipk0) arrayList.get(3);
            pqk0 pqk0Var = g3l0Var.b;
            pqk0 pqk0Var2 = g3l0Var.b;
            ipk0 ipk0VarB = pqk0Var.b(g3l0Var, ipk0Var4);
            if (pqk0Var2.b(g3l0Var, ipk0Var3).zze().booleanValue()) {
                ipk0 ipk0VarB2 = g3l0Var.b((pnk0) ipk0VarB);
                if (ipk0VarB2 instanceof ynk0) {
                    ynk0 ynk0Var = (ynk0) ipk0VarB2;
                    String str2 = ynk0Var.b;
                    if ("break".equals(str2)) {
                        return ipk0.o;
                    }
                    if ("return".equals(str2)) {
                        return ynk0Var;
                    }
                }
            }
            while (pqk0Var2.b(g3l0Var, ipk0Var).zze().booleanValue()) {
                ipk0 ipk0VarB3 = g3l0Var.b((pnk0) ipk0VarB);
                if (ipk0VarB3 instanceof ynk0) {
                    ynk0 ynk0Var2 = (ynk0) ipk0VarB3;
                    String str3 = ynk0Var2.b;
                    if ("break".equals(str3)) {
                        return ipk0.o;
                    }
                    if ("return".equals(str3)) {
                        return ynk0Var2;
                    }
                }
                g3l0Var.a(ipk0Var2);
            }
            return ipk0.o;
        }
        switch (iOrdinal) {
            case RuntimeVersion.MINOR /* 26 */:
                r5l0.a(3, "FOR_IN", arrayList);
                if (!(arrayList.get(0) instanceof ypk0)) {
                    hb5.a("Variable name in FOR_IN must be a string");
                    return null;
                }
                String strZzc = ((ipk0) arrayList.get(0)).zzc();
                ipk0 ipk0VarB4 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
                ipk0 ipk0VarB5 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(2));
                Iterator itZzf = ipk0VarB4.zzf();
                if (itZzf != null) {
                    while (itZzf.hasNext()) {
                        g3l0Var.f(strZzc, (ipk0) itZzf.next());
                        ipk0 ipk0VarB6 = g3l0Var.b((pnk0) ipk0VarB5);
                        if (ipk0VarB6 instanceof ynk0) {
                            ynk0 ynk0Var3 = (ynk0) ipk0VarB6;
                            String str4 = ynk0Var3.b;
                            if ("break".equals(str4)) {
                                return ipk0.o;
                            }
                            if ("return".equals(str4)) {
                                return ynk0Var3;
                            }
                        }
                    }
                }
                return ipk0.o;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                r5l0.a(3, "FOR_IN_CONST", arrayList);
                if (!(arrayList.get(0) instanceof ypk0)) {
                    hb5.a("Variable name in FOR_IN_CONST must be a string");
                    return null;
                }
                return d(new lsk0(g3l0Var, ((ipk0) arrayList.get(0)).zzc()), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzf(), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(2)));
            case 28:
                r5l0.a(3, "FOR_IN_LET", arrayList);
                if (!(arrayList.get(0) instanceof ypk0)) {
                    hb5.a("Variable name in FOR_IN_LET must be a string");
                    return null;
                }
                String strZzc2 = ((ipk0) arrayList.get(0)).zzc();
                ipk0 ipk0VarB7 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
                ipk0 ipk0VarB8 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(2));
                Iterator itZzf2 = ipk0VarB7.zzf();
                if (itZzf2 != null) {
                    while (itZzf2.hasNext()) {
                        ipk0 ipk0Var5 = (ipk0) itZzf2.next();
                        g3l0 g3l0VarC = g3l0Var.c();
                        g3l0VarC.f(strZzc2, ipk0Var5);
                        ipk0 ipk0VarB9 = g3l0VarC.b((pnk0) ipk0VarB8);
                        if (ipk0VarB9 instanceof ynk0) {
                            ynk0 ynk0Var4 = (ynk0) ipk0VarB9;
                            String str5 = ynk0Var4.b;
                            if ("break".equals(str5)) {
                                return ipk0.o;
                            }
                            if ("return".equals(str5)) {
                                return ynk0Var4;
                            }
                        }
                    }
                }
                return ipk0.o;
            case 29:
                r5l0.a(4, "FOR_LET", arrayList);
                ipk0 ipk0Var6 = (ipk0) arrayList.get(0);
                pqk0 pqk0Var3 = g3l0Var.b;
                pqk0 pqk0Var4 = g3l0Var.b;
                ipk0 ipk0VarB10 = pqk0Var3.b(g3l0Var, ipk0Var6);
                if (!(ipk0VarB10 instanceof pnk0)) {
                    hb5.a("Initializer variables in FOR_LET must be an ArrayList");
                    return null;
                }
                pnk0 pnk0Var = (pnk0) ipk0VarB10;
                ipk0 ipk0Var7 = (ipk0) arrayList.get(1);
                ipk0 ipk0Var8 = (ipk0) arrayList.get(2);
                ipk0 ipk0VarB11 = pqk0Var4.b(g3l0Var, (ipk0) arrayList.get(3));
                g3l0 g3l0VarC2 = g3l0Var.c();
                for (int i = 0; i < pnk0Var.j(); i++) {
                    String strZzc3 = pnk0Var.k(i).zzc();
                    g3l0VarC2.e(strZzc3, g3l0Var.g(strZzc3));
                }
                while (pqk0Var4.b(g3l0Var, ipk0Var7).zze().booleanValue()) {
                    ipk0 ipk0VarB12 = g3l0Var.b((pnk0) ipk0VarB11);
                    if (ipk0VarB12 instanceof ynk0) {
                        ynk0 ynk0Var5 = (ynk0) ipk0VarB12;
                        String str6 = ynk0Var5.b;
                        if ("break".equals(str6)) {
                            return ipk0.o;
                        }
                        if ("return".equals(str6)) {
                            return ynk0Var5;
                        }
                    }
                    g3l0 g3l0VarC3 = g3l0Var.c();
                    for (int i2 = 0; i2 < pnk0Var.j(); i2++) {
                        String strZzc4 = pnk0Var.k(i2).zzc();
                        g3l0VarC3.e(strZzc4, g3l0VarC2.g(strZzc4));
                    }
                    g3l0VarC3.a(ipk0Var8);
                    g3l0VarC2 = g3l0VarC3;
                }
                return ipk0.o;
            case 30:
                r5l0.a(3, "FOR_OF", arrayList);
                if (!(arrayList.get(0) instanceof ypk0)) {
                    hb5.a("Variable name in FOR_OF must be a string");
                    return null;
                }
                return c(new vsk0(g3l0Var, ((ipk0) arrayList.get(0)).zzc()), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(2)));
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                r5l0.a(3, "FOR_OF_CONST", arrayList);
                if (!(arrayList.get(0) instanceof ypk0)) {
                    hb5.a("Variable name in FOR_OF_CONST must be a string");
                    return null;
                }
                return c(new lsk0(g3l0Var, ((ipk0) arrayList.get(0)).zzc()), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(2)));
            case 32:
                r5l0.a(3, "FOR_OF_LET", arrayList);
                if (!(arrayList.get(0) instanceof ypk0)) {
                    hb5.a("Variable name in FOR_OF_LET must be a string");
                    return null;
                }
                return c(new osk0(g3l0Var, ((ipk0) arrayList.get(0)).zzc()), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)), g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(2)));
            default:
                b(str);
                throw null;
        }
    }
}
