package u4;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class k0 {
    public static final String A = ".ac4";
    public static final String B = ".adts";
    public static final String C = ".aac";
    public static final String D = ".amr";
    public static final String E = ".flac";
    public static final String F = ".flv";
    public static final String G = ".mid";
    public static final String H = ".midi";
    public static final String I = ".smf";
    public static final String J = ".mk";
    public static final String K = ".webm";
    public static final String L = ".og";
    public static final String M = ".opus";
    public static final String N = ".mp3";
    public static final String O = ".mp4";
    public static final String P = ".m4";
    public static final String Q = ".mp4";
    public static final String R = ".cmf";
    public static final String S = ".ps";
    public static final String T = ".mpeg";
    public static final String U = ".mpg";
    public static final String V = ".m2p";
    public static final String W = ".ts";
    public static final String X = ".ts";
    public static final String Y = ".wav";
    public static final String Z = ".wave";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f138584a = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f138585a0 = ".vtt";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f138586b = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f138587b0 = ".webvtt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f138588c = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f138589c0 = ".jpg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f138590d = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f138591d0 = ".jpeg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f138592e = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f138593e0 = ".avi";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f138594f = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f138595f0 = ".png";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f138596g = 5;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f138597g0 = ".webp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f138598h = 6;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f138599h0 = ".bmp";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f138600i = 7;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f138601i0 = ".dib";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f138602j = 8;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f138603j0 = ".heic";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f138604k = 9;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f138605k0 = ".heif";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f138606l = 10;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f138607l0 = ".avif";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f138608m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f138609n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f138610o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f138611p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f138612q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f138613r = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f138614s = 17;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f138615t = 18;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f138616u = 19;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f138617v = 20;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f138618w = 21;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @k.h1
    public static final String f138619x = "Content-Type";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f138620y = ".ac3";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f138621z = ".ec3";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(@Nullable String str) {
        byte b10;
        if (str == null) {
            return -1;
        }
        String strX = l1.x(str);
        strX.getClass();
        switch (strX.hashCode()) {
            case -2123537834:
                b10 = !strX.equals("audio/eac3-joc") ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b10 = !strX.equals("video/mp2p") ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b10 = !strX.equals("video/mp2t") ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b10 = !strX.equals("video/webm") ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b10 = !strX.equals("audio/amr-wb") ? (byte) -1 : (byte) 4;
                break;
            case -1487656890:
                b10 = !strX.equals(l1.f138659f1) ? (byte) -1 : (byte) 5;
                break;
            case -1487464693:
                b10 = !strX.equals("image/heic") ? (byte) -1 : (byte) 6;
                break;
            case -1487464690:
                b10 = !strX.equals("image/heif") ? (byte) -1 : (byte) 7;
                break;
            case -1487394660:
                b10 = !strX.equals("image/jpeg") ? (byte) -1 : (byte) 8;
                break;
            case -1487018032:
                b10 = !strX.equals("image/webp") ? (byte) -1 : (byte) 9;
                break;
            case -1248337486:
                b10 = !strX.equals("application/mp4") ? (byte) -1 : (byte) 10;
                break;
            case -1079884372:
                b10 = !strX.equals("video/x-msvideo") ? (byte) -1 : (byte) 11;
                break;
            case -1004728940:
                b10 = !strX.equals("text/vtt") ? (byte) -1 : (byte) 12;
                break;
            case -879272239:
                b10 = !strX.equals(l1.f138662g1) ? (byte) -1 : (byte) 13;
                break;
            case -879258763:
                b10 = !strX.equals("image/png") ? (byte) -1 : (byte) 14;
                break;
            case -387023398:
                b10 = !strX.equals("audio/x-matroska") ? (byte) -1 : (byte) 15;
                break;
            case -43467528:
                b10 = !strX.equals("application/webm") ? (byte) -1 : (byte) 16;
                break;
            case 13915911:
                b10 = !strX.equals("video/x-flv") ? (byte) -1 : (byte) 17;
                break;
            case 187078296:
                b10 = !strX.equals("audio/ac3") ? (byte) -1 : (byte) 18;
                break;
            case 187078297:
                b10 = !strX.equals("audio/ac4") ? (byte) -1 : (byte) 19;
                break;
            case 187078669:
                b10 = !strX.equals("audio/amr") ? (byte) -1 : (byte) 20;
                break;
            case 187090232:
                b10 = !strX.equals("audio/mp4") ? (byte) -1 : (byte) 21;
                break;
            case 187091926:
                b10 = !strX.equals("audio/ogg") ? (byte) -1 : zi.c.f161648z;
                break;
            case 187099443:
                b10 = !strX.equals("audio/wav") ? (byte) -1 : zi.c.A;
                break;
            case 1331848029:
                b10 = !strX.equals("video/mp4") ? (byte) -1 : zi.c.B;
                break;
            case 1503095341:
                b10 = !strX.equals("audio/3gpp") ? (byte) -1 : zi.c.C;
                break;
            case 1504578661:
                b10 = !strX.equals("audio/eac3") ? (byte) -1 : zi.c.D;
                break;
            case 1504619009:
                b10 = !strX.equals("audio/flac") ? (byte) -1 : zi.c.E;
                break;
            case 1504824762:
                b10 = !strX.equals("audio/midi") ? (byte) -1 : (byte) 28;
                break;
            case 1504831518:
                b10 = !strX.equals("audio/mpeg") ? (byte) -1 : zi.c.G;
                break;
            case 1505118770:
                b10 = !strX.equals("audio/webm") ? (byte) -1 : zi.c.H;
                break;
            case 2039520277:
                b10 = !strX.equals("video/x-matroska") ? (byte) -1 : (byte) 31;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(f138597g0)) {
            return 18;
        }
        if (lastPathSegment.endsWith(f138599h0) || lastPathSegment.endsWith(f138601i0)) {
            return 19;
        }
        if (lastPathSegment.endsWith(f138603j0) || lastPathSegment.endsWith(f138605k0)) {
            return 20;
        }
        return lastPathSegment.endsWith(f138607l0) ? 21 : -1;
    }
}
