package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class HtmlOmidTracker {

    @m
    private String verificationParams;

    @l
    private String vendor = "";

    @l
    private String url = "";

    @l
    public final String getUrl() {
        return this.url;
    }

    @l
    public final String getVendor() {
        return this.vendor;
    }

    @m
    public final String getVerificationParams() {
        return this.verificationParams;
    }

    public final void setUrl(@l String str) {
        m0.p(str, "<set-?>");
        this.url = str;
    }

    public final void setVendor(@l String str) {
        m0.p(str, "<set-?>");
        this.vendor = str;
    }

    public final void setVerificationParams(@m String str) {
        this.verificationParams = str;
    }
}
