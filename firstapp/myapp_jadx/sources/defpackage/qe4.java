package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class qe4 implements wg50<ImageDecoder.Source, Bitmap> {
    public final ve4 a = new ve4();

    @Override // defpackage.wg50
    public final boolean a(ImageDecoder.Source source, s2z s2zVar) {
        pe4.a(source);
        return true;
    }

    @Override // defpackage.wg50
    public final /* bridge */ /* synthetic */ qg50<Bitmap> b(ImageDecoder.Source source, int i, int i2, s2z s2zVar) {
        return c(pe4.a(source), i, i2, s2zVar);
    }

    public final we4 c(ImageDecoder.Source source, int i, int i2, s2z s2zVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new qed(i, i2, s2zVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new we4(this.a, bitmapDecodeBitmap);
    }
}
