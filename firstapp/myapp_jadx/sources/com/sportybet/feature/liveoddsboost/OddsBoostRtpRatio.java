package com.sportybet.feature.liveoddsboost;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/feature/liveoddsboost/OddsBoostRtpRatio;", "", "ratio", "", "minRtp", "maxRtp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRatio", "()Ljava/lang/String;", "getMinRtp", "getMaxRtp", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OddsBoostRtpRatio {
    public static final int $stable = 0;
    private final String maxRtp;
    private final String minRtp;
    private final String ratio;

    public OddsBoostRtpRatio(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.ratio = str;
        this.minRtp = str2;
        this.maxRtp = str3;
    }

    public static /* synthetic */ OddsBoostRtpRatio copy$default(OddsBoostRtpRatio oddsBoostRtpRatio, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oddsBoostRtpRatio.ratio;
        }
        if ((i & 2) != 0) {
            str2 = oddsBoostRtpRatio.minRtp;
        }
        if ((i & 4) != 0) {
            str3 = oddsBoostRtpRatio.maxRtp;
        }
        return oddsBoostRtpRatio.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinRtp() {
        return this.minRtp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaxRtp() {
        return this.maxRtp;
    }

    public final OddsBoostRtpRatio copy(String ratio, String minRtp, String maxRtp) {
        ratio.getClass();
        minRtp.getClass();
        maxRtp.getClass();
        return new OddsBoostRtpRatio(ratio, minRtp, maxRtp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsBoostRtpRatio)) {
            return false;
        }
        OddsBoostRtpRatio oddsBoostRtpRatio = (OddsBoostRtpRatio) other;
        return Intrinsics.g(this.ratio, oddsBoostRtpRatio.ratio) && Intrinsics.g(this.minRtp, oddsBoostRtpRatio.minRtp) && Intrinsics.g(this.maxRtp, oddsBoostRtpRatio.maxRtp);
    }

    public final String getMaxRtp() {
        return this.maxRtp;
    }

    public final String getMinRtp() {
        return this.minRtp;
    }

    public final String getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        return this.maxRtp.hashCode() + gmf0.a(this.ratio.hashCode() * 31, 31, this.minRtp);
    }

    public String toString() {
        String str = this.ratio;
        String str2 = this.minRtp;
        return uf80.a(ux5.a("OddsBoostRtpRatio(ratio=", str, ", minRtp=", str2, ", maxRtp="), this.maxRtp, ")");
    }
}
