package l1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public class h extends i {
    public h(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // l1.i
    public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        t();
        outline.setRoundRect(this.f103297h, c());
    }

    @Override // l1.i
    public boolean h() {
        Bitmap bitmap = this.f103290a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // l1.i
    public void o(boolean z10) {
        Bitmap bitmap = this.f103290a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z10);
            invalidateSelf();
        }
    }
}
