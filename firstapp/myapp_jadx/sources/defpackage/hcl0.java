package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class hcl0 implements Runnable {
    public final /* synthetic */ nfl0 a;

    public hcl0(nfl0 nfl0Var) {
        this.a = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        utl0 utl0Var = this.a.r;
        k8l0 k8l0Var = utl0Var.a;
        p7l0 p7l0Var = k8l0Var.g;
        nfl0 nfl0Var = k8l0Var.m;
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        if (utl0Var.c()) {
            if (utl0Var.b()) {
                k8l0.k(j6l0Var);
                j6l0Var.w.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                k8l0.l(nfl0Var);
                nfl0Var.n(StompClient.DEFAULT_ACK, "_cmpx", bundle);
            } else {
                k8l0.k(j6l0Var);
                h6l0 h6l0Var = j6l0Var.w;
                String strA = h6l0Var.a();
                if (TextUtils.isEmpty(strA)) {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.g.a("Cache still valid but referrer not found");
                } else {
                    long jA = j6l0Var.x.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    String str2 = obj == null ? "app" : (String) obj;
                    k8l0.l(nfl0Var);
                    nfl0Var.n(str2, "_cmp", (Bundle) pair.second);
                }
                h6l0Var.b(null);
            }
            k8l0.k(j6l0Var);
            j6l0Var.x.b(0L);
        }
    }
}
