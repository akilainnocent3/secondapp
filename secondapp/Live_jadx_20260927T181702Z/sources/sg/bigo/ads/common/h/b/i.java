package sg.bigo.ads.common.h.b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, a> f133123a = new HashMap();

    public static void a() {
        f133123a.clear();
    }

    public static Collection<a> b() {
        return f133123a.values();
    }

    public static a c(String str) {
        if (f133123a.containsKey(str)) {
            return f133123a.get(str);
        }
        return null;
    }

    public static void a(String str) {
        a aVarC = c(str);
        if (aVarC == null) {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        int i10 = aVarC.f133104e;
        if (i10 == h.f133118d || i10 == h.f133120f) {
            sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", "start downloadBean = ".concat(String.valueOf(aVarC)));
            return;
        }
        aVarC.f133104e = h.f133116b;
        f.a().a(aVarC.f133100a);
        g.f133114a.execute(aVarC.f133102c);
    }

    public static void b(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            a(aVarC);
        } else {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (f133123a.containsKey(str)) {
            f133123a.remove(str);
        }
    }

    public static void a(a aVar) {
        aVar.f133105f = "It's remove !!!";
        if (aVar.f133104e != h.f133120f) {
            aVar.f133104e = h.f133121g;
            f.a().a(aVar.f133100a);
        }
        f.a().b(aVar.f133100a);
        g.a(aVar.f133102c);
    }

    public static void b(a aVar) {
        if (f133123a.containsKey(aVar.f133100a)) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", " " + f133123a.keySet().size());
        f133123a.put(aVar.f133100a, aVar);
    }
}
