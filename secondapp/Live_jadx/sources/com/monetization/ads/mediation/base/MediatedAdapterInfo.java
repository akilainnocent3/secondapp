package com.monetization.ads.mediation.base;

import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedAdapterInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f71860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f71861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f71862c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f71863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f71864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f71865c;

        @l
        public final MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this.f71863a, this.f71864b, this.f71865c, null);
        }

        @l
        public final Builder setAdapterVersion(@l String str) {
            this.f71863a = str;
            return this;
        }

        @l
        public final Builder setNetworkName(@l String str) {
            this.f71864b = str;
            return this;
        }

        @l
        public final Builder setNetworkSdkVersion(@l String str) {
            this.f71865c = str;
            return this;
        }
    }

    public /* synthetic */ MediatedAdapterInfo(String str, String str2, String str3, x xVar) {
        this(str, str2, str3);
    }

    @m
    public final String getAdapterVersion() {
        return this.f71860a;
    }

    @m
    public final String getNetworkName() {
        return this.f71861b;
    }

    @m
    public final String getNetworkSdkVersion() {
        return this.f71862c;
    }

    private MediatedAdapterInfo(String str, String str2, String str3) {
        this.f71860a = str;
        this.f71861b = str2;
        this.f71862c = str3;
    }
}
