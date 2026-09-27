package com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class l implements com.cleveradssolutions.adapters.exchange.rendering.networking.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42969b = "zw";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.a f42970a;

    public l(com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.a aVar) {
        this.f42970a = aVar;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.b
    public void a(String str, long j10) {
        com.cleveradssolutions.adapters.exchange.b.a(f42969b, "Failed with " + str);
        f();
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.b
    public void d(com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar) {
        if (aVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42969b, "getOriginalURLCallback onResponse failed. Result is null");
            f();
        } else {
            com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.a aVar2 = this.f42970a;
            if (aVar2 != null) {
                aVar2.a(aVar.f42408e, aVar.f42409f);
            }
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.b
    public void e(Exception exc, long j10) {
        com.cleveradssolutions.adapters.exchange.b.a(f42969b, "Failed with " + exc.getMessage());
        f();
    }

    public final void f() {
        com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network.a aVar = this.f42970a;
        if (aVar != null) {
            aVar.zz();
        }
    }
}
