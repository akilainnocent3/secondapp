package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class wll0 extends j3l0 {
    public pvk0 c;
    public boolean d;
    public final ull0 e;
    public final sll0 f;
    public final jll0 g;

    public wll0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.d = true;
        this.e = new ull0(this);
        this.f = new sll0(this);
        this.g = new jll0(this);
    }

    @Override // defpackage.j3l0
    public final boolean j() {
        return false;
    }

    public final void k() {
        g();
        if (this.c == null) {
            this.c = new pvk0(Looper.getMainLooper());
        }
    }
}
