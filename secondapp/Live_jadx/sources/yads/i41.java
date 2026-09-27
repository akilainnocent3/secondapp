package yads;

import android.graphics.Bitmap;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f150421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j41 f150422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k41 f150424d;

    public i41(k41 k41Var, Bitmap bitmap, String str, j41 j41Var) {
        this.f150424d = k41Var;
        this.f150421a = bitmap;
        this.f150423c = str;
        this.f150422b = j41Var;
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        if (this.f150422b == null) {
            return;
        }
        g41 g41Var = (g41) this.f150424d.f151386c.get(this.f150423c);
        if (g41Var != null) {
            g41Var.f149389d.remove(this);
            if (g41Var.f149389d.size() == 0) {
                g41Var.f149386a.a();
                this.f150424d.f151386c.remove(this.f150423c);
                return;
            }
            return;
        }
        g41 g41Var2 = (g41) this.f150424d.f151387d.get(this.f150423c);
        if (g41Var2 != null) {
            g41Var2.f149389d.remove(this);
            if (g41Var2.f149389d.size() == 0) {
                g41Var2.f149386a.a();
            }
            if (g41Var2.f149389d.size() == 0) {
                this.f150424d.f151387d.remove(this.f150423c);
            }
        }
    }
}
