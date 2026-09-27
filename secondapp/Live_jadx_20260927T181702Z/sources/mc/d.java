package mc;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d extends q<Bitmap> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // mc.q
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Drawable w(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f107229c).getResources(), bitmap);
    }

    @Deprecated
    public d(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
