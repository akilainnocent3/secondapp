package com.sporty.android.core.model.config;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hxa;
import defpackage.om2;
import defpackage.tag;
import defpackage.ux5;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\u0010\u0010!\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\"\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0015J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020 J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003JO\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010/\u001a\u00020&J\u0014\u00100\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0083\u0004J\n\u00103\u001a\u00020&HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u0015¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0017Ê\u0001\u0002\b<¨\u0006;"}, d2 = {"Lcom/sporty/android/core/model/config/VersionData;", "Landroid/os/Parcelable;", "version", "", "minorVer", "desc", "url", "md5", "updateType", "Lcom/sporty/android/core/model/config/VersionUpdateType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/config/VersionUpdateType;)V", "getVersion", "()Ljava/lang/String;", "getMinorVer", "getDesc", "getUrl", "getMd5", "getUpdateType", "()Lcom/sporty/android/core/model/config/VersionUpdateType;", "createdTimestamp", "", "getCreatedTimestamp$annotations", "()V", "getCreatedTimestamp", "()J", "versionComparison", "Lcom/sporty/android/core/model/config/VersionData$VersionComparison;", "getVersionComparison$annotations", "getVersionCompareResult", "localVersionStr", "hasNewVersionRequired", "", "hasNewVersionAvailable", "hasNoNewVersion", "isValidCachedData", "maxCacheTimeInMinutes", "availableVersionCode", "", "showPopUp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "VersionComparison", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VersionData implements Parcelable {
    public static final Parcelable.Creator<VersionData> CREATOR = new Creator();
    private final long createdTimestamp;
    private final String desc;
    private final String md5;
    private final String minorVer;
    private final VersionUpdateType updateType;
    private final String url;
    private final String version;
    private VersionComparison versionComparison;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VersionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VersionData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VersionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), VersionUpdateType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VersionData[] newArray(int i) {
            return new VersionData[i];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sporty/android/core/model/config/VersionData$VersionComparison;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_VERSION_REQUIRED", "NEW_VERSION_AVAILABLE", "NO_NEW_VERSION", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum VersionComparison {
        NEW_VERSION_REQUIRED,
        NEW_VERSION_AVAILABLE,
        NO_NEW_VERSION;

        private static final /* synthetic */ tag $ENTRIES = om2.a(values());

        public static tag<VersionComparison> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ VersionData(String str, String str2, String str3, String str4, String str5, VersionUpdateType versionUpdateType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? VersionUpdateType.IGNORE : versionUpdateType);
    }

    public static /* synthetic */ VersionData copy$default(VersionData versionData, String str, String str2, String str3, String str4, String str5, VersionUpdateType versionUpdateType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = versionData.version;
        }
        if ((i & 2) != 0) {
            str2 = versionData.minorVer;
        }
        if ((i & 4) != 0) {
            str3 = versionData.desc;
        }
        if ((i & 8) != 0) {
            str4 = versionData.url;
        }
        if ((i & 16) != 0) {
            str5 = versionData.md5;
        }
        if ((i & 32) != 0) {
            versionUpdateType = versionData.updateType;
        }
        String str6 = str5;
        VersionUpdateType versionUpdateType2 = versionUpdateType;
        return versionData.copy(str, str2, str3, str4, str6, versionUpdateType2);
    }

    public static /* synthetic */ void getCreatedTimestamp$annotations() {
    }

    private final VersionComparison getVersionCompareResult(String localVersionStr) {
        VersionComparison versionComparison;
        VersionComparison versionComparison2 = this.versionComparison;
        if (versionComparison2 == null) {
            Version version = new Version(this.minorVer);
            Version version2 = new Version(this.version);
            Version version3 = new Version(localVersionStr);
            if (version.compareTo(version3) > 0) {
                versionComparison = VersionComparison.NEW_VERSION_REQUIRED;
            } else {
                versionComparison = version2.compareTo(version3) > 0 ? VersionComparison.NEW_VERSION_AVAILABLE : VersionComparison.NO_NEW_VERSION;
            }
            versionComparison2 = versionComparison;
            this.versionComparison = versionComparison2;
        }
        if (versionComparison2 != null) {
            return versionComparison2;
        }
        Intrinsics.n("versionComparison");
        throw null;
    }

    private static /* synthetic */ void getVersionComparison$annotations() {
    }

    public final int availableVersionCode() {
        return new Version(this.version).toVersionCode();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinorVer() {
        return this.minorVer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VersionUpdateType getUpdateType() {
        return this.updateType;
    }

    public final VersionData copy(String version, String minorVer, String desc, String url, String md5, VersionUpdateType updateType) {
        updateType.getClass();
        return new VersionData(version, minorVer, desc, url, md5, updateType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionData)) {
            return false;
        }
        VersionData versionData = (VersionData) other;
        return Intrinsics.g(this.version, versionData.version) && Intrinsics.g(this.minorVer, versionData.minorVer) && Intrinsics.g(this.desc, versionData.desc) && Intrinsics.g(this.url, versionData.url) && Intrinsics.g(this.md5, versionData.md5) && this.updateType == versionData.updateType;
    }

    public final long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMinorVer() {
        return this.minorVer;
    }

    public final VersionUpdateType getUpdateType() {
        return this.updateType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean hasNewVersionAvailable(String localVersionStr) {
        return VersionComparison.NEW_VERSION_AVAILABLE == getVersionCompareResult(localVersionStr);
    }

    public final boolean hasNewVersionRequired(String localVersionStr) {
        return VersionComparison.NEW_VERSION_REQUIRED == getVersionCompareResult(localVersionStr);
    }

    public final boolean hasNoNewVersion(String localVersionStr) {
        return VersionComparison.NO_NEW_VERSION == getVersionCompareResult(localVersionStr);
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.minorVer;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.md5;
        return this.updateType.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final boolean isValidCachedData(long maxCacheTimeInMinutes) {
        return System.currentTimeMillis() - this.createdTimestamp <= TimeUnit.MINUTES.toMillis(maxCacheTimeInMinutes);
    }

    public final boolean showPopUp() {
        return this.updateType == VersionUpdateType.POPUP;
    }

    public String toString() {
        String str = this.version;
        String str2 = this.minorVer;
        String str3 = this.desc;
        String str4 = this.url;
        String str5 = this.md5;
        VersionUpdateType versionUpdateType = this.updateType;
        StringBuilder sbA = ux5.a("VersionData(version=", str, ", minorVer=", str2, ", desc=");
        hxa.c(sbA, str3, ", url=", str4, ", md5=");
        sbA.append(str5);
        sbA.append(", updateType=");
        sbA.append(versionUpdateType);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.version);
        dest.writeString(this.minorVer);
        dest.writeString(this.desc);
        dest.writeString(this.url);
        dest.writeString(this.md5);
        dest.writeString(this.updateType.name());
    }

    public VersionData(String str, String str2, String str3, String str4, String str5, VersionUpdateType versionUpdateType) {
        versionUpdateType.getClass();
        this.version = str;
        this.minorVer = str2;
        this.desc = str3;
        this.url = str4;
        this.md5 = str5;
        this.updateType = versionUpdateType;
        this.createdTimestamp = System.currentTimeMillis();
    }

    public VersionData() {
        this(null, null, null, null, null, null, 63, null);
    }
}
