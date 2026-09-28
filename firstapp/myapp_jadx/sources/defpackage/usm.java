package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface usm {
    static void g(usm usmVar, brb brbVar, String str, String str2) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        usmVar.h(brbVar, str, str2, o2gVar);
    }

    static void i(usm usmVar, brb brbVar, String str) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        usmVar.j(brbVar, str, o2gVar);
    }

    b390 a();

    void b(String str, Map map);

    boolean c();

    b390 d();

    void e();

    b390 f();

    void h(brb brbVar, String str, String str2, Map<String, String> map);

    void j(brb brbVar, String str, Map<String, String> map);
}
