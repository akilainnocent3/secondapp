package com.ironsource;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4293g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61861a = "POST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f61862b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61863c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.g8$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f61864h = 15000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f61865i = 15000;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f61866j = "UTF-8";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f61867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f61868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f61869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f61870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f61871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f61872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ArrayList<Pair<String, String>> f61873g;

        /* JADX INFO: renamed from: com.ironsource.g8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0575a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f61875b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            String f61877d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            List<Pair<String, String>> f61874a = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            String f61876c = "POST";

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f61878e = 15000;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f61879f = 15000;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            String f61880g = "UTF-8";

            public C0575a a(String str) {
                this.f61877d = str;
                return this;
            }

            public C0575a b(String str) {
                this.f61880g = str;
                return this;
            }

            public C0575a c(String str) {
                this.f61875b = str;
                return this;
            }

            public C0575a d(String str) {
                this.f61876c = str;
                return this;
            }

            public C0575a a(int i10) {
                this.f61878e = i10;
                return this;
            }

            public C0575a b(int i10) {
                this.f61879f = i10;
                return this;
            }

            public C0575a a(Pair<String, String> pair) {
                this.f61874a.add(pair);
                return this;
            }

            public C0575a a(List<Pair<String, String>> list) {
                this.f61874a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public a(C0575a c0575a) {
            this.f61867a = c0575a.f61875b;
            this.f61868b = c0575a.f61876c;
            this.f61869c = c0575a.f61877d;
            this.f61873g = new ArrayList<>(c0575a.f61874a);
            this.f61870d = c0575a.f61878e;
            this.f61871e = c0575a.f61879f;
            this.f61872f = c0575a.f61880g;
        }

        public boolean a() {
            return "POST".equals(this.f61868b);
        }
    }

    public static Gd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0575a c0575a = new a.C0575a();
        c0575a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0575a.a());
    }

    public static Gd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0575a c0575a = new a.C0575a();
        c0575a.c(str).a(str2).d("POST").a(list);
        return b(c0575a.a());
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:32:0x0067 */
    public static Gd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (a(aVar.f61867a, aVar.f61869c)) {
            Gd gd2 = new Gd();
            InputStream inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    httpURLConnectionA = a(aVar);
                    try {
                        a(httpURLConnectionA, aVar.f61873g);
                        a(httpURLConnectionA, aVar);
                        inputStream3 = httpURLConnectionA.getInputStream();
                        gd2.f59114a = httpURLConnectionA.getResponseCode();
                        if (inputStream3 != null) {
                            gd2.f59115b = C4319hg.a(inputStream3);
                        }
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                    } catch (InterruptedIOException e10) {
                        e = e10;
                        Log.d(f61863c, "Failed post to " + aVar.f61867a + " exception: " + e.getMessage());
                        throw e;
                    } catch (SSLException e11) {
                        e = e11;
                        Log.d(f61863c, "Failed post to " + aVar.f61867a + " exception: " + e.getMessage());
                        throw e;
                    } catch (IOException e12) {
                        e = e12;
                        inputStream = inputStream3;
                        httpURLConnection = httpURLConnectionA;
                        C4485r4.d().a(e);
                        if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                            throw new Fc(e);
                        }
                        if (httpURLConnection != null) {
                            int responseCode = httpURLConnection.getResponseCode();
                            gd2.f59114a = responseCode;
                            if (responseCode >= 400) {
                                Log.d(f61863c, "Failed post to " + aVar.f61867a + " StatusCode: " + gd2.f59114a);
                                if (inputStream != null) {
                                    InputStream inputStream4 = inputStream;
                                    httpURLConnectionA = httpURLConnection;
                                    inputStream3 = inputStream4;
                                    inputStream3.close();
                                } else {
                                    httpURLConnectionA = httpURLConnection;
                                }
                            }
                        }
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnectionA = null;
                    inputStream3 = inputStream2;
                }
            } catch (InterruptedIOException e13) {
                e = e13;
                Log.d(f61863c, "Failed post to " + aVar.f61867a + " exception: " + e.getMessage());
                throw e;
            } catch (SSLException e14) {
                e = e14;
                Log.d(f61863c, "Failed post to " + aVar.f61867a + " exception: " + e.getMessage());
                throw e;
            } catch (IOException e15) {
                e = e15;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionA = null;
            }
            httpURLConnectionA.disconnect();
            return gd2;
        }
        throw new InvalidParameterException("not valid params");
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f61869c.getBytes(aVar.f61872f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f61867a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f61870d);
        httpURLConnection.setReadTimeout(aVar.f61871e);
        httpURLConnection.setRequestMethod(aVar.f61868b);
        return httpURLConnection;
    }
}
