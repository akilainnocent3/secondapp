package fc;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends j<Drawable> {
    public l(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    public static v<Drawable> d(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new l(drawable);
        }
        return null;
    }

    @Override // vb.v
    @NonNull
    public Class<Drawable> b() {
        return this.f83890b.getClass();
    }

    @Override // vb.v
    public int getSize() {
        return Math.max(1, this.f83890b.getIntrinsicWidth() * this.f83890b.getIntrinsicHeight() * 4);
    }

    @Override // vb.v
    public void a() {
    }
}
