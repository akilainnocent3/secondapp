package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class xk5 implements wg50<ByteBuffer, Bitmap> {
    public final qe4 a = new qe4();

    @Override // defpackage.wg50
    public final boolean a(ByteBuffer byteBuffer, s2z s2zVar) {
        return true;
    }

    @Override // defpackage.wg50
    public final qg50<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, s2z s2zVar) {
        return this.a.c(ImageDecoder.createSource(byteBuffer), i, i2, s2zVar);
    }
}
