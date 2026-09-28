package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class rdp {
    public static final sae.a<Map<String, Integer>> a = new sae.a<>();

    public static final int a(pd80 pd80Var, wbp wbpVar, String str) {
        pd80Var.getClass();
        wbpVar.getClass();
        str.getClass();
        d(wbpVar, pd80Var);
        int iC = pd80Var.c(str);
        if (iC != -3 || !wbpVar.a.e) {
            return iC;
        }
        sae saeVar = wbpVar.c;
        qdp qdpVar = new qdp(0, pd80Var, wbpVar);
        ConcurrentHashMap concurrentHashMap = saeVar.a;
        Map map = (Map) concurrentHashMap.get(pd80Var);
        sae.a<Map<String, Integer>> aVar = a;
        Object obj = map != null ? map.get(aVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = qdpVar.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(pd80Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(pd80Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(aVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(pd80 pd80Var, wbp wbpVar, String str, String str2) {
        pd80Var.getClass();
        wbpVar.getClass();
        str.getClass();
        int iA = a(pd80Var, wbpVar, str);
        if (iA != -3) {
            return iA;
        }
        throw new ee80(pd80Var.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(wbp wbpVar, pd80 pd80Var) {
        pd80Var.getClass();
        wbpVar.getClass();
        if (wbpVar.a.a) {
            return true;
        }
        List<Annotation> annotations = pd80Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof ldp) {
                return true;
            }
        }
        return false;
    }

    public static final void d(wbp wbpVar, pd80 pd80Var) {
        pd80Var.getClass();
        wbpVar.getClass();
        Intrinsics.g(pd80Var.getKind(), ebe0.a.a);
    }
}
