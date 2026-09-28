package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a7l0 implements Callable {
    public final /* synthetic */ e7l0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ a7l0(e7l0 e7l0Var, String str) {
        this.a = e7l0Var;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e7l0 e7l0Var = this.a;
        lqk0 lqk0Var = e7l0Var.b.c;
        iol0.U(lqk0Var);
        String str = this.b;
        k5l0 k5l0VarI0 = lqk0Var.i0(str);
        HashMap map = new HashMap();
        map.put("platform", "android");
        map.put("package_name", str);
        e7l0Var.a.d.l();
        map.put("gmp_version", 133005L);
        if (k5l0VarI0 != null) {
            String strN = k5l0VarI0.N();
            if (strN != null) {
                map.put("app_version", strN);
            }
            map.put("app_version_int", Long.valueOf(k5l0VarI0.P()));
            map.put("dynamite_version", Long.valueOf(k5l0VarI0.b()));
        }
        return map;
    }
}
