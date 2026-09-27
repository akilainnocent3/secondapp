package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class hk1 extends qa0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150162b;

    public hk1(IllegalStateException illegalStateException, ik1 ik1Var) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(ik1Var == null ? null : ik1Var.f150657a);
        super(sb2.toString(), illegalStateException);
        this.f150162b = ib3.f150516a >= 21 ? a(illegalStateException) : null;
    }

    public static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
