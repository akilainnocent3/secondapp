package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.A8;
import g8.a;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class InlineParams {

    @A8
    @m
    private String callerBundleId;

    @m
    private final String listing;
    private final boolean overlay;

    @A8
    private boolean pingInWebView;

    @m
    private final String referrer;

    @A8
    @m
    private String targetBundleId;

    @l
    private final String url;

    public InlineParams() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public static /* synthetic */ InlineParams copy$default(InlineParams inlineParams, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inlineParams.url;
        }
        if ((i10 & 2) != 0) {
            str2 = inlineParams.referrer;
        }
        if ((i10 & 4) != 0) {
            str3 = inlineParams.listing;
        }
        if ((i10 & 8) != 0) {
            z10 = inlineParams.overlay;
        }
        if ((i10 & 16) != 0) {
            str4 = inlineParams.callerBundleId;
        }
        if ((i10 & 32) != 0) {
            str5 = inlineParams.targetBundleId;
        }
        if ((i10 & 64) != 0) {
            z11 = inlineParams.pingInWebView;
        }
        String str6 = str5;
        boolean z12 = z11;
        String str7 = str4;
        String str8 = str3;
        return inlineParams.copy(str, str2, str8, z10, str7, str6, z12);
    }

    @l
    public final String component1() {
        return this.url;
    }

    @m
    public final String component2() {
        return this.referrer;
    }

    @m
    public final String component3() {
        return this.listing;
    }

    public final boolean component4() {
        return this.overlay;
    }

    @m
    public final String component5() {
        return this.callerBundleId;
    }

    @m
    public final String component6() {
        return this.targetBundleId;
    }

    public final boolean component7() {
        return this.pingInWebView;
    }

    @l
    public final InlineParams copy(@l String url, @m String str, @m String str2, boolean z10, @m String str3, @m String str4, boolean z11) {
        m0.p(url, "url");
        return new InlineParams(url, str, str2, z10, str3, str4, z11);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineParams)) {
            return false;
        }
        InlineParams inlineParams = (InlineParams) obj;
        return m0.g(this.url, inlineParams.url) && m0.g(this.referrer, inlineParams.referrer) && m0.g(this.listing, inlineParams.listing) && this.overlay == inlineParams.overlay && m0.g(this.callerBundleId, inlineParams.callerBundleId) && m0.g(this.targetBundleId, inlineParams.targetBundleId) && this.pingInWebView == inlineParams.pingInWebView;
    }

    @m
    public final String getCallerBundleId() {
        return this.callerBundleId;
    }

    @m
    public final String getListing() {
        return this.listing;
    }

    public final boolean getOverlay() {
        return this.overlay;
    }

    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    @m
    public final String getReferrer() {
        return this.referrer;
    }

    @m
    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.referrer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.listing;
        int iA = (a.a(this.overlay) + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.callerBundleId;
        int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetBundleId;
        return a.a(this.pingInWebView) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setCallerBundleId(@m String str) {
        this.callerBundleId = str;
    }

    public final void setPingInWebView(boolean z10) {
        this.pingInWebView = z10;
    }

    public final void setTargetBundleId(@m String str) {
        this.targetBundleId = str;
    }

    @l
    public String toString() {
        return "InlineParams(url=" + this.url + ", referrer=" + this.referrer + ", listing=" + this.listing + ", overlay=" + this.overlay + ", callerBundleId=" + this.callerBundleId + ", targetBundleId=" + this.targetBundleId + ", pingInWebView=" + this.pingInWebView + j.f86771d;
    }

    public InlineParams(@l String url, @m String str, @m String str2, boolean z10, @m String str3, @m String str4, boolean z11) {
        m0.p(url, "url");
        this.url = url;
        this.referrer = str;
        this.listing = str2;
        this.overlay = z10;
        this.callerBundleId = str3;
        this.targetBundleId = str4;
        this.pingInWebView = z11;
    }

    public /* synthetic */ InlineParams(String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, int i10, x xVar) {
        this((i10 & 1) != 0 ? "https://play.google.com/d?" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? false : z11);
    }
}
