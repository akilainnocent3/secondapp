package com.startapp.sdk.adsbase.adrules;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AdRulesResult implements Serializable {
    private static final long serialVersionUID = 6038458956238784052L;
    private String reason;
    private boolean shouldDisplayAd;

    public AdRulesResult(String str) {
        this.shouldDisplayAd = false;
        this.reason = str;
    }

    public final String a() {
        String str = this.reason;
        return str != null ? str.split(" ")[0] : "";
    }

    public final boolean b() {
        return this.shouldDisplayAd;
    }

    public AdRulesResult() {
        this.shouldDisplayAd = true;
        this.reason = "";
    }
}
