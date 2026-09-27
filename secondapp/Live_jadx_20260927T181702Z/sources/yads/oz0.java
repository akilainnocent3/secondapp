package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oz0 implements yj0 {
    @Override // yads.yj0
    public final Drawable a(byte[] bArr, Context context) throws IOException {
        if (Build.VERSION.SDK_INT >= 28) {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(ByteBuffer.wrap(bArr)));
            if (fc.a.a(drawableDecodeDrawable)) {
                fc.b.a(drawableDecodeDrawable).start();
            }
            return drawableDecodeDrawable;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray != null) {
            return new BitmapDrawable(context.getResources(), bitmapDecodeByteArray);
        }
        throw new IllegalArgumentException("Cannot decode bitmap from data");
    }
}
