package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class DefaultNetworkResponseHandler implements NetworkResponseHandler<DefaultResponseParser.Response> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultResponseParser f98915a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    public DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f98915a = defaultResponseParser;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    public DefaultResponseParser.Response handle(@NonNull ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f98915a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
