package defpackage;

import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;

/* JADX INFO: loaded from: classes.dex */
public final class x41 implements uby<j40> {
    public static final x41 a = new x41();
    public static final hjh b = hjh.a("sdkVersion");
    public static final hjh c = hjh.a("model");
    public static final hjh d = hjh.a("hardware");
    public static final hjh e = hjh.a(LastLoginDeviceInfo.KEY_DEVICE);
    public static final hjh f = hjh.a("product");
    public static final hjh g = hjh.a("osBuild");
    public static final hjh h = hjh.a("manufacturer");
    public static final hjh i = hjh.a("fingerprint");
    public static final hjh j = hjh.a("locale");
    public static final hjh k = hjh.a(LGxrN.fWfdbeSHguyJSI);
    public static final hjh l = hjh.a("mccMnc");
    public static final hjh m = hjh.a("applicationBuild");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        j40 j40Var = (j40) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, j40Var.l());
        vbyVar2.a(c, j40Var.i());
        vbyVar2.a(d, j40Var.e());
        vbyVar2.a(e, j40Var.c());
        vbyVar2.a(f, j40Var.k());
        vbyVar2.a(g, j40Var.j());
        vbyVar2.a(h, j40Var.g());
        vbyVar2.a(i, j40Var.d());
        vbyVar2.a(j, j40Var.f());
        vbyVar2.a(k, j40Var.b());
        vbyVar2.a(l, j40Var.h());
        vbyVar2.a(m, j40Var.a());
    }
}
