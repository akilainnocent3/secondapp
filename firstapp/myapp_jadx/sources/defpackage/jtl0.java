package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class jtl0 extends jok0 {
    public final hal0 c;
    public final HashMap d;

    public jtl0(hal0 hal0Var) {
        super("require");
        this.d = new HashMap();
        this.c = hal0Var;
    }

    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        ipk0 ipk0Var;
        r5l0.a(1, "require", list);
        String strZzc = g3l0Var.b.b(g3l0Var, (ipk0) list.get(0)).zzc();
        HashMap map = this.d;
        if (map.containsKey(strZzc)) {
            return (ipk0) map.get(strZzc);
        }
        HashMap map2 = this.c.a;
        if (map2.containsKey(strZzc)) {
            try {
                ipk0Var = (ipk0) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                ib5.a("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
                return null;
            }
        } else {
            ipk0Var = ipk0.o;
        }
        if (ipk0Var instanceof jok0) {
            map.put(strZzc, (jok0) ipk0Var);
        }
        return ipk0Var;
    }
}
