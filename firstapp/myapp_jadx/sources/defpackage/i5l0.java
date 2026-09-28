package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i5l0 extends vml0 {
    @Override // defpackage.vml0
    public final void j() {
    }

    public final boolean k() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void l(String str, xml0 xml0Var, j8l0 j8l0Var, c5l0 c5l0Var) {
        String str2;
        String str3 = xml0Var.a;
        k8l0 k8l0Var = this.a;
        g();
        h();
        try {
            URL url = new URI(str3).toURL();
            this.b.j0();
            byte[] bArrE = j8l0Var.e();
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            Map map = xml0Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                p7l0Var.s(new g5l0(this, str2, url, bArrE, map, c5l0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.c(y4l0.k(str2), gvQvkPPtA.HBzkLCZVhoRC, str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }
}
