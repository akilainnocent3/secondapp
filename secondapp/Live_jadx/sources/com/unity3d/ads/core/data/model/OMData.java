package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class OMData {

    @l
    private final String partnerName;

    @l
    private final String partnerVersion;

    @l
    private final String version;

    public OMData(@l String version, @l String partnerName, @l String partnerVersion) {
        m0.p(version, "version");
        m0.p(partnerName, "partnerName");
        m0.p(partnerVersion, "partnerVersion");
        this.version = version;
        this.partnerName = partnerName;
        this.partnerVersion = partnerVersion;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oMData.version;
        }
        if ((i10 & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i10 & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    @l
    public final String component1() {
        return this.version;
    }

    @l
    public final String component2() {
        return this.partnerName;
    }

    @l
    public final String component3() {
        return this.partnerVersion;
    }

    @l
    public final OMData copy(@l String version, @l String partnerName, @l String partnerVersion) {
        m0.p(version, "version");
        m0.p(partnerName, "partnerName");
        m0.p(partnerVersion, "partnerVersion");
        return new OMData(version, partnerName, partnerVersion);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) obj;
        return m0.g(this.version, oMData.version) && m0.g(this.partnerName, oMData.partnerName) && m0.g(this.partnerVersion, oMData.partnerVersion);
    }

    @l
    public final String getPartnerName() {
        return this.partnerName;
    }

    @l
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    @l
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version.hashCode() * 31) + this.partnerName.hashCode()) * 31) + this.partnerVersion.hashCode();
    }

    @l
    public String toString() {
        return "OMData(version=" + this.version + ", partnerName=" + this.partnerName + ", partnerVersion=" + this.partnerVersion + ')';
    }
}
