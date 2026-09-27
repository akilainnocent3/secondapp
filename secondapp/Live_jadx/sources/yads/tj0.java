package yads;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tj0 extends LruCache {
    public tj0(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Drawable drawable = ((uj0) obj2).f156467a;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap().getByteCount() / 1024;
        }
        return 100;
    }
}
