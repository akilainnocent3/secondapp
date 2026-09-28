package defpackage;

import com.google.firebase.perf.util.Timer;
import com.twilio.voice.VoiceURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class fso {
    public static final p80 f = p80.d();
    public final HttpURLConnection a;
    public final dox b;
    public long c = -1;
    public long d = -1;
    public final Timer e;

    public fso(HttpURLConnection httpURLConnection, Timer timer, dox doxVar) {
        this.a = httpURLConnection;
        this.b = doxVar;
        this.e = timer;
        doxVar.q(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        dox doxVar = this.b;
        Timer timer = this.e;
        if (j == -1) {
            timer.g();
            long j2 = timer.a;
            this.c = j2;
            doxVar.j(j2);
        }
        try {
            this.a.connect();
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final Object b() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        dox doxVar = this.b;
        doxVar.h(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                doxVar.k(httpURLConnection.getContentType());
                return new bso((InputStream) content, doxVar, timer);
            }
            doxVar.k(httpURLConnection.getContentType());
            doxVar.n(httpURLConnection.getContentLength());
            doxVar.p(timer.a());
            doxVar.e();
            return content;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        dox doxVar = this.b;
        doxVar.h(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                doxVar.k(httpURLConnection.getContentType());
                return new bso((InputStream) content, doxVar, timer);
            }
            doxVar.k(httpURLConnection.getContentType());
            doxVar.n(httpURLConnection.getContentLength());
            doxVar.p(timer.a());
            doxVar.e();
            return content;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        dox doxVar = this.b;
        i();
        try {
            doxVar.h(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new bso(errorStream, doxVar, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        dox doxVar = this.b;
        doxVar.h(responseCode);
        doxVar.k(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new bso(inputStream, doxVar, timer) : inputStream;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        Timer timer = this.e;
        dox doxVar = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            return outputStream != null ? new cso(outputStream, doxVar, timer) : outputStream;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        Timer timer = this.e;
        dox doxVar = this.b;
        if (j == -1) {
            long jA = timer.a();
            this.d = jA;
            doxVar.d.v(jA);
        }
        try {
            int responseCode = this.a.getResponseCode();
            doxVar.h(responseCode);
            return responseCode;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.a;
        i();
        long j = this.d;
        Timer timer = this.e;
        dox doxVar = this.b;
        if (j == -1) {
            long jA = timer.a();
            this.d = jA;
            doxVar.d.v(jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            doxVar.h(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        long j = this.c;
        dox doxVar = this.b;
        if (j == -1) {
            Timer timer = this.e;
            timer.g();
            long j2 = timer.a;
            this.c = j2;
            doxVar.j(j2);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            doxVar.g(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            doxVar.g(VoiceURLConnection.METHOD_TYPE_POST);
        } else {
            doxVar.g("GET");
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
