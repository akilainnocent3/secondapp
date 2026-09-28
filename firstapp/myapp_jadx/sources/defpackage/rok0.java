package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface rok0 {
    static ipk0 d(rok0 rok0Var, ypk0 ypk0Var, g3l0 g3l0Var, ArrayList arrayList) {
        String str = ypk0Var.a;
        if (rok0Var.f(str)) {
            ipk0 ipk0VarB = rok0Var.b(str);
            if (ipk0VarB instanceof jok0) {
                return ((jok0) ipk0VarB).g(g3l0Var, arrayList);
            }
            hb5.a(yk10.a(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            r5l0.a(1, "hasOwnProperty", arrayList);
            return rok0Var.f(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc()) ? ipk0.t : ipk0.u;
        }
        hb5.a(inm.a("Object has no function ", str));
        return null;
    }

    ipk0 b(String str);

    void e(String str, ipk0 ipk0Var);

    boolean f(String str);
}
