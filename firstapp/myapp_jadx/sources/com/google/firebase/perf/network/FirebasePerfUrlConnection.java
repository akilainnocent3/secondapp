package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import defpackage.avg0;
import defpackage.dox;
import defpackage.dso;
import defpackage.eox;
import defpackage.eso;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class FirebasePerfUrlConnection {
    public static Object getContent(URL url) throws IOException {
        avg0 avg0Var = avg0.H;
        Timer timer = new Timer();
        timer.g();
        long j = timer.a;
        dox doxVar = new dox(avg0Var);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new eso((HttpsURLConnection) uRLConnectionOpenConnection, timer, doxVar).a.b();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new dso((HttpURLConnection) uRLConnectionOpenConnection, timer, doxVar).a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            doxVar.j(j);
            doxVar.p(timer.a());
            doxVar.q(url.toString());
            eox.c(doxVar);
            throw e;
        }
    }

    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new eso((HttpsURLConnection) obj, new Timer(), new dox(avg0.H));
        }
        return obj instanceof HttpURLConnection ? new dso((HttpURLConnection) obj, new Timer(), new dox(avg0.H)) : obj;
    }

    public static InputStream openStream(URL url) throws IOException {
        avg0 avg0Var = avg0.H;
        Timer timer = new Timer();
        if (!avg0Var.c.get()) {
            return url.openConnection().getInputStream();
        }
        timer.g();
        long j = timer.a;
        dox doxVar = new dox(avg0Var);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new eso((HttpsURLConnection) uRLConnectionOpenConnection, timer, doxVar).a.e();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new dso((HttpURLConnection) uRLConnectionOpenConnection, timer, doxVar).a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            doxVar.j(j);
            doxVar.p(timer.a());
            doxVar.q(url.toString());
            eox.c(doxVar);
            throw e;
        }
    }

    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        avg0 avg0Var = avg0.H;
        Timer timer = new Timer();
        timer.g();
        long j = timer.a;
        dox doxVar = new dox(avg0Var);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new eso((HttpsURLConnection) uRLConnectionOpenConnection, timer, doxVar).a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new dso((HttpURLConnection) uRLConnectionOpenConnection, timer, doxVar).a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            doxVar.j(j);
            doxVar.p(timer.a());
            doxVar.q(url.toString());
            eox.c(doxVar);
            throw e;
        }
    }
}
