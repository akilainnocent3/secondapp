package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class yiv extends f5d {
    public final int a;

    public yiv(IllegalStateException illegalStateException, ziv zivVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(zivVar == null ? null : zivVar.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
