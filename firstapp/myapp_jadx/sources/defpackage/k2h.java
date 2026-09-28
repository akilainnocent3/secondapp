package defpackage;

import com.sporty.android.core.model.patron.ReachedLimit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k2h implements ajg0 {
    public static final k2h a = new k2h();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public static final ArrayList c(List list) {
        ?? arrayList;
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReachedLimit reachedLimit = (ReachedLimit) it.next();
            String strValueOf = String.valueOf(reachedLimit.getLimitType());
            rcs.a aVar = rcs.b;
            if (Intrinsics.g(strValueOf, "1")) {
                arrayList = new ArrayList();
                if (reachedLimit.getReachedDailyLimit()) {
                    arrayList.add(c140.e);
                }
                if (reachedLimit.getReachedWeeklyLimit()) {
                    arrayList.add(c140.f);
                }
                if (Intrinsics.g(reachedLimit.getReachedMonthlyLimit(), Boolean.TRUE)) {
                    arrayList.add(c140.i);
                }
            } else if (Intrinsics.g(strValueOf, "4")) {
                arrayList = new ArrayList();
                if (reachedLimit.getReachedDailyLimit()) {
                    arrayList.add(c140.c);
                }
                if (reachedLimit.getReachedWeeklyLimit()) {
                    arrayList.add(c140.d);
                }
            } else if (Intrinsics.g(strValueOf, "3")) {
                arrayList = new ArrayList();
                if (reachedLimit.getReachedDailyLimit()) {
                    arrayList.add(c140.v);
                }
                if (reachedLimit.getReachedWeeklyLimit()) {
                    arrayList.add(c140.w);
                }
                if (Intrinsics.g(reachedLimit.getReachedMonthlyLimit(), Boolean.TRUE)) {
                    arrayList.add(c140.y);
                }
            } else {
                arrayList = m2g.a;
            }
            p48.w(arrayList, arrayListA);
        }
        return arrayListA;
    }

    public static final boolean d(qai0 qai0Var, qai0 qai0Var2, kxs kxsVar) {
        qai0Var.getClass();
        if (qai0Var2 == null || ((qai0Var2 instanceof qai0.b) && (qai0Var instanceof qai0.a))) {
            return true;
        }
        if ((qai0Var instanceof qai0.b) && (qai0Var2 instanceof qai0.a)) {
            return false;
        }
        return (qai0Var.c == qai0Var2.c && qai0Var.d == qai0Var2.d && qai0Var2.a(kxsVar) <= qai0Var.a(kxsVar)) ? false : true;
    }

    public static ipk0 e(pnk0 pnk0Var, g3l0 g3l0Var, ArrayList arrayList, boolean z) {
        ipk0 ipk0VarG;
        r5l0.b(1, "reduce", arrayList);
        r5l0.c(2, "reduce", arrayList);
        ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
        if (!(ipk0VarB instanceof jok0)) {
            hb5.a("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            ipk0VarG = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
            if (ipk0VarG instanceof ynk0) {
                hb5.a("Failed to parse initial value");
                return null;
            }
        } else {
            if (pnk0Var.j() == 0) {
                ib5.a("Empty array with no initial value error");
                return null;
            }
            ipk0VarG = null;
        }
        jok0 jok0Var = (jok0) ipk0VarB;
        int iJ = pnk0Var.j();
        int i = z ? 0 : iJ - 1;
        int i2 = z ? iJ - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (ipk0VarG == null) {
            ipk0VarG = pnk0Var.k(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (pnk0Var.m(i)) {
                ipk0VarG = jok0Var.g(g3l0Var, Arrays.asList(ipk0VarG, pnk0Var.k(i), new eok0(Double.valueOf(i)), pnk0Var));
                if (ipk0VarG instanceof ynk0) {
                    ib5.a("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return ipk0VarG;
    }

    public static pnk0 f(pnk0 pnk0Var, g3l0 g3l0Var, fpk0 fpk0Var, Boolean bool, Boolean bool2) {
        pnk0 pnk0Var2 = new pnk0();
        Iterator itI = pnk0Var.i();
        while (itI.hasNext()) {
            int iIntValue = ((Integer) itI.next()).intValue();
            if (pnk0Var.m(iIntValue)) {
                ipk0 ipk0VarG = fpk0Var.g(g3l0Var, Arrays.asList(pnk0Var.k(iIntValue), new eok0(Double.valueOf(iIntValue)), pnk0Var));
                if (ipk0VarG.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || ipk0VarG.zze().equals(bool2)) {
                    pnk0Var2.l(iIntValue, ipk0VarG);
                }
            }
        }
        return pnk0Var2;
    }

    @Override // defpackage.ajg0
    public zig0 build() {
        return j2h.a;
    }

    @Override // defpackage.ajg0
    public ajg0 a(String str) {
        return this;
    }

    @Override // defpackage.ajg0
    public ajg0 b(String str) {
        return this;
    }
}
