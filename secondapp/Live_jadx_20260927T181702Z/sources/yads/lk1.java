package yads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lk1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik1 f152033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152034e;

    public lk1(int i10, mx0 mx0Var, rk1 rk1Var, boolean z10) {
        this("Decoder init failed: [" + i10 + "], " + mx0Var, rk1Var, mx0Var.f152729m, z10, null, a(i10));
    }

    public static String a(int i10) {
        return "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
    }

    public lk1(String str, Throwable th2, String str2, boolean z10, ik1 ik1Var, String str3) {
        super(str, th2);
        this.f152031b = str2;
        this.f152032c = z10;
        this.f152033d = ik1Var;
        this.f152034e = str3;
    }

    public static String a(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
        }
        return null;
    }
}
