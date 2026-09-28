package com.sporty.android.core.model.config.bo;

import defpackage.eal;
import defpackage.kya0;
import defpackage.t160;
import defpackage.xdp;
import defpackage.zi50;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u000eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigFeatureFlag;", "", "enabled", "", "android", "Lcom/sporty/android/core/model/config/bo/BOConfigFeatureFlag$AndroidRule;", "<init>", "(ZLcom/sporty/android/core/model/config/bo/BOConfigFeatureFlag$AndroidRule;)V", "getEnabled", "()Z", "getAndroid", "()Lcom/sporty/android/core/model/config/bo/BOConfigFeatureFlag$AndroidRule;", "isEnabled", "appVersionName", "", "getData", "T", "()Ljava/lang/Object;", "compareVersions", "", "a", "b", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "AndroidRule", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BOConfigFeatureFlag {
    private final AndroidRule android;
    private final boolean enabled;

    public /* synthetic */ BOConfigFeatureFlag(boolean z, AndroidRule androidRule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : androidRule);
    }

    private final int compareVersions(String a, String b) {
        Integer intOrNull;
        Integer intOrNull2;
        List listSplit$default = StringsKt__StringsKt.split$default(a, new String[]{"."}, false, 0, 6, null);
        List listSplit$default2 = StringsKt__StringsKt.split$default(b, new String[]{"."}, false, 0, 6, null);
        int iMax = Math.max(listSplit$default.size(), listSplit$default2.size());
        for (int i = 0; i < iMax; i++) {
            String str = (String) CollectionsKt.V(i, listSplit$default);
            int iIntValue = (str == null || (intOrNull2 = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull2.intValue();
            String str2 = (String) CollectionsKt.V(i, listSplit$default2);
            int iIntValue2 = (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) ? 0 : intOrNull.intValue();
            if (iIntValue != iIntValue2) {
                return iIntValue - iIntValue2;
            }
        }
        return 0;
    }

    public static /* synthetic */ BOConfigFeatureFlag copy$default(BOConfigFeatureFlag bOConfigFeatureFlag, boolean z, AndroidRule androidRule, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bOConfigFeatureFlag.enabled;
        }
        if ((i & 2) != 0) {
            androidRule = bOConfigFeatureFlag.android;
        }
        return bOConfigFeatureFlag.copy(z, androidRule);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AndroidRule getAndroid() {
        return this.android;
    }

    public final BOConfigFeatureFlag copy(boolean enabled, AndroidRule android2) {
        return new BOConfigFeatureFlag(enabled, android2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BOConfigFeatureFlag)) {
            return false;
        }
        BOConfigFeatureFlag bOConfigFeatureFlag = (BOConfigFeatureFlag) other;
        return this.enabled == bOConfigFeatureFlag.enabled && Intrinsics.g(this.android, bOConfigFeatureFlag.android);
    }

    public final AndroidRule getAndroid() {
        return this.android;
    }

    public final <T> T getData() {
        AndroidRule android2 = getAndroid();
        if (android2 == null || android2.getData() == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            new eal();
            Intrinsics.m();
            throw null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            T t = (T) new zi50.b(th);
            if (t instanceof zi50.b) {
                return null;
            }
            return t;
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        AndroidRule androidRule = this.android;
        return iHashCode + (androidRule == null ? 0 : androidRule.hashCode());
    }

    public final boolean isEnabled(String appVersionName) {
        appVersionName.getClass();
        AndroidRule androidRule = this.android;
        if (androidRule == null || !this.enabled || !androidRule.getEnabled()) {
            return false;
        }
        String minVersion = androidRule.getMinVersion();
        if (minVersion != null) {
            if (minVersion.length() <= 0) {
                minVersion = null;
            }
            if (minVersion != null && compareVersions(appVersionName, minVersion) < 0) {
                return false;
            }
        }
        String maxVersion = androidRule.getMaxVersion();
        if (maxVersion != null) {
            String str = maxVersion.length() > 0 ? maxVersion : null;
            if (str != null && compareVersions(appVersionName, str) > 0) {
                return false;
            }
        }
        List<String> excludedVersions = androidRule.getExcludedVersions();
        if (excludedVersions == null || excludedVersions.isEmpty()) {
            return true;
        }
        Iterator<T> it = excludedVersions.iterator();
        while (it.hasNext()) {
            if (compareVersions(appVersionName, (String) it.next()) == 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BOConfigFeatureFlag(enabled=" + this.enabled + ", android=" + this.android + ")";
    }

    public BOConfigFeatureFlag(boolean z, AndroidRule androidRule) {
        this.enabled = z;
        this.android = androidRule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BOConfigFeatureFlag() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0010R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0015¨\u0006("}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigFeatureFlag$AndroidRule;", "", "", "enabled", "", "minVersion", "maxVersion", "", "excludedVersions", "Lxdp;", "data", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lxdp;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lxdp;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lxdp;)Lcom/sporty/android/core/model/config/bo/BOConfigFeatureFlag$AndroidRule;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/lang/String;", "getMinVersion", "getMaxVersion", "Ljava/util/List;", "getExcludedVersions", "Lxdp;", "getData", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AndroidRule {
        private final xdp data;
        private final boolean enabled;
        private final List<String> excludedVersions;
        private final String maxVersion;
        private final String minVersion;

        public /* synthetic */ AndroidRule(boolean z, String str, String str2, List list, xdp xdpVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : xdpVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AndroidRule copy$default(AndroidRule androidRule, boolean z, String str, String str2, List list, xdp xdpVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = androidRule.enabled;
            }
            if ((i & 2) != 0) {
                str = androidRule.minVersion;
            }
            if ((i & 4) != 0) {
                str2 = androidRule.maxVersion;
            }
            if ((i & 8) != 0) {
                list = androidRule.excludedVersions;
            }
            if ((i & 16) != 0) {
                xdpVar = androidRule.data;
            }
            xdp xdpVar2 = xdpVar;
            String str3 = str2;
            return androidRule.copy(z, str, str3, list, xdpVar2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMinVersion() {
            return this.minVersion;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMaxVersion() {
            return this.maxVersion;
        }

        public final List<String> component4() {
            return this.excludedVersions;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final xdp getData() {
            return this.data;
        }

        public final AndroidRule copy(boolean enabled, String minVersion, String maxVersion, List<String> excludedVersions, xdp data) {
            return new AndroidRule(enabled, minVersion, maxVersion, excludedVersions, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AndroidRule)) {
                return false;
            }
            AndroidRule androidRule = (AndroidRule) other;
            return this.enabled == androidRule.enabled && Intrinsics.g(this.minVersion, androidRule.minVersion) && Intrinsics.g(this.maxVersion, androidRule.maxVersion) && Intrinsics.g(this.excludedVersions, androidRule.excludedVersions) && Intrinsics.g(this.data, androidRule.data);
        }

        public final xdp getData() {
            return this.data;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final List<String> getExcludedVersions() {
            return this.excludedVersions;
        }

        public final String getMaxVersion() {
            return this.maxVersion;
        }

        public final String getMinVersion() {
            return this.minVersion;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.enabled) * 31;
            String str = this.minVersion;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.maxVersion;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.excludedVersions;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            xdp xdpVar = this.data;
            return iHashCode4 + (xdpVar != null ? xdpVar.a.hashCode() : 0);
        }

        public String toString() {
            boolean z = this.enabled;
            String str = this.minVersion;
            String str2 = this.maxVersion;
            List<String> list = this.excludedVersions;
            xdp xdpVar = this.data;
            StringBuilder sbA = t160.a("AndroidRule(enabled=", ", minVersion=", str, ", maxVersion=", z);
            kya0.b(str2, ", excludedVersions=", ", data=", sbA, list);
            sbA.append(xdpVar);
            sbA.append(")");
            return sbA.toString();
        }

        public AndroidRule(boolean z, String str, String str2, List<String> list, xdp xdpVar) {
            this.enabled = z;
            this.minVersion = str;
            this.maxVersion = str2;
            this.excludedVersions = list;
            this.data = xdpVar;
        }

        public AndroidRule() {
            this(false, null, null, null, null, 31, null);
        }
    }
}
