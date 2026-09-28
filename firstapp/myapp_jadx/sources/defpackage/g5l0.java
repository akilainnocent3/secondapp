package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g5l0 implements Runnable {
    public final URL a;
    public final byte[] b;
    public final c5l0 c;
    public final String d;
    public final Map e;
    public final /* synthetic */ i5l0 f;

    public g5l0(i5l0 i5l0Var, String str, URL url, byte[] bArr, Map map, c5l0 c5l0Var) {
        Objects.requireNonNull(i5l0Var);
        this.f = i5l0Var;
        hm20.e(str);
        hm20.h(url);
        this.a = url;
        this.b = bArr;
        this.c = c5l0Var;
        this.d = str;
        this.e = map;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x014f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        OutputStream outputStream;
        Throwable th;
        int responseCode;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        HttpURLConnection httpURLConnection;
        p7l0 p7l0Var;
        e5l0 e5l0Var;
        IOException iOException;
        InputStream inputStream;
        c5l0 c5l0Var = this.c;
        String str2 = this.d;
        i5l0 i5l0Var = this.f;
        k8l0 k8l0Var = i5l0Var.a;
        k8l0 k8l0Var2 = i5l0Var.a;
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.k();
        try {
            URLConnection uRLConnectionOpenConnection = this.a.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setDefaultUseCaches(false);
                wok0 wok0Var = k8l0Var2.d;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    Map map = this.e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.b;
                    if (bArr != null) {
                        pol0 pol0Var = i5l0Var.b.g;
                        iol0.U(pol0Var);
                        byte[] bArrN = pol0Var.N(bArr);
                        y4l0 y4l0Var = k8l0Var2.f;
                        k8l0.m(y4l0Var);
                        u4l0 u4l0Var = y4l0Var.n;
                        int length = bArrN.length;
                        u4l0Var.b(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream5 = httpURLConnection.getOutputStream();
                        try {
                            outputStream5.write(bArrN);
                            outputStream5.close();
                        } catch (IOException e) {
                            e = e;
                            outputStream = null;
                            outputStream4 = outputStream5;
                            str = str2;
                            responseCode = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = outputStream5;
                            str = str2;
                            responseCode = 0;
                            outputStream2 = null;
                            outputStream3 = outputStream;
                            outputStream = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e2) {
                                    y4l0 y4l0Var2 = k8l0Var2.f;
                                    k8l0.m(y4l0Var2);
                                    y4l0Var2.f.c(y4l0.k(str), "Error closing HTTP compressed POST connection output stream. appId", e2);
                                }
                            }
                            if (outputStream != null) {
                                outputStream.disconnect();
                            }
                            p7l0 p7l0Var3 = k8l0Var2.g;
                            k8l0.m(p7l0Var3);
                            p7l0Var3.p(new e5l0(this.d, c5l0Var, responseCode, null, null, outputStream2));
                            throw th;
                        }
                    }
                    str = str2;
                    try {
                        responseCode = httpURLConnection.getResponseCode();
                        outputStream = null;
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int i = inputStream.read(bArr2);
                                            if (i <= 0) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr2, 0, i);
                                            }
                                        }
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        p7l0Var = k8l0Var2.g;
                                        k8l0.m(p7l0Var);
                                        e5l0Var = new e5l0(this.d, c5l0Var, responseCode, null, byteArray, headerFields);
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
                            } catch (IOException e3) {
                                iOException = e3;
                                outputStream4 = null;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e4) {
                                        y4l0 y4l0Var3 = k8l0Var2.f;
                                        k8l0.m(y4l0Var3);
                                        y4l0Var3.f.c(y4l0.k(str), "Error closing HTTP compressed POST connection output stream. appId", e4);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                p7l0Var = k8l0Var2.g;
                                k8l0.m(p7l0Var);
                                e5l0Var = new e5l0(this.d, c5l0Var, responseCode, iOException, null, outputStream);
                            } catch (Throwable th5) {
                                th = th5;
                                outputStream2 = outputStream;
                                outputStream3 = outputStream2;
                                outputStream = httpURLConnection;
                                th = th;
                                if (outputStream3 != null) {
                                    outputStream3.close();
                                }
                                if (outputStream != null) {
                                    outputStream.disconnect();
                                }
                                p7l0 p7l0Var4 = k8l0Var2.g;
                                k8l0.m(p7l0Var4);
                                p7l0Var4.p(new e5l0(this.d, c5l0Var, responseCode, null, null, outputStream2));
                                throw th;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            outputStream = null;
                            outputStream4 = null;
                            iOException = e;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            p7l0Var = k8l0Var2.g;
                            k8l0.m(p7l0Var);
                            e5l0Var = new e5l0(this.d, c5l0Var, responseCode, iOException, null, outputStream);
                        } catch (Throwable th6) {
                            th = th6;
                            outputStream2 = null;
                            outputStream3 = outputStream;
                            outputStream = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (outputStream != null) {
                                outputStream.disconnect();
                            }
                            p7l0 p7l0Var5 = k8l0Var2.g;
                            k8l0.m(p7l0Var5);
                            p7l0Var5.p(new e5l0(this.d, c5l0Var, responseCode, null, null, outputStream2));
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        outputStream = null;
                        responseCode = 0;
                        outputStream4 = null;
                    } catch (Throwable th7) {
                        th = th7;
                        outputStream = null;
                        responseCode = 0;
                        outputStream2 = outputStream;
                        outputStream3 = outputStream2;
                        outputStream = httpURLConnection;
                        th = th;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (outputStream != null) {
                            outputStream.disconnect();
                        }
                        p7l0 p7l0Var6 = k8l0Var2.g;
                        k8l0.m(p7l0Var6);
                        p7l0Var6.p(new e5l0(this.d, c5l0Var, responseCode, null, null, outputStream2));
                        throw th;
                    }
                } catch (IOException e7) {
                    e = e7;
                    str = str2;
                } catch (Throwable th8) {
                    th = th8;
                    str = str2;
                }
                p7l0Var.p(e5l0Var);
            }
            str = str2;
            outputStream = null;
            try {
                throw new IOException("Failed to obtain HTTP connection");
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th9) {
                th = th9;
                th = th;
                responseCode = 0;
                outputStream2 = outputStream;
                outputStream3 = outputStream2;
                if (outputStream3 != null) {
                    outputStream3.close();
                }
                if (outputStream != null) {
                    outputStream.disconnect();
                }
                p7l0 p7l0Var7 = k8l0Var2.g;
                k8l0.m(p7l0Var7);
                p7l0Var7.p(new e5l0(this.d, c5l0Var, responseCode, null, null, outputStream2));
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            str = str2;
            outputStream = null;
        } catch (Throwable th10) {
            th = th10;
            str = str2;
            outputStream = null;
        }
        responseCode = 0;
        outputStream4 = outputStream;
        httpURLConnection = outputStream4;
        iOException = e;
        if (outputStream4 != null) {
            outputStream4.close();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        p7l0Var = k8l0Var2.g;
        k8l0.m(p7l0Var);
        e5l0Var = new e5l0(this.d, c5l0Var, responseCode, iOException, null, outputStream);
        p7l0Var.p(e5l0Var);
    }
}
