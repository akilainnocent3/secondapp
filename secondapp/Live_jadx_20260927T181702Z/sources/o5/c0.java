package o5;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class c0 extends c5.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final d0 f118643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f118644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f118645d;

    public c0(Throwable th2, @Nullable d0 d0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(d0Var == null ? null : d0Var.f118650a);
        super(sb2.toString(), th2);
        this.f118643b = d0Var;
        this.f118644c = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f118645d = a(th2);
    }

    public static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
