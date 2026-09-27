package aa;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4545a = Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);

    @NonNull
    public static String a(@NonNull String str, @NonNull String str2) {
        Charset charsetForName = Charset.forName(str2);
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : charsetForName.encode(com.google.android.material.badge.a.f50153v).array()) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return str.replaceAll("\\+", sb2.toString());
    }

    public static boolean b(@NonNull String str, @NonNull String str2) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(46) + 1));
        return (mimeTypeFromExtension == null || mimeTypeFromExtension.equalsIgnoreCase(str2)) ? false : true;
    }

    @Nullable
    public static String c(@NonNull String str) {
        String strG;
        String[] strArrSplit = str.trim().split(";", 2);
        String strF = null;
        if (strArrSplit.length < 2 || "inline".equalsIgnoreCase(strArrSplit[0].trim())) {
            return null;
        }
        Matcher matcher = f4545a.matcher(strArrSplit[1]);
        String str2 = null;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (matcher.group(2) != null) {
                strG = g(matcher.group(2));
            } else {
                strG = matcher.group(3) != null ? g(matcher.group(3)) : matcher.group(4);
            }
            if (strGroup != null && strG != null) {
                if ("filename*".equalsIgnoreCase(strGroup)) {
                    strF = f(strG);
                } else if ("filename".equalsIgnoreCase(strGroup)) {
                    str2 = strG;
                }
            }
        }
        return strF != null ? strF : str2;
    }

    @NonNull
    public static String d(@NonNull String str, @Nullable String str2) {
        String lastPathSegment;
        String strC;
        if (str2 != null && (strC = c(str2)) != null) {
            return h(strC);
        }
        Uri uri = Uri.parse(str);
        return (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null) ? "downloadfile" : h(lastPathSegment);
    }

    @NonNull
    public static String e(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        String strD = d(str, str2);
        String strI = i(str3);
        if (strD.indexOf(46) < 0) {
            return strD + strI;
        }
        if (str3 == null || !b(strD, str3)) {
            return strD;
        }
        return strD + strI;
    }

    public static String f(String str) {
        String[] strArrSplit = str.split("'", 3);
        if (strArrSplit.length < 3) {
            return null;
        }
        String str2 = strArrSplit[0];
        try {
            return URLDecoder.decode(a(strArrSplit[2], str2), str2);
        } catch (UnsupportedEncodingException | RuntimeException unused) {
            return null;
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\(.)", "$1");
    }

    @NonNull
    public static String h(@NonNull String str) {
        return str.replaceAll(to.c.userBaseDel, lk.e.f104695m);
    }

    @NonNull
    public static String i(@Nullable String str) {
        if (str == null) {
            return ".bin";
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType == null) {
            if (str.equalsIgnoreCase("text/html")) {
                return ".html";
            }
            return str.toLowerCase(Locale.ROOT).startsWith("text/") ? ".txt" : ".bin";
        }
        return fe.F + extensionFromMimeType;
    }
}
