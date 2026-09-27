package wb;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface m {
    String a(int i10, int i11, Bitmap.Config config);

    int b(Bitmap bitmap);

    String c(Bitmap bitmap);

    void d(Bitmap bitmap);

    @Nullable
    Bitmap e(int i10, int i11, Bitmap.Config config);

    @Nullable
    Bitmap removeLast();
}
