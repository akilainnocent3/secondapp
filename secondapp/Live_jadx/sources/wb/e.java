package wb;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface e {
    void a(int i10);

    void b();

    void c(float f10);

    void d(Bitmap bitmap);

    @NonNull
    Bitmap e(int i10, int i11, Bitmap.Config config);

    @NonNull
    Bitmap f(int i10, int i11, Bitmap.Config config);

    long getMaxSize();
}
