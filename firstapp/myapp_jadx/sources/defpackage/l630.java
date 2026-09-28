package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class l630 {
    public static final c730 a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(l630.class, je1.a);
        map2.remove(l630.class);
        map.put(ds7.class, ce1.a);
        map2.remove(ds7.class);
        map.put(mxf0.class, le1.a);
        map2.remove(mxf0.class);
        map.put(yft.class, fe1.a);
        map2.remove(yft.class);
        map.put(hft.class, ee1.a);
        map2.remove(hft.class);
        map.put(q1l.class, de1.a);
        map2.remove(q1l.class);
        map.put(n1e0.class, ke1.a);
        map2.remove(n1e0.class);
        a = new c730(new HashMap(map), new HashMap(map2));
    }

    public abstract ds7 a();
}
