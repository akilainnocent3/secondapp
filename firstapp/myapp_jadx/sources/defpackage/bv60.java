package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bv60 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final av60 e;

    public bv60(Map<String, ? extends Object> map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new av60(this);
    }

    public final void a(Object obj, String str) {
        str.getClass();
        this.a.put(str, obj);
        ztw ztwVar = (ztw) this.c.get(str);
        if (ztwVar != null) {
            ztwVar.setValue(obj);
        }
        ztw ztwVar2 = (ztw) this.d.get(str);
        if (ztwVar2 != null) {
            ztwVar2.setValue(obj);
        }
    }
}
