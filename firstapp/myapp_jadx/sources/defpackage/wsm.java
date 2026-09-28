package defpackage;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface wsm {
    static void d(wsm wsmVar, Throwable th) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wsmVar.f(th, o2gVar);
    }

    void a(String str);

    void b();

    void c(boolean z);

    void e(String str, String str2);

    void f(Throwable th, Map<String, String> map);

    void g(String str, String str2, Throwable th, List<? extends Pair<String, String>> list);

    void h(LinkedHashMap linkedHashMap);

    void log(String str);
}
