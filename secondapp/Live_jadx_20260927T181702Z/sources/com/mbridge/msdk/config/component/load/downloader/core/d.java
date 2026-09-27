package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f65371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<T> f65372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f65373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f65374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f65375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Future f65376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f65377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.h f65378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f65379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f65380j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f65382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.e f65383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f65384n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f65386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f65387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f65388r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f65381k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f65385o = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f65389a;

        public a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f65389a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f65378h != null) {
                    d.this.f65378h.a(this.f65389a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f65391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f65392b;

        public b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f65391a = bVar;
            this.f65392b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f65381k >= d.this.f65380j) {
                    d.this.a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
                    if (d.this.f65378h != null) {
                        d.this.f65378h.a(this.f65391a, this.f65392b);
                    }
                    d.this.b();
                    return;
                }
                d.this.a(com.mbridge.msdk.config.component.load.downloader.e.RETRY);
                d.this.f65381k++;
                d.this.a(0L);
                d.this.b(0L);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f65394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DownloadProgress f65395b;

        public c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f65394a = bVar;
            this.f65395b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f65378h != null) {
                    d.this.f65378h.a(this.f65394a, this.f65395b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class RunnableC0612d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f65397a;

        public RunnableC0612d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f65397a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f65378h != null) {
                    d.this.f65378h.c(this.f65397a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f65399a;

        public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f65399a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f65378h != null) {
                    d.this.f65378h.b(this.f65399a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f65401a;

        public f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f65401a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f65375e != null && !d.this.f65375e.isEmpty()) {
                    String str = (String) d.this.f65375e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f65401a.a("responseHeaders", str);
                    }
                }
                if (d.this.f65378h != null) {
                    d.this.f65378h.d(this.f65401a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public d(com.mbridge.msdk.config.component.load.downloader.core.e<T> eVar) {
        this.f65377g = eVar.f65408f;
        this.f65373c = eVar.f65405c;
        this.f65379i = eVar.f65409g;
        this.f65371a = eVar.f65403a;
        this.f65386p = eVar.f65412j;
        this.f65372b = eVar.f65404b;
        this.f65388r = eVar.f65413k;
        this.f65378h = eVar.f65406d;
        this.f65380j = eVar.f65410h;
        this.f65384n = eVar.f65411i;
        this.f65375e = eVar.f65407e;
    }

    public String f() {
        com.mbridge.msdk.config.component.load.downloader.b<T> bVar = this.f65372b;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public long g() {
        return this.f65374d;
    }

    public long h() {
        return this.f65379i;
    }

    public int i() {
        return this.f65382l;
    }

    public com.mbridge.msdk.config.component.load.downloader.e j() {
        return this.f65383m;
    }

    public long k() {
        return this.f65384n;
    }

    public long l() {
        return this.f65385o;
    }

    public long m() {
        return this.f65388r;
    }

    public void n() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    public void b(long j10) {
        this.f65385o = j10;
    }

    public long c() {
        return this.f65371a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b<T> d() {
        return this.f65372b;
    }

    public com.mbridge.msdk.config.component.load.downloader.c e() {
        return this.f65373c;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f65383m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f65383m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0612d(bVar));
        }
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f65383m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.COMPLETED);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f65383m = com.mbridge.msdk.config.component.load.downloader.e.CANCELLED;
        Future future = this.f65376f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public String a(String str, String str2) {
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f65375e) && this.f65375e.containsKey(str) && !TextUtils.isEmpty(str)) {
            String str3 = this.f65375e.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return str2;
    }

    public void a(long j10) {
        this.f65374d = j10;
    }

    public void a(int i10) {
        this.f65382l = i10;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.e eVar) {
        this.f65383m = eVar;
    }

    public void a(String str) {
        this.f65387q = str;
    }

    private void a() {
        this.f65378h = null;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f65383m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, DownloadProgress downloadProgress) {
        if (this.f65383m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }

    public void a(Future future) {
        this.f65376f = future;
    }
}
