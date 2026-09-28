package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ce4 implements qh50<Bitmap, byte[]> {
    @Override // defpackage.qh50
    public final qg50<byte[]> a(qg50<Bitmap> qg50Var, s2z s2zVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        qg50Var.get().compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        qg50Var.c();
        return new ul5(byteArrayOutputStream.toByteArray());
    }
}
