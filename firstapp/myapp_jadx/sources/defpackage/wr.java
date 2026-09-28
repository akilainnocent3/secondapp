package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class wr {
    public static final HashMap a;

    public static String a(tr trVar) {
        String str = (String) a.get(trVar.getClass());
        if (str != null) {
            return str;
        }
        ib5.a("Unrecognized aggregation ".concat(trVar.getClass().getName()));
        return null;
    }

    static {
        HashMap map = new HashMap();
        x8d x8dVar = x8d.a;
        map.put("default", x8dVar);
        map.put("sum", hfe0.a);
        lor lorVar = lor.a;
        String str = LhMGMAwwhzjwfz.DoyS;
        map.put(str, lorVar);
        map.put("drop", oef.a);
        c0h c0hVar = c0h.c;
        map.put("explicit_bucket_histogram", c0hVar);
        map.put("base2_exponential_bucket_histogram", xx1.a);
        HashMap map2 = new HashMap();
        a = map2;
        map2.put(x8dVar.getClass(), "default");
        map2.put(hfe0.class, "sum");
        map2.put(lor.class, str);
        map2.put(oef.class, "drop");
        map2.put(c0hVar.getClass(), "explicit_bucket_histogram");
        map2.put(xx1.class, "base2_exponential_bucket_histogram");
    }
}
