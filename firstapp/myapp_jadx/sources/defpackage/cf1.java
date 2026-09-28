package defpackage;

import android.os.Build;
import com.sporty.android.permission.location.KN.qUnCRF;

/* JADX INFO: loaded from: classes4.dex */
public final class cf1 implements uby<u20> {
    public static final cf1 a = new cf1();
    public static final hjh b = hjh.a("packageName");
    public static final hjh c = hjh.a("versionName");
    public static final hjh d = hjh.a("appBuildVersion");
    public static final hjh e = hjh.a(qUnCRF.LvwedeiC);
    public static final hjh f = hjh.a("currentProcessDetails");
    public static final hjh g = hjh.a("appProcessDetails");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        u20 u20Var = (u20) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, u20Var.a);
        vbyVar2.a(c, u20Var.b);
        vbyVar2.a(d, u20Var.c);
        vbyVar2.a(e, Build.MANUFACTURER);
        vbyVar2.a(f, u20Var.d);
        vbyVar2.a(g, u20Var.e);
    }
}
