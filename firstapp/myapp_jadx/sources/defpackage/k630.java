package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k630 {
    public static final c730 a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(k630.class, ie1.a);
        map2.remove(k630.class);
        map.put(rov.class, he1.a);
        map2.remove(rov.class);
        map.put(qov.class, ge1.a);
        map2.remove(qov.class);
        a = new c730(new HashMap(map), new HashMap(map2));
    }

    public abstract rov a();
}
