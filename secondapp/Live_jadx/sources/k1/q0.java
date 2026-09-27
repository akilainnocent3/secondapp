package k1;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    @oy.l
    public static final PorterDuffColorFilter a(@oy.l PorterDuff.Mode mode, int i10) {
        return new PorterDuffColorFilter(i10, mode);
    }

    @oy.l
    public static final PorterDuffXfermode b(@oy.l PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
