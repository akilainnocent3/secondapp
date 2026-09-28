package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class wk5 implements wg50<ByteBuffer, Bitmap> {
    public final c7f a;

    public wk5(c7f c7fVar) {
        this.a = c7fVar;
    }

    @Override // defpackage.wg50
    public final boolean a(ByteBuffer byteBuffer, s2z s2zVar) {
        return true;
    }

    @Override // defpackage.wg50
    public final qg50<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, s2z s2zVar) {
        c7f c7fVar = this.a;
        return c7fVar.a(new ian.a(byteBuffer, c7fVar.d, c7fVar.c), i, i2, s2zVar, c7f.k);
    }
}
