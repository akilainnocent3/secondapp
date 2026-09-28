package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes.dex */
public enum unh0 {
    PREVIEW(SurfaceHolder.class),
    IMAGE_CAPTURE(null),
    VIDEO_CAPTURE(MediaCodec.class),
    STREAM_SHARING(SurfaceTexture.class),
    UNDEFINED(null);

    public static final a b = new a();
    public final Class<?> a;

    public static final class a {
        public static unh0 a(pnh0 pnh0Var) {
            pnh0Var.getClass();
            if (pnh0Var instanceof aq20) {
                return unh0.PREVIEW;
            }
            if (pnh0Var instanceof h8n) {
                return unh0.IMAGE_CAPTURE;
            }
            if (v36.B(pnh0Var)) {
                return unh0.VIDEO_CAPTURE;
            }
            return pnh0Var instanceof g8e0 ? unh0.STREAM_SHARING : unh0.UNDEFINED;
        }
    }

    unh0(Class cls) {
        this.a = cls;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Preview";
        }
        if (iOrdinal == 1) {
            return "ImageCapture";
        }
        if (iOrdinal == 2) {
            return "VideoCapture";
        }
        if (iOrdinal == 3) {
            return "StreamSharing";
        }
        if (iOrdinal == 4) {
            return "Undefined";
        }
        uhc.a();
        return null;
    }
}
