package yads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f152460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f152461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f152462c;

    public /* synthetic */ mi2(Context context) {
        this(new xr(context, 0));
    }

    public final Bitmap a(u41 u41Var) {
        String str = u41Var.f156268c;
        Bitmap bitmap = (Bitmap) this.f152461b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        pa3 pa3Var = w82.f157240d.a(this.f152460a.f157967a).f157244c;
        String str2 = u41Var.f156268c;
        Bitmap bitmapA = pa3Var.a(str2);
        if (bitmapA != null && bitmapA.getWidth() == 1 && bitmapA.getHeight() == 1) {
            bitmapA = Bitmap.createScaledBitmap(bitmapA, u41Var.f156266a, u41Var.f156267b, false);
            pa3Var.a(str2, bitmapA);
        }
        if (bitmapA == null) {
            return null;
        }
        this.f152461b.put(str, bitmapA);
        return bitmapA;
    }

    public mi2(xr xrVar) {
        this.f152460a = xrVar;
        this.f152461b = new LinkedHashMap();
        this.f152462c = new LinkedHashMap();
    }
}
