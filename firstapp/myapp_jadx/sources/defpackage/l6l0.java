package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class l6l0 implements Runnable {
    public final /* synthetic */ vtk0 a;
    public final /* synthetic */ n6l0 b;

    public l6l0(n6l0 n6l0Var, vtk0 vtk0Var, n6l0 n6l0Var2) {
        this.a = vtk0Var;
        this.b = n6l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n6l0 n6l0Var = this.b;
        k8l0 k8l0Var = n6l0Var.b.a;
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", n6l0Var.a);
        try {
            if (this.a.F(bundle) == null) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.a("Install Referrer Service returned a null response");
            }
        } catch (Exception e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
        }
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
