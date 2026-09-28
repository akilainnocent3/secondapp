package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class df1 implements uby<xu0> {
    public static final df1 a = new df1();
    public static final hjh b = hjh.a("appId");
    public static final hjh c = hjh.a("deviceModel");
    public static final hjh d = hjh.a("sessionSdkVersion");
    public static final hjh e = hjh.a("osVersion");
    public static final hjh f = hjh.a("logEnvironment");
    public static final hjh g = hjh.a("androidAppInfo");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        xu0 xu0Var = (xu0) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, xu0Var.a);
        vbyVar2.a(c, Build.MODEL);
        vbyVar2.a(d, "3.0.1");
        vbyVar2.a(e, Build.VERSION.RELEASE);
        vbyVar2.a(f, fft.LOG_ENVIRONMENT_PROD);
        vbyVar2.a(g, xu0Var.b);
    }
}
