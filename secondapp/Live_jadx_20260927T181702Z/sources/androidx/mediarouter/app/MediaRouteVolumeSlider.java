package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class MediaRouteVolumeSlider extends m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f17673h = "MediaRouteVolumeSlider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f17676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17678g;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public void a(int i10) {
        b(i10, i10);
    }

    public void b(int i10, int i11) {
        if (this.f17677f != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e(f17673h, "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.f17677f = i10;
        }
        if (this.f17678g != i11) {
            if (Color.alpha(i11) != 255) {
                Log.e(f17673h, "Volume slider background color cannot be translucent: #" + Integer.toHexString(i11));
            }
            this.f17678g = i11;
        }
    }

    public void c(boolean z10) {
        if (this.f17675d == z10) {
            return;
        }
        this.f17675d = z10;
        super.setThumb(z10 ? null : this.f17676e);
    }

    @Override // androidx.appcompat.widget.m0, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i10 = isEnabled() ? 255 : (int) (this.f17674c * 255.0f);
        Drawable drawable = this.f17676e;
        int i11 = this.f17677f;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i11, mode);
        this.f17676e.setAlpha(i10);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f17678g, mode);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f17677f, mode);
        progressDrawable.setAlpha(i10);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f17676e = drawable;
        if (this.f17675d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.a.b.O2);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17674c = m.h(context);
    }
}
