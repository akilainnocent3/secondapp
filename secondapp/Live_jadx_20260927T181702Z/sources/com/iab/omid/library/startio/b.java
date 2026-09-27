package com.iab.omid.library.startio;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.startio.internal.i;
import com.iab.omid.library.startio.internal.k;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.g;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f53846a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f53847a;

        public a(b bVar, Context context) {
            this.f53847a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebSettings.getDefaultUserAgent(this.f53847a);
        }
    }

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.6.0-Startio";
    }

    public void c() {
        g.a();
        com.iab.omid.library.startio.internal.a.a().d();
    }

    private void c(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.startio.internal.b.g().a(context);
        com.iab.omid.library.startio.utils.a.a(context);
        com.iab.omid.library.startio.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.startio.internal.g.b().a(context);
        com.iab.omid.library.startio.internal.a.a().a(context);
        k.b().a(context);
        c(context);
    }

    public boolean b() {
        return this.f53846a;
    }

    public void a(boolean z10) {
        this.f53846a = z10;
    }
}
