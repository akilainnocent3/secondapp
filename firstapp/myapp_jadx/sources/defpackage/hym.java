package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface hym {
    static void a(hym hymVar, String str, Map map, int i) {
        if ((i & 2) != 0) {
            map = o2g.a;
            map.getClass();
        }
        hymVar.c(str, map, false);
    }

    void b(String str, Map map);

    void c(String str, Map map, boolean z);
}
