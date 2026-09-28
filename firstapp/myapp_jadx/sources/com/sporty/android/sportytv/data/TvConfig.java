package com.sporty.android.sportytv.data;

import defpackage.kwi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0004HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/sportytv/data/TvConfig;", "", "dates", "", "", "serverTimeZone", "serverTimestamp", "streamUrl", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDates", "()Ljava/util/List;", "getServerTimeZone", "()Ljava/lang/String;", "getServerTimestamp", "getStreamUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sportyMedia", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TvConfig {
    public static final int $stable = 8;
    private final List<String> dates;
    private final String serverTimeZone;
    private final String serverTimestamp;
    private final String streamUrl;

    public TvConfig(List<String> list, String str, String str2, String str3) {
        this.dates = list;
        this.serverTimeZone = str;
        this.serverTimestamp = str2;
        this.streamUrl = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TvConfig copy$default(TvConfig tvConfig, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tvConfig.dates;
        }
        if ((i & 2) != 0) {
            str = tvConfig.serverTimeZone;
        }
        if ((i & 4) != 0) {
            str2 = tvConfig.serverTimestamp;
        }
        if ((i & 8) != 0) {
            str3 = tvConfig.streamUrl;
        }
        return tvConfig.copy(list, str, str2, str3);
    }

    public final List<String> component1() {
        return this.dates;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServerTimeZone() {
        return this.serverTimeZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServerTimestamp() {
        return this.serverTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public final TvConfig copy(List<String> dates, String serverTimeZone, String serverTimestamp, String streamUrl) {
        return new TvConfig(dates, serverTimeZone, serverTimestamp, streamUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TvConfig)) {
            return false;
        }
        TvConfig tvConfig = (TvConfig) other;
        return Intrinsics.g(this.dates, tvConfig.dates) && Intrinsics.g(this.serverTimeZone, tvConfig.serverTimeZone) && Intrinsics.g(this.serverTimestamp, tvConfig.serverTimestamp) && Intrinsics.g(this.streamUrl, tvConfig.streamUrl);
    }

    public final List<String> getDates() {
        return this.dates;
    }

    public final String getServerTimeZone() {
        return this.serverTimeZone;
    }

    public final String getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public int hashCode() {
        List<String> list = this.dates;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.serverTimeZone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serverTimestamp;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.streamUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.dates;
        String str = this.serverTimeZone;
        String str2 = this.serverTimestamp;
        String str3 = this.streamUrl;
        StringBuilder sb = new StringBuilder("TvConfig(dates=");
        sb.append(list);
        sb.append(", serverTimeZone=");
        sb.append(str);
        sb.append(", serverTimestamp=");
        return kwi.a(sb, str2, ", streamUrl=", str3, ")");
    }
}
