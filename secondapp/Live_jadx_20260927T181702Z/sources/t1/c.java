package t1;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.ironsource.G5;
import e2.x;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f135976b = "mailto:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f135977c = "mailto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f135978d = "to";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f135979e = "body";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f135980f = "cc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f135981g = "bcc";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f135982h = "subject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, String> f135983a = new HashMap<>();

    public static boolean g(@Nullable Uri uri) {
        return uri != null && f135977c.equals(uri.getScheme());
    }

    public static boolean h(@Nullable String str) {
        return str != null && str.startsWith(f135976b);
    }

    @NonNull
    public static c i(@NonNull Uri uri) throws d {
        return j(uri.toString());
    }

    @NonNull
    public static c j(@NonNull String str) throws d {
        String strDecode;
        String strSubstring;
        x.l(str);
        if (!h(str)) {
            throw new d("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        c cVar = new c();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split(C4235d4.j.f61456b, 2);
                if (strArrSplit.length != 0) {
                    cVar.f135983a.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String strF = cVar.f();
        if (strF != null) {
            strDecode = strDecode + ", " + strF;
        }
        cVar.f135983a.put("to", strDecode);
        return cVar;
    }

    @Nullable
    public String a() {
        return this.f135983a.get(f135981g);
    }

    @Nullable
    public String b() {
        return this.f135983a.get("body");
    }

    @Nullable
    public String c() {
        return this.f135983a.get(f135980f);
    }

    @Nullable
    public Map<String, String> d() {
        return this.f135983a;
    }

    @Nullable
    public String e() {
        return this.f135983a.get(f135982h);
    }

    @Nullable
    public String f() {
        return this.f135983a.get("to");
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(f135976b);
        sb2.append('?');
        for (Map.Entry<String, String> entry : this.f135983a.entrySet()) {
            sb2.append(Uri.encode(entry.getKey()));
            sb2.append(G5.T);
            sb2.append(Uri.encode(entry.getValue()));
            sb2.append('&');
        }
        return sb2.toString();
    }
}
