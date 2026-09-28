package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class o6l0 {
    public final k8l0 a;

    public o6l0(iol0 iol0Var) {
        this.a = iol0Var.l;
    }

    public final boolean a() {
        k8l0 k8l0Var = this.a;
        try {
            return r7k0.a(k8l0Var.a).b(128, "com.android.vending").versionCode >= 80837300;
        } catch (Exception e) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
