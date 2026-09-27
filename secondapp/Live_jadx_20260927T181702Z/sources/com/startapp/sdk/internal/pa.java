package com.startapp.sdk.internal;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class pa extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains(CampaignEx.JSON_KEY_MRAID)) {
                d9 d9Var = new d9(e9.f74722e);
                d9Var.f74675d = "MraidMode.ConsoleError";
                d9Var.f74676e = consoleMessage.message();
                d9Var.a();
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
