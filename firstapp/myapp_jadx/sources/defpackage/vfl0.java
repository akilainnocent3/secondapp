package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class vfl0 implements Runnable {
    public final URL a;
    public final byte[] b;
    public final rfl0 c;
    public final String d;
    public final Map e;
    public final /* synthetic */ xfl0 f;

    public vfl0(xfl0 xfl0Var, String str, URL url, byte[] bArr, HashMap map, rfl0 rfl0Var) {
        Objects.requireNonNull(xfl0Var);
        this.f = xfl0Var;
        hm20.e(str);
        this.a = url;
        this.b = bArr;
        this.c = rfl0Var;
        this.d = str;
        this.e = map;
    }

    public final void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        p7l0 p7l0Var = this.f.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new Runnable() { // from class: tfl0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vfl0 vfl0Var = this.a;
                vfl0Var.c.a(vfl0Var.d, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [vfl0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        ?? r6;
        IOException e;
        ?? r7;
        InputStream inputStream;
        String str = this.d;
        xfl0 xfl0Var = this.f;
        k8l0 k8l0Var = xfl0Var.a;
        k8l0 k8l0Var2 = xfl0Var.a;
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.k();
        int i = 0;
        ?? r4 = 0;
        ?? r8 = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.a.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            wok0 wok0Var = k8l0Var2.d;
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] byteArray = this.b;
                    if (byteArray != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(byteArray);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            y4l0 y4l0Var = k8l0Var2.f;
                            k8l0.m(y4l0Var);
                            u4l0 u4l0Var = y4l0Var.n;
                            int length = byteArray.length;
                            u4l0Var.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                            } catch (IOException e2) {
                                e = e2;
                                r4 = 0;
                                r7 = outputStream;
                                if (r7 != 0) {
                                    try {
                                        r7.close();
                                    } catch (IOException e3) {
                                        y4l0 y4l0Var2 = k8l0Var2.f;
                                        k8l0.m(y4l0Var2);
                                        y4l0Var2.f.c(y4l0.k(str), "Error closing HTTP compressed POST connection output stream. appId", e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(i, e, null, r4);
                            } catch (Throwable th2) {
                                th = th2;
                                r8 = 0;
                                r6 = outputStream;
                                if (r6 != 0) {
                                    try {
                                        r6.close();
                                    } catch (IOException e4) {
                                        y4l0 y4l0Var3 = k8l0Var2.f;
                                        k8l0.m(y4l0Var3);
                                        y4l0Var3.f.c(y4l0.k(str), "Error closing HTTP compressed POST connection output stream. appId", e4);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(i, null, null, r8);
                                throw th;
                            }
                        } catch (IOException e5) {
                            y4l0 y4l0Var4 = k8l0Var2.f;
                            k8l0.m(y4l0Var4);
                            y4l0Var4.f.b(e5, "Failed to gzip post request content");
                            throw e5;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream.read(bArr);
                                        if (i2 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            a(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i2);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                            }
                        } catch (IOException e6) {
                            r4 = byteArray;
                            e = e6;
                            i = responseCode;
                            r7 = 0;
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i, e, null, r4);
                        } catch (Throwable th5) {
                            r8 = byteArray;
                            th = th5;
                            i = responseCode;
                            r6 = 0;
                            if (r6 != 0) {
                                r6.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i, null, null, r8);
                            throw th;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        i = responseCode;
                        r7 = r4;
                        if (r7 != 0) {
                            r7.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i, e, null, r4);
                    } catch (Throwable th6) {
                        th = th6;
                        i = responseCode;
                        r6 = r4;
                        if (r6 != 0) {
                            r6.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i, null, null, r8);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (IOException e9) {
            e = e9;
            httpURLConnection = null;
            r7 = 0;
            r4 = 0;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            r6 = 0;
            r8 = 0;
        }
    }
}
