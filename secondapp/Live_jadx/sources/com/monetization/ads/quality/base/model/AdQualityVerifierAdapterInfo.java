package com.monetization.ads.quality.base.model;

import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class AdQualityVerifierAdapterInfo {

    @m
    private final String adapterVersion;

    @m
    private final String verifierName;

    @m
    private final String verifierSdkVersion;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f71946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f71947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f71948c;

        @l
        public final AdQualityVerifierAdapterInfo build() {
            return new AdQualityVerifierAdapterInfo(this.f71946a, this.f71947b, this.f71948c, null);
        }

        @l
        public final Builder setAdapterVersion(@m String str) {
            this.f71946a = str;
            return this;
        }

        @l
        public final Builder setVerifierName(@m String str) {
            this.f71947b = str;
            return this;
        }

        @l
        public final Builder setVerifierSdkVersion(@m String str) {
            this.f71948c = str;
            return this;
        }
    }

    public /* synthetic */ AdQualityVerifierAdapterInfo(String str, String str2, String str3, x xVar) {
        this(str, str2, str3);
    }

    @m
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @m
    public final String getVerifierName() {
        return this.verifierName;
    }

    @m
    public final String getVerifierSdkVersion() {
        return this.verifierSdkVersion;
    }

    private AdQualityVerifierAdapterInfo(String str, String str2, String str3) {
        this.adapterVersion = str;
        this.verifierName = str2;
        this.verifierSdkVersion = str3;
    }
}
