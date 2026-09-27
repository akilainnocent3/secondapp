package yads;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ej2 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f148733c;

    public ej2(ProgressBar progressBar, int i10, int i11) {
        this.f148731a = i10;
        this.f148732b = i11;
        this.f148733c = new WeakReference(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        ProgressBar progressBar = (ProgressBar) this.f148733c.get();
        if (progressBar != null) {
            super.applyTransformation(f10, transformation);
            int i10 = this.f148731a;
            progressBar.setProgress(Math.round(((this.f148732b - i10) * f10) + i10));
        }
    }
}
