package yads;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zv3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f159059b;

    public zv3(dw3 dw3Var) {
        this.f159059b = dw3Var.f148395g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f159059b.destroy();
    }
}
