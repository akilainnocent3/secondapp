package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class WebViewClientError {

    @l
    private final ErrorReason reason;

    @m
    private final Integer statusCode;

    @m
    private final String url;

    public WebViewClientError(@m String str, @l ErrorReason reason, @m Integer num) {
        m0.p(reason, "reason");
        this.url = str;
        this.reason = reason;
        this.statusCode = num;
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i10 & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i10 & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    @m
    public final String component1() {
        return this.url;
    }

    @l
    public final ErrorReason component2() {
        return this.reason;
    }

    @m
    public final Integer component3() {
        return this.statusCode;
    }

    @l
    public final WebViewClientError copy(@m String str, @l ErrorReason reason, @m Integer num) {
        m0.p(reason, "reason");
        return new WebViewClientError(str, reason, num);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) obj;
        return m0.g(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && m0.g(this.statusCode, webViewClientError.statusCode);
    }

    @l
    public final ErrorReason getReason() {
        return this.reason;
    }

    @m
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @m
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Integer num = this.statusCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @l
    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, errorReason, (i10 & 4) != 0 ? null : num);
    }
}
