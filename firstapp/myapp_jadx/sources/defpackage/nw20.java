package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nw20 {
    public static final SparseArray<kw20> a = new SparseArray<>();
    public static final HashMap<kw20, Integer> b;

    static {
        HashMap<kw20, Integer> map = new HashMap<>();
        b = map;
        map.put(kw20.a, 0);
        map.put(kw20.b, 1);
        map.put(kw20.c, 2);
        for (kw20 kw20Var : map.keySet()) {
            a.append(b.get(kw20Var).intValue(), kw20Var);
        }
    }

    public static int a(kw20 kw20Var) {
        Integer num = b.get(kw20Var);
        if (num != null) {
            return num.intValue();
        }
        rcp.a(kw20Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static kw20 b(int i) {
        kw20 kw20Var = a.get(i);
        if (kw20Var != null) {
            return kw20Var;
        }
        hb5.a(hce0.a(i, "Unknown Priority for value "));
        return null;
    }
}
