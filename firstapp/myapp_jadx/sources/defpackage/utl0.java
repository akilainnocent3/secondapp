package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class utl0 {
    public final k8l0 a;

    public utl0(k8l0 k8l0Var) {
        this.a = k8l0Var;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        k8l0 k8l0Var = this.a;
        p7l0 p7l0Var = k8l0Var.g;
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        if (k8l0Var.f()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = StompClient.DEFAULT_ACK;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        k8l0.k(j6l0Var);
        j6l0Var.w.b(string);
        d6l0 d6l0Var = j6l0Var.x;
        k8l0Var.k.getClass();
        d6l0Var.b(System.currentTimeMillis());
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        k8l0 k8l0Var = this.a;
        k8l0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        return jCurrentTimeMillis - j6l0Var.x.a() > k8l0Var.d.n(null, v2l0.j0);
    }

    public final boolean c() {
        j6l0 j6l0Var = this.a.e;
        k8l0.k(j6l0Var);
        return j6l0Var.x.a() > 0;
    }
}
