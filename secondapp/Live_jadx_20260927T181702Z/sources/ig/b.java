package ig;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import k.t;
import k.t0;
import re.n2;
import se.b2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f90633a = "android.media.mediaparser.inBandCryptoInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f90634b = "android.media.mediaparser.includeSupplementalData";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f90635c = "android.media.mediaparser.eagerlyExposeTrackType";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f90636d = "android.media.mediaparser.exposeDummySeekMap";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f90637e = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f90638f = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f90639g = "android.media.mediaParser.exposeCaptionFormats";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f90640h = "android.media.mediaparser.ignoreTimestampOffset";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(31)
    public static final class a {
        @t
        public static void a(MediaParser mediaParser, b2 b2Var) {
            LogSessionId logSessionIdA = b2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionIdA);
        }
    }

    @t0(31)
    public static void a(MediaParser mediaParser, b2 b2Var) {
        a.a(mediaParser, b2Var);
    }

    public static MediaFormat b(n2 n2Var) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", n2Var.f126249m);
        int i10 = n2Var.E;
        if (i10 != -1) {
            mediaFormat.setInteger("caption-service-number", i10);
        }
        return mediaFormat;
    }
}
