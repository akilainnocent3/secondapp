package mc;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g extends j<Drawable> {
    public g(ImageView imageView) {
        super(imageView);
    }

    @Override // mc.j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void u(@Nullable Drawable drawable) {
        ((ImageView) this.f107229c).setImageDrawable(drawable);
    }

    @Deprecated
    public g(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
