package l1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    @oy.l
    public static final ColorDrawable a(@k.k int i10) {
        return new ColorDrawable(i10);
    }

    @t0(26)
    @oy.l
    @SuppressLint({"ClassVerificationFailure"})
    public static final ColorDrawable b(@oy.l Color color) {
        return new ColorDrawable(color.toArgb());
    }
}
