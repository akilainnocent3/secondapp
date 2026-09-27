package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.util.o;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f44230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c f44231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f44232c;

    public d(e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.f44232c = eVar;
        this.f44230a = aVar;
        this.f44231b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f44232c.f44235c) {
            try {
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f44230a;
                if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                    g gVar = (g) this.f44232c.f44233a.f44243a.get(this.f44231b);
                    if (gVar != null) {
                        int i10 = f.f44238a[aVar.ordinal()];
                        if (i10 == 1) {
                            gVar.f44240b++;
                        } else if (i10 == 2) {
                            gVar.f44241c++;
                        } else if (i10 == 3) {
                            gVar.f44239a++;
                        }
                    }
                } else {
                    this.f44232c.f44233a = new i();
                }
                try {
                    o.a(o.f47884a, e.a(this.f44232c).toString().getBytes("UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
                this.f44232c.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
