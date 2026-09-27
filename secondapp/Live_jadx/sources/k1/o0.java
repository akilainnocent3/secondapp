package k1;

import android.graphics.Canvas;
import android.graphics.Picture;
import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    @oy.l
    public static final Picture a(@oy.l Picture picture, int i10, int i11, @oy.l ds.l<? super Canvas, w2> lVar) {
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        try {
            lVar.invoke(canvasBeginRecording);
            return picture;
        } finally {
            kotlin.jvm.internal.j0.d(1);
            picture.endRecording();
            kotlin.jvm.internal.j0.c(1);
        }
    }
}
