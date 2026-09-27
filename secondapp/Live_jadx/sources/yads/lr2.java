package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f152098a;

    public lr2(WeakReference weakReference) {
        this.f152098a = weakReference;
    }

    public final void a() {
        View view = (View) this.f152098a.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
