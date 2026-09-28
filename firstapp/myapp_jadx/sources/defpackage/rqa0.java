package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface rqa0 {
    int a();

    ui1 b();

    default oso c() {
        dj1 dj1VarG = g();
        String str = dj1VarG.a;
        int i = oso.a;
        String str2 = dj1VarG.b;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = dj1VarG.c;
        return oso.a(str, str2, str3 != null ? str3 : null, vw0.d);
    }

    pg50 d();

    List<gng> e();

    long f();

    @Deprecated
    dj1 g();

    m21 getAttributes();

    wqa0 getKind();

    String getName();

    yzd0 getStatus();

    int h();

    long i();

    List<sfs> j();

    default String k() {
        return b().a();
    }

    int l();

    default String m() {
        return b().c();
    }

    ui1 n();
}
