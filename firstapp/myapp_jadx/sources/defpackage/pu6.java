package defpackage;

import android.util.Log;
import com.twilio.voice.Constants;
import com.twilio.voice.VoiceURLConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pu6 implements tby {
    public final /* synthetic */ Object a;

    @Override // defpackage.tby
    public Object a() {
        return ((vnn) this.a).a();
    }

    public qu6.b b(qu6.a aVar) throws IOException {
        qu6 qu6Var = (qu6) this.a;
        URL url = aVar.a;
        String strC = tgt.c("CctTransportBackend");
        if (Log.isLoggable(strC, 4)) {
            Log.i(strC, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", Constants.APP_JSON_PAYLOAD_TYPE);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    jcp jcpVar = qu6Var.a;
                    lg1 lg1Var = aVar.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    kcp kcpVar = jcpVar.a;
                    nfp nfpVar = new nfp(bufferedWriter, kcpVar.a, kcpVar.b, kcpVar.c, kcpVar.d);
                    nfpVar.h(lg1Var);
                    nfpVar.j();
                    nfpVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strC2 = tgt.c("CctTransportBackend");
                    if (Log.isLoggable(strC2, 4)) {
                        Log.i(strC2, String.format("Status Code: %d", numValueOf));
                    }
                    tgt.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    tgt.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new qu6.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new qu6.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            qu6.b bVar = new qu6.b(responseCode, null, mj1.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e) {
            e = e;
            tgt.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new qu6.b(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            tgt.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new qu6.b(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            tgt.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new qu6.b(400, null, 0L);
        } catch (k4g e4) {
            e = e4;
            tgt.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new qu6.b(400, null, 0L);
        }
    }
}
