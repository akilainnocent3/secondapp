package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fnf {
    public static final /* synthetic */ int a = 0;

    public static final Object a(vu60 vu60Var, dq7 dq7Var, Map map) {
        vu60Var.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        php phpVarB = ue80.b(dq7Var);
        ArrayList arrayListC = w060.c(phpVarB, map);
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            nex nexVar = (nex) obj;
            linkedHashMap.put(nexVar.a, nexVar.b.a);
        }
        return new s060(vu60Var, linkedHashMap).X(phpVarB);
    }
}
