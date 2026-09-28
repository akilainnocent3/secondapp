package defpackage;

import android.net.Uri;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class x8n {
    public static final x8n a = new x8n();
    public static final Map<String, String> b = kpu.f(new Pair("s.sporty.net", "cdn.sporty.net"), new Pair("test.sporty.net", "cdn-uat.sporty.net"));
    public static final Regex c = new Regex(".*\\.(jpg|jpeg|png|webp|gif|bmp|svg|ico|xml|json|mp3|zip|atlas|skel)(\\?.*)?$", ns40.IGNORE_CASE);

    public static boolean a() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = Boolean.TRUE;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return ((Boolean) bVar).booleanValue();
    }

    public static boolean b(String str) {
        Object bVar;
        boolean zContainsKey;
        try {
            zi50.a aVar = zi50.b;
            String host = Uri.parse(str).getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                zContainsKey = b.containsKey(lowerCase);
            } else {
                zContainsKey = false;
            }
            bVar = Boolean.valueOf(zContainsKey);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return ((Boolean) bVar).booleanValue();
    }

    public static boolean c(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = Boolean.valueOf(StringsKt.U(str) ? false : c.f(str));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return ((Boolean) bVar).booleanValue();
    }

    public static String d(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            Uri uri = Uri.parse(str);
            String encodedPath = uri.getEncodedPath();
            if (encodedPath == null) {
                encodedPath = "";
            }
            String encodedQuery = uri.getEncodedQuery();
            bVar = encodedPath.concat(encodedQuery != null ? "?".concat(encodedQuery) : "");
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = str;
        if (!(bVar instanceof zi50.b)) {
            obj = bVar;
        }
        return (String) obj;
    }

    public static String e(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str2 = b.get(lowerCase);
                if (str2 == null) {
                    bVar = str;
                } else {
                    String string = uri.buildUpon().authority(str2).build().toString();
                    string.getClass();
                    bVar = string;
                }
            } else {
                bVar = str;
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = str;
        if (!(bVar instanceof zi50.b)) {
            obj = bVar;
        }
        return (String) obj;
    }
}
