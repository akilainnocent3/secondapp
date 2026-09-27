package androidx.activity;

import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(28)
public class y extends w {
    @Override // androidx.activity.d0, androidx.activity.e0
    @k.t
    public void a(@oy.l Window window) {
        kotlin.jvm.internal.m0.p(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
