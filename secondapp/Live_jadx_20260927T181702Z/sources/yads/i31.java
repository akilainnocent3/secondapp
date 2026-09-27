package yads;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q41 f150412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p41 f150413b;

    public /* synthetic */ i31(Context context, q41 q41Var) {
        this(q41Var, new p41(context));
    }

    public final u41 a(Map map, MediatedNativeAdImage mediatedNativeAdImage) {
        if (mediatedNativeAdImage != null) {
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            this.f150412a.getClass();
            if (width > 0 && height > 0) {
                return new u41(width, height, url, this.f150413b.a(width, height), 112);
            }
            Bitmap bitmap = (Bitmap) map.get(url);
            if (bitmap != null) {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                return new u41(width2, height2, url, this.f150413b.a(width2, height2), 112);
            }
        }
        return null;
    }

    public i31(q41 q41Var, p41 p41Var) {
        this.f150412a = q41Var;
        this.f150413b = p41Var;
    }
}
