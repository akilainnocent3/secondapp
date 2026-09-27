package com.fyber.inneractive.sdk.web.remoteui;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m implements a, com.fyber.inneractive.sdk.player.ui.remote.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f48034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.remote.a f48035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f48036j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f48037k;

    public b() {
        c cVar = new c(this, this);
        this.f48037k = cVar;
        setWebViewClient(cVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        this.f48036j = false;
        a aVar = this.f48034h;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        this.f48034h = null;
        this.f48035i = null;
        c cVar = this.f48037k;
        cVar.getClass();
        IAlog.a("%s: destroy()", "RemoteUiWebViewClient");
        cVar.f48039b = null;
        cVar.f48038a = null;
        super.destroy();
    }

    public void setCommandHandler(com.fyber.inneractive.sdk.player.ui.remote.a aVar) {
        this.f48035i = aVar;
    }

    public void setResultFailureListener(a aVar) {
        this.f48034h = aVar;
    }

    public void setUiReady(boolean z10) {
        this.f48036j = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.f48035i;
        if (aVar != null) {
            aVar.a(str, map);
        }
    }
}
