package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jl3 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f151147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f151148b;

    public jl3(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f151147a = onPreDrawListener;
        this.f151148b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f151147a.onPreDraw();
        this.f151148b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
