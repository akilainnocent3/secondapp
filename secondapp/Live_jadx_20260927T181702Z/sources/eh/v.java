package eh;

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
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v {
    public static final String A = ".flv";
    public static final String B = ".mid";
    public static final String C = ".midi";
    public static final String D = ".smf";
    public static final String E = ".mk";
    public static final String F = ".webm";
    public static final String G = ".og";
    public static final String H = ".opus";
    public static final String I = ".mp3";
    public static final String J = ".mp4";
    public static final String K = ".m4";
    public static final String L = ".mp4";
    public static final String M = ".cmf";
    public static final String N = ".ps";
    public static final String O = ".mpeg";
    public static final String P = ".mpg";
    public static final String Q = ".m2p";
    public static final String R = ".ts";
    public static final String S = ".ts";
    public static final String T = ".wav";
    public static final String U = ".wave";
    public static final String V = ".vtt";
    public static final String W = ".webvtt";
    public static final String X = ".jpg";
    public static final String Y = ".jpeg";
    public static final String Z = ".avi";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f81208a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81209b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81210c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f81211d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f81212e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f81213f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81214g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f81215h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f81216i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f81217j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f81218k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f81219l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f81220m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f81221n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f81222o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f81223p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f81224q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f81225r = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @k.h1
    public static final String f81226s = "Content-Type";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f81227t = ".ac3";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f81228u = ".ec3";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f81229v = ".ac4";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f81230w = ".adts";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f81231x = ".aac";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f81232y = ".amr";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f81233z = ".flac";

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
        String strU = l0.u(str);
        strU.getClass();
        switch (strU.hashCode()) {
            case -2123537834:
                b10 = !strU.equals("audio/eac3-joc") ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b10 = !strU.equals("video/mp2p") ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b10 = !strU.equals("video/mp2t") ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b10 = !strU.equals("video/webm") ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b10 = !strU.equals("audio/amr-wb") ? (byte) -1 : (byte) 4;
                break;
            case -1487394660:
                b10 = !strU.equals("image/jpeg") ? (byte) -1 : (byte) 5;
                break;
            case -1248337486:
                b10 = !strU.equals("application/mp4") ? (byte) -1 : (byte) 6;
                break;
            case -1079884372:
                b10 = !strU.equals("video/x-msvideo") ? (byte) -1 : (byte) 7;
                break;
            case -1004728940:
                b10 = !strU.equals("text/vtt") ? (byte) -1 : (byte) 8;
                break;
            case -387023398:
                b10 = !strU.equals("audio/x-matroska") ? (byte) -1 : (byte) 9;
                break;
            case -43467528:
                b10 = !strU.equals("application/webm") ? (byte) -1 : (byte) 10;
                break;
            case 13915911:
                b10 = !strU.equals("video/x-flv") ? (byte) -1 : (byte) 11;
                break;
            case 187078296:
                b10 = !strU.equals("audio/ac3") ? (byte) -1 : (byte) 12;
                break;
            case 187078297:
                b10 = !strU.equals("audio/ac4") ? (byte) -1 : (byte) 13;
                break;
            case 187078669:
                b10 = !strU.equals("audio/amr") ? (byte) -1 : (byte) 14;
                break;
            case 187090232:
                b10 = !strU.equals("audio/mp4") ? (byte) -1 : (byte) 15;
                break;
            case 187091926:
                b10 = !strU.equals("audio/ogg") ? (byte) -1 : (byte) 16;
                break;
            case 187099443:
                b10 = !strU.equals("audio/wav") ? (byte) -1 : (byte) 17;
                break;
            case 1331848029:
                b10 = !strU.equals("video/mp4") ? (byte) -1 : zi.c.f161643u;
                break;
            case 1503095341:
                b10 = !strU.equals("audio/3gpp") ? (byte) -1 : (byte) 19;
                break;
            case 1504578661:
                b10 = !strU.equals("audio/eac3") ? (byte) -1 : zi.c.f161646x;
                break;
            case 1504619009:
                b10 = !strU.equals("audio/flac") ? (byte) -1 : zi.c.f161647y;
                break;
            case 1504824762:
                b10 = !strU.equals("audio/midi") ? (byte) -1 : zi.c.f161648z;
                break;
            case 1504831518:
                b10 = !strU.equals("audio/mpeg") ? (byte) -1 : zi.c.A;
                break;
            case 1505118770:
                b10 = !strU.equals("audio/webm") ? (byte) -1 : zi.c.B;
                break;
            case 2039520277:
                b10 = !strU.equals("video/x-matroska") ? (byte) -1 : zi.c.C;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 12:
            case 20:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 9:
            case 10:
            case 24:
            case 25:
                return 6;
            case 4:
            case 14:
            case 19:
                return 3;
            case 5:
                return 14;
            case 6:
            case 15:
            case 18:
                return 8;
            case 7:
                return 16;
            case 8:
                return 13;
            case 11:
                return 5;
            case 13:
                return 1;
            case 16:
                return 9;
            case 17:
                return 12;
            case 21:
                return 4;
            case 22:
                return 15;
            case 23:
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
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }
}
