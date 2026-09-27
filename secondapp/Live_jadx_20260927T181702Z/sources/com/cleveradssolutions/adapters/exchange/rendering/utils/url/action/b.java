package com.cleveradssolutions.adapters.exchange.rendering.utils.url.action;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42559a = "zs";

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public boolean a(Uri uri) {
        return "deeplink+".equalsIgnoreCase(uri.getScheme());
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public void b(Context context, com.cleveradssolutions.adapters.exchange.rendering.utils.url.a aVar, Uri uri) throws com.cleveradssolutions.adapters.exchange.rendering.utils.url.b {
        if (!"navigate".equalsIgnoreCase(uri.getHost())) {
            throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("Deeplink+ URL did not have 'navigate' as the host.");
        }
        try {
            String queryParameter = uri.getQueryParameter("primaryUrl");
            List<String> queryParameters = uri.getQueryParameters("primaryTrackingUrl");
            String queryParameter2 = uri.getQueryParameter("fallbackUrl");
            List<String> queryParameters2 = uri.getQueryParameters("fallbackTrackingUrl");
            if (queryParameter == null) {
                throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("Deeplink+ did not have 'primaryUrl' query param.");
            }
            if (queryParameter.startsWith("deeplink+")) {
                throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("Deeplink+ had another Deeplink+ as the 'primaryUrl'.");
            }
            try {
                com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.b(context, queryParameter);
                com.cleveradssolutions.adapters.exchange.rendering.networking.tracking.a.a().c(queryParameters);
            } catch (com.cleveradssolutions.adapters.exchange.rendering.utils.url.b unused) {
                com.cleveradssolutions.adapters.exchange.b.h(f42559a, "performAction(): Primary URL failed. Attempting to process fallback URL");
                if (queryParameter2 == null) {
                    throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("Unable to handle 'primaryUrl' for Deeplink+ and 'fallbackUrl' was missing.");
                }
                if (a(Uri.parse(queryParameter2))) {
                    throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("Deeplink+ URL had another Deeplink+ URL as the 'fallbackUrl'.");
                }
                aVar.b(context, queryParameter2, queryParameters2, true);
            }
        } catch (UnsupportedOperationException unused2) {
            throw new com.cleveradssolutions.adapters.exchange.rendering.utils.url.b("Deeplink+ URL was not a hierarchical URI.");
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public boolean zz() {
        return true;
    }
}
