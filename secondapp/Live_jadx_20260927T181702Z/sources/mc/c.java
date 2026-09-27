package mc;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c extends j<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    @Override // mc.j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void u(Bitmap bitmap) {
        ((ImageView) this.f107229c).setImageBitmap(bitmap);
    }

    @Deprecated
    public c(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
