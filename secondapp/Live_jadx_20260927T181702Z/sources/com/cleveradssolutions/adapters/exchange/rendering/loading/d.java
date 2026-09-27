package com.cleveradssolutions.adapters.exchange.rendering.loading;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f42147k = "zu";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f42148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f42149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f42150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f42151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f42152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.session.manager.b f42153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.d f42154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f42157j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void b(d dVar);

        void c(com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements com.cleveradssolutions.adapters.exchange.rendering.loading.a.InterfaceC0423a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f42158a;

        public b(d dVar) {
            this.f42158a = new WeakReference(dVar);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.loading.a.InterfaceC0423a
        public void e(com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar) {
            d dVar = (d) this.f42158a.get();
            if (dVar == null) {
                com.cleveradssolutions.adapters.exchange.b.d(d.f42147k, "CreativeMaker is null");
            } else {
                dVar.f42152e.c(aVar, dVar.d());
                dVar.b();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.loading.a.InterfaceC0423a
        public void onSuccess() {
            d dVar = (d) this.f42158a.get();
            if (dVar == null) {
                com.cleveradssolutions.adapters.exchange.b.d(d.f42147k, "CreativeMaker is null");
            } else {
                if (dVar.g()) {
                    return;
                }
                dVar.f42152e.b(dVar);
            }
        }
    }

    public d(Context context, List list, String str, com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.d dVar, a aVar) throws com.cleveradssolutions.adapters.exchange.api.exceptions.a {
        if (context == null) {
            throw new com.cleveradssolutions.adapters.exchange.api.exceptions.a("Context is null");
        }
        if (list == null || list.isEmpty()) {
            throw new com.cleveradssolutions.adapters.exchange.api.exceptions.a("Transaction - Creative models is empty");
        }
        if (aVar == null) {
            throw new com.cleveradssolutions.adapters.exchange.api.exceptions.a("Transaction - Listener is null");
        }
        this.f42151d = new WeakReference(context);
        this.f42150c = list;
        j();
        this.f42155h = str;
        this.f42152e = aVar;
        this.f42154g = dVar;
        this.f42153f = com.cleveradssolutions.adapters.exchange.rendering.session.manager.b.j(com.cleveradssolutions.adapters.exchange.rendering.sdk.b.g(context));
        this.f42148a = new ArrayList();
    }

    public static d i(Context context, com.cleveradssolutions.adapters.exchange.rendering.models.h.a aVar, com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.d dVar, a aVar2) {
        d dVar2 = new d(context, aVar.f42207b, aVar.f42206a, dVar, aVar2);
        dVar2.k(System.currentTimeMillis());
        dVar2.l(aVar.f42208c);
        return dVar2;
    }

    public void b() {
        h();
        Iterator it = this.f42148a.iterator();
        while (it.hasNext()) {
            ((com.cleveradssolutions.adapters.exchange.rendering.loading.a) it.next()).d();
        }
    }

    public List c() {
        return this.f42148a;
    }

    public String d() {
        return this.f42156i;
    }

    public String e() {
        return this.f42155h;
    }

    public void f() {
        try {
            this.f42148a.clear();
            Iterator it = this.f42150c.iterator();
            while (it.hasNext()) {
                this.f42148a.add(new com.cleveradssolutions.adapters.exchange.rendering.loading.a((Context) this.f42151d.get(), (com.cleveradssolutions.adapters.exchange.rendering.models.e) it.next(), new b(this), this.f42153f, this.f42154g));
            }
            this.f42149b = this.f42148a.iterator();
            g();
        } catch (com.cleveradssolutions.adapters.exchange.api.exceptions.a e10) {
            this.f42152e.c(e10, this.f42156i);
        }
    }

    public final boolean g() {
        Iterator it = this.f42149b;
        if (it == null || !it.hasNext()) {
            return false;
        }
        ((com.cleveradssolutions.adapters.exchange.rendering.loading.a) this.f42149b.next()).f();
        return true;
    }

    public final void h() {
        com.cleveradssolutions.adapters.exchange.rendering.session.manager.b bVar = this.f42153f;
        if (bVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42147k, "Failed to stopOmAdSession. OmAdSessionManager is null");
        } else {
            bVar.i();
            this.f42153f = null;
        }
    }

    public final void j() {
        try {
            List list = this.f42150c;
            if (list == null || list.size() <= 1 || !((com.cleveradssolutions.adapters.exchange.rendering.models.e) this.f42150c.get(0)).o().g()) {
                return;
            }
            ((com.cleveradssolutions.adapters.exchange.rendering.models.e) this.f42150c.get(1)).o().k(true);
        } catch (Exception unused) {
            com.cleveradssolutions.adapters.exchange.b.a(f42147k, "Failed to check for built in video override");
        }
    }

    public void k(long j10) {
        this.f42157j = j10;
    }

    public void l(String str) {
        this.f42156i = str;
    }
}
