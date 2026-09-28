package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class ve4 implements ue4 {
    @Override // defpackage.ue4
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ue4
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ue4
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ue4
    public final void b() {
    }

    @Override // defpackage.ue4
    public final void a(int i) {
    }
}
