package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hq implements yj0 {
    @Override // yads.yj0
    public final Drawable a(byte[] bArr, Context context) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray != null) {
            return new BitmapDrawable(context.getResources(), bitmapDecodeByteArray);
        }
        throw new IllegalArgumentException("Cannot decode bitmap from data");
    }
}
