package com.sporty.android.common_analytics.opentelemetry;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/common_analytics/opentelemetry/UrlTemplateConfig;", "", "countryReg", "", "pathRegMap", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getCountryReg", "()Ljava/lang/String;", "getPathRegMap", "()Ljava/util/Map;", "validate", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UrlTemplateConfig {
    private final String countryReg;
    private final Map<String, String> pathRegMap;

    public UrlTemplateConfig(String str, Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.countryReg = str;
        this.pathRegMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrlTemplateConfig copy$default(UrlTemplateConfig urlTemplateConfig, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlTemplateConfig.countryReg;
        }
        if ((i & 2) != 0) {
            map = urlTemplateConfig.pathRegMap;
        }
        return urlTemplateConfig.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryReg() {
        return this.countryReg;
    }

    public final Map<String, String> component2() {
        return this.pathRegMap;
    }

    public final UrlTemplateConfig copy(String countryReg, Map<String, String> pathRegMap) {
        countryReg.getClass();
        pathRegMap.getClass();
        return new UrlTemplateConfig(countryReg, pathRegMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlTemplateConfig)) {
            return false;
        }
        UrlTemplateConfig urlTemplateConfig = (UrlTemplateConfig) other;
        return Intrinsics.g(this.countryReg, urlTemplateConfig.countryReg) && Intrinsics.g(this.pathRegMap, urlTemplateConfig.pathRegMap);
    }

    public final String getCountryReg() {
        return this.countryReg;
    }

    public final Map<String, String> getPathRegMap() {
        return this.pathRegMap;
    }

    public int hashCode() {
        return this.pathRegMap.hashCode() + (this.countryReg.hashCode() * 31);
    }

    public String toString() {
        return "UrlTemplateConfig(countryReg=" + this.countryReg + ", pathRegMap=" + this.pathRegMap + ")";
    }

    public final boolean validate() {
        try {
            return (StringsKt.U(this.countryReg) || this.pathRegMap.isEmpty()) ? false : true;
        } catch (Exception unused) {
        }
    }
}
