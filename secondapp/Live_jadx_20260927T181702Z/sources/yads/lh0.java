package yads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lh0 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f151984a;

    public lh0(ImageView imageView) {
        this.f151984a = imageView;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        Bitmap bitmap = i41Var.f150421a;
        if (bitmap != null) {
            this.f151984a.setImageBitmap(bitmap);
        }
    }
}
