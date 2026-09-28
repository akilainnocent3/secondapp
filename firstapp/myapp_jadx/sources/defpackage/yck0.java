package defpackage;

import android.media.ImageWriter;
import androidx.camera.core.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yck0 implements ImageWriter.OnImageReleasedListener {
    public final /* synthetic */ c a;

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) throws Exception {
        this.a.close();
    }
}
