package com.unity3d.ads.core.data.model;

import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class WebViewConfiguration {

    @l
    private final List<String> additionalFiles;

    @l
    private final String entryPoint;

    @l
    private final String type;
    private final int version;

    public WebViewConfiguration(int i10, @l String entryPoint, @l List<String> additionalFiles, @l String type) {
        m0.p(entryPoint, "entryPoint");
        m0.p(additionalFiles, "additionalFiles");
        m0.p(type, "type");
        this.version = i10;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i11 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i10, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    @l
    public final String component2() {
        return this.entryPoint;
    }

    @l
    public final List<String> component3() {
        return this.additionalFiles;
    }

    @l
    public final String component4() {
        return this.type;
    }

    @l
    public final WebViewConfiguration copy(int i10, @l String entryPoint, @l List<String> additionalFiles, @l String type) {
        m0.p(entryPoint, "entryPoint");
        m0.p(additionalFiles, "additionalFiles");
        m0.p(type, "type");
        return new WebViewConfiguration(i10, entryPoint, additionalFiles, type);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && m0.g(this.entryPoint, webViewConfiguration.entryPoint) && m0.g(this.additionalFiles, webViewConfiguration.additionalFiles) && m0.g(this.type, webViewConfiguration.type);
    }

    @l
    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    @l
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((this.version * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode()) * 31) + this.type.hashCode();
    }

    @l
    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ", type=" + this.type + ')';
    }
}
