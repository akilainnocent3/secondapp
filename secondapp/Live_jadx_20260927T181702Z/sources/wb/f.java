package wb;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f implements e {
    @Override // wb.e
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // wb.e
    @NonNull
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // wb.e
    @NonNull
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return e(i10, i11, config);
    }

    @Override // wb.e
    public long getMaxSize() {
        return 0L;
    }

    @Override // wb.e
    public void b() {
    }

    @Override // wb.e
    public void a(int i10) {
    }

    @Override // wb.e
    public void c(float f10) {
    }
}
