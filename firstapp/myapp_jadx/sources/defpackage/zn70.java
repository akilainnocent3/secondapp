package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zn70 {
    public static final eae0 e = new eae0("_root_");
    public final krp a;
    public final Set<cb30> b;
    public final ConcurrentHashMap c;
    public final qn70 d;

    public zn70(krp krpVar) {
        this.a = krpVar;
        Set<cb30> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.b = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        eae0 eae0Var = e;
        qn70 qn70Var = new qn70(eae0Var, "_root_", null, krpVar, 8);
        this.d = qn70Var;
        setNewSetFromMap.add(eae0Var);
        concurrentHashMap.put("_root_", qn70Var);
    }
}
