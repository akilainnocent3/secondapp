package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x8j implements zqm {
    public static final x8j a = new x8j();
    public static f00 b;

    @Override // defpackage.zqm
    public final void b(String str, Map<String, ? extends Object> map) {
        str.getClass();
        map.getClass();
        f00 f00Var = b;
        if (f00Var != null) {
            f00Var.e.f(str, map);
        }
    }

    @Override // defpackage.zqm
    public final void d(String str, String str2) {
        str2.getClass();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        b(str, o2gVar);
    }

    @Override // defpackage.zqm
    public final void e(f00 f00Var) {
        b = f00Var;
    }

    @Override // defpackage.zqm
    public final void a(String str) {
    }

    @Override // defpackage.zqm
    public final void setUserId(String str) {
    }

    @Override // defpackage.zqm
    public final void c(Context context, String str) {
    }
}
