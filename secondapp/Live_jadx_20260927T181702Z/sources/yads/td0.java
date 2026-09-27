package yads;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class td0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f155825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f155826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f155827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f155828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t11 f155829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t11 f155830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f155831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final og2 f155832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HttpURLConnection f155833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f155834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f155835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f155836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f155837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f155838r;

    public td0(String str, int i10, int i11, boolean z10, t11 t11Var) {
        super(true);
        this.f155828h = str;
        this.f155826f = i10;
        this.f155827g = i11;
        this.f155825e = z10;
        this.f155829i = t11Var;
        this.f155832l = null;
        this.f155830j = new t11();
        this.f155831k = false;
    }

    public final URL a(URL url, String str) throws q11 {
        if (str == null) {
            throw new q11("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new q11("Unsupported protocol redirect: " + protocol, 2001);
            }
            if (this.f155825e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new q11("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + gi.j.f86771d, 2001);
        } catch (MalformedURLException e10) {
            throw new q11(e10, 2001, 1);
        }
    }

    public final HttpURLConnection c(u30 u30Var) throws IOException {
        URL url = new URL(u30Var.f156234a.toString());
        int i10 = u30Var.f156236c;
        byte[] bArr = u30Var.f156237d;
        long j10 = u30Var.f156239f;
        long j11 = u30Var.f156240g;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = (u30Var.f156242i & 1) == 1;
        if (!this.f155825e && !this.f155831k) {
            return a(url, i10, bArr, j10, j11, z10, true, u30Var.f156238e);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new q11(new NoRouteToHostException(mg2.a("Too many redirects: ", i13)), 2001, 1);
            }
            HttpURLConnection httpURLConnectionA = a(url, i10, bArr, j10, j11, z10, false, u30Var.f156238e);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                url = a(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionA;
                }
                httpURLConnectionA.disconnect();
                if (!this.f155831k || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = a(url, headerField);
            }
            i12 = i13;
            i11 = 1;
        }
    }

    @Override // yads.p30
    public final void close() {
        try {
            InputStream inputStream = this.f155834n;
            if (inputStream != null) {
                long j10 = this.f155837q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f155838r;
                }
                a(this.f155833m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = ib3.f150516a;
                    throw new q11(e10, 2000, 3);
                }
            }
            this.f155834n = null;
            f();
            if (this.f155835o) {
                this.f155835o = false;
                d();
            }
        } catch (Throwable th2) {
            this.f155834n = null;
            f();
            if (this.f155835o) {
                this.f155835o = false;
                d();
            }
            throw th2;
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.f155833m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                ih1.b("DefaultHttpDataSource", ih1.a("Unexpected error while disconnecting", e10));
            }
            this.f155833m = null;
        }
    }

    @Override // yads.eo, yads.p30
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f155833m;
        return httpURLConnection == null ? xm2.f157915h : new rd0(httpURLConnection.getHeaderFields());
    }

    @Override // yads.p30
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f155833m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws q11 {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f155837q;
            if (j10 != -1) {
                long j11 = j10 - this.f155838r;
                if (j11 != 0) {
                    i11 = (int) Math.min(i11, j11);
                    InputStream inputStream = this.f155834n;
                    int i13 = ib3.f150516a;
                    i12 = inputStream.read(bArr, i10, i11);
                    if (i12 != -1) {
                        this.f155838r += (long) i12;
                        c(i12);
                        return i12;
                    }
                }
            } else {
                InputStream inputStream2 = this.f155834n;
                int i14 = ib3.f150516a;
                i12 = inputStream2.read(bArr, i10, i11);
                if (i12 != -1) {
                    this.f155838r += (long) i12;
                    c(i12);
                    return i12;
                }
            }
            return -1;
        } catch (IOException e10) {
            int i15 = ib3.f150516a;
            throw q11.a(e10, 2);
        }
    }

    public final HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        Map map2;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f155826f);
        httpURLConnectionA.setReadTimeout(this.f155827g);
        HashMap map3 = new HashMap();
        t11 t11Var = this.f155829i;
        if (t11Var != null) {
            synchronized (t11Var) {
                try {
                    if (t11Var.f155669b == null) {
                        t11Var.f155669b = Collections.unmodifiableMap(new HashMap(t11Var.f155668a));
                    }
                    map2 = t11Var.f155669b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map3.putAll(map2);
        }
        map3.putAll(this.f155830j.a());
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = b21.f147029a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j10);
            sb2.append(TokenBuilder.TOKEN_DELIMITER);
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty("Range", string);
        }
        String str2 = this.f155828h;
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str2);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        int i11 = u30.f156233k;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else if (i10 == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnectionA.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionA;
        }
        httpURLConnectionA.connect();
        return httpURLConnectionA;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = ib3.f150516a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    @Override // yads.p30
    public final long a(u30 u30Var) throws q11 {
        boolean z10;
        long j10;
        long j11;
        HttpURLConnection httpURLConnection;
        this.f155838r = 0L;
        this.f155837q = 0L;
        e();
        try {
            HttpURLConnection httpURLConnectionC = c(u30Var);
            this.f155833m = httpURLConnectionC;
            this.f155836p = httpURLConnectionC.getResponseCode();
            httpURLConnectionC.getResponseMessage();
            int i10 = this.f155836p;
            long jMax = -1;
            if (i10 >= 200 && i10 <= 299) {
                String contentType = httpURLConnectionC.getContentType();
                og2 og2Var = this.f155832l;
                if (og2Var != null && !og2Var.apply(contentType)) {
                    f();
                    throw new r11(contentType);
                }
                if (this.f155836p == 200) {
                    j11 = u30Var.f156239f;
                    if (j11 == 0) {
                        j11 = 0;
                    }
                } else {
                    j11 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionC.getHeaderField("Content-Encoding"));
                if (!zEqualsIgnoreCase) {
                    long j12 = u30Var.f156240g;
                    if (j12 != -1) {
                        this.f155837q = j12;
                        httpURLConnection = httpURLConnectionC;
                    } else {
                        String headerField = httpURLConnectionC.getHeaderField("Content-Length");
                        String headerField2 = httpURLConnectionC.getHeaderField(kj.d.f102466f0);
                        Pattern pattern = b21.f147029a;
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                jMax = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                ih1.b("HttpUtil", "Unexpected Content-Length [" + headerField + C4235d4.j.f61462e);
                            }
                        }
                        if (TextUtils.isEmpty(headerField2)) {
                            httpURLConnection = httpURLConnectionC;
                        } else {
                            Matcher matcher = b21.f147029a.matcher(headerField2);
                            if (matcher.matches()) {
                                try {
                                    String strGroup = matcher.group(2);
                                    strGroup.getClass();
                                    long j13 = Long.parseLong(strGroup);
                                    String strGroup2 = matcher.group(1);
                                    strGroup2.getClass();
                                    httpURLConnection = httpURLConnectionC;
                                    long j14 = (j13 - Long.parseLong(strGroup2)) + 1;
                                    if (jMax < 0) {
                                        jMax = j14;
                                    } else if (jMax != j14) {
                                        try {
                                            ih1.d("HttpUtil", "Inconsistent headers [" + headerField + "] [" + headerField2 + C4235d4.j.f61462e);
                                            jMax = Math.max(jMax, j14);
                                        } catch (NumberFormatException unused2) {
                                            ih1.b("HttpUtil", "Unexpected Content-Range [" + headerField2 + C4235d4.j.f61462e);
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                    httpURLConnection = httpURLConnectionC;
                                }
                            } else {
                                httpURLConnection = httpURLConnectionC;
                            }
                        }
                        this.f155837q = jMax != jMax ? jMax - j11 : -1L;
                    }
                } else {
                    httpURLConnection = httpURLConnectionC;
                    this.f155837q = u30Var.f156240g;
                }
                try {
                    this.f155834n = httpURLConnection.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.f155834n = new GZIPInputStream(this.f155834n);
                    }
                    this.f155835o = true;
                    b(u30Var);
                    try {
                        a(j11);
                        return this.f155837q;
                    } catch (IOException e10) {
                        f();
                        if (e10 instanceof q11) {
                            throw ((q11) e10);
                        }
                        throw new q11(e10, 2000, 1);
                    }
                } catch (IOException e11) {
                    f();
                    throw new q11(e11, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = httpURLConnectionC.getHeaderFields();
            if (this.f155836p == 416) {
                String headerField3 = httpURLConnectionC.getHeaderField(kj.d.f102466f0);
                Pattern pattern2 = b21.f147029a;
                if (TextUtils.isEmpty(headerField3)) {
                    z10 = true;
                    j10 = -1;
                } else {
                    Matcher matcher2 = b21.f147030b.matcher(headerField3);
                    if (matcher2.matches()) {
                        z10 = true;
                        String strGroup3 = matcher2.group(1);
                        strGroup3.getClass();
                        j10 = Long.parseLong(strGroup3);
                    } else {
                        z10 = true;
                        j10 = -1;
                    }
                }
                if (u30Var.f156239f == j10) {
                    this.f155835o = z10;
                    b(u30Var);
                    long j15 = u30Var.f156240g;
                    if (j15 != -1) {
                        return j15;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = httpURLConnectionC.getErrorStream();
            try {
                if (errorStream != null) {
                    int i11 = ib3.f150516a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i12 = errorStream.read(bArr);
                        if (i12 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i12);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i13 = ib3.f150516a;
                }
            } catch (IOException unused4) {
                int i14 = ib3.f150516a;
            }
            f();
            throw new s11(this.f155836p, this.f155836p == 416 ? new q30(2008) : null, headerFields);
        } catch (IOException e12) {
            f();
            throw q11.a(e12, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final void a(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f155834n;
            int i10 = ib3.f150516a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new q11(new InterruptedIOException(), 2000, 1);
            }
            if (i11 != -1) {
                j10 -= (long) i11;
                c(i11);
            } else {
                throw new q11();
            }
        }
    }
}
