package nf;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import eh.o1;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class m extends ye.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final n f116621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f116622c;

    public m(Throwable th2, @Nullable n nVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(nVar == null ? null : nVar.f116628a);
        super(sb2.toString(), th2);
        this.f116621b = nVar;
        this.f116622c = o1.f81142a >= 21 ? a(th2) : null;
    }

    @Nullable
    @t0(21)
    public static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
