package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class gek0 {
    public static final gek0 b;
    public boolean a;

    static {
        gek0 gek0Var = new gek0();
        try {
            Class.forName("com.huawei.appgallery.log.LogAdaptor");
            gek0Var.a = true;
        } catch (ClassNotFoundException unused) {
            gek0Var.a = false;
        }
        b = gek0Var;
    }

    public final void a(String str, String str2) {
        if (this.a) {
            jdk0.a.e(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public final void b(String str, String str2, Exception exc) {
        if (this.a) {
            jdk0.a.e(str, str2, exc);
        } else {
            Log.e(str, str2, exc);
        }
    }

    public final void c(String str) {
        if (this.a) {
            jdk0.a.w("X509CertUtil", str);
        } else {
            Log.w("X509CertUtil", str);
        }
    }
}
