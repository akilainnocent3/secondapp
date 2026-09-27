package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l33 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f151851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf f151852c;

    public l33(TextView textView, gf gfVar) {
        this.f151851b = textView;
        this.f151852c = gfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f151852c.a(this.f151851b);
    }
}
