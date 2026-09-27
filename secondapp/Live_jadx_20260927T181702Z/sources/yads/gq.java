package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gq implements eq {
    @Override // yads.eq
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return kotlin.jvm.internal.m0.g(bitmap, ((BitmapDrawable) drawable).getBitmap());
    }
}
