package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class l9i0 {
    public static final fk1 c;
    public static final Logger d;
    public final HashMap a = new HashMap();
    public final ArrayList b;

    static {
        k6i0 k6i0VarA = nl1.a();
        c = new fk1(new cj1(), new nl1(k6i0VarA.a, k6i0VarA.b, k6i0VarA.c), ayx.b, 2000, qwx.a);
        d = Logger.getLogger(l9i0.class.getName());
    }

    public l9i0(y8d y8dVar, hh6 hh6Var, ArrayList arrayList) {
        for (lso lsoVar : lso.values()) {
            HashMap map = this.a;
            cj1 cj1Var = new cj1();
            k6i0 k6i0VarA = nl1.a();
            x8d x8dVarN = y8dVar.n();
            if (x8dVarN == null) {
                hb5.a("Custom Aggregation implementations are currently not supported. Use one of the standard implementations returned by the static factories in the Aggregation class.");
                throw null;
            }
            k6i0VarA.a = x8dVarN;
            map.put(lsoVar, new fk1(cj1Var, new nl1(x8dVarN, k6i0VarA.b, k6i0VarA.c), ayx.b, hh6Var.a(), qwx.a));
        }
        this.b = arrayList;
    }

    public final List a(bj1 bj1Var, oso osoVar) {
        Logger logger;
        tm tmVar;
        ArrayList arrayList;
        int i;
        int i2;
        Pattern patternCompile;
        boolean zMatches;
        int i3;
        int i4;
        char c2;
        tm tmVar2 = bj1Var.h;
        String str = bj1Var.c;
        lso lsoVar = bj1Var.f;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.b;
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            logger = d;
            if (i5 >= size) {
                break;
            }
            Object obj = arrayList3.get(i5);
            int i6 = i5 + 1;
            nw40 nw40Var = (nw40) obj;
            cj1 cj1VarB = nw40Var.b();
            if ((cj1VarB.b() == null || cj1VarB.b() == lsoVar) && (cj1VarB.c() == null || cj1VarB.c().equals(bj1Var.e))) {
                if (cj1VarB.a() != null) {
                    String strA = cj1VarB.a();
                    tmVar = tmVar2;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= strA.length()) {
                            arrayList = arrayList3;
                            i = size;
                            i2 = i6;
                            patternCompile = null;
                            break;
                        }
                        char cCharAt = strA.charAt(i7);
                        arrayList = arrayList3;
                        i = size;
                        char c3 = '*';
                        if (cCharAt == '*' || cCharAt == '?') {
                            StringBuilder sb = new StringBuilder();
                            int i8 = 0;
                            int i9 = -1;
                            while (i8 < strA.length()) {
                                char cCharAt2 = strA.charAt(i8);
                                if (cCharAt2 == c3 || cCharAt2 == '?') {
                                    i3 = i9;
                                    i4 = i6;
                                    if (i3 != -1) {
                                        sb.append(Pattern.quote(strA.substring(i3, i8)));
                                        i3 = -1;
                                    }
                                    c2 = '*';
                                    if (cCharAt2 == '*') {
                                        sb.append(".*");
                                    } else {
                                        sb.append(".");
                                    }
                                } else {
                                    i3 = i9;
                                    i4 = i6;
                                    if (i3 == -1) {
                                        i3 = i8;
                                    }
                                    c2 = '*';
                                }
                                i8++;
                                int i10 = i4;
                                i9 = i3;
                                c3 = c2;
                                i6 = i10;
                            }
                            int i11 = i9;
                            i2 = i6;
                            if (i11 != -1) {
                                sb.append(Pattern.quote(strA.substring(i11)));
                            }
                            patternCompile = Pattern.compile(sb.toString());
                            break;
                        }
                        i7++;
                        arrayList3 = arrayList;
                        size = i;
                    }
                    if (strA.equals("*")) {
                        zMatches = true;
                    } else {
                        zMatches = patternCompile != null ? patternCompile.matcher(str).matches() : strA.equalsIgnoreCase(str);
                    }
                    if (!zMatches) {
                    }
                } else {
                    tmVar = tmVar2;
                    arrayList = arrayList3;
                    i = size;
                    i2 = i6;
                }
                if ((cj1VarB.d() == null || cj1VarB.d().equals(osoVar.c())) && ((cj1VarB.f() == null || cj1VarB.f().equals(osoVar.e())) && (cj1VarB.e() == null || cj1VarB.e().equals(osoVar.d())))) {
                    if (((yr) nw40Var.c().b()).a(bj1Var)) {
                        arrayList2.add(nw40Var);
                    } else {
                        logger.log(Level.WARNING, "View aggregation " + wr.a(nw40Var.c().b()) + " is incompatible with instrument " + str + " of type " + lsoVar);
                    }
                }
            } else {
                tmVar = tmVar2;
                arrayList = arrayList3;
                i = size;
                i2 = i6;
            }
            tmVar2 = tmVar;
            arrayList3 = arrayList;
            size = i;
            i5 = i2;
        }
        tm tmVar3 = tmVar2;
        if (!arrayList2.isEmpty()) {
            return Collections.unmodifiableList(arrayList2);
        }
        nw40 fk1Var = (nw40) this.a.get(lsoVar);
        Objects.requireNonNull(fk1Var);
        if (!((yr) fk1Var.c().b()).a(bj1Var)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + wr.a(fk1Var.c().b()) + " is incompatible with instrument " + str + " of type " + lsoVar);
            fk1Var = c;
        }
        if (tmVar3.a() != null) {
            cj1 cj1VarB2 = fk1Var.b();
            nl1 nl1VarC = fk1Var.c();
            List<e21<?>> listA = tmVar3.a();
            Objects.requireNonNull(listA);
            fk1Var = new fk1(cj1VarB2, nl1VarC, new um(listA), fk1Var.a(), fk1Var.e());
        }
        return Collections.singletonList(fk1Var);
    }
}
