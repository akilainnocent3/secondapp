package com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a f44899a;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a aVar) {
        this.f44899a = aVar;
    }

    public final void a(String str, HashMap map, g1 g1Var) {
        str.getClass();
        switch (str) {
            case "onClick":
                String str2 = (String) map.get("clickAction");
                if (str2 != null && !str2.isEmpty()) {
                    try {
                        this.f44899a.a(Integer.parseInt(str2), g1Var);
                    } catch (NumberFormatException e10) {
                        IAlog.b("WebviewCommandHandlerBase: handleClick: exception: %s" + e10, new Object[0]);
                    }
                    break;
                } else {
                    IAlog.a("WebviewCommandHandlerBase: handleClick: no click action in params for click cmd", new Object[0]);
                    break;
                }
                break;
            case "onError":
                this.f44899a.a(map);
                break;
            case "DOMLoaded":
                this.f44899a.a();
                break;
            default:
                IAlog.f("Sent unknown command: %s", str);
                break;
        }
        this.f44899a.b();
    }
}
