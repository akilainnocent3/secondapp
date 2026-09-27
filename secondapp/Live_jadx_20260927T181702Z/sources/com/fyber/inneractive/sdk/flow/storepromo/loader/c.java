package com.fyber.inneractive.sdk.flow.storepromo.loader;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f44900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f44901b;

    public c(d dVar, String str) {
        this.f44901b = dVar;
        this.f44900a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f44901b.f44902a;
        String str = this.f44900a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f44905a;
        if (aVar != null) {
            try {
                aVar.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
            } catch (Throwable th2) {
                if (fVar.f44909e != null) {
                    fVar.f44909e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th2.getMessage(), "");
                }
            }
        }
    }
}
