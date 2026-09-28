package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.twilio.voice.AudioFormat;
import com.twilio.voice.VoiceURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class idd extends qz1 {
    public final rom e;
    public final rom f;
    public gqc g;
    public HttpURLConnection h;
    public InputStream i;
    public boolean j;
    public int k;
    public long l;
    public long m;

    public static final class a implements zpc.a {
        public final rom a = new rom();

        @Override // zpc.a
        public final zpc a() {
            return new idd(this.a);
        }
    }

    public static class b extends gui<String, List<String>> {
        public final Map<String, List<String>> c;

        public b(Map<String, List<String>> map) {
            super(6);
            this.c = map;
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && this.c.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            gpu gpuVar = new gpu(entrySet().iterator());
            if (obj == null) {
                while (gpuVar.hasNext()) {
                    if (gpuVar.next() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (gpuVar.hasNext()) {
                if (obj.equals(gpuVar.next())) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.gui, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return vi80.b(super.entrySet(), new jdd());
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && hpu.a(obj, this);
        }

        @Override // java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return this.c.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return vi80.c(entrySet());
        }

        @Override // defpackage.gui, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && this.c.containsKey(null));
        }

        @Override // defpackage.gui, java.util.Map
        public final Set<String> keySet() {
            return vi80.b(super.keySet(), new kdd());
        }

        @Override // defpackage.gui, java.util.Map
        public final int size() {
            return super.size() - (this.c.containsKey(null) ? 1 : 0);
        }
    }

    public idd(rom romVar) {
        super(true);
        this.e = romVar;
        this.f = new rom();
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) throws oom {
        boolean z;
        long j;
        long jMax;
        String str;
        this.g = gqcVar;
        this.m = 0L;
        this.l = 0L;
        p(gqcVar);
        try {
            HttpURLConnection httpURLConnectionS = s(new URL(gqcVar.a.toString()), gqcVar.c, gqcVar.d, gqcVar.f, gqcVar.g, (gqcVar.i & 1) == 1, true, gqcVar.e);
            long j2 = gqcVar.g;
            long j3 = gqcVar.f;
            this.h = httpURLConnectionS;
            this.k = httpURLConnectionS.getResponseCode();
            httpURLConnectionS.getResponseMessage();
            int i = this.k;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionS.getHeaderFields();
                if (this.k == 416) {
                    String headerField = httpURLConnectionS.getHeaderField("Content-Range");
                    Pattern pattern = jqm.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = jqm.b.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j3 == j) {
                        this.j = z;
                        q(gqcVar);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionS.getErrorStream();
                try {
                    if (errorStream != null) {
                        jl5.b(errorStream);
                    } else {
                        String str2 = jrh0.a;
                    }
                } catch (IOException unused) {
                    String str3 = jrh0.a;
                }
                r();
                throw new qom(this.k, this.k == 416 ? new dqc(2008) : null, headerFields);
            }
            httpURLConnectionS.getContentType();
            if (this.k != 200 || j3 == 0) {
                j3 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionS.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j2 != -1) {
                this.l = j2;
            } else {
                String headerField2 = httpURLConnectionS.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionS.getHeaderField("Content-Range");
                Pattern pattern2 = jqm.a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        cft.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = jqm.a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j4 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            str = "]";
                            long j5 = (j4 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                try {
                                    cft.g("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                    jMax = Math.max(jMax, j5);
                                } catch (NumberFormatException unused3) {
                                    cft.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.l = jMax != -1 ? jMax - j3 : -1L;
            }
            try {
                this.i = httpURLConnectionS.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.i = new GZIPInputStream(this.i);
                }
                this.j = true;
                q(gqcVar);
                try {
                    t(j3);
                    return this.l;
                } catch (IOException e) {
                    r();
                    if (e instanceof oom) {
                        throw ((oom) e);
                    }
                    throw new oom(e, 2000, 1);
                }
            } catch (IOException e2) {
                r();
                throw new oom(e2, 2000, 1);
            }
        } catch (IOException e3) {
            r();
            throw oom.a(e3, 1);
        }
    }

    @Override // defpackage.zpc
    public final void close() {
        try {
            InputStream inputStream = this.i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = jrh0.a;
                    throw new oom(e, 2000, 3);
                }
            }
            this.i = null;
            r();
            if (this.j) {
                this.j = false;
                o();
            }
            this.h = null;
            this.g = null;
        } catch (Throwable th) {
            this.i = null;
            r();
            if (this.j) {
                this.j = false;
                o();
            }
            this.h = null;
            this.g = null;
            throw th;
        }
    }

    @Override // defpackage.zpc
    public final Map<String, List<String>> d() {
        HttpURLConnection httpURLConnection = this.h;
        return httpURLConnection == null ? d150.i : new b(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        gqc gqcVar = this.g;
        if (gqcVar != null) {
            return gqcVar.a;
        }
        return null;
    }

    public final void r() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                cft.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) throws oom {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.l;
            if (j != -1) {
                long j2 = j - this.m;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.i;
                    String str = jrh0.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.m += (long) i3;
                        n(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.i;
                String str2 = jrh0.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.m += (long) i3;
                    n(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = jrh0.a;
            throw oom.a(e, 2);
        }
    }

    public final HttpURLConnection s(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(AudioFormat.AUDIO_SAMPLE_RATE_8000);
        httpURLConnection.setReadTimeout(AudioFormat.AUDIO_SAMPLE_RATE_8000);
        HashMap map2 = new HashMap();
        map2.putAll(this.e.a());
        map2.putAll(this.f.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = jqm.a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbA = q6a0.a(j, "bytes=", "-");
            if (j2 != -1) {
                sbA.append((j + j2) - 1);
            }
            string = sbA.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = gqc.j;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = VoiceURLConnection.METHOD_TYPE_POST;
        } else {
            if (i != 3) {
                fm20.a();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
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

    public final void t(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.i;
            String str = jrh0.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new oom(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new oom();
            }
            j -= (long) i;
            n(i);
        }
    }
}
