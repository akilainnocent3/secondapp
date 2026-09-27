package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f44947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44948b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44949c;

    public c(g gVar, String str) {
        this.f44947a = gVar;
        this.f44949c = str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String message;
        boolean z11;
        String str = (String) obj;
        if (this.f44948b) {
            IAlog.a("StorePromoTemplateCallback: onNetworkResult: the cached response was applied and this one being cached", new Object[0]);
            return;
        }
        IAlog.a("StorePromoTemplateCallback: onNetworkResult: fromCache: " + z10, new Object[0]);
        this.f44948b = true;
        if (str != null && exc == null) {
            g gVar = this.f44947a;
            gVar.getClass();
            IAlog.a("StorePromoResourcesLoader: onTemplateDownloaded", new Object[0]);
            gVar.f44914d.f44955c = str;
            gVar.a(null, false, null, null);
            return;
        }
        if (exc != null) {
            message = exc.getMessage() != null ? exc.getMessage() : exc.toString();
        } else {
            message = "";
        }
        String str2 = "Unable download store promo template, error: " + message;
        g gVar2 = this.f44947a;
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        String str3 = this.f44949c;
        if (com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.TEMPLATE_FAILURE == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i10 = gVar2.f44916f;
            int i11 = gVar2.f44917g + 1;
            gVar2.f44917g = i11;
            z11 = i10 - i11 < 2;
        }
        gVar2.a(aVar, z11, str2, str3);
    }
}
