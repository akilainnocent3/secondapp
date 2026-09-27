package com.unity3d.ads;

import java.util.Locale;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@UnityAdsExperimental
public final class MediationInfo {

    @l
    private final String adapterVersion;

    @l
    private final String name;

    @l
    private final String version;

    public MediationInfo(@l String name, @l String version, @l String adapterVersion) {
        m0.p(name, "name");
        m0.p(version, "version");
        m0.p(adapterVersion, "adapterVersion");
        this.version = version;
        this.adapterVersion = adapterVersion;
        String lowerCase = name.toLowerCase(Locale.ROOT);
        m0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.name = lowerCase;
    }

    @l
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getVersion() {
        return this.version;
    }
}
