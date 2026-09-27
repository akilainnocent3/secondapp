package yads;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mh0 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DivImageDownloadCallback f152451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f152452b;

    public mh0(String str, DivImageDownloadCallback divImageDownloadCallback) {
        this.f152451a = divImageDownloadCallback;
        this.f152452b = str;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        this.f152451a.onError();
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        Bitmap bitmap = i41Var.f150421a;
        if (bitmap != null) {
            this.f152451a.onSuccess(new CachedBitmap(bitmap, Uri.parse(this.f152452b), z10 ? BitmapSource.MEMORY : BitmapSource.NETWORK));
        }
    }
}
