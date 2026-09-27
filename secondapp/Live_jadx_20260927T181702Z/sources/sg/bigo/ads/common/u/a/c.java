package sg.bigo.ads.common.u.a;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.u.b.c<? extends sg.bigo.ads.common.u.a> f133309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    URL f133310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f133311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f133312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f133313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final URL f133314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f133315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HttpURLConnection f133316h;

    private c(@NonNull sg.bigo.ads.common.u.b.c cVar, @Nullable URL url, @Nullable URL url2, @NonNull b bVar, @Nullable g gVar) {
        this.f133311c = false;
        this.f133309a = cVar;
        this.f133310b = url;
        this.f133314f = url2;
        this.f133312d = bVar;
        this.f133313e = gVar;
        sg.bigo.ads.common.t.a.a(0, 3, "HttpRequest", "request, " + cVar + ", redirectURL= " + url2 + ", content=" + cVar.d());
    }

    public final HttpURLConnection a() throws IOException {
        String str;
        BufferedOutputStream bufferedOutputStream;
        g gVar;
        URL urlA = this.f133314f;
        if (urlA == null) {
            this.f133309a.a("PreHost");
            T t10 = this.f133309a.f133348k;
            String strA = t10.a();
            String strF = t10.f();
            String strD = t10.d();
            if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strD) && !TextUtils.equals(strF, strD)) {
                this.f133309a.a("PreHost", strF);
            }
            if (t10.e()) {
                this.f133309a.a(kj.d.f102521w, strD);
            }
            this.f133309a.h();
            urlA = a(Uri.parse(strA));
            this.f133310b = urlA;
        } else if (urlA != null && this.f133313e != null && this.f133309a.f133352o) {
            urlA = a(Uri.parse(urlA.toString()));
        }
        boolean zEqualsIgnoreCase = "HTTPS".equalsIgnoreCase(urlA.getProtocol());
        URLConnection uRLConnectionOpenConnection = urlA.openConnection();
        this.f133316h = zEqualsIgnoreCase ? (HttpsURLConnection) uRLConnectionOpenConnection : (HttpURLConnection) uRLConnectionOpenConnection;
        this.f133316h.setInstanceFollowRedirects(false);
        this.f133316h.setDoInput(true);
        this.f133316h.setUseCaches(false);
        this.f133316h.setConnectTimeout((int) this.f133309a.f133350m);
        this.f133316h.setReadTimeout((int) this.f133309a.f133350m);
        this.f133316h.setRequestMethod(this.f133309a.a());
        Map<String, Set<String>> map = this.f133309a.f133351n;
        if (!map.containsKey("Connection")) {
            map.put("Connection", new HashSet(Collections.singletonList(kj.d.f102516u0)));
        }
        Set<String> set = map.get("Range");
        Set<String> set2 = map.get("Accept-Encoding");
        if (k.a(set) && k.a(set2)) {
            this.f133311c = true;
            map.put("Accept-Encoding", new HashSet(Collections.singletonList("gzip")));
        }
        if (!map.containsKey(kj.d.f102521w)) {
            try {
                b bVar = this.f133312d;
                String host = this.f133316h.getURL().getHost();
                str = TextUtils.isEmpty(host) ? "" : bVar.f133308a.get(host);
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                map.put(kj.d.f102521w, new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !k.a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f133316h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] bArrC = this.f133309a.c();
        if (bArrC != null && bArrC.length > 0) {
            f fVarB = this.f133309a.b();
            if (fVarB != null) {
                this.f133316h.setRequestProperty("Content-Type", fVarB.toString());
            }
            this.f133316h.setDoOutput(true);
            if (!(this.f133309a instanceof sg.bigo.ads.common.u.b.b) || (gVar = this.f133313e) == null || !gVar.ax() || sg.bigo.ads.common.x.a.F()) {
                this.f133316h.setRequestProperty("Content-Length", Long.toString(this.f133309a.e()));
                bufferedOutputStream = new BufferedOutputStream(this.f133316h.getOutputStream());
                bufferedOutputStream.write(bArrC);
            } else {
                this.f133316h.setRequestProperty("Content-Encoding", "gzip");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrC);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length;
                this.f133316h.setRequestProperty("Content-Length", String.valueOf(length));
                ((sg.bigo.ads.common.u.b.b) this.f133309a).f133345i = length;
                bufferedOutputStream = new BufferedOutputStream(this.f133316h.getOutputStream());
                bufferedOutputStream.write(byteArray);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.f133316h;
    }

    public final boolean b() {
        return this.f133314f != null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f133314f != null) {
            sb2.append("originUrl=");
            sb2.append(this.f133309a.g());
            sb2.append(", redirectURL=");
            sb2.append(this.f133314f);
            sb2.append(", redirectCount=");
            sb2.append(this.f133315g);
        } else {
            sb2.append("requestUrl=");
            sb2.append(this.f133309a.g());
        }
        return sb2.toString();
    }

    public c(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull b bVar, @Nullable g gVar) {
        this(cVar, null, null, bVar, gVar);
    }

    private URL a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (this.f133313e == null || !this.f133309a.f133352o) {
            return new URL(uri.toString());
        }
        Uri.Builder builderBuildUpon = Uri.parse(uri.toString()).buildUpon();
        a(builderBuildUpon, "sdk_ver", this.f133313e.y());
        a(builderBuildUpon, "sdk_vc", "50602");
        a(builderBuildUpon, "country", this.f133313e.U());
        a(builderBuildUpon, MBridgeConstans.APP_KEY, this.f133313e.a());
        a(builderBuildUpon, "pkg_ver", this.f133313e.c());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f133313e.d());
        a(builderBuildUpon, "pkg_vc", sb2.toString());
        a(builderBuildUpon, Q6.F, this.f133313e.i());
        a(builderBuildUpon, "os_ver", this.f133313e.j());
        a(builderBuildUpon, "os_lang", this.f133313e.k());
        a(builderBuildUpon, "vendor", this.f133313e.l());
        a(builderBuildUpon, "model", this.f133313e.m());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f133313e.p());
        a(builderBuildUpon, "dpi", sb3.toString());
        a(builderBuildUpon, "dpi_f", this.f133313e.q());
        a(builderBuildUpon, "resolution", this.f133313e.o());
        a(builderBuildUpon, "net", this.f133313e.r());
        a(builderBuildUpon, "tz", this.f133313e.s());
        if (this.f133309a.f()) {
            a(builderBuildUpon, "enc", "1");
        }
        return new URL(builderBuildUpon.build().toString());
    }

    @NonNull
    public final c a(@NonNull URL url) {
        c cVar = new c(this.f133309a, this.f133310b, url, this.f133312d, this.f133313e);
        cVar.f133315g = this.f133315g + 1;
        return cVar;
    }

    private static void a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
