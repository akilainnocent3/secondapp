package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f47057o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReference f47058p = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f47063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f47064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f47065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpURLConnection f47066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputStream f47067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f47069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f47070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f47071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f47072n;

    public p(String str, m mVar, int i10, int i11, boolean z10, w wVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f47062d = str;
        this.f47065g = mVar;
        this.f47064f = new w();
        this.f47060b = i10;
        this.f47061c = i11;
        this.f47059a = z10;
        this.f47063e = wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f47066h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(k kVar) throws IOException {
        URL url = new URL(kVar.f47032a.toString());
        long j10 = kVar.f47034c;
        long j11 = kVar.f47035d;
        int i10 = 0;
        boolean z10 = (kVar.f47037f & 1) == 1;
        if (!this.f47059a) {
            return a(url, null, j10, j11, z10, true);
        }
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i11));
            }
            boolean z11 = z10;
            long j12 = j11;
            long j13 = j10;
            HttpURLConnection httpURLConnectionA = a(url, null, j13, j12, z11, false);
            j10 = j13;
            j11 = j12;
            z10 = z11;
            int responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                return httpURLConnectionA;
            }
            String headerField = httpURLConnectionA.getHeaderField("Location");
            httpURLConnectionA.disconnect();
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i10 = i11;
            url = url2;
        }
    }

    public final void c() throws IOException {
        if (this.f47071m == this.f47069k) {
            return;
        }
        byte[] bArr = (byte[]) f47058p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j10 = this.f47071m;
            long j11 = this.f47069k;
            if (j10 == j11) {
                f47058p.set(bArr);
                return;
            }
            int i10 = this.f47067i.read(bArr, 0, (int) Math.min(j11 - j10, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            long j12 = i10;
            this.f47071m += j12;
            m mVar = this.f47065g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f47046d += j12;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.f47067i != null) {
                HttpURLConnection httpURLConnection = this.f47066h;
                long j10 = this.f47070l;
                if (j10 != -1) {
                    j10 -= this.f47072n;
                }
                a(httpURLConnection, j10);
                try {
                    this.f47067i.close();
                } catch (IOException e10) {
                    throw new u(e10);
                }
            }
            this.f47067i = null;
            b();
            if (this.f47068j) {
                this.f47068j = false;
                m mVar = this.f47065g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        } catch (Throwable th2) {
            this.f47067i = null;
            b();
            if (this.f47068j) {
                this.f47068j = false;
                m mVar2 = this.f47065g;
                if (mVar2 != null) {
                    mVar2.a();
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws u {
        try {
            c();
            return a(bArr, i10, i11);
        } catch (IOException e10) {
            throw new u(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws u {
        long j10;
        long jMax;
        this.f47072n = 0L;
        this.f47071m = 0L;
        try {
            HttpURLConnection httpURLConnectionB = b(kVar);
            this.f47066h = httpURLConnectionB;
            try {
                int responseCode = httpURLConnectionB.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    this.f47066h.getHeaderFields();
                    b();
                    v vVar = new v(responseCode);
                    if (responseCode != 416) {
                        throw vVar;
                    }
                    vVar.initCause(new i());
                    throw vVar;
                }
                this.f47066h.getContentType();
                if (responseCode == 200) {
                    j10 = kVar.f47034c;
                    if (j10 == 0) {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                this.f47069k = j10;
                if ((kVar.f47037f & 1) == 1) {
                    this.f47070l = kVar.f47035d;
                } else {
                    long j11 = kVar.f47035d;
                    if (j11 != -1) {
                        this.f47070l = j11;
                    } else {
                        HttpURLConnection httpURLConnection = this.f47066h;
                        String headerField = httpURLConnection.getHeaderField("Content-Length");
                        if (TextUtils.isEmpty(headerField)) {
                            jMax = -1;
                        } else {
                            try {
                                jMax = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + C4235d4.j.f61462e);
                                jMax = -1;
                            }
                        }
                        String headerField2 = httpURLConnection.getHeaderField(kj.d.f102466f0);
                        if (!TextUtils.isEmpty(headerField2)) {
                            Matcher matcher = f47057o.matcher(headerField2);
                            if (matcher.find()) {
                                try {
                                    long j12 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                    if (jMax < 0) {
                                        jMax = j12;
                                    } else if (jMax != j12) {
                                        Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + C4235d4.j.f61462e);
                                        jMax = Math.max(jMax, j12);
                                    }
                                } catch (NumberFormatException unused2) {
                                    Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + C4235d4.j.f61462e);
                                }
                            }
                        }
                        this.f47070l = jMax != -1 ? jMax - this.f47069k : -1L;
                    }
                }
                try {
                    this.f47067i = this.f47066h.getInputStream();
                    this.f47068j = true;
                    m mVar = this.f47065g;
                    if (mVar != null) {
                        synchronized (mVar) {
                            try {
                                if (mVar.f47044b == 0) {
                                    mVar.f47045c = SystemClock.elapsedRealtime();
                                }
                                mVar.f47044b++;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return this.f47070l;
                } catch (IOException e10) {
                    b();
                    throw new u(e10);
                }
            } catch (IOException e11) {
                b();
                throw new u("Unable to connect to " + kVar.f47032a.toString(), e11);
            }
        } catch (IOException e12) {
            throw new u("Unable to connect to " + kVar.f47032a.toString(), e12);
        }
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f47066h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f47066h = null;
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f47060b);
        httpURLConnection.setReadTimeout(this.f47061c);
        w wVar = this.f47063e;
        if (wVar != null) {
            synchronized (wVar) {
                try {
                    if (wVar.f47086b == null) {
                        wVar.f47086b = Collections.unmodifiableMap(new HashMap(wVar.f47085a));
                    }
                    map = wVar.f47086b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f47064f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + TokenBuilder.TOKEN_DELIMITER;
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f47062d);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
                return httpURLConnection;
            }
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47070l;
        if (j10 != -1) {
            long j11 = j10 - this.f47072n;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.f47067i.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f47070l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = i12;
        this.f47072n += j12;
        m mVar = this.f47065g;
        if (mVar == null) {
            return i12;
        }
        synchronized (mVar) {
            mVar.f47046d += j12;
        }
        return i12;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f47158a;
        if (i10 == 19 || i10 == 20) {
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
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
