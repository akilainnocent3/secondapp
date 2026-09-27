package mc;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Override // mc.j
    public void u(@Nullable T t10) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f107229c).getLayoutParams();
        Drawable drawableW = w(t10);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableW = new i(drawableW, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f107229c).setImageDrawable(drawableW);
    }

    public abstract Drawable w(T t10);

    @Deprecated
    public q(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
