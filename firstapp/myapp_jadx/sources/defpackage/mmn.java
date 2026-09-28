package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class mmn implements wg50<InputStream, Bitmap> {
    public final qe4 a = new qe4();

    @Override // defpackage.wg50
    public final boolean a(InputStream inputStream, s2z s2zVar) {
        return true;
    }

    @Override // defpackage.wg50
    public final qg50<Bitmap> b(InputStream inputStream, int i, int i2, s2z s2zVar) {
        return this.a.c(ImageDecoder.createSource(fl5.b(inputStream)), i, i2, s2zVar);
    }
}
