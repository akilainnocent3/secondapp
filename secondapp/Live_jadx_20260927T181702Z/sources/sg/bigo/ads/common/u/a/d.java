package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.common.utils.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final HttpURLConnection f133317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f133318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h<List<String>> f133319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f133320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f133321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f133322f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f133323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f133324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f133325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f133326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f133327e;

        private a(URL url, String str, int i10, String str2, int i11) {
            this.f133323a = url;
            this.f133324b = str;
            this.f133325c = i10;
            this.f133326d = str2;
            this.f133327e = i11;
        }

        public /* synthetic */ a(URL url, String str, int i10, String str2, int i11, byte b10) {
            this(url, str, i10, str2, i11);
        }
    }

    public d(@NonNull c cVar) throws IOException {
        this.f133320d = cVar;
        HttpURLConnection httpURLConnectionA = cVar.a();
        this.f133317a = httpURLConnectionA;
        this.f133318b = httpURLConnectionA.getResponseCode();
        this.f133321e = httpURLConnectionA.getRequestMethod();
        h<List<String>> hVar = new h<>();
        this.f133319c = hVar;
        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
        if (headerFields != null) {
            hVar.a(headerFields);
        }
        boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionA.getContentEncoding());
        this.f133322f = zEqualsIgnoreCase;
        if (zEqualsIgnoreCase && cVar.f133311c) {
            hVar.b("Content-Encoding");
            hVar.b("Content-Length");
        }
    }

    public final InputStream a() throws IOException {
        InputStream inputStream = this.f133317a.getInputStream();
        return (this.f133322f && this.f133320d.f133311c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Nullable
    public final a b() {
        int i10 = this.f133318b;
        if (i10 == 307 || i10 == 308) {
            String strA = a("Location");
            if (this.f133321e.equalsIgnoreCase("GET") || this.f133321e.equalsIgnoreCase("HEAD")) {
                return new a(null, strA, 0, "", this.f133318b, (byte) 0);
            }
            return new a(null, strA, 706, "redirect code(" + this.f133318b + ") is only available for GET or HEAD method, current request method is " + this.f133321e, this.f133318b, (byte) 0);
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                String strA2 = a("Location");
                if (TextUtils.isEmpty(strA2)) {
                    return new a(null, strA2, 707, "empty location.", this.f133318b, (byte) 0);
                }
                try {
                    URL url = new URL(this.f133317a.getURL(), strA2);
                    String string = url.toString();
                    if (TextUtils.equals(string, this.f133317a.getURL().toString())) {
                        return new a(url, strA2, 705, "redirect to the same url, location is " + strA2 + ", redirectURL is " + string, this.f133318b, (byte) 0);
                    }
                    URL url2 = this.f133320d.f133310b;
                    if (url2 == null || !TextUtils.equals(string, url2.toString())) {
                        return new a(url, strA2, 0, "", this.f133318b, (byte) 0);
                    }
                    return new a(url, strA2, 704, "redirect to origin url, location is " + strA2 + ", redirectURL is " + string, this.f133318b, (byte) 0);
                } catch (Exception unused) {
                    return new a(null, strA2, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, "location->\"" + strA2 + "\" is not a network url.", this.f133318b, (byte) 0);
                }
            default:
                return null;
        }
    }

    @Nullable
    private String a(String str) {
        List<String> listA = this.f133319c.a(str);
        int size = listA != null ? listA.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = listA.get(0);
        }
        return str2;
    }
}
