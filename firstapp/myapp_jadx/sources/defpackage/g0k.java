package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg0k;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g0k extends j8i0 {
    public final Map<String, Object> a;
    public final mpe0 b;

    public g0k(n0d n0dVar, bnh0 bnh0Var) {
        n0dVar.getClass();
        bnh0Var.getClass();
        l0d l0dVarC = n0dVar.c();
        Pair pair = new Pair("F-Token", l0dVarC.a);
        Pair pair2 = new Pair("User-Id", l0dVarC.k);
        Pair pair3 = new Pair(CaBJCMnsV.VwrYWnqrLGLbDeX, l0dVarC.b);
        Pair pair4 = new Pair("Fingerprints", l0dVarC.c);
        Pair pair5 = new Pair("Host", bnh0Var.a("https", new String[0]));
        yi5 yi5Var = l0dVarC.j;
        this.a = kpu.f(pair, pair2, pair3, pair4, pair5, new Pair("F-Crashlytics", Boolean.valueOf(yi5Var.a().g())), new Pair("F-Analytics", Boolean.valueOf(l0dVarC.d)), new Pair("S-Crashlytics", Boolean.valueOf(yi5Var.a().c())), new Pair("logs", Boolean.valueOf(yi5Var.a().e())), new Pair("Build channel", yi5Var.b().h().name()), new Pair("GP-Version", Boolean.valueOf(yi5Var.b().j())), new Pair("ApplicationId", yi5Var.b().e()), new Pair("AccType", l0dVarC.e), new Pair("DefaultCountry", yi5Var.b().o()), new Pair("NetworkConfig overridden", Boolean.valueOf(yi5Var.a().d())), new Pair("Sct", l0dVarC.f), new Pair("Sct status", Integer.valueOf(l0dVarC.g)), new Pair("FS", l0dVarC.h), new Pair("WebView debugging", Boolean.valueOf(yi5Var.a().h())), new Pair("Portal", yi5Var.c().a()), new Pair("Game sdk", yi5Var.b().c()), new Pair("installer", l0dVarC.i), new Pair("Git branch", yi5Var.b().n()), new Pair("Build Number", yi5Var.b().b()));
        this.b = hwr.b(new f0k(this, 0));
    }
}
