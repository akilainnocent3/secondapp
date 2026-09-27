package com.cleveradssolutions.adapters.exchange.rendering.networking;

import android.os.AsyncTask;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c extends AsyncTask {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42400e = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.networking.a f42403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public URLConnection f42404d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f42401a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends com.cleveradssolutions.adapters.exchange.rendering.networking.exception.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f42405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f42406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f42407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f42408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f42409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String[] f42410g;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f42411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f42412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f42413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f42414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f42415e;
    }

    public c(com.cleveradssolutions.adapters.exchange.rendering.networking.a aVar) {
        this.f42403c = aVar;
    }

    public static void n(String str, OutputStream outputStream) throws IOException {
        for (byte b10 : str.getBytes()) {
            outputStream.write(b10);
        }
    }

    public final a a(b... bVarArr) {
        URLConnection uRLConnection;
        if (isCancelled()) {
            return this.f42401a;
        }
        if (!e(bVarArr) || isCancelled()) {
            this.f42401a = null;
        } else {
            b bVar = bVarArr[0];
            try {
                this.f42402b = System.currentTimeMillis();
                this.f42401a = h(bVar);
                uRLConnection = this.f42404d;
                if (uRLConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                }
            } catch (ConnectTimeoutException e10) {
                com.cleveradssolutions.adapters.exchange.b.h(f42400e, "Network Error: ConnectTimeoutException" + e10.getMessage());
                this.f42401a.b(e10);
                uRLConnection = this.f42404d;
                if (uRLConnection instanceof HttpURLConnection) {
                }
            } catch (IOException e11) {
                com.cleveradssolutions.adapters.exchange.b.h(f42400e, "Network Error: IOException" + e11.getMessage());
                this.f42401a.b(e11);
                uRLConnection = this.f42404d;
                if (uRLConnection instanceof HttpURLConnection) {
                }
            } catch (MalformedURLException e12) {
                com.cleveradssolutions.adapters.exchange.b.h(f42400e, "Network Error: MalformedURLException" + e12.getMessage());
                this.f42401a.b(e12);
                uRLConnection = this.f42404d;
                if (uRLConnection instanceof HttpURLConnection) {
                }
            } catch (SocketTimeoutException e13) {
                com.cleveradssolutions.adapters.exchange.b.h(f42400e, "Network Error: SocketTimeoutException" + e13.getMessage());
                this.f42401a.b(e13);
                uRLConnection = this.f42404d;
                if (uRLConnection instanceof HttpURLConnection) {
                }
            } catch (Exception e14) {
                com.cleveradssolutions.adapters.exchange.b.h(f42400e, "Network Error: Exception" + e14.getMessage());
                this.f42401a.b(e14);
                uRLConnection = this.f42404d;
                if (uRLConnection instanceof HttpURLConnection) {
                }
            } finally {
                URLConnection uRLConnection2 = this.f42404d;
                if (uRLConnection2 instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection2).disconnect();
                }
            }
        }
        return this.f42401a;
    }

    public final URLConnection b(b bVar) throws Exception {
        String str;
        DataOutputStream dataOutputStream;
        if (!bVar.f42415e.equals("GET") || bVar.f42412b == null) {
            str = "";
        } else {
            str = "?" + bVar.f42412b;
        }
        URLConnection uRLConnectionOpenConnection = new URL(bVar.f42411a + str).openConnection();
        this.f42404d = uRLConnectionOpenConnection;
        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnectionOpenConnection).setRequestMethod(bVar.f42415e);
            ((HttpURLConnection) this.f42404d).setInstanceFollowRedirects(false);
        }
        this.f42404d.setRequestProperty("User-Agent", bVar.f42414d);
        this.f42404d.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        this.f42404d.setRequestProperty("Accept", "application/x-www-form-urlencoded,application/json,text/plain,text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        this.f42404d.setRequestProperty("Content-Type", "application/json");
        d(this.f42404d);
        this.f42404d.setConnectTimeout(com.cleveradssolutions.adapters.exchange.c.a());
        if (!(this instanceof com.cleveradssolutions.adapters.exchange.rendering.loading.c)) {
            this.f42404d.setReadTimeout(5000);
        }
        if ("POST".equals(bVar.f42415e)) {
            this.f42404d.setDoOutput(true);
            try {
                dataOutputStream = new DataOutputStream(this.f42404d.getOutputStream());
                try {
                    String str2 = bVar.f42412b;
                    if (str2 != null) {
                        n(str2, dataOutputStream);
                    }
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (dataOutputStream != null) {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
            }
        }
        URLConnection uRLConnectionK = k(this.f42404d);
        this.f42404d = uRLConnectionK;
        return uRLConnectionK;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(a aVar) {
        String str;
        String str2;
        if (aVar != null) {
            if (this.f42403c == null) {
                str = f42400e;
                str2 = "No ResponseHandler on: may be a tracking event";
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f42402b;
                aVar.f42407d = jCurrentTimeMillis;
                if (aVar.a() == null) {
                    String str3 = aVar.f42405b;
                    if (str3 == null || str3.length() >= 100 || !aVar.f42405b.contains("<VAST")) {
                        ((com.cleveradssolutions.adapters.exchange.rendering.networking.b) this.f42403c).d(aVar);
                    } else {
                        ((com.cleveradssolutions.adapters.exchange.rendering.networking.b) this.f42403c).a("Invalid VAST Response: less than 100 characters.", jCurrentTimeMillis);
                    }
                    l();
                    return;
                }
                ((com.cleveradssolutions.adapters.exchange.rendering.networking.b) this.f42403c).e(aVar.a(), jCurrentTimeMillis);
            }
            l();
        }
        str = f42400e;
        str2 = "URL result is null";
        com.cleveradssolutions.adapters.exchange.b.h(str, str2);
        l();
    }

    public boolean e(b... bVarArr) {
        if (bVarArr != null && bVarArr[0] != null) {
            return true;
        }
        this.f42401a.b(new Exception("Invalid Params"));
        return false;
    }

    public final a f(int i10) throws Exception {
        if (i10 == 200) {
            String strJ = j(this.f42404d.getInputStream());
            a aVar = this.f42401a;
            aVar.f42405b = strJ;
            return aVar;
        }
        if (i10 >= 400 && i10 < 600) {
            String str = String.format(Locale.getDefault(), "Code %d. %s", Integer.valueOf(i10), j(((HttpURLConnection) this.f42404d).getErrorStream()));
            com.cleveradssolutions.adapters.exchange.b.h(f42400e, str);
            throw new Exception(str);
        }
        String str2 = String.format("Bad server response - [HTTP Response code of %s]", Integer.valueOf(i10));
        if (i10 == 204) {
            str2 = "Response code 204. No bids.";
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42400e, str2);
        throw new Exception(str2);
    }

    public a g(int i10, URLConnection uRLConnection) {
        return this.f42401a;
    }

    public a h(b bVar) throws Exception {
        if (bVar.f42411a.isEmpty()) {
            com.cleveradssolutions.adapters.exchange.b.a(f42400e, "url is empty");
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42400e, "url: " + bVar.f42411a);
        URLConnection uRLConnectionB = b(bVar);
        this.f42404d = uRLConnectionB;
        int responseCode = uRLConnectionB instanceof HttpURLConnection ? ((HttpURLConnection) uRLConnectionB).getResponseCode() : 0;
        if (j.h(bVar.f42413c) && !IDownloadTask.TAG.equals(bVar.f42413c) && !"RedirectTask".equals(bVar.f42413c) && !"StatusTask".equals(bVar.f42413c)) {
            this.f42401a = f(responseCode);
        }
        a aVarG = g(responseCode, this.f42404d);
        this.f42401a = aVarG;
        aVarG.f42406c = responseCode;
        return aVarG;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a doInBackground(b... bVarArr) {
        return a(bVarArr);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    public String j(InputStream inputStream) throws Throwable {
        String str;
        StringBuilder sb2;
        String str2;
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                char[] cArr = new char[1024];
                boolean z11 = false;
                while (true) {
                    try {
                        int i10 = bufferedReader.read(cArr, 0, 1024);
                        if (i10 > 0) {
                            z11 = true;
                            sb3.append(cArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (Exception e10) {
                                e = e10;
                                z10 = z11;
                                if (z10) {
                                    str = f42400e;
                                    sb2 = new StringBuilder();
                                    str2 = "Exception in readResponse(): ";
                                } else {
                                    str = f42400e;
                                    sb2 = new StringBuilder();
                                    str2 = "Empty response: ";
                                }
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                com.cleveradssolutions.adapters.exchange.b.h(str, sb2.toString());
                            }
                        }
                        return sb3.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                    if (z10) {
                        str = f42400e;
                        sb2 = new StringBuilder();
                        str2 = "Exception in readResponse(): ";
                    } else {
                        str = f42400e;
                        sb2 = new StringBuilder();
                        str2 = "Empty response: ";
                    }
                    sb2.append(str2);
                    sb2.append(e.getMessage());
                    com.cleveradssolutions.adapters.exchange.b.h(str, sb2.toString());
                }
                bufferedReader.close();
                return sb3.toString();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final URLConnection k(URLConnection uRLConnection) throws Exception {
        int responseCode;
        URLConnection uRLConnectionOpenConnection;
        boolean z10;
        String str;
        String str2;
        int i10 = 0;
        while (true) {
            responseCode = uRLConnection instanceof HttpURLConnection ? ((HttpURLConnection) uRLConnection).getResponseCode() : 0;
            if (responseCode < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                uRLConnectionOpenConnection = uRLConnection;
                z10 = false;
            } else {
                URL url = uRLConnection.getURL();
                String headerField = uRLConnection.getHeaderField("Location");
                str = f42400e;
                if (headerField == null) {
                    str2 = "not found location";
                } else {
                    str2 = "location = " + headerField;
                }
                com.cleveradssolutions.adapters.exchange.b.h(str, str2);
                URL url2 = headerField != null ? new URL(url, headerField) : null;
                ((HttpURLConnection) uRLConnection).disconnect();
                z10 = true;
                if (url2 == null || (!(url2.getProtocol().equals("http") || url2.getProtocol().equals("https")) || i10 >= 5)) {
                    break;
                }
                uRLConnectionOpenConnection = url2.openConnection();
                i10++;
            }
            if (!z10) {
                return uRLConnectionOpenConnection;
            }
            uRLConnection = uRLConnectionOpenConnection;
        }
        String str3 = String.format("Bad server response - [HTTP Response code of %s]", Integer.valueOf(responseCode));
        com.cleveradssolutions.adapters.exchange.b.h(str, str3);
        throw new Exception(str3);
    }

    public void l() {
        this.f42403c = null;
        URLConnection uRLConnection = this.f42404d;
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onCancelled(a aVar) {
        super.onCancelled(aVar);
        com.cleveradssolutions.adapters.exchange.b.h(f42400e, "Request cancelled. Disconnecting connection");
        l();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
    }

    public final void d(URLConnection uRLConnection) {
    }
}
