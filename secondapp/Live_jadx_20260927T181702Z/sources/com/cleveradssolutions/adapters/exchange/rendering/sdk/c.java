package com.cleveradssolutions.adapters.exchange.rendering.sdk;

import android.content.Context;
import android.os.AsyncTask;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.l;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import gi.j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SortedSet f42435b = Collections.synchronizedSortedSet(new TreeSet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b f42436a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements com.cleveradssolutions.adapters.exchange.rendering.loading.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f42437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b f42438b;

        public a(String str, com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b bVar) {
            this.f42437a = str;
            this.f42438b = bVar;
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.loading.b
        public void b(String str) {
            com.cleveradssolutions.adapters.exchange.b.c("JsScriptsDownloader", "JS scripts saved: " + this.f42437a);
            this.f42438b.f(this.f42437a);
            Context contextA = e.a();
            if (contextA != null) {
                b.g(contextA).e();
            }
            c.f42435b.remove(this.f42437a);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.loading.b
        public void c(Exception exc) {
            com.cleveradssolutions.adapters.exchange.b.a("JsScriptsDownloader", "Can't download script " + this.f42437a + j.f86770c + exc.getMessage() + j.f86771d);
            this.f42438b.b(this.f42437a);
            c.f42435b.remove(this.f42437a);
        }
    }

    public c(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.b bVar) {
        this.f42436a = bVar;
    }

    public static c c(Context context) {
        return new c(new com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.c(context));
    }

    public static String d(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(line);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
    }

    public String a(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a aVar) {
        try {
            return d(this.f42436a.d(aVar.b()));
        } catch (Throwable unused) {
            com.cleveradssolutions.adapters.exchange.b.a("JsScriptsDownloader", "Can't read file: " + aVar.b());
            return null;
        }
    }

    public boolean b() {
        return i(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a.f42489c) && i(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a.f42490d);
    }

    public final void f(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a aVar, com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.d dVar) {
        SortedSet sortedSet = f42435b;
        if (sortedSet.add(aVar.b())) {
            if (i(aVar)) {
                sortedSet.remove(aVar.b());
                return;
            }
            File fileD = this.f42436a.d(aVar.b());
            this.f42436a.c(fileD);
            h(fileD, aVar, dVar);
        }
    }

    public void g(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.d dVar) {
        try {
            f(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a.f42489c, dVar);
            f(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a.f42490d, dVar);
        } catch (Throwable th2) {
            com.cleveradssolutions.adapters.exchange.b.i("JsScriptsDownloader", "Can't download scripts", th2);
        }
    }

    public void h(File file, com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a aVar, com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.d dVar) {
        com.cleveradssolutions.adapters.exchange.rendering.networking.c.b bVar = new com.cleveradssolutions.adapters.exchange.rendering.networking.c.b();
        bVar.f42411a = aVar.a();
        bVar.f42414d = l.c();
        bVar.f42415e = "GET";
        bVar.f42413c = IDownloadTask.TAG;
        com.cleveradssolutions.adapters.exchange.rendering.loading.c cVar = new com.cleveradssolutions.adapters.exchange.rendering.loading.c(dVar.b(aVar.b()), file);
        cVar.q(true);
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, bVar);
    }

    public final boolean i(com.cleveradssolutions.adapters.exchange.rendering.sdk.scripts.a aVar) {
        return this.f42436a.a(this.f42436a.d(aVar.b()), aVar.b());
    }
}
